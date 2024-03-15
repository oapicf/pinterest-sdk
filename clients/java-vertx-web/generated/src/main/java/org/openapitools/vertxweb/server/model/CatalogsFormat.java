package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The file format of a feed.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The file format of a feed.
 */
public enum CatalogsFormat {
  
  TSV("TSV"),
  
  CSV("CSV"),
  
  XML("XML");

  private String value;

  CatalogsFormat(String value) {
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

  public static CatalogsFormat fromValue(String value) {
    for (CatalogsFormat b : CatalogsFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}