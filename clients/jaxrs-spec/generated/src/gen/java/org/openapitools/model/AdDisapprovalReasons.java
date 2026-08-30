package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ad disapproval reasons
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public enum AdDisapprovalReasons {
  
  HASHTAGS("HASHTAGS"),
  
  PROMOTIONS_AND_PRICES("PROMOTIONS_AND_PRICES"),
  
  TARGETING("TARGETING"),
  
  LANDING_PAGE("LANDING_PAGE"),
  
  CAPS_AND_SYMBOLS("CAPS_AND_SYMBOLS"),
  
  SHOCKING("SHOCKING"),
  
  WEIGHT_LOSS("WEIGHT_LOSS"),
  
  PROHIBITED_PRODUCT("PROHIBITED_PRODUCT"),
  
  AUTHENTICITY("AUTHENTICITY"),
  
  NUDITY("NUDITY"),
  
  CONFUSING_DESIGN("CONFUSING_DESIGN"),
  
  URGENCY("URGENCY"),
  
  RATINGS("RATINGS"),
  
  APP("APP"),
  
  ALCOHOL("ALCOHOL"),
  
  CONTESTS("CONTESTS"),
  
  POLITICAL("POLITICAL"),
  
  OTHER("OTHER"),
  
  IMAGE("IMAGE"),
  
  NAR("NAR"),
  
  INCONSISTENT("INCONSISTENT"),
  
  CLICKBAIT("CLICKBAIT"),
  
  NO_DESCRIPTION("NO_DESCRIPTION"),
  
  LOW_QUALITY("LOW_QUALITY"),
  
  EXAGGERATED_CLAIMS("EXAGGERATED_CLAIMS"),
  
  PINTEREST_BRAND("PINTEREST_BRAND"),
  
  ALCOHOL_NO_SALE("ALCOHOL_NO_SALE"),
  
  LANDING_PAGE_SPEED("LANDING_PAGE_SPEED"),
  
  LANDING_PAGE_HARDWALL("LANDING_PAGE_HARDWALL"),
  
  LANDING_PAGE_BROKEN("LANDING_PAGE_BROKEN"),
  
  LANDING_PAGE_QUALITY("LANDING_PAGE_QUALITY"),
  
  OUT_OF_STOCK("OUT_OF_STOCK"),
  
  IMAGE_LOW_QUALITY("IMAGE_LOW_QUALITY"),
  
  IMAGE_BUSY("IMAGE_BUSY"),
  
  IMAGE_POORLY_EDITED("IMAGE_POORLY_EDITED"),
  
  IMAGE_BEFORE_AFTER("IMAGE_BEFORE_AFTER"),
  
  UGC("UGC"),
  
  FAKE_BUTTONS("FAKE_BUTTONS"),
  
  WEAPONS("WEAPONS"),
  
  SENSITIVE("SENSITIVE"),
  
  UNACCEPTABLE_BUSINESS("UNACCEPTABLE_BUSINESS"),
  
  SUSPICIOUS_CLAIMS("SUSPICIOUS_CLAIMS"),
  
  PHARMA("PHARMA"),
  
  SUSPICIOUS_SUPPLEMENTS("SUSPICIOUS_SUPPLEMENTS"),
  
  ILLEGAL_RECREATIONAL_DRUG("ILLEGAL_RECREATIONAL_DRUG"),
  
  LOW_QUALITY_LANDING_PAGE("LOW_QUALITY_LANDING_PAGE"),
  
  RESTRICTED_HEALTHCARE("RESTRICTED_HEALTHCARE"),
  
  INCONSISTENT_LANG_FR("INCONSISTENT_LANG_FR");

  private String value;

  AdDisapprovalReasons(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AdDisapprovalReasons fromString(String s) {
      for (AdDisapprovalReasons b : AdDisapprovalReasons.values()) {
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
  public static AdDisapprovalReasons fromValue(String value) {
    for (AdDisapprovalReasons b : AdDisapprovalReasons.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


