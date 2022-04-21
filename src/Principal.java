
import com.abstractfactory.buttons.Button;
import com.abstractfactory.checkboxes.Checkbox;
import com.abstractfactory.factories.GUIFactory;

/**
 *
 * @author osmar
 */
public class Principal {

    public static void main(String[] args) {

        /**
         * A fabrica escolhe o tipo de fábrica e o cria em tempo de execução
         * (geralmente em fase de inicialização), dependendo da configuração ou
         * ambiente variáveis.
         */
        GUIFactory factory = GUIFactory.getFactory();

        /**
         * Os usuários da fábrica não se importam com qual fábrica concreta eles
         * usam, pois trabalham com fábricas e produtos através de interfaces
         * abstratas.
         */
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();

    }

}
