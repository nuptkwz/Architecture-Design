package com.gameenginedemo.demo.enumeration;

import lombok.AllArgsConstructor;

/**
 * Description
 * Date 2020/9/22 23:59
 * Created by kwz
 */
@AllArgsConstructor
public enum HeroSkillEnum {

    ONE_FLAT_A("一技能平A"),
    TWO_POWER("二技能力量"),
    THREE_BIG_MOVE("三技能大招"),
    FOUR_SPECIAL("四技能特殊技能");
    private String description;
}
