package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
 */
public enum BatchOperation {
  
  UPDATE("UPDATE"),
  
  UPSERT("UPSERT"),
  
  CREATE("CREATE"),
  
  DELETE_DISCONTINUED("DELETE_DISCONTINUED"),
  
  DELETE("DELETE");

  private final String value;

  BatchOperation(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BatchOperation fromValue(String value) {
    for (BatchOperation b : BatchOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

