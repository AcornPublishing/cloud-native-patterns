package com.corneliadavis.cloudnative.connections;

import com.corneliadavis.cloudnative.connections.Connection;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by corneliadavis on 9/4/17.
 */
public interface ConnectionRepository extends CrudRepository<Connection, Long> {

    Iterable<Connection> findByFollower(Long follower);
}
