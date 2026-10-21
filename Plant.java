/**
 * Абстрактный класс, представляющий комнатное растение.
 * Содержит общие поля и методы для всех видов растений.
 *
 * @author Student
 * @version 1.0
 */
public abstract class Plant {

    /** Название растения. */
    private String Name;

    /** Высота растения в сантиметрах. */
    private double Height;

    /** Продолжительность жизни в годах. */
    private int LifeSpan;

    /**
     * Конструктор растения.
     *
     * @param name     название
     * @param height   высота в см
     * @param lifespan продолжительность жизни в годах
     */
    public Plant(String name, double height, int lifespan) {
        this.Name = name;
        this.Height = height;
        this.LifeSpan = lifespan;
    }

    /**
     * Возвращает название вида растения.
     * Реализуется в классах-наследниках.
     *
     * @return название вида
     */
    public abstract String GetType();

    /**
     * Устанавливает название растения.
     *
     * @param name новое название
     */
    public void SetName(String name) {
        this.Name = name;
    }

    /**
     * Устанавливает высоту растения.
     *
     * @param height новая высота в см
     */
    public void SetHeight(double height) {
        this.Height = height;
    }

    /**
     * Устанавливает продолжительность жизни.
     *
     * @param lifespan новая продолжительность жизни в годах
     */
    public void SetLifeSpan(int lifespan) {
        this.LifeSpan = lifespan;
    }

    /**
     * Возвращает название растения.
     *
     * @return название
     */
    public String GetName() {
        return Name;
    }

    /**
     * Возвращает высоту растения.
     *
     * @return высота в см
     */
    public double GetHeight() {
        return Height;
    }

    /**
     * Возвращает продолжительность жизни.
     *
     * @return продолжительность жизни в годах
     */
    public int GetLifeSpan() {
        return LifeSpan;
    }

    /**
     * Возвращает строковое представление растения.
     *
     * @return строка с типом, названием, высотой и сроком жизни
     */
    @Override
    public String toString() {
        return "[" + GetType() + "] " + Name
                + " | Высота: " + Height + " см"
                + " | Продолжительность жизни: " + LifeSpan + " лет";
    }
}