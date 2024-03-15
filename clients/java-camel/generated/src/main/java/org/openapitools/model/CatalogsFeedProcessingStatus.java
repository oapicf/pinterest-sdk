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
 * Gets or Sets CatalogsFeedProcessingStatus
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public enum CatalogsFeedProcessingStatus {
  
  COMPLETED("COMPLETED"),
  
  COMPLETED_EARLY("COMPLETED_EARLY"),
  
  DISAPPROVED("DISAPPROVED"),
  
  FAILED("FAILED"),
  
  PROCESSING("PROCESSING"),
  
  QUEUED_FOR_PROCESSING("QUEUED_FOR_PROCESSING"),
  
  UNDER_APPEAL("UNDER_APPEAL"),
  
  UNDER_REVIEW("UNDER_REVIEW");

  private String value;

  CatalogsFeedProcessingStatus(String value) {
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
  public static CatalogsFeedProcessingStatus fromValue(String value) {
    for (CatalogsFeedProcessingStatus b : CatalogsFeedProcessingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

