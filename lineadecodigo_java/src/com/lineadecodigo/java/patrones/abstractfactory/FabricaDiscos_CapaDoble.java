package com.lineadecodigo.java.patrones.abstractfactory;

/**
 * @file FabricaDiscos_CapaDoble.java
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date Enero 29, 2013
 * @url http://lineadecodigo.com/patrones/patron-abstract-factory/
 * @description Codigo correspondiente al ejemplo sobre el patr�n de dise�o AbstractFactory
 */
import com.lineadecodigo.java.patrones.*;

public class FabricaDiscos_CapaDoble implements FabricaDiscos {

        @Override
        public BluRay crearBluRay() {
                return new BluRay_CapaDoble();
        }

        @Override
        public DVD crearDVD() {
                return new DVD_CapaDoble();
        }

}