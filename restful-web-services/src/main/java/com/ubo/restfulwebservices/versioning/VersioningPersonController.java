package com.ubo.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController
{
    //URI versioning involves adding the version number to the API’s URL. This is a straightforward and easily understandable method.
    //However, it may not be the most elegant, as it can lead to lengthy URLs.
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson()
    {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson()
    {
        return new PersonV2(new Name("Bob","Charlie"));
    }

    //Request parameter versioning
    //With this approach, the version number is passed as a request parameter.
    //It’s less intrusive than URI versioning but might not be as intuitive for consumers.

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequestParameter()
    {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestParameter()
    {
        return new PersonV2(new Name("Bob","Charlie"));
    }

    //Custom header versioning
    //Custom header versioning involves adding a custom header to the HTTP request, containing the version number.
    //This method keeps the URI clean, but consumers must remember to include the custom header.

    @GetMapping(value = "/person/header",headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader()
    {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }


    //Accept header versioning leverages the HTTP Accept header to specify the desired API version.
    //This method adheres to the HATEOAS principle, as the version is part of the content negotiation.

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPersonAcceptHeader() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfPersonAcceptHeader() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }


}
