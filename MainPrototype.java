
abstract class Documento implements Cloneable {
    String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public abstract void mostrar();

    @Override
    public Documento clone() {
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Relatorio extends Documento {
    public Relatorio(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrar() {
        System.out.println("Relatório: " + titulo);
    }
}

public class MainPrototype {
    public static void main(String[] args) {
        Relatorio original = new Relatorio("Vendas 2025");
        Relatorio copia = (Relatorio) original.clone();

        original.mostrar();
        copia.mostrar();
    }
}
