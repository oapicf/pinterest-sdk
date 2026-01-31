package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ProductCategoriesEngagementType
 */
public enum ProductCategoriesEngagementType {
  
  ENGAGEMENT("ENGAGEMENT"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  SAVE("SAVE");

  private final String value;

  ProductCategoriesEngagementType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductCategoriesEngagementType fromValue(String value) {
    for (ProductCategoriesEngagementType b : ProductCategoriesEngagementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

