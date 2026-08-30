package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Estimation type for campaign planning estimated curve
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum CampaignPlanningEstimationType {
  
  IMPRESSION("IMPRESSION"),
  
  CLICK("CLICK"),
  
  CONVERSION("CONVERSION"),
  
  WEEKLY_FREQUENCY("WEEKLY_FREQUENCY"),
  
  WEEKLY_REACH("WEEKLY_REACH"),
  
  LIFETIME_FREQUENCY("LIFETIME_FREQUENCY"),
  
  LIFETIME_REACH("LIFETIME_REACH"),
  
  CPM("CPM"),
  
  CPC("CPC"),
  
  CPA("CPA");

  private String value;

  CampaignPlanningEstimationType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CampaignPlanningEstimationType fromString(String s) {
      for (CampaignPlanningEstimationType b : CampaignPlanningEstimationType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CampaignPlanningEstimationType fromValue(String value) {
    for (CampaignPlanningEstimationType b : CampaignPlanningEstimationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


