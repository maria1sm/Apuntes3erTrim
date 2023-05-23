package Teoria;

import java.util.regex.Pattern;

public class Regex {
    public static boolean validateMatricula(String matricula) {
        // Expresión regular para validar la matrícula
        String regex = "^\\d{4}[A-Z]{3}$";

        return matricula.matches(regex);
    }

    // VALIDAR IBAN
    public static boolean validateIBAN(String iban) {
        // Eliminar espacios en blanco del IBAN
        String cleanedIBAN = iban.replaceAll("\\s+", "");

        // Expresión regular para validar el IBAN
        String regex = "^([A-Z]{2}\\d{2})\\s*([0-9A-Z]{4}\\s*){4}[0-9A-Z]{2}$";

        return Pattern.matches(regex, cleanedIBAN);
    }
    // VALIDAR DNI

    private static void validarDNI(String dni){
        if (dni == null) {
            throw new IllegalArgumentException("Error... No puede tener DNI nulo.");
        }

        String letrasPosibles = "TRWAGMYFPDXBNJZSQVHLCKE";
        if (!dni.matches("[0-9]{8}["+ letrasPosibles +"]")) {
            throw new IllegalArgumentException("Error... Formato de DNI no valido.");
        }

        int resto = Integer.parseInt(dni.substring(0, 8)) % 23;
        if (dni.charAt(8) != letrasPosibles.charAt(resto)) {
            throw new IllegalArgumentException("Error... Letra de DNI no valida.");
        }
    }

    //Email
    private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static boolean validateEmail(String email) {
        return pattern.matcher(email).matches();
    }

}
