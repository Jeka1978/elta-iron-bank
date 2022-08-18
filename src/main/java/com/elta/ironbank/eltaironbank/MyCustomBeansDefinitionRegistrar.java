package com.elta.ironbank.eltaironbank;

import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.time.Period;

/**
 * @author Evgeny Borisov
 */
public class MyCustomBeansDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(Period.class);//some custom class
        ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
        argumentValues.addGenericArgumentValue(1);
        argumentValues.addGenericArgumentValue(1);
        argumentValues.addGenericArgumentValue(1);
        beanDefinition.setConstructorArgumentValues(argumentValues);
        beanDefinition.setScope("prototype");
        registry.registerBeanDefinition("myBean",beanDefinition);
    }
}
