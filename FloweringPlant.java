/**
 * Красивоцветущее растение.
 * Дополняет {@link Plant} полем «продолжительность цветения».
 *
 * @author Student
 * @version 1.0
 */
public class FloweringPlant extends Plant {

    /** Продолжительность цветения в месяцах. */
    private int BloomProd;

    /**
     * Конструктор красивоцветущего растения.
     *
     * @param name      название
     * @param height    высота в см
     * @param lifespan  продолжительность жизни в годах
     * @param bloomprod продолжительность цветения в месяцах
     */
    public FloweringPlant(String name, double height, int lifespan, int bloomprod) {
        super(name, height, lifespan);
        this.BloomProd = bloomprod;
    }

    /**
     * Устанавливает продолжительность цветения.
     *
     * @param bloomprod продолжительность цветения в месяцах
     */
    public void SetBloomProd(int bloomprod) {
        this.BloomProd = bloomprod;
    }

    /**
     * Возвращает продолжительность цветения.
     *
     * @return продолжительность цветения в месяцах
     */
    public int GetBloomProd() {
        return BloomProd;
    }

    /**
     * Возвращает название вида растения.
     *
     * @return строка «Красивоцветущее»
     */
    @Override
    public String GetType() {
        return "Красивоцветущее";
    }

    /**
     * Возвращает строковое представление растения.
     *
     * @return строка с данными родителя и продолжительностью цветения
     */
    @Override
    public String toString() {
        return super.toString() + " | Продолжительность цветения: " + BloomProd + " мес.";
    }
}