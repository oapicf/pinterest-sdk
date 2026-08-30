package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Campaign objective type. If set as one of [\&quot;AWARENESS\&quot;, \&quot;CONSIDERATION\&quot;, \&quot;WEB_CONVERSION\&quot;, \&quot;CATALOG_SALES\&quot;, \&quot;VIDEO_COMPLETION\&quot;, \&quot;CTV_CONSIDERATION\&quot;] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\&quot;WEB_SESSIONS\&quot;] is DEPRECATED. &#x60;VIDEO_VIEW&#x60; is deprecated; use &#x60;VIDEO_COMPLETION&#x60; instead. &#x60;CTV_CONSIDERATION&#x60; is in BETA. For update, only draft campaigns may update objective type.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum CampaignObjectiveType {
  
  AWARENESS("AWARENESS"),
  
  CONSIDERATION("CONSIDERATION"),
  
  VIDEO_VIEW("VIDEO_VIEW"),
  
  WEB_CONVERSION("WEB_CONVERSION"),
  
  CATALOG_SALES("CATALOG_SALES"),
  
  WEB_SESSIONS("WEB_SESSIONS"),
  
  VIDEO_COMPLETION("VIDEO_COMPLETION"),
  
  APP_INSTALL("APP_INSTALL"),
  
  SALES("SALES"),
  
  LEADS("LEADS"),
  
  CTV_CONSIDERATION("CTV_CONSIDERATION");

  private String value;

  CampaignObjectiveType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CampaignObjectiveType fromString(String s) {
      for (CampaignObjectiveType b : CampaignObjectiveType.values()) {
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
  public static CampaignObjectiveType fromValue(String value) {
    for (CampaignObjectiveType b : CampaignObjectiveType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


