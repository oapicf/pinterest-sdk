package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Summary status for product group
 */
public enum ProductGroupSummaryStatus {
  
  RUNNING("RUNNING"),
  
  PAUSED("PAUSED"),
  
  EXCLUDED("EXCLUDED"),
  
  ARCHIVED("ARCHIVED");

  private final String value;

  ProductGroupSummaryStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductGroupSummaryStatus fromValue(String value) {
    for (ProductGroupSummaryStatus b : ProductGroupSummaryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

