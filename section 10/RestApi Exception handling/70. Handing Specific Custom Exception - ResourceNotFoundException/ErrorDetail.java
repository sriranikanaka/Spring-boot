In Exception package you have to create error class

package Net.javaguides.springboot.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ErrorDetails {
    private LocalDateTime timestamp;
    private String message;
    private String path;
    private String errorcode;
}
