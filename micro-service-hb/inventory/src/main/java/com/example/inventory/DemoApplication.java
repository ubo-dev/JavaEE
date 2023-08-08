package com.example.inventory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
@RequiredArgsConstructor
class OrderController{

	private final OrderService orderService;

	@PostMapping("/orders")
	@ResponseStatus(HttpStatus.CREATED)
	public void placeOrder(@RequestBody PlaceOrderRequest request){
		this.orderService.placeOrder(request);
	}
}

@Service
class OrderService {

	public void placeOrder(PlaceOrderRequest request) {
		// save into db
		// publish event
	}
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class PlaceOrderRequest {
	private String product;
	private double price;
}
