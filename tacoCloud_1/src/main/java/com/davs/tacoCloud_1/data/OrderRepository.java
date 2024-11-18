package com.davs.tacoCloud_1.data;



import org.springframework.data.repository.CrudRepository;

import com.davs.tacoCloud_1.models.TacoOrder;


public interface OrderRepository extends CrudRepository<TacoOrder, String>{



}
