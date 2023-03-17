package com.ark.userinfo.query;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Api(value = "账户信息", tags = "账户信息")
@FeignClient(name = "userinfo-query", url = "http://ark-userinfo/ark-userinfo")
public interface UserinfoApi {
    @ApiOperation(value = "获取用户信息", notes = "用户信息")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "long", paramType = "arg")
    @GetMapping("/{argType}/{arg}")
    AccountInfo getUserinfoById(@PathVariable("argType") String argType, @PathVariable("arg") String arg);
}
