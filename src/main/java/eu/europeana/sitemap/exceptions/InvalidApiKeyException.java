package eu.europeana.sitemap.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception that is thrown when the provided API key is not valid
 * @author Patrick Ehlert
 * Created on 11-02-2019
 */
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class InvalidApiKeyException extends SiteMapException {

    public InvalidApiKeyException(String msg, Throwable t) {
        super(msg, t);
    }

    public InvalidApiKeyException(String msg) {
        super(msg);
    }

    /**
     * @return false because we don't want to explicitly log this type of exception
     */
    @Override
    public boolean doLog() {
        return false;
    }
}
