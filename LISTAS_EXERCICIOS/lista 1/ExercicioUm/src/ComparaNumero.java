class ComparaNumero {
    public static void compararNumeros(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Os numeros sao iguais.");
        } else {
            System.out.println("Os numeros sao diferentes.");
            int maior = Math.max(num1, num2);
            int menor = Math.min(num1, num2);
            System.out.println("Maior numero: " + maior);
            System.out.println("Menor numero: " + menor);
        }
    }
}
