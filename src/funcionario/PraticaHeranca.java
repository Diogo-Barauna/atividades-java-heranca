package funcionario;

public class PraticaHeranca {
    public static class FuncionarioBanco {
        private String nome;
        private double salario;

        public FuncionarioBanco(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }

    public static class Gerente extends FuncionarioBanco {
        private String login;
        private String senha;

        public Gerente(String nome, double salario, String login, String senha) {
            super(nome, salario);
            this.login = login;
            this.senha = senha;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }
    }

    public static class Telefonista extends FuncionarioBanco {
        private String codigoEstacao;

        public Telefonista(String nome, double salario, String codigoEstacao) {
            super(nome, salario);
            this.codigoEstacao = codigoEstacao;
        }

        public String getCodigoEstacao() {
            return codigoEstacao;
        }

        public void setCodigoEstacao(String codigoEstacao) {
            this.codigoEstacao = codigoEstacao;
        }
    }

    public static class Secretaria extends FuncionarioBanco {
        private String numeroRamal;

        public Secretaria(String nome, double salario, String numeroRamal) {
            super(nome, salario);
            this.numeroRamal = numeroRamal;
        }

        public String getNumeroRamal() {
            return numeroRamal;
        }

        public void setNumeroRamal(String numeroRamal) {
            this.numeroRamal = numeroRamal;
        }
    }
}

