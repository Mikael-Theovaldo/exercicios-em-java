package conteudos.enumeracao.exercicios.enumComComportamento;

public enum Operacao {
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO;

    public double calcular(double a, double b){
        return switch (this){
            case SOMA -> a + b;
            case SUBTRACAO -> a - b;
            case MULTIPLICACAO -> a * b;
            case DIVISAO -> {
                if (b == 0) {
                    throw new IllegalArgumentException("impossivel divisao por 0");
                } else {
                    yield a / b;
                }

            }
        };
    }

}
