package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Catalog product group type
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-05-07T06:40:56.403503Z[Etc/UTC]")
public enum CatalogsProductGroupType {
  
  MERCHANT_CREATED("MERCHANT_CREATED"),
  
  ALL_PRODUCTS("ALL_PRODUCTS"),
  
  BEST_DEALS("BEST_DEALS"),
  
  PINNER_FAVORITES("PINNER_FAVORITES"),
  
  TOP_SELLERS("TOP_SELLERS"),
  
  BACK_IN_STOCK("BACK_IN_STOCK"),
  
  NEW_ARRIVALS("NEW_ARRIVALS");

  private String value;

  CatalogsProductGroupType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogsProductGroupType fromValue(String value) {
    for (CatalogsProductGroupType b : CatalogsProductGroupType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

