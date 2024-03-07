package com.dealer.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.dealer.entity.Dealer;
import com.dealer.repository.Dealerrepo;
@Repository
public class Dealerdao {
@Autowired
Dealerrepo dr;
public String post(@RequestBody List<Dealer> a) {
	dr.saveAll(a);
	return "Added";
}
public List<Dealer> get(){
	return dr.findAll();
}
public Optional<Dealer> getid(int a){
	return dr.findById(a);
}
public List<Dealer> getdeal(String a){
	return dr.getdeal(a);
}
public List<Dealer> getletter(){
	return dr.getletter();
}
public String saverate(Dealer d) {
	dr.save(d);
	return "success";
}
public List<Dealer> getbyname(String name){
	return dr.getbyname(name);
}
}
