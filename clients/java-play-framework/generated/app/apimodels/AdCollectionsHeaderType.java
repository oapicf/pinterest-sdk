package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Collections ad header type for ads
 */
public enum AdCollectionsHeaderType {
  
  SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
  
  EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
  
  NO_HEADER("NO_HEADER");

  private final String value;

  AdCollectionsHeaderType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdCollectionsHeaderType fromValue(String value) {
    for (AdCollectionsHeaderType b : AdCollectionsHeaderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

