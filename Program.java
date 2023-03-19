/*Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. Для каждого сформировать список свойств и возможных действий. 
Напрнимер свойство скорость, действие нанести удар. Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый 
класс описывающий свойства и действия имеющиеся у всех персонажей. Создать этот класс. Создать классы для каждого типа персонажей 
наследующие и расширяющие абстрактный(обобщённый) класс. В основной программе создать по одному экземпляру каждого типа персонажей.
*/
import Units.*;

public class Program {
    public static void main(String[] args) {

        BaseHero peasant = new Peasant();
        System.out.println(peasant.getInfo());
        
        BaseHero robber = new Robber();
        System.out.println(robber.getInfo());

        BaseHero sniper = new Sniper();
        System.out.println(sniper.getInfo());

        BaseHero magician = new Magician();
        System.out.println(magician.getInfo());

        BaseHero spearman = new Spearman();
        System.out.println(spearman.getInfo());

        BaseHero crossbowman = new Crossbowman();
        System.out.println(crossbowman.getInfo());

        BaseHero monk = new Monk();
        System.out.println(monk.getInfo());
    }
}