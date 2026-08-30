package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * AI disclosure declaration the creator has made about the Pin.
 */
public enum AiDisclosureItem {
  
  AI_MODIFIED("AI_MODIFIED"),
  
  SYNTHETIC_PERFORMER("SYNTHETIC_PERFORMER");

  private final String value;

  AiDisclosureItem(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AiDisclosureItem fromValue(String value) {
    for (AiDisclosureItem b : AiDisclosureItem.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

