
package fhi360.it.assetverify.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception
{
    public ResourceNotFoundException(final String message) {
        super(message);
    }
}
