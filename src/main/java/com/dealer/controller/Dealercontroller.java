package com.dealer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dealer.entity.Dealer;
import com.dealer.exception.Namenotfound;
import com.dealer.service.DealerService;

@RestController
@RequestMapping(value="/deal")
public class Dealercontroller {
	@Autowired
	 DealerService ds;
	@PostMapping("/post")
	public String post(@RequestBody List<Dealer> a) {
		return ds.post(a);
	}
    @GetMapping("/get")
   
    public List<Dealer> get(){
    	return ds.get();
    }
    @GetMapping("/getid/{a}")
    public Optional<Dealer> getid(@PathVariable int a){
    	return ds.getid(a);
    }
    @GetMapping("/getname/{a}")
    public List<Dealer> getdeal(@PathVariable String a){
    	return ds.getdeal(a);
    }
    @GetMapping("/getlet")
    public List<Dealer> getletter(){
    	return ds.getletter();
    }
   
    @GetMapping("/setbyname/{name}")
    public List<Dealer> getbyname(@PathVariable String name) throws Namenotfound {
    	return ds.getbyname(name);
    }
}

