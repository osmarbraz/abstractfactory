package com.abstractfactory.buttons;

/**
 * Abstract Factory assume que você tem várias famílias de produtos, estruturado
 * em hierarquias de classes separadas (Botão/Caixa de seleção). Todos os
 * produtos de a mesma família tem a interface comum.
 *
 * Esta é a interface comum para a família de botões.
 */
public interface Button {

    void paint();
}
