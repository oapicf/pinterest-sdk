package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * User list type
 */
public enum UserListType {
  
  EMAIL("EMAIL"),
  
  IDFA("IDFA"),
  
  MAID("MAID"),
  
  LR_ID("LR_ID"),
  
  DLX_ID("DLX_ID"),
  
  HASHED_PINNER_ID("HASHED_PINNER_ID");

  private final String value;

  UserListType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UserListType fromValue(String value) {
    for (UserListType b : UserListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

