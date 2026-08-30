package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Device form factor
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FormFactor fromValue(String text) {
    for (FormFactor b : FormFactor.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


