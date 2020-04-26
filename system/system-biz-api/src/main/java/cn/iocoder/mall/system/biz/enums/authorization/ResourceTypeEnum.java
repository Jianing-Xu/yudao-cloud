package cn.iocoder.mall.system.biz.enums.authorization;

import cn.iocoder.common.framework.core.IntArrayValuable;

import java.util.Arrays;

/**
 * 资源类型枚举
 */
public enum ResourceTypeEnum implements IntArrayValuable {

    MENU(1, "菜单"),
    BUTTON(2, "按钮");

    public static final int[] ARRAYS = Arrays.stream(values()).mapToInt(ResourceTypeEnum::getValue).toArray();

    /**
     * 资源类型
     */
    private final Integer value;
    /**
     * 资源类型名
     */
    private final String name;

    ResourceTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public int[] array() {
        return ARRAYS;
    }

}