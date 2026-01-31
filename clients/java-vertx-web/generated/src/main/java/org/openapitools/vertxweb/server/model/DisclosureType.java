package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Type of information in the page referenced by &#x60;disclosure_url&#x60;, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of information in the page referenced by &#x60;disclosure_url&#x60;, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 */
public enum DisclosureType {
  
  NO_DISCLOSURE("NO_DISCLOSURE"),
  
  PRESCRIBING_INFORMATION("PRESCRIBING_INFORMATION"),
  
  PRESCRIBING_INFORMATION_BOX_WARNING("PRESCRIBING_INFORMATION_BOX_WARNING"),
  
  IMPORTANT_SAFETY_INFO("IMPORTANT_SAFETY_INFO"),
  
  MED_GUIDE("MED_GUIDE"),
  
  PATIENT_INFORMATION("PATIENT_INFORMATION");

  private String value;

  DisclosureType(String value) {
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

  public static DisclosureType fromValue(String value) {
    for (DisclosureType b : DisclosureType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}