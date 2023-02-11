public class Notebook {
    private String modelName;
    private double displayDiagonal;
    private String color;
    private String cpu;
    private String ram;
    private String hddSize;
    private String os;
    private int idProduct;
    private int productCount;
    private static int count = 0;
    final private String[] colors = new String[] { "gray", "black", "red", "white" };
    final private String[] sizesHdd = new String[] { "256 Gb", "512 Gb", "1 Tb", "1.5 Tb" };
    final private String[] cpuModels = new String[] { "Intel Pentium", "Intel Core", "AMD", "AMD Ryzen" };
    final private String[] varRAM = new String[] { "4 Gb", "6 Gb", "8 Gb", "16 Gb" };
    final private String[] varOS = new String[] { "Windows 7", "Windows 10", "Linux", "without OS", "DOS" };

    Notebook(String name) {
        this.modelName = name;
        this.displayDiagonal = (int) (((14 + (int) (Math.random() * 20)) + Math.random()) * 10) * 0.1;
        this.color = colors[0 + (int) (Math.random() * (colors.length - 1))];
        this.cpu = cpuModels[0 + (int) (Math.random() * (cpuModels.length - 1))];
        this.ram = varRAM[0 + (int) (Math.random() * (varRAM.length - 1))];
        this.hddSize = sizesHdd[0 + (int) (Math.random() * (sizesHdd.length - 1))];
        this.os = varOS[0 + (int) (Math.random() * (varOS.length - 1))];
        this.count++;
        this.idProduct = (int) ((this.count + Math.random()) * 100000);
        this.productCount = 1 + (int) (Math.random() * 30);
    }

    @Override
    public String toString() {
        return String.format(
                "Ноут %s (id: %d, кол.: %s шт.): диаг. - %.1f, цвет - %s, проц. - %s, RAM - %s, HDD - %s, ОС - %s. \n",
                this.modelName, this.idProduct, this.productCount, this.displayDiagonal, this.color, this.cpu, this.ram,
                this.hddSize, this.os);
    }

}
