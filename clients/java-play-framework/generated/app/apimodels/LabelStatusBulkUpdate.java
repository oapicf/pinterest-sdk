package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Set status to `ARCHIVED` to remove the label from the parent entity.
 */
public enum LabelStatusBulkUpdate {
  
  ARCHIVED("ARCHIVED");

  private final String value;

  LabelStatusBulkUpdate(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LabelStatusBulkUpdate fromValue(String value) {
    for (LabelStatusBulkUpdate b : LabelStatusBulkUpdate.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

