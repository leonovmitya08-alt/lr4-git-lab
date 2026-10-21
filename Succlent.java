/**
 * Суккулент — растение, запасающее воду в листьях или стебле.
 * Наследует общие поля и методы от {@link Plant}.
 *
 * @author Student
 * @version 1.0
 */
public class Succlent extends Plant {

    /**
     * Конструктор суккулента.
     *
     * @param name     название
     * @param height   высота в см
     * @param lifespan продолжительность жизни в годах
     */
    public Succlent(String name, double height, int lifespan) {
        super(name, height, lifespan);
    }

    /**
     * Возвращает название вида растения.
     *
     * @return строка «Суккуленты»
     */
    @Override
    public String GetType() {
        return "Суккуленты";
    }
}