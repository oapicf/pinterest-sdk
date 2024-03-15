package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogsFormat fromValue(String text) {
    for (CatalogsFormat b : CatalogsFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

