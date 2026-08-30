package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Method used to verify website ownership.
 */
public enum WebsiteVerificationMethod {
  
  FILENAME("FILENAME"),
  
  METATAG("METATAG"),
  
  DNSTXT("DNSTXT");

  private final String value;

  WebsiteVerificationMethod(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WebsiteVerificationMethod fromValue(String value) {
    for (WebsiteVerificationMethod b : WebsiteVerificationMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

