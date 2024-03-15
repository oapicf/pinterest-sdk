package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * User list operation type (add or remove)
 */
public enum UserListOperationType {
  
  ADD("ADD"),
  
  REMOVE("REMOVE");

  private final String value;

  UserListOperationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UserListOperationType fromValue(String value) {
    for (UserListOperationType b : UserListOperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

