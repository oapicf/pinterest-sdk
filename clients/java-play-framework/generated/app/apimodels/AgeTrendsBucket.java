package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets AgeTrendsBucket
 */
public enum AgeTrendsBucket {
  
  _18_24("18-24"),
  
  _25_34("25-34"),
  
  _35_44("35-44"),
  
  _45_49("45-49"),
  
  _50_54("50-54"),
  
  _55_64("55-64"),
  
  _65_("65+");

  private final String value;

  AgeTrendsBucket(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AgeTrendsBucket fromValue(String value) {
    for (AgeTrendsBucket b : AgeTrendsBucket.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

