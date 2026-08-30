package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Device form factor
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Device form factor
 */
public enum FormFactor {
  
  DESKTOP("desktop"),
  
  LAPTOP("laptop"),
  
  CELLPHONE("cellphone"),
  
  TABLET("tablet"),
  
  SMARTWATCH("smartwatch"),
  
  TV("tv"),
  
  VR("vr"),
  
  CONSOLE("console"),
  
  OTHER("other");

  private String value;

  FormFactor(String value) {
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

  public static FormFactor fromValue(String value) {
    for (FormFactor b : FormFactor.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}