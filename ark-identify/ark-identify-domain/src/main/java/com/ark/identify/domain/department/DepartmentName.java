package com.ark.identify.domain.department;

import com.ark.common.exception.api.Assert;
import com.ark.common.util.MapUtil;
import lombok.Getter;

import java.util.Map;

@Getter
public class DepartmentName {
    private String departmentName;

    public DepartmentName(String departmentName) {
        Assert.inLengthRange(departmentName, 50, MapUtil.simpleMap("departmentName", "部门名字数在50个内"));
        this.departmentName = departmentName;
    }
}
