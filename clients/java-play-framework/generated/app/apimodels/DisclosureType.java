package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 */
public enum DisclosureType {
  
  NO_DISCLOSURE("NO_DISCLOSURE"),
  
  PRESCRIBING_INFORMATION("PRESCRIBING_INFORMATION"),
  
  PRESCRIBING_INFORMATION_BOX_WARNING("PRESCRIBING_INFORMATION_BOX_WARNING"),
  
  IMPORTANT_SAFETY_INFO("IMPORTANT_SAFETY_INFO"),
  
  MED_GUIDE("MED_GUIDE"),
  
  PATIENT_INFORMATION("PATIENT_INFORMATION");

  private final String value;

  DisclosureType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DisclosureType fromValue(String value) {
    for (DisclosureType b : DisclosureType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

