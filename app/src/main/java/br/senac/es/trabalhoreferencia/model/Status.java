package br.senac.es.trabalhoreferencia.model;

public enum Status {


    ENVIADA {
        @Override
        public String toString() {
            return "ENVIADA";
        }

    },
    NAOENVIADA {
        @Override
        public String toString() {
            return "NÃO ENVIADA";

        }
    }
}
