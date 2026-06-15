package com.abstractfactory.checkboxes;

/**
 * Todas as famílias de produtos possuem as mesmas variedades (MacOS/Windows).
 *
 * Esta é uma variante de uma caixa de seleção.
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Voce criou um MacOSCheckbox.");
    }
}
