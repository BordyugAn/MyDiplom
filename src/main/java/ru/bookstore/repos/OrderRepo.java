package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.OrderEntity;

public interface OrderRepo extends CrudRepository<OrderEntity, Long> {
}
