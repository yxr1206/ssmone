package com.william.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public interface UserMapper {
    List<Map<String, Object>> listUsers();
}
