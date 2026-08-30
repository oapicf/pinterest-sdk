package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * ad disapproval reasons
 */
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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdDisapprovalReasons fromValue(String text) {
    for (AdDisapprovalReasons b : AdDisapprovalReasons.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

