package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: Leo
 * @Date: 2018/8/19
 * @Description:
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String >{
    List<OrderDetail> findByOrderId(String orderId);

}
