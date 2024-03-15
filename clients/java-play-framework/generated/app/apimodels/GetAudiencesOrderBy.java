package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets GetAudiencesOrderBy
 */
public enum GetAudiencesOrderBy {
  
  NONE("NONE"),
  
  ID("ID"),
  
  SIZE("SIZE"),
  
  CREATION_DATE("CREATION_DATE"),
  
  UPDATED_TIME("UPDATED_TIME"),
  
  NAME("NAME"),
  
  STATUS("STATUS"),
  
  TYPE("TYPE");

  private final String value;

  GetAudiencesOrderBy(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GetAudiencesOrderBy fromValue(String value) {
    for (GetAudiencesOrderBy b : GetAudiencesOrderBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

