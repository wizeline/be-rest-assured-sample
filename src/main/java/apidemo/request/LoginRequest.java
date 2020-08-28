package apidemo.request;

import lombok.Builder;
import lombok.Data;

/**
 * LoginRequest
 */
@Builder
public class LoginRequest {
    private String email;
    private String password;  
}