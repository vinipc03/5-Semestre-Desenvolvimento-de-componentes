public class exercicio1 {
    // Interface responsável apenas pela conexão
interface Connection {
    void dial(String phoneNumber);
    void hangup();
}

// Interface responsável apenas pela comunicação de dados
interface DataChannel {
    void send(char c);
    char recv();
}

// Exemplo de uma classe que implementa as duas interfaces
class StandardModem implements Connection, DataChannel {

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Discando para " + phoneNumber);
    }

    @Override
    public void hangup() {
        System.out.println("Encerrando chamada...");
    }

    @Override
    public void send(char c) {
        System.out.println("Enviando: " + c);
    }

    @Override
    public char recv() {
        System.out.println("Recebendo caractere...");
        return 'A';
    }
}

}

// Explicação

// A refatoração separou a interface original Modem em duas novas interfaces:

// Connection: cuida apenas do gerenciamento da conexão telefônica;

// DataChannel: lida apenas com a transmissão e recepção de dados.

// Essa organização segue o Princípio da Responsabilidade Única (SRP) porque cada interface tem um único motivo para mudar. Além disso, ela traz vantagens importantes:

// Manutenibilidade: mudanças em como a conexão é feita não afetam o código de transmissão de dados;

// Flexibilidade: classes podem implementar apenas as interfaces que realmente precisam (ex.: um dispositivo que só gerencia conexão não precisa implementar métodos de envio de dados);

// Clareza: os nomes das interfaces deixam explícita a responsabilidade de cada uma.

// Assim, o código torna-se mais modular, fácil de estender e aderente a boas práticas de design orientado a objetos.