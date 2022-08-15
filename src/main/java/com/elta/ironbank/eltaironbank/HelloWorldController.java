package com.elta.ironbank.eltaironbank;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @PostMapping("/customername")
    public String nameOfCustomer(@RequestBody BankCustomer customer) {
        return customer.getName().toUpperCase();
    }

    @GetMapping("/privet")
    public String helloWithRequestParam(@RequestParam String name) {
        return name.toUpperCase();
    }


    @GetMapping("/hi/{name}/{age}")
    public String helloWithName(@PathVariable String name,@PathVariable int age) {
        return "hello " + name.toUpperCase()+" age: "+age;
    }



    @GetMapping("/customer")
    @SneakyThrows
    public BankCustomer customer(){
        BankCustomer bogration = BankCustomer.builder().name("Bogration").build();

        String json = new ObjectMapper().writeValueAsString(bogration);
        System.out.println("json = " + json);
        return bogration;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello Iron bank";
    }
}
