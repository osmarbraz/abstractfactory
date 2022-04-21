package com.abstractfactory.checkboxes;

/**
 * Todas as famílias de produtos possuem as mesmas variedades (MacOS/Windows).
 *
 * Esta é outra variante de uma caixa de seleção.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
