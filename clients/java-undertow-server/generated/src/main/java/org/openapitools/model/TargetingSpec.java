/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TargetingSpecSHOPPINGRETARGETING;



/**
 * Ad group targeting specification defining the ad group target audience. For example, {\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}
 */

@ApiModel(description = "Ad group targeting specification defining the ad group target audience. For example, {\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TargetingSpec   {
  


  public enum AGEBUCKETEnum {
    _18_24("18-24"),
    _21_("21+"),
    _25_34("25-34"),
    _35_44("35-44"),
    _45_49("45-49"),
    _50_54("50-54"),
    _55_64("55-64"),
    _65_("65+");

    private String value;

    AGEBUCKETEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<AGEBUCKETEnum> AGE_BUCKET;


  public enum APPTYPEEnum {
    ANDROID_MOBILE("android_mobile"),
    ANDROID_TABLET("android_tablet"),
    IPAD("ipad"),
    IPHONE("iphone"),
    WEB("web"),
    WEB_MOBILE("web_mobile");

    private String value;

    APPTYPEEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<APPTYPEEnum> APPTYPE;
  private List<String> AUDIENCE_EXCLUDE;
  private List<String> auDIENCEINCLUDEQuote;


  public enum GENDEREnum {
    UNKNOWN("unknown"),
    MALE("male"),
    FEMALE("female");

    private String value;

    GENDEREnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<GENDEREnum> GENDER;
  private List<String> GEO;
  private List<String> INTEREST;
  private List<String> LOCALE;
  private List<String> LOCATION;
  private List<TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING;


  public enum TARGETINGSTRATEGYEnum {
    CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
    FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
    RECONNECT_WITH_USERS("RECONNECT_WITH_USERS");

    private String value;

    TARGETINGSTRATEGYEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY;

  /**
   * Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
   */
  public TargetingSpec AGE_BUCKET(List<AGEBUCKETEnum> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
    return this;
  }

  
  @ApiModelProperty(example = "[\"35-44\",\"50-54\"]", value = "Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.")
  @JsonProperty("AGE_BUCKET")
  public List<AGEBUCKETEnum> getAGEBUCKET() {
    return AGE_BUCKET;
  }
  public void setAGEBUCKET(List<AGEBUCKETEnum> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  /**
   * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
   */
  public TargetingSpec APPTYPE(List<APPTYPEEnum> APPTYPE) {
    this.APPTYPE = APPTYPE;
    return this;
  }

  
  @ApiModelProperty(example = "[\"ipad\",\"iphone\"]", value = "Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.")
  @JsonProperty("APPTYPE")
  public List<APPTYPEEnum> getAPPTYPE() {
    return APPTYPE;
  }
  public void setAPPTYPE(List<APPTYPEEnum> APPTYPE) {
    this.APPTYPE = APPTYPE;
  }

  /**
   * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
   */
  public TargetingSpec AUDIENCE_EXCLUDE(List<String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.")
  @JsonProperty("AUDIENCE_EXCLUDE")
  public List<String> getAUDIENCEEXCLUDE() {
    return AUDIENCE_EXCLUDE;
  }
  public void setAUDIENCEEXCLUDE(List<String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
  }

  /**
   * Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
   */
  public TargetingSpec auDIENCEINCLUDEQuote(List<String> auDIENCEINCLUDEQuote) {
    this.auDIENCEINCLUDEQuote = auDIENCEINCLUDEQuote;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.")
  @JsonProperty("AUDIENCE_INCLUDE&#39;")
  public List<String> getAuDIENCEINCLUDEQuote() {
    return auDIENCEINCLUDEQuote;
  }
  public void setAuDIENCEINCLUDEQuote(List<String> auDIENCEINCLUDEQuote) {
    this.auDIENCEINCLUDEQuote = auDIENCEINCLUDEQuote;
  }

  /**
   * Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
   */
  public TargetingSpec GENDER(List<GENDEREnum> GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.")
  @JsonProperty("GENDER")
  public List<GENDEREnum> getGENDER() {
    return GENDER;
  }
  public void setGENDER(List<GENDEREnum> GENDER) {
    this.GENDER = GENDER;
  }

  /**
   * Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.
   */
  public TargetingSpec GEO(List<String> GEO) {
    this.GEO = GEO;
    return this;
  }

  
  @ApiModelProperty(value = "Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.")
  @JsonProperty("GEO")
  public List<String> getGEO() {
    return GEO;
  }
  public void setGEO(List<String> GEO) {
    this.GEO = GEO;
  }

  /**
   * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
   */
  public TargetingSpec INTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
    return this;
  }

  
  @ApiModelProperty(value = "Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.")
  @JsonProperty("INTEREST")
  public List<String> getINTEREST() {
    return INTEREST;
  }
  public void setINTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
  }

  /**
   * 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.
   */
  public TargetingSpec LOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
    return this;
  }

  
  @ApiModelProperty(value = "24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.")
  @JsonProperty("LOCALE")
  public List<String> getLOCALE() {
    return LOCALE;
  }
  public void setLOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
  }

  /**
   * 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.
   */
  public TargetingSpec LOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }

  
  @ApiModelProperty(value = "22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.")
  @JsonProperty("LOCATION")
  public List<String> getLOCATION() {
    return LOCATION;
  }
  public void setLOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
  }

  /**
   * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
   */
  public TargetingSpec SHOPPING_RETARGETING(List<TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
    return this;
  }

  
  @ApiModelProperty(value = "Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting")
  @JsonProperty("SHOPPING_RETARGETING")
  public List<TargetingSpecSHOPPINGRETARGETING> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }
  public void setSHOPPINGRETARGETING(List<TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
  }

  /**
   * 
   */
  public TargetingSpec TARGETING_STRATEGY(List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("TARGETING_STRATEGY")
  public List<TARGETINGSTRATEGYEnum> getTARGETINGSTRATEGY() {
    return TARGETING_STRATEGY;
  }
  public void setTARGETINGSTRATEGY(List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingSpec targetingSpec = (TargetingSpec) o;
    return Objects.equals(AGE_BUCKET, targetingSpec.AGE_BUCKET) &&
        Objects.equals(APPTYPE, targetingSpec.APPTYPE) &&
        Objects.equals(AUDIENCE_EXCLUDE, targetingSpec.AUDIENCE_EXCLUDE) &&
        Objects.equals(auDIENCEINCLUDEQuote, targetingSpec.auDIENCEINCLUDEQuote) &&
        Objects.equals(GENDER, targetingSpec.GENDER) &&
        Objects.equals(GEO, targetingSpec.GEO) &&
        Objects.equals(INTEREST, targetingSpec.INTEREST) &&
        Objects.equals(LOCALE, targetingSpec.LOCALE) &&
        Objects.equals(LOCATION, targetingSpec.LOCATION) &&
        Objects.equals(SHOPPING_RETARGETING, targetingSpec.SHOPPING_RETARGETING) &&
        Objects.equals(TARGETING_STRATEGY, targetingSpec.TARGETING_STRATEGY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AGE_BUCKET, APPTYPE, AUDIENCE_EXCLUDE, auDIENCEINCLUDEQuote, GENDER, GEO, INTEREST, LOCALE, LOCATION, SHOPPING_RETARGETING, TARGETING_STRATEGY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpec {\n");
    
    sb.append("    AGE_BUCKET: ").append(toIndentedString(AGE_BUCKET)).append("\n");
    sb.append("    APPTYPE: ").append(toIndentedString(APPTYPE)).append("\n");
    sb.append("    AUDIENCE_EXCLUDE: ").append(toIndentedString(AUDIENCE_EXCLUDE)).append("\n");
    sb.append("    auDIENCEINCLUDEQuote: ").append(toIndentedString(auDIENCEINCLUDEQuote)).append("\n");
    sb.append("    GENDER: ").append(toIndentedString(GENDER)).append("\n");
    sb.append("    GEO: ").append(toIndentedString(GEO)).append("\n");
    sb.append("    INTEREST: ").append(toIndentedString(INTEREST)).append("\n");
    sb.append("    LOCALE: ").append(toIndentedString(LOCALE)).append("\n");
    sb.append("    LOCATION: ").append(toIndentedString(LOCATION)).append("\n");
    sb.append("    SHOPPING_RETARGETING: ").append(toIndentedString(SHOPPING_RETARGETING)).append("\n");
    sb.append("    TARGETING_STRATEGY: ").append(toIndentedString(TARGETING_STRATEGY)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

