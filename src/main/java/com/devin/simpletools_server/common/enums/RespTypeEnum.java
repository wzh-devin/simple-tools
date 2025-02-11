package com.devin.simpletools_server.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 2025/2/11 17:42
 * <p>
 *     响应类型枚举
 * </p>
 * @author <a href="https://github.com/wzh-devin">devin</a>
 * @version 1.0
 * @since 1.0
 */
@Getter
@AllArgsConstructor
public enum RespTypeEnum {

    WX_LOGIN(1, "微信登录，二维码返回值"),
    ;

    private final Integer type;
    private final String desc;
}
