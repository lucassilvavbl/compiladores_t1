package br.dc.compiladores.t1_compiladores;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileOutputStream;
import java.io.IOException;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.err.println("Uso: java Principal <arquivo_entrada> <arquivo_saida>");
                System.exit(1);
            }

            String arquivoEntrada = args[0];
            String arquivoSaida = args[1];

            // Cria um CharStream a partir do arquivo de entrada e cria um lexer para
            // analisar o CharStream
            CharStream cs = CharStreams.fromFileName(arquivoEntrada);
            t1_compiladores lex = new t1_compiladores(cs);

            Token t = null;
            StringBuilder sb = new StringBuilder();

            // Itera sobre os tokens identificados pelo analisador léxico
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String identificador_token = t1_compiladores.VOCABULARY.getDisplayName(t.getType());

                // Verifica o tipo do token e executa ação correspondente
                switch (identificador_token) {
                    case "ERRO" -> {
                        String msgErro = "Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado"
                                + "\n";
                        sb.append(msgErro);
                        byte[] bytes_awnser = sb.toString().getBytes();
                        FileOutputStream fo = new FileOutputStream(arquivoSaida);
                        fo.write(bytes_awnser);
                        return;
                    }
                    case "COMENTARIO_ABERTO" -> {
                        String msgErro = "Linha " + t.getLine() + ": comentario nao fechado" + "\n";
                        sb.append(msgErro);
                        byte[] bytes_awnser = sb.toString().getBytes();
                        FileOutputStream fo = new FileOutputStream(arquivoSaida);
                        fo.write(bytes_awnser);
                        return;
                    }
                    case "CADEIA_ABERTA" -> {
                        String cadAberta = "Linha " + t.getLine() + ": cadeia literal nao fechada" + "\n";
                        sb.append(cadAberta);
                        byte[] bytes_awnser = sb.toString().getBytes();
                        FileOutputStream fo = new FileOutputStream(arquivoSaida);
                        fo.write(bytes_awnser);
                        return;
                    }
                    case "NUM_INT" -> {
                        String completeToken = "<" + "'" + t.getText() + "'" + "," + identificador_token + ">" + "\n";
                        sb.append(completeToken);
                    }
                    case "NUM_REAL" -> {
                        String completeToken = "<" + "'" + t.getText() + "'" + "," + identificador_token + ">" + "\n";
                        sb.append(completeToken);
                    }
                    case "IDENT" -> {
                        String completeToken = "<" + "'" + t.getText() + "'" + "," + identificador_token + ">" + "\n";
                        sb.append(completeToken);
                    }
                    case "CADEIA" -> {
                        String completeToken = "<" + "'" + t.getText() + "'" + "," + identificador_token + ">" + "\n";
                        sb.append(completeToken);
                    }
                    default -> {
                        String completeToken = "<" + "'" + t.getText() + "'" + ",'" + t.getText() + "'>" + "\n";
                        sb.append(completeToken);
                    }
                }

            }
            byte[] bytes_awnser = sb.toString().getBytes();
            FileOutputStream fo = new FileOutputStream(arquivoSaida);
            fo.write(bytes_awnser);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}