package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of information in the page referenced by &#x60;disclosure_url&#x60;, provided either by the Food and Drug Administration (FDA) or the manufacturer.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static DisclosureType fromString(String s) {
      for (DisclosureType b : DisclosureType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      return null;
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


