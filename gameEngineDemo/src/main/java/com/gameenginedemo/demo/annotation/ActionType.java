package com.gameenginedemo.demo.annotation;

import com.gameenginedemo.demo.enumeration.HeroSkillEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description
 * Date 2020/9/23 0:05
 * Created by kwz
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface ActionType {
    HeroSkillEnum[] skills = new HeroSkillEnum[]{};
}
