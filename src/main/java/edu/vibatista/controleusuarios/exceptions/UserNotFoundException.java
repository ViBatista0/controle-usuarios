package edu.vibatista.controleusuarios.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Usuário não encontrado!");
    }
}
