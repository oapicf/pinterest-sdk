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
 * Order Line Paid Type
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public enum OrderLinePaidType {
  
  PAID("PAID"),
  
  BONUS("BONUS"),
  
  MAKE_GOOD("MAKE_GOOD"),
  
  TEST("TEST"),
  
  NULL("null");

  private String value;

  OrderLinePaidType(String value) {
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
  public static OrderLinePaidType fromValue(String value) {
    for (OrderLinePaidType b : OrderLinePaidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

