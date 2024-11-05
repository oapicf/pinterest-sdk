package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AdvancedAuctionOperation
 */
public enum AdvancedAuctionOperation {
  
  UPSERT("UPSERT"),
  
  DELETE("DELETE");

  private final String value;

  AdvancedAuctionOperation(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdvancedAuctionOperation fromValue(String value) {
    for (AdvancedAuctionOperation b : AdvancedAuctionOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

