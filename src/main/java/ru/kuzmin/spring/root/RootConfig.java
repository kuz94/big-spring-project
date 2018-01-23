/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kuzmin.spring.root;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author kuzmin_a_a
 */
@Configuration
@ComponentScan("ru.kuzmin.spring.root")
@ImportResource("classpath:spring_beans.xml")
public class RootConfig {

}
