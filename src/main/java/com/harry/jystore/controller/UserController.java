package com.harry.jystore.controller;

import com.harry.jystore.entity.User;
import com.harry.jystore.service.UserService;
import com.harry.jystore.util.JsonUtil;
import com.harry.jystore.util.ResultCode;
import com.harry.jystore.util.ResultGenerator;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;


    @ApiOperation("查询表的全部")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
        public JsonUtil findall(){
            List<User> findall = userService.findalls();
            return ResultGenerator.genSuccessResult(findall);
        }
    @ApiOperation("使用mybatis做的更新操作")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public JsonUtil update(@RequestBody User user){
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }
    @ApiOperation("新增")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JsonUtil add(@RequestBody User user){
        userService.add(user);
        return ResultGenerator.genSuccessResult();
    }
    @ApiOperation("删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public JsonUtil delete(@RequestBody User user){
        userService.delete(user);
        return ResultGenerator.genSuccessResult();
    }
}
