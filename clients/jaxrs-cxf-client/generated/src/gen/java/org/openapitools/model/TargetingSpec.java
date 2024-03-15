package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TargetingSpecSHOPPINGRETARGETING;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ad group targeting specification defining the ad group target audience. For example, {\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}
 **/
@ApiModel(description="Ad group targeting specification defining the ad group target audience. For example, {\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}")

public class TargetingSpec  {
  
public enum AGEBUCKETEnum {

_18_24(String.valueOf("18-24")), _21_(String.valueOf("21+")), _25_34(String.valueOf("25-34")), _35_44(String.valueOf("35-44")), _45_49(String.valueOf("45-49")), _50_54(String.valueOf("50-54")), _55_64(String.valueOf("55-64")), _65_(String.valueOf("65+"));


    private String value;

    AGEBUCKETEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AGEBUCKETEnum fromValue(String value) {
        for (AGEBUCKETEnum b : AGEBUCKETEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "[\"35-44\",\"50-54\"]", value = "Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.")
 /**
   * Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
  **/
  private List<AGEBUCKETEnum> AGE_BUCKET;

public enum APPTYPEEnum {

ANDROID_MOBILE(String.valueOf("android_mobile")), ANDROID_TABLET(String.valueOf("android_tablet")), IPAD(String.valueOf("ipad")), IPHONE(String.valueOf("iphone")), WEB(String.valueOf("web")), WEB_MOBILE(String.valueOf("web_mobile"));


    private String value;

    APPTYPEEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static APPTYPEEnum fromValue(String value) {
        for (APPTYPEEnum b : APPTYPEEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "[\"ipad\",\"iphone\"]", value = "Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.")
 /**
   * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
  **/
  private List<APPTYPEEnum> APPTYPE;

  @ApiModelProperty(value = "Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.")
 /**
   * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
  **/
  private List<String> AUDIENCE_EXCLUDE;

  @ApiModelProperty(value = "Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.")
 /**
   * Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
  **/
  private List<String> auDIENCEINCLUDEQuote;

public enum GENDEREnum {

UNKNOWN(String.valueOf("unknown")), MALE(String.valueOf("male")), FEMALE(String.valueOf("female"));


    private String value;

    GENDEREnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GENDEREnum fromValue(String value) {
        for (GENDEREnum b : GENDEREnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.")
 /**
   * Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
  **/
  private List<GENDEREnum> GENDER;

  @ApiModelProperty(value = "Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.")
 /**
   * Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.
  **/
  private List<String> GEO;

  @ApiModelProperty(value = "Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.")
 /**
   * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
  **/
  private List<String> INTEREST;

  @ApiModelProperty(value = "24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.")
 /**
   * 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.
  **/
  private List<String> LOCALE;

  @ApiModelProperty(value = "22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.")
 /**
   * 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.
  **/
  private List<String> LOCATION;

  @ApiModelProperty(value = "Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting")
 /**
   * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
  **/
  private List<TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING;

public enum TARGETINGSTRATEGYEnum {

CHOOSE_YOUR_OWN(String.valueOf("CHOOSE_YOUR_OWN")), FIND_NEW_CUSTOMERS(String.valueOf("FIND_NEW_CUSTOMERS")), RECONNECT_WITH_USERS(String.valueOf("RECONNECT_WITH_USERS"));


    private String value;

    TARGETINGSTRATEGYEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TARGETINGSTRATEGYEnum fromValue(String value) {
        for (TARGETINGSTRATEGYEnum b : TARGETINGSTRATEGYEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
 /**
   * 
  **/
  private List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY;
 /**
   * Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
   * @return AGE_BUCKET
  **/
  @JsonProperty("AGE_BUCKET")
  public List<AGEBUCKETEnum> getAGEBUCKET() {
    return AGE_BUCKET;
  }

  public void setAGEBUCKET(List<AGEBUCKETEnum> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  public TargetingSpec AGE_BUCKET(List<AGEBUCKETEnum> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
    return this;
  }

  public TargetingSpec addAGEBUCKETItem(AGEBUCKETEnum AGE_BUCKETItem) {
    this.AGE_BUCKET.add(AGE_BUCKETItem);
    return this;
  }

 /**
   * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
   * @return APPTYPE
  **/
  @JsonProperty("APPTYPE")
  public List<APPTYPEEnum> getAPPTYPE() {
    return APPTYPE;
  }

  public void setAPPTYPE(List<APPTYPEEnum> APPTYPE) {
    this.APPTYPE = APPTYPE;
  }

  public TargetingSpec APPTYPE(List<APPTYPEEnum> APPTYPE) {
    this.APPTYPE = APPTYPE;
    return this;
  }

  public TargetingSpec addAPPTYPEItem(APPTYPEEnum APPTYPEItem) {
    this.APPTYPE.add(APPTYPEItem);
    return this;
  }

 /**
   * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
   * @return AUDIENCE_EXCLUDE
  **/
  @JsonProperty("AUDIENCE_EXCLUDE")
  public List<String> getAUDIENCEEXCLUDE() {
    return AUDIENCE_EXCLUDE;
  }

  public void setAUDIENCEEXCLUDE(List<String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
  }

  public TargetingSpec AUDIENCE_EXCLUDE(List<String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
    return this;
  }

  public TargetingSpec addAUDIENCEEXCLUDEItem(String AUDIENCE_EXCLUDEItem) {
    this.AUDIENCE_EXCLUDE.add(AUDIENCE_EXCLUDEItem);
    return this;
  }

 /**
   * Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
   * @return auDIENCEINCLUDEQuote
  **/
  @JsonProperty("AUDIENCE_INCLUDE&#39;")
  public List<String> getAuDIENCEINCLUDEQuote() {
    return auDIENCEINCLUDEQuote;
  }

  public void setAuDIENCEINCLUDEQuote(List<String> auDIENCEINCLUDEQuote) {
    this.auDIENCEINCLUDEQuote = auDIENCEINCLUDEQuote;
  }

  public TargetingSpec auDIENCEINCLUDEQuote(List<String> auDIENCEINCLUDEQuote) {
    this.auDIENCEINCLUDEQuote = auDIENCEINCLUDEQuote;
    return this;
  }

  public TargetingSpec addAuDIENCEINCLUDEQuoteItem(String auDIENCEINCLUDEQuoteItem) {
    this.auDIENCEINCLUDEQuote.add(auDIENCEINCLUDEQuoteItem);
    return this;
  }

 /**
   * Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
   * @return GENDER
  **/
  @JsonProperty("GENDER")
  public List<GENDEREnum> getGENDER() {
    return GENDER;
  }

  public void setGENDER(List<GENDEREnum> GENDER) {
    this.GENDER = GENDER;
  }

  public TargetingSpec GENDER(List<GENDEREnum> GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  public TargetingSpec addGENDERItem(GENDEREnum GENDERItem) {
    this.GENDER.add(GENDERItem);
    return this;
  }

 /**
   * Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.
   * @return GEO
  **/
  @JsonProperty("GEO")
  public List<String> getGEO() {
    return GEO;
  }

  public void setGEO(List<String> GEO) {
    this.GEO = GEO;
  }

  public TargetingSpec GEO(List<String> GEO) {
    this.GEO = GEO;
    return this;
  }

  public TargetingSpec addGEOItem(String GEOItem) {
    this.GEO.add(GEOItem);
    return this;
  }

 /**
   * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
   * @return INTEREST
  **/
  @JsonProperty("INTEREST")
  public List<String> getINTEREST() {
    return INTEREST;
  }

  public void setINTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
  }

  public TargetingSpec INTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
    return this;
  }

  public TargetingSpec addINTERESTItem(String INTERESTItem) {
    this.INTEREST.add(INTERESTItem);
    return this;
  }

 /**
   * 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.
   * @return LOCALE
  **/
  @JsonProperty("LOCALE")
  public List<String> getLOCALE() {
    return LOCALE;
  }

  public void setLOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
  }

  public TargetingSpec LOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
    return this;
  }

  public TargetingSpec addLOCALEItem(String LOCALEItem) {
    this.LOCALE.add(LOCALEItem);
    return this;
  }

 /**
   * 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.
   * @return LOCATION
  **/
  @JsonProperty("LOCATION")
  public List<String> getLOCATION() {
    return LOCATION;
  }

  public void setLOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
  }

  public TargetingSpec LOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }

  public TargetingSpec addLOCATIONItem(String LOCATIONItem) {
    this.LOCATION.add(LOCATIONItem);
    return this;
  }

 /**
   * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
   * @return SHOPPING_RETARGETING
  **/
  @JsonProperty("SHOPPING_RETARGETING")
  public List<TargetingSpecSHOPPINGRETARGETING> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }

  public void setSHOPPINGRETARGETING(List<TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
  }

  public TargetingSpec SHOPPING_RETARGETING(List<TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
    return this;
  }

  public TargetingSpec addSHOPPINGRETARGETINGItem(TargetingSpecSHOPPINGRETARGETING SHOPPING_RETARGETINGItem) {
    this.SHOPPING_RETARGETING.add(SHOPPING_RETARGETINGItem);
    return this;
  }

 /**
   * 
   * @return TARGETING_STRATEGY
  **/
  @JsonProperty("TARGETING_STRATEGY")
  public List<TARGETINGSTRATEGYEnum> getTARGETINGSTRATEGY() {
    return TARGETING_STRATEGY;
  }

  public void setTARGETINGSTRATEGY(List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
  }

  public TargetingSpec TARGETING_STRATEGY(List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
    return this;
  }

  public TargetingSpec addTARGETINGSTRATEGYItem(TARGETINGSTRATEGYEnum TARGETING_STRATEGYItem) {
    this.TARGETING_STRATEGY.add(TARGETING_STRATEGYItem);
    return this;
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
    return Objects.equals(this.AGE_BUCKET, targetingSpec.AGE_BUCKET) &&
        Objects.equals(this.APPTYPE, targetingSpec.APPTYPE) &&
        Objects.equals(this.AUDIENCE_EXCLUDE, targetingSpec.AUDIENCE_EXCLUDE) &&
        Objects.equals(this.auDIENCEINCLUDEQuote, targetingSpec.auDIENCEINCLUDEQuote) &&
        Objects.equals(this.GENDER, targetingSpec.GENDER) &&
        Objects.equals(this.GEO, targetingSpec.GEO) &&
        Objects.equals(this.INTEREST, targetingSpec.INTEREST) &&
        Objects.equals(this.LOCALE, targetingSpec.LOCALE) &&
        Objects.equals(this.LOCATION, targetingSpec.LOCATION) &&
        Objects.equals(this.SHOPPING_RETARGETING, targetingSpec.SHOPPING_RETARGETING) &&
        Objects.equals(this.TARGETING_STRATEGY, targetingSpec.TARGETING_STRATEGY);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

