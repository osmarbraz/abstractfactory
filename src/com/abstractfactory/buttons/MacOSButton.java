package com.abstractfactory.buttons;

/**
 * Todas as famílias de produtos possuem as mesmas variedades (MacOS/Windows).
 *
 * Esta é uma variante do MacOS de um botão.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("Você criou um MacOSButton.");
    }
}
