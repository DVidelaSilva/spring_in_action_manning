package com.davs.tacoCloud_1.data;


import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.davs.tacoCloud_1.models.TacoOrder;


public interface OrderRepository extends CrudRepository<TacoOrder, Long>{

    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
      String deliveryZip, Date startDate, Date endDate);

}
