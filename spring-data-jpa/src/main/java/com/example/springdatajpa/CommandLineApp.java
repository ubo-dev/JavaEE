package com.example.springdatajpa;

import com.example.springdatajpa.models.*;
import com.example.springdatajpa.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CommandLineApp implements CommandLineRunner {

    private final PersonRepository personRepository;

    private final PassportRepository passportRepository;

    private final CartRepository cartRepository;

    private final CartItemRepository cartItemRepository;

    private final SubscriberRepository subscriberRepository;

    private final ChannelRepository channelRepository;

    @Override
    public void run(String... args) throws Exception {
            oneToManyExample();
    }

    private void oneToManyExample() {
        Cart cart = new Cart();
        cart.setUserId(5);

        this.cartRepository.save(cart);

        CartItem cartItem = new CartItem();
        cartItem.setCart(cart);
        cartItem.setProductCode("code1");
        cartItem.setQuantity(2);
        cartItem.setUnitPrice(BigDecimal.valueOf(24.5));

        CartItem cartItem2 = new CartItem();
        cartItem2.setCart(cart);
        cartItem2.setProductCode("code2");
        cartItem2.setQuantity(5);
        cartItem2.setUnitPrice(BigDecimal.valueOf(124.5));

        this.cartItemRepository.save(cartItem);
        this.cartItemRepository.save(cartItem2);

        List<Cart> carts = this.cartRepository.findAll();
        List<CartItem> cartItems =this.cartItemRepository.findAll();

        System.out.println(carts.get(0).getCartItems());
        System.out.println(cartItems.get(0).getCart());


    }

    public void manyToManyExample() {
        Channel channel = new Channel();
        channel.setName("ch1");
        channel.setUrl("url1");
        Channel channel1 = new Channel();
        channel1.setName("ch2");
        channel1.setUrl("url2");

        Subscriber subscriber = new Subscriber();
        subscriber.setUserName("user1");
        Subscriber subscriber1 = new Subscriber();
        subscriber1.setUserName("user2");

        channel1.setSubscribers(List.of(subscriber, subscriber1));
        this.subscriberRepository.saveAll(List.of(subscriber,subscriber1));
        this.channelRepository.saveAll(List.of(channel, channel1));

        List<Channel> channels = this.channelRepository.findAll();
        List<Subscriber> subscribers = this.subscriberRepository.findAll();

        System.out.println(subscribers);
        System.out.println(channels);


    }


    private void oneToOneExample() {
        Person person = Person.builder()
                .name("mert")
                .surname("test1")

                .build();
        Passport passport = Passport.builder()
                .expireDate(Instant.now().plus(10, ChronoUnit.DAYS).getEpochSecond())
                .person(person)
                .build();

        this.passportRepository.save(passport);
        System.out.println(passport);
    }
}
