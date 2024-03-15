package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 */
public enum CreativeType {
  
  REGULAR("REGULAR"),
  
  VIDEO("VIDEO"),
  
  SHOPPING("SHOPPING"),
  
  CAROUSEL("CAROUSEL"),
  
  MAX_VIDEO("MAX_VIDEO"),
  
  SHOP_THE_PIN("SHOP_THE_PIN"),
  
  COLLECTION("COLLECTION"),
  
  IDEA("IDEA"),
  
  SHOWCASE("SHOWCASE"),
  
  QUIZ("QUIZ");

  private final String value;

  CreativeType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CreativeType fromValue(String value) {
    for (CreativeType b : CreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

