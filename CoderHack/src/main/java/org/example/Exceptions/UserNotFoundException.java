package org.example.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserNotFoundException extends RuntimeException{
    String message;
}
