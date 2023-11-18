package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materias;

/**
 * Classe que representa um caderno, qual é uma especialização de um produto da loja.
 * @author pedro ferreira
 */
public class Caderno extends Produto {

    /**
     * Materias do caderno.
     */
    private Materias tipo;

    public Materias getTipo() {
        return tipo;
    }

    public void setTipo(Materias tipo) {
        this.tipo = tipo;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) * (1 + tipo.getFator());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "tipo='" + tipo + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}
