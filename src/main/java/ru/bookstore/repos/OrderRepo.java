package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.OrderEntity;

import javax.persistence.Lob;
import java.util.List;

public interface OrderRepo extends CrudRepository<OrderEntity, Long> {
    OrderEntity findFirstByOrderByIdDesc();
    OrderEntity findById(Integer id);
    List<OrderEntity> findAllByBuyer(Integer id);
}
