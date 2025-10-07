//Primeira questao

//  Agregação:Jogadores de Futebol e jogadores, Carrinho de Compras e Produtos
// Composição: Casa e comodo , Nota fiscal e itens 

// Segunda questao:
//Se uma classe é declarada como final, ela não pode ser herdada por outras classes.
// um atributo (variável de instância ou de classe) é declarado como final, ele deve ser inicializado no momento da sua declaração ou no construtor da classe, e o seu valor não poderá ser alterado posteriormente.

// Terceira questao : A principal vantagem de programar um método estático é que ele pode ser chamado sem a necessidade de criar uma instância (objeto) da classe.

// Quarta questao : outros metododos sao getClass() e clone

// Quinta questão:




import javax.swing.JOptionPane;

public class CalculadoraSimples {

    public static void main(String[] args) {
        String num1Str, num2Str;
        double num1 = 0, num2 = 0;

        while (true) {
            try {
                num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
                if (num1Str == null) return;
                num1 = Double.parseDouble(num1Str);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            try {
                num2Str = JOptionPane.showInputDialog("Digite o segundo número:");
                if (num2Str == null) return;
                num2 = Double.parseDouble(num2Str);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        String[] options = {"+", "−", "×", "÷"};
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha a operação matemática:",
                "Operação",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        if (escolha == JOptionPane.CLOSED_OPTION) return;

        double resultado = 0;
        String operacao = options[escolha];

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "−":
                resultado = num1 - num2;
                break;
            case "×":
                resultado = num1 * num2;
                break;
            case "÷":
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.", "Erro de Cálculo", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                resultado = num1 / num2;
                break;
        }

        JOptionPane.showMessageDialog(null, "O resultado de " + num1 + " " + operacao + " " + num2 + " é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
