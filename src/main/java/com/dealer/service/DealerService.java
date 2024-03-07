package com.dealer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dealer.dao.Dealerdao;
import com.dealer.entity.Dealer;
import com.dealer.exception.Dealerexception;
import com.dealer.exception.Namenotfound;

@Service
public class DealerService {
	@Autowired
	Dealerdao dd;

	public String post(@RequestBody List<Dealer> a) {
		return dd.post(a);
	}

	public List<Dealer> get() {
		return dd.get();
	}

	public Optional<Dealer> getid(int a) {
		return dd.getid(a);
	}

	public List<Dealer> getdeal(String a) {
		return dd.getdeal(a);
	}

	public List<Dealer> getletter() {
		return dd.getletter();
	}

	/*public String saverate(Dealer d) throws Exception {
		try {
			if (d.getRating() > 1 && d.getRating() < 3) {
				return dd.saverate(d);
			} else {
				throw new Dealerexception("Rating must be 5");
			}
		} catch (Dealerexception de) {
			return "Exception handled";
		}

	}*/
	public List<Dealer> getbyname(String name) throws Namenotfound{
		if(dd.getbyname(name).isEmpty()) {
			throw new Namenotfound("There is no data in this name");
		}
		else {
			return dd.getbyname(name);
		}
	}
}
