package org.example.package3;

import org.example.package1.MathUtils;
import org.example.package2.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.example.package1.MathUtils.divide;

public class MainApp {
    private static final Logger logger = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        mathUtils.add(10, 5);
        logger.info("Resultado da adição: {}", mathUtils.getResult());

        StringUtils stringUtils = new StringUtils();
        stringUtils.concatenate("Hello, ", "World!");
        logger.info("String concatenada: {}", stringUtils.getResult());

        logger.debug("Mensagem de debug para análise detalhada.");

        try {
            int resultadoDivisao = divide(10, 0);
            logger.info("Resultado da divisão: {}", resultadoDivisao);
        } catch (ArithmeticException e) {
            logger.error("Erro ao dividir por zero: {}", e.getMessage());
        }
    }

}
