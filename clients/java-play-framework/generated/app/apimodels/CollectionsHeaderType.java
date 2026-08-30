package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Collections ad header type
 */
public enum CollectionsHeaderType {
  
  SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
  
  EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
  
  NO_HEADER("NO_HEADER"),
  
  ON_SALE("ON_SALE"),
  
  GET_DEAL("GET_DEAL");

  private final String value;

  CollectionsHeaderType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CollectionsHeaderType fromValue(String value) {
    for (CollectionsHeaderType b : CollectionsHeaderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

