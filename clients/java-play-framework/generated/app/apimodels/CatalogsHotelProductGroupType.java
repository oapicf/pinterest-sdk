package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Catalog hotel product group type
 */
public enum CatalogsHotelProductGroupType {
  
  MERCHANT_CREATED("MERCHANT_CREATED"),
  
  ALL_LISTINGS("ALL_LISTINGS");

  private final String value;

  CatalogsHotelProductGroupType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogsHotelProductGroupType fromValue(String value) {
    for (CatalogsHotelProductGroupType b : CatalogsHotelProductGroupType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

