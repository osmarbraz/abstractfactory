package com.abstractfactory.factories;

import com.abstractfactory.buttons.Button;
import com.abstractfactory.checkboxes.Checkbox;

/**
 * A fábrica abstrata conhece todos os tipos de produtos (abstratos).
 */
public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();

    /**
     * Retorna a fabrica de acordo com o SO.
     *
     * @return Uma fábrica.
     */
    public static GUIFactory getFactory() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            return new MacOSFactory();
        } else {
            return new WindowsFactory();
        }
    }
}
