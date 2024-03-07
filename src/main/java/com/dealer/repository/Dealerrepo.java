package com.dealer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dealer.entity.Dealer;

public interface Dealerrepo extends JpaRepository<Dealer, Integer> {
	//jpa query
	@Query(value="select d from Dealer d where d.name=:name")
	public List<Dealer> getdeal(@Param(value="name")String a);
	
    @Query(value="select d from Dealer d where d.name like (\"k%\")")
    public List<Dealer> getletter();
            
	@Query(value="select d from Dealer d where d.name=:name")
	public List<Dealer> getbyname(@Param(value="name")String name);
	
}
