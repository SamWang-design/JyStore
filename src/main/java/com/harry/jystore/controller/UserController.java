package com.harry.jystore.controller;

import com.harry.jystore.entity.User;
import com.harry.jystore.service.UserService;
import com.harry.jystore.util.JsonUtil;
import com.harry.jystore.util.ResultCode;
import com.harry.jystore.util.ResultGenerator;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
    @ApiOperation("查询表的全部")
    @RequestMapping(value = "/find2", method = RequestMethod.GET)
    public JsonUtil findall2(){
        List<User> findall = userService.findallss();
        return ResultGenerator.genSuccessResult(findall);
    }
}
