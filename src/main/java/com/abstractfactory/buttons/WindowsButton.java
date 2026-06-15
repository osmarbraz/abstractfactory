package com.abstractfactory.buttons;

/**
 * Todas as famílias de produtos possuem as mesmas variedades (MacOS/Windows).
 *
 * Esta é outra variante de um botão.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Você criou um WindowsButton.");
    }
}
