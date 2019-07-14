package com.example.demo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel()
public class LoginQuery {
    @NotBlank
    @ApiModelProperty(value = "账户", required = true)
    private String account;

    @ApiModelProperty("密码")
    private String password;
}
