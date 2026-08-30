package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
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

  private final String value;

  FormFactor(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FormFactor fromValue(String value) {
    for (FormFactor b : FormFactor.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

