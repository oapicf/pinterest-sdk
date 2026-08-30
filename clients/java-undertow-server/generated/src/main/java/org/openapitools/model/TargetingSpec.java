/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
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
import org.openapitools.model.TargetingSpecAgeBucket;
import org.openapitools.model.TargetingSpecAppType;
import org.openapitools.model.TargetingSpecGender;
import org.openapitools.model.TargetingSpecShoppingRetargeting;



/**
 * Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"MINIMUM_AGE\":\"18\", \"MAXIMUM_AGE\":\"65+\"}`
 */

@ApiModel(description = "Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"MINIMUM_AGE\":\"18\", \"MAXIMUM_AGE\":\"65+\"}`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingSpec   {
  
  private List<TargetingSpecAgeBucket> AGE_BUCKET;
  private List<TargetingSpecAppType> APPTYPE;
  private List<String> AUDIENCE_EXCLUDE;
  private List<String> AUDIENCE_INCLUDE;
  private List<TargetingSpecGender> GENDER;
  private List<String> GEO;
  private List<String> GEO_EXCLUDE = new ArrayList<>();
  private List<String> INTEREST = new ArrayList<>();
  private List<String> LOCALE;
  private List<String> LOCATION;
  private List<String> LOCATION_EXCLUDE = new ArrayList<>();
  private String MAXIMUM_AGE;
  private String MINIMUM_AGE;
  private List<TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING;


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
   * **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
   */
  public TargetingSpec AGE_BUCKET(List<TargetingSpecAgeBucket> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
    return this;
  }

  
  @ApiModelProperty(example = "[\"35-44\",\"50-54\"]", value = "**Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.")
  @JsonProperty("AGE_BUCKET")
  public List<TargetingSpecAgeBucket> getAGEBUCKET() {
    return AGE_BUCKET;
  }
  public void setAGEBUCKET(List<TargetingSpecAgeBucket> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  /**
   * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
   */
  public TargetingSpec APPTYPE(List<TargetingSpecAppType> APPTYPE) {
    this.APPTYPE = APPTYPE;
    return this;
  }

  
  @ApiModelProperty(example = "[\"ipad\",\"iphone\"]", value = "Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.")
  @JsonProperty("APPTYPE")
  public List<TargetingSpecAppType> getAPPTYPE() {
    return APPTYPE;
  }
  public void setAPPTYPE(List<TargetingSpecAppType> APPTYPE) {
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
  public TargetingSpec AUDIENCE_INCLUDE(List<String> AUDIENCE_INCLUDE) {
    this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.")
  @JsonProperty("AUDIENCE_INCLUDE")
  public List<String> getAUDIENCEINCLUDE() {
    return AUDIENCE_INCLUDE;
  }
  public void setAUDIENCEINCLUDE(List<String> AUDIENCE_INCLUDE) {
    this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
  }

  /**
   * Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
   */
  public TargetingSpec GENDER(List<TargetingSpecGender> GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.")
  @JsonProperty("GENDER")
  public List<TargetingSpecGender> getGENDER() {
    return GENDER;
  }
  public void setGENDER(List<TargetingSpecGender> GENDER) {
    this.GENDER = GENDER;
  }

  /**
   * Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
   */
  public TargetingSpec GEO(List<String> GEO) {
    this.GEO = GEO;
    return this;
  }

  
  @ApiModelProperty(value = "Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.")
  @JsonProperty("GEO")
  public List<String> getGEO() {
    return GEO;
  }
  public void setGEO(List<String> GEO) {
    this.GEO = GEO;
  }

  /**
   * Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br />
   */
  public TargetingSpec GEO_EXCLUDE(List<String> GEO_EXCLUDE) {
    this.GEO_EXCLUDE = GEO_EXCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br />")
  @JsonProperty("GEO_EXCLUDE")
  public List<String> getGEOEXCLUDE() {
    return GEO_EXCLUDE;
  }
  public void setGEOEXCLUDE(List<String> GEO_EXCLUDE) {
    this.GEO_EXCLUDE = GEO_EXCLUDE;
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
   * 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
   */
  public TargetingSpec LOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
    return this;
  }

  
  @ApiModelProperty(value = "24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.")
  @JsonProperty("LOCALE")
  public List<String> getLOCALE() {
    return LOCALE;
  }
  public void setLOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
  }

  /**
   * Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
   */
  public TargetingSpec LOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }

  
  @ApiModelProperty(value = "Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.")
  @JsonProperty("LOCATION")
  public List<String> getLOCATION() {
    return LOCATION;
  }
  public void setLOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
  }

  /**
   * Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information.
   */
  public TargetingSpec LOCATION_EXCLUDE(List<String> LOCATION_EXCLUDE) {
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information.")
  @JsonProperty("LOCATION_EXCLUDE")
  public List<String> getLOCATIONEXCLUDE() {
    return LOCATION_EXCLUDE;
  }
  public void setLOCATIONEXCLUDE(List<String> LOCATION_EXCLUDE) {
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
  }

  /**
   * Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
   */
  public TargetingSpec MAXIMUM_AGE(String MAXIMUM_AGE) {
    this.MAXIMUM_AGE = MAXIMUM_AGE;
    return this;
  }

  
  @ApiModelProperty(example = "65+", value = "Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.")
  @JsonProperty("MAXIMUM_AGE")
  public String getMAXIMUMAGE() {
    return MAXIMUM_AGE;
  }
  public void setMAXIMUMAGE(String MAXIMUM_AGE) {
    this.MAXIMUM_AGE = MAXIMUM_AGE;
  }

  /**
   * Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
   */
  public TargetingSpec MINIMUM_AGE(String MINIMUM_AGE) {
    this.MINIMUM_AGE = MINIMUM_AGE;
    return this;
  }

  
  @ApiModelProperty(example = "18", value = "Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.")
  @JsonProperty("MINIMUM_AGE")
  public String getMINIMUMAGE() {
    return MINIMUM_AGE;
  }
  public void setMINIMUMAGE(String MINIMUM_AGE) {
    this.MINIMUM_AGE = MINIMUM_AGE;
  }

  /**
   * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
   */
  public TargetingSpec SHOPPING_RETARGETING(List<TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
    return this;
  }

  
  @ApiModelProperty(value = "Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting")
  @JsonProperty("SHOPPING_RETARGETING")
  public List<TargetingSpecShoppingRetargeting> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }
  public void setSHOPPINGRETARGETING(List<TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
  }

  /**
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
        Objects.equals(AUDIENCE_INCLUDE, targetingSpec.AUDIENCE_INCLUDE) &&
        Objects.equals(GENDER, targetingSpec.GENDER) &&
        Objects.equals(GEO, targetingSpec.GEO) &&
        Objects.equals(GEO_EXCLUDE, targetingSpec.GEO_EXCLUDE) &&
        Objects.equals(INTEREST, targetingSpec.INTEREST) &&
        Objects.equals(LOCALE, targetingSpec.LOCALE) &&
        Objects.equals(LOCATION, targetingSpec.LOCATION) &&
        Objects.equals(LOCATION_EXCLUDE, targetingSpec.LOCATION_EXCLUDE) &&
        Objects.equals(MAXIMUM_AGE, targetingSpec.MAXIMUM_AGE) &&
        Objects.equals(MINIMUM_AGE, targetingSpec.MINIMUM_AGE) &&
        Objects.equals(SHOPPING_RETARGETING, targetingSpec.SHOPPING_RETARGETING) &&
        Objects.equals(TARGETING_STRATEGY, targetingSpec.TARGETING_STRATEGY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AGE_BUCKET, APPTYPE, AUDIENCE_EXCLUDE, AUDIENCE_INCLUDE, GENDER, GEO, GEO_EXCLUDE, INTEREST, LOCALE, LOCATION, LOCATION_EXCLUDE, MAXIMUM_AGE, MINIMUM_AGE, SHOPPING_RETARGETING, TARGETING_STRATEGY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpec {\n");
    
    sb.append("    AGE_BUCKET: ").append(toIndentedString(AGE_BUCKET)).append("\n");
    sb.append("    APPTYPE: ").append(toIndentedString(APPTYPE)).append("\n");
    sb.append("    AUDIENCE_EXCLUDE: ").append(toIndentedString(AUDIENCE_EXCLUDE)).append("\n");
    sb.append("    AUDIENCE_INCLUDE: ").append(toIndentedString(AUDIENCE_INCLUDE)).append("\n");
    sb.append("    GENDER: ").append(toIndentedString(GENDER)).append("\n");
    sb.append("    GEO: ").append(toIndentedString(GEO)).append("\n");
    sb.append("    GEO_EXCLUDE: ").append(toIndentedString(GEO_EXCLUDE)).append("\n");
    sb.append("    INTEREST: ").append(toIndentedString(INTEREST)).append("\n");
    sb.append("    LOCALE: ").append(toIndentedString(LOCALE)).append("\n");
    sb.append("    LOCATION: ").append(toIndentedString(LOCATION)).append("\n");
    sb.append("    LOCATION_EXCLUDE: ").append(toIndentedString(LOCATION_EXCLUDE)).append("\n");
    sb.append("    MAXIMUM_AGE: ").append(toIndentedString(MAXIMUM_AGE)).append("\n");
    sb.append("    MINIMUM_AGE: ").append(toIndentedString(MINIMUM_AGE)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

