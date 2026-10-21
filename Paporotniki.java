/**
 * Папоротник — споровое растение.
 * Наследует общие поля и методы от {@link Plant}.
 *
 * @author Student
 * @version 1.0
 */
public class Paporotniki extends Plant {

    /**
     * Конструктор папоротника.
     *
     * @param name     название
     * @param height   высота в см
     * @param lifespan продолжительность жизни в годах
     */
    public Paporotniki(String name, double height, int lifespan) {
        super(name, height, lifespan);
    }

    /**
     * Возвращает название вида растения.
     *
     * @return строка «Папоротник»
     */
    @Override
    public String GetType() {
        return "Папоротник";
    }
}