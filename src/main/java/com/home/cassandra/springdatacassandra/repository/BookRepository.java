package com.home.cassandra.springdatacassandra.repository;

import com.home.cassandra.springdatacassandra.entity.Book;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface BookRepository extends CassandraRepository<Book, Integer> {

    List<Book> findAllById(String id);
}
