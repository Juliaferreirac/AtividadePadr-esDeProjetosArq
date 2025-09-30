
class Computador {
    private String cpu;
    private String ram;
    private String gpu;

    private Computador(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.gpu = builder.gpu;
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String gpu;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Computador build() {
            return new Computador(this);
        }
    }

    @Override
    public String toString() {
        return "Computador [CPU=" + cpu + ", RAM=" + ram + ", GPU=" + gpu + "]";
    }
}

public class MainBuilder {
    public static void main(String[] args) {
        Computador pc = new Computador.Builder()
                            .cpu("Intel i7")
                            .ram("16GB")
                            .gpu("RTX 3060")
                            .build();
        System.out.println(pc);
    }
}
