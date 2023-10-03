package ru.dunaf.planner.todo.feign;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.dunaf.planner.entity.User;


//если не отработает planner-users, то будет вызываться UserFeignClient класс
@FeignClient(name = "planner-users", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {

    @PostMapping("/user/id")
    ResponseEntity<User> findUserById (@RequestBody Long userId);
}

@Component
class UserFeignClientFallback implements UserFeignClient {

    //этот метод будет вызываться, если не будет доступен /user/id
    @Override
    public ResponseEntity<User> findUserById(Long userId) {
        return null;
    }
}
