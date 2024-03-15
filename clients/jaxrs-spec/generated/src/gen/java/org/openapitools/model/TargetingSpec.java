package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TargetingSpecSHOPPINGRETARGETING;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ad group targeting specification defining the ad group target audience. For example, {\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}
 **/
@ApiModel(description = "Ad group targeting specification defining the ad group target audience. For example, {\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}")
@JsonTypeName("TargetingSpec")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TargetingSpec   {
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AGEBUCKETEnum fromString(String s) {
        for (AGEBUCKETEnum b : AGEBUCKETEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static AGEBUCKETEnum fromValue(String value) {
        for (AGEBUCKETEnum b : AGEBUCKETEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<AGEBUCKETEnum> AGE_BUCKET;
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static APPTYPEEnum fromString(String s) {
        for (APPTYPEEnum b : APPTYPEEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static APPTYPEEnum fromValue(String value) {
        for (APPTYPEEnum b : APPTYPEEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<APPTYPEEnum> APPTYPE;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> auDIENCEINCLUDEQuote;
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static GENDEREnum fromString(String s) {
        for (GENDEREnum b : GENDEREnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static GENDEREnum fromValue(String value) {
        for (GENDEREnum b : GENDEREnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<GENDEREnum> GENDER;
  private @Valid List<String> GEO;
  private @Valid List<String> INTEREST;
  private @Valid List<String> LOCALE;
  private @Valid List<String> LOCATION;
  private @Valid List<@Valid TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING;
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TARGETINGSTRATEGYEnum fromString(String s) {
        for (TARGETINGSTRATEGYEnum b : TARGETINGSTRATEGYEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static TARGETINGSTRATEGYEnum fromValue(String value) {
        for (TARGETINGSTRATEGYEnum b : TARGETINGSTRATEGYEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY;

  /**
   * Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
   **/
  public TargetingSpec AGE_BUCKET(List<AGEBUCKETEnum> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
    return this;
  }

  
  @ApiModelProperty(example = "[\"35-44\",\"50-54\"]", value = "Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.")
  @JsonProperty("AGE_BUCKET")
  public List<AGEBUCKETEnum> getAGEBUCKET() {
    return AGE_BUCKET;
  }

  @JsonProperty("AGE_BUCKET")
  public void setAGEBUCKET(List<AGEBUCKETEnum> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  public TargetingSpec addAGEBUCKETItem(AGEBUCKETEnum AGE_BUCKETItem) {
    if (this.AGE_BUCKET == null) {
      this.AGE_BUCKET = new ArrayList<>();
    }

    this.AGE_BUCKET.add(AGE_BUCKETItem);
    return this;
  }

  public TargetingSpec removeAGEBUCKETItem(AGEBUCKETEnum AGE_BUCKETItem) {
    if (AGE_BUCKETItem != null && this.AGE_BUCKET != null) {
      this.AGE_BUCKET.remove(AGE_BUCKETItem);
    }

    return this;
  }
  /**
   * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
   **/
  public TargetingSpec APPTYPE(List<APPTYPEEnum> APPTYPE) {
    this.APPTYPE = APPTYPE;
    return this;
  }

  
  @ApiModelProperty(example = "[\"ipad\",\"iphone\"]", value = "Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.")
  @JsonProperty("APPTYPE")
  public List<APPTYPEEnum> getAPPTYPE() {
    return APPTYPE;
  }

  @JsonProperty("APPTYPE")
  public void setAPPTYPE(List<APPTYPEEnum> APPTYPE) {
    this.APPTYPE = APPTYPE;
  }

  public TargetingSpec addAPPTYPEItem(APPTYPEEnum APPTYPEItem) {
    if (this.APPTYPE == null) {
      this.APPTYPE = new ArrayList<>();
    }

    this.APPTYPE.add(APPTYPEItem);
    return this;
  }

  public TargetingSpec removeAPPTYPEItem(APPTYPEEnum APPTYPEItem) {
    if (APPTYPEItem != null && this.APPTYPE != null) {
      this.APPTYPE.remove(APPTYPEItem);
    }

    return this;
  }
  /**
   * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
   **/
  public TargetingSpec AUDIENCE_EXCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.")
  @JsonProperty("AUDIENCE_EXCLUDE")
  public List< @Pattern(regexp="^\\d+$")String> getAUDIENCEEXCLUDE() {
    return AUDIENCE_EXCLUDE;
  }

  @JsonProperty("AUDIENCE_EXCLUDE")
  public void setAUDIENCEEXCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
  }

  public TargetingSpec addAUDIENCEEXCLUDEItem(String AUDIENCE_EXCLUDEItem) {
    if (this.AUDIENCE_EXCLUDE == null) {
      this.AUDIENCE_EXCLUDE = new ArrayList<>();
    }

    this.AUDIENCE_EXCLUDE.add(AUDIENCE_EXCLUDEItem);
    return this;
  }

  public TargetingSpec removeAUDIENCEEXCLUDEItem(String AUDIENCE_EXCLUDEItem) {
    if (AUDIENCE_EXCLUDEItem != null && this.AUDIENCE_EXCLUDE != null) {
      this.AUDIENCE_EXCLUDE.remove(AUDIENCE_EXCLUDEItem);
    }

    return this;
  }
  /**
   * Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
   **/
  public TargetingSpec auDIENCEINCLUDEQuote(List<@Pattern(regexp = "^\\d+$")String> auDIENCEINCLUDEQuote) {
    this.auDIENCEINCLUDEQuote = auDIENCEINCLUDEQuote;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.")
  @JsonProperty("AUDIENCE_INCLUDE&#39;")
  public List< @Pattern(regexp="^\\d+$")String> getAuDIENCEINCLUDEQuote() {
    return auDIENCEINCLUDEQuote;
  }

  @JsonProperty("AUDIENCE_INCLUDE&#39;")
  public void setAuDIENCEINCLUDEQuote(List<@Pattern(regexp = "^\\d+$")String> auDIENCEINCLUDEQuote) {
    this.auDIENCEINCLUDEQuote = auDIENCEINCLUDEQuote;
  }

  public TargetingSpec addAuDIENCEINCLUDEQuoteItem(String auDIENCEINCLUDEQuoteItem) {
    if (this.auDIENCEINCLUDEQuote == null) {
      this.auDIENCEINCLUDEQuote = new ArrayList<>();
    }

    this.auDIENCEINCLUDEQuote.add(auDIENCEINCLUDEQuoteItem);
    return this;
  }

  public TargetingSpec removeAuDIENCEINCLUDEQuoteItem(String auDIENCEINCLUDEQuoteItem) {
    if (auDIENCEINCLUDEQuoteItem != null && this.auDIENCEINCLUDEQuote != null) {
      this.auDIENCEINCLUDEQuote.remove(auDIENCEINCLUDEQuoteItem);
    }

    return this;
  }
  /**
   * Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
   **/
  public TargetingSpec GENDER(List<GENDEREnum> GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.")
  @JsonProperty("GENDER")
  public List<GENDEREnum> getGENDER() {
    return GENDER;
  }

  @JsonProperty("GENDER")
  public void setGENDER(List<GENDEREnum> GENDER) {
    this.GENDER = GENDER;
  }

  public TargetingSpec addGENDERItem(GENDEREnum GENDERItem) {
    if (this.GENDER == null) {
      this.GENDER = new ArrayList<>();
    }

    this.GENDER.add(GENDERItem);
    return this;
  }

  public TargetingSpec removeGENDERItem(GENDEREnum GENDERItem) {
    if (GENDERItem != null && this.GENDER != null) {
      this.GENDER.remove(GENDERItem);
    }

    return this;
  }
  /**
   * Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.
   **/
  public TargetingSpec GEO(List<String> GEO) {
    this.GEO = GEO;
    return this;
  }

  
  @ApiModelProperty(value = "Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.")
  @JsonProperty("GEO")
  public List<String> getGEO() {
    return GEO;
  }

  @JsonProperty("GEO")
  public void setGEO(List<String> GEO) {
    this.GEO = GEO;
  }

  public TargetingSpec addGEOItem(String GEOItem) {
    if (this.GEO == null) {
      this.GEO = new ArrayList<>();
    }

    this.GEO.add(GEOItem);
    return this;
  }

  public TargetingSpec removeGEOItem(String GEOItem) {
    if (GEOItem != null && this.GEO != null) {
      this.GEO.remove(GEOItem);
    }

    return this;
  }
  /**
   * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
   **/
  public TargetingSpec INTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
    return this;
  }

  
  @ApiModelProperty(value = "Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.")
  @JsonProperty("INTEREST")
  public List<String> getINTEREST() {
    return INTEREST;
  }

  @JsonProperty("INTEREST")
  public void setINTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
  }

  public TargetingSpec addINTERESTItem(String INTERESTItem) {
    if (this.INTEREST == null) {
      this.INTEREST = new ArrayList<>();
    }

    this.INTEREST.add(INTERESTItem);
    return this;
  }

  public TargetingSpec removeINTERESTItem(String INTERESTItem) {
    if (INTERESTItem != null && this.INTEREST != null) {
      this.INTEREST.remove(INTERESTItem);
    }

    return this;
  }
  /**
   * 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.
   **/
  public TargetingSpec LOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
    return this;
  }

  
  @ApiModelProperty(value = "24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.")
  @JsonProperty("LOCALE")
  public List<String> getLOCALE() {
    return LOCALE;
  }

  @JsonProperty("LOCALE")
  public void setLOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
  }

  public TargetingSpec addLOCALEItem(String LOCALEItem) {
    if (this.LOCALE == null) {
      this.LOCALE = new ArrayList<>();
    }

    this.LOCALE.add(LOCALEItem);
    return this;
  }

  public TargetingSpec removeLOCALEItem(String LOCALEItem) {
    if (LOCALEItem != null && this.LOCALE != null) {
      this.LOCALE.remove(LOCALEItem);
    }

    return this;
  }
  /**
   * 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.
   **/
  public TargetingSpec LOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }

  
  @ApiModelProperty(value = "22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.")
  @JsonProperty("LOCATION")
  public List<String> getLOCATION() {
    return LOCATION;
  }

  @JsonProperty("LOCATION")
  public void setLOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
  }

  public TargetingSpec addLOCATIONItem(String LOCATIONItem) {
    if (this.LOCATION == null) {
      this.LOCATION = new ArrayList<>();
    }

    this.LOCATION.add(LOCATIONItem);
    return this;
  }

  public TargetingSpec removeLOCATIONItem(String LOCATIONItem) {
    if (LOCATIONItem != null && this.LOCATION != null) {
      this.LOCATION.remove(LOCATIONItem);
    }

    return this;
  }
  /**
   * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
   **/
  public TargetingSpec SHOPPING_RETARGETING(List<@Valid TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
    return this;
  }

  
  @ApiModelProperty(value = "Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting")
  @JsonProperty("SHOPPING_RETARGETING")
  public List<TargetingSpecSHOPPINGRETARGETING> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }

  @JsonProperty("SHOPPING_RETARGETING")
  public void setSHOPPINGRETARGETING(List<@Valid TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
  }

  public TargetingSpec addSHOPPINGRETARGETINGItem(TargetingSpecSHOPPINGRETARGETING SHOPPING_RETARGETINGItem) {
    if (this.SHOPPING_RETARGETING == null) {
      this.SHOPPING_RETARGETING = new ArrayList<>();
    }

    this.SHOPPING_RETARGETING.add(SHOPPING_RETARGETINGItem);
    return this;
  }

  public TargetingSpec removeSHOPPINGRETARGETINGItem(TargetingSpecSHOPPINGRETARGETING SHOPPING_RETARGETINGItem) {
    if (SHOPPING_RETARGETINGItem != null && this.SHOPPING_RETARGETING != null) {
      this.SHOPPING_RETARGETING.remove(SHOPPING_RETARGETINGItem);
    }

    return this;
  }
  /**
   * 
   **/
  public TargetingSpec TARGETING_STRATEGY(List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("TARGETING_STRATEGY")
  public List<TARGETINGSTRATEGYEnum> getTARGETINGSTRATEGY() {
    return TARGETING_STRATEGY;
  }

  @JsonProperty("TARGETING_STRATEGY")
  public void setTARGETINGSTRATEGY(List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
  }

  public TargetingSpec addTARGETINGSTRATEGYItem(TARGETINGSTRATEGYEnum TARGETING_STRATEGYItem) {
    if (this.TARGETING_STRATEGY == null) {
      this.TARGETING_STRATEGY = new ArrayList<>();
    }

    this.TARGETING_STRATEGY.add(TARGETING_STRATEGYItem);
    return this;
  }

  public TargetingSpec removeTARGETINGSTRATEGYItem(TARGETINGSTRATEGYEnum TARGETING_STRATEGYItem) {
    if (TARGETING_STRATEGYItem != null && this.TARGETING_STRATEGY != null) {
      this.TARGETING_STRATEGY.remove(TARGETING_STRATEGYItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

