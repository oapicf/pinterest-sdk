package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TargetingSpecAgeBucket;
import org.openapitools.model.TargetingSpecAppType;
import org.openapitools.model.TargetingSpecGender;
import org.openapitools.model.TargetingSpecShoppingRetargeting;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;MINIMUM_AGE\&quot;:\&quot;18\&quot;, \&quot;MAXIMUM_AGE\&quot;:\&quot;65+\&quot;}&#x60;
 */

@Schema(name = "TargetingSpec", description = "Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"MINIMUM_AGE\":\"18\", \"MAXIMUM_AGE\":\"65+\"}`")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingSpec {

  @Valid
  private JsonNullable<List<TargetingSpecAgeBucket>> AGE_BUCKET = JsonNullable.<List<TargetingSpecAgeBucket>>undefined();

  @Valid
  private JsonNullable<List<TargetingSpecAppType>> APPTYPE = JsonNullable.<List<TargetingSpecAppType>>undefined();

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> AUDIENCE_EXCLUDE = JsonNullable.<List<@Pattern(regexp = "^\\d+$")String>>undefined();

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> AUDIENCE_INCLUDE = JsonNullable.<List<@Pattern(regexp = "^\\d+$")String>>undefined();

  @Valid
  private JsonNullable<List<TargetingSpecGender>> GENDER = JsonNullable.<List<TargetingSpecGender>>undefined();

  @Valid
  private JsonNullable<List<String>> GEO = JsonNullable.<List<String>>undefined();

  @Valid
  private List<String> GEO_EXCLUDE = new ArrayList<>();

  @Valid
  private List<String> INTEREST = new ArrayList<>();

  @Valid
  private JsonNullable<List<String>> LOCALE = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> LOCATION = JsonNullable.<List<String>>undefined();

  @Valid
  private List<String> LOCATION_EXCLUDE = new ArrayList<>();

  private String MAXIMUM_AGE;

  private String MINIMUM_AGE;

  @Valid
  private JsonNullable<List<@Valid TargetingSpecShoppingRetargeting>> SHOPPING_RETARGETING = JsonNullable.<List<@Valid TargetingSpecShoppingRetargeting>>undefined();

  /**
   * Gets or Sets TARGETING_STRATEGY
   */
  public enum TARGETINGSTRATEGYEnum {
    CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
    
    FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
    
    RECONNECT_WITH_USERS("RECONNECT_WITH_USERS");

    private final String value;

    TARGETINGSTRATEGYEnum(String value) {
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

  @Valid
  private JsonNullable<List<TARGETINGSTRATEGYEnum>> TARGETING_STRATEGY = JsonNullable.<List<TARGETINGSTRATEGYEnum>>undefined();

  public TargetingSpec AGE_BUCKET(List<TargetingSpecAgeBucket> AGE_BUCKET) {
    this.AGE_BUCKET = JsonNullable.of(AGE_BUCKET);
    return this;
  }

  public TargetingSpec addAGEBUCKETItem(TargetingSpecAgeBucket AGE_BUCKETItem) {
    if (this.AGE_BUCKET == null || !this.AGE_BUCKET.isPresent()) {
      this.AGE_BUCKET = JsonNullable.of(new ArrayList<>());
    }
    this.AGE_BUCKET.get().add(AGE_BUCKETItem);
    return this;
  }

  /**
   * **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
   * @return AGE_BUCKET
   */
  @Valid 
  @Schema(name = "AGE_BUCKET", example = "[\"35-44\",\"50-54\"]", description = "**Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AGE_BUCKET")
  public JsonNullable<List<TargetingSpecAgeBucket>> getAGEBUCKET() {
    return AGE_BUCKET;
  }

  public void setAGEBUCKET(JsonNullable<List<TargetingSpecAgeBucket>> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  public TargetingSpec APPTYPE(List<TargetingSpecAppType> APPTYPE) {
    this.APPTYPE = JsonNullable.of(APPTYPE);
    return this;
  }

  public TargetingSpec addAPPTYPEItem(TargetingSpecAppType APPTYPEItem) {
    if (this.APPTYPE == null || !this.APPTYPE.isPresent()) {
      this.APPTYPE = JsonNullable.of(new ArrayList<>());
    }
    this.APPTYPE.get().add(APPTYPEItem);
    return this;
  }

  /**
   * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
   * @return APPTYPE
   */
  @Valid 
  @Schema(name = "APPTYPE", example = "[\"ipad\",\"iphone\"]", description = "Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("APPTYPE")
  public JsonNullable<List<TargetingSpecAppType>> getAPPTYPE() {
    return APPTYPE;
  }

  public void setAPPTYPE(JsonNullable<List<TargetingSpecAppType>> APPTYPE) {
    this.APPTYPE = APPTYPE;
  }

  public TargetingSpec AUDIENCE_EXCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = JsonNullable.of(AUDIENCE_EXCLUDE);
    return this;
  }

  public TargetingSpec addAUDIENCEEXCLUDEItem(String AUDIENCE_EXCLUDEItem) {
    if (this.AUDIENCE_EXCLUDE == null || !this.AUDIENCE_EXCLUDE.isPresent()) {
      this.AUDIENCE_EXCLUDE = JsonNullable.of(new ArrayList<>());
    }
    this.AUDIENCE_EXCLUDE.get().add(AUDIENCE_EXCLUDEItem);
    return this;
  }

  /**
   * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
   * @return AUDIENCE_EXCLUDE
   */
  
  @Schema(name = "AUDIENCE_EXCLUDE", description = "Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AUDIENCE_EXCLUDE")
  public JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> getAUDIENCEEXCLUDE() {
    return AUDIENCE_EXCLUDE;
  }

  public void setAUDIENCEEXCLUDE(JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
  }

  public TargetingSpec AUDIENCE_INCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE) {
    this.AUDIENCE_INCLUDE = JsonNullable.of(AUDIENCE_INCLUDE);
    return this;
  }

  public TargetingSpec addAUDIENCEINCLUDEItem(String AUDIENCE_INCLUDEItem) {
    if (this.AUDIENCE_INCLUDE == null || !this.AUDIENCE_INCLUDE.isPresent()) {
      this.AUDIENCE_INCLUDE = JsonNullable.of(new ArrayList<>());
    }
    this.AUDIENCE_INCLUDE.get().add(AUDIENCE_INCLUDEItem);
    return this;
  }

  /**
   * Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
   * @return AUDIENCE_INCLUDE
   */
  
  @Schema(name = "AUDIENCE_INCLUDE", description = "Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AUDIENCE_INCLUDE")
  public JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> getAUDIENCEINCLUDE() {
    return AUDIENCE_INCLUDE;
  }

  public void setAUDIENCEINCLUDE(JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> AUDIENCE_INCLUDE) {
    this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
  }

  public TargetingSpec GENDER(List<TargetingSpecGender> GENDER) {
    this.GENDER = JsonNullable.of(GENDER);
    return this;
  }

  public TargetingSpec addGENDERItem(TargetingSpecGender GENDERItem) {
    if (this.GENDER == null || !this.GENDER.isPresent()) {
      this.GENDER = JsonNullable.of(new ArrayList<>());
    }
    this.GENDER.get().add(GENDERItem);
    return this;
  }

  /**
   * Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
   * @return GENDER
   */
  @Valid 
  @Schema(name = "GENDER", description = "Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GENDER")
  public JsonNullable<List<TargetingSpecGender>> getGENDER() {
    return GENDER;
  }

  public void setGENDER(JsonNullable<List<TargetingSpecGender>> GENDER) {
    this.GENDER = GENDER;
  }

  public TargetingSpec GEO(List<String> GEO) {
    this.GEO = JsonNullable.of(GEO);
    return this;
  }

  public TargetingSpec addGEOItem(String GEOItem) {
    if (this.GEO == null || !this.GEO.isPresent()) {
      this.GEO = JsonNullable.of(new ArrayList<>());
    }
    this.GEO.get().add(GEOItem);
    return this;
  }

  /**
   * Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
   * @return GEO
   */
  
  @Schema(name = "GEO", description = "Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GEO")
  public JsonNullable<List<String>> getGEO() {
    return GEO;
  }

  public void setGEO(JsonNullable<List<String>> GEO) {
    this.GEO = GEO;
  }

  public TargetingSpec GEO_EXCLUDE(List<String> GEO_EXCLUDE) {
    this.GEO_EXCLUDE = GEO_EXCLUDE;
    return this;
  }

  public TargetingSpec addGEOEXCLUDEItem(String GEO_EXCLUDEItem) {
    if (this.GEO_EXCLUDE == null) {
      this.GEO_EXCLUDE = new ArrayList<>();
    }
    this.GEO_EXCLUDE.add(GEO_EXCLUDEItem);
    return this;
  }

  /**
   * Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br />
   * @return GEO_EXCLUDE
   */
  
  @Schema(name = "GEO_EXCLUDE", description = "Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br />", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GEO_EXCLUDE")
  public List<String> getGEOEXCLUDE() {
    return GEO_EXCLUDE;
  }

  public void setGEOEXCLUDE(List<String> GEO_EXCLUDE) {
    this.GEO_EXCLUDE = GEO_EXCLUDE;
  }

  public TargetingSpec INTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
    return this;
  }

  public TargetingSpec addINTERESTItem(String INTERESTItem) {
    if (this.INTEREST == null) {
      this.INTEREST = new ArrayList<>();
    }
    this.INTEREST.add(INTERESTItem);
    return this;
  }

  /**
   * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
   * @return INTEREST
   */
  
  @Schema(name = "INTEREST", description = "Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("INTEREST")
  public List<String> getINTEREST() {
    return INTEREST;
  }

  public void setINTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
  }

  public TargetingSpec LOCALE(List<String> LOCALE) {
    this.LOCALE = JsonNullable.of(LOCALE);
    return this;
  }

  public TargetingSpec addLOCALEItem(String LOCALEItem) {
    if (this.LOCALE == null || !this.LOCALE.isPresent()) {
      this.LOCALE = JsonNullable.of(new ArrayList<>());
    }
    this.LOCALE.get().add(LOCALEItem);
    return this;
  }

  /**
   * 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
   * @return LOCALE
   */
  
  @Schema(name = "LOCALE", description = "24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LOCALE")
  public JsonNullable<List<String>> getLOCALE() {
    return LOCALE;
  }

  public void setLOCALE(JsonNullable<List<String>> LOCALE) {
    this.LOCALE = LOCALE;
  }

  public TargetingSpec LOCATION(List<String> LOCATION) {
    this.LOCATION = JsonNullable.of(LOCATION);
    return this;
  }

  public TargetingSpec addLOCATIONItem(String LOCATIONItem) {
    if (this.LOCATION == null || !this.LOCATION.isPresent()) {
      this.LOCATION = JsonNullable.of(new ArrayList<>());
    }
    this.LOCATION.get().add(LOCATIONItem);
    return this;
  }

  /**
   * Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
   * @return LOCATION
   */
  
  @Schema(name = "LOCATION", description = "Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LOCATION")
  public JsonNullable<List<String>> getLOCATION() {
    return LOCATION;
  }

  public void setLOCATION(JsonNullable<List<String>> LOCATION) {
    this.LOCATION = LOCATION;
  }

  public TargetingSpec LOCATION_EXCLUDE(List<String> LOCATION_EXCLUDE) {
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
    return this;
  }

  public TargetingSpec addLOCATIONEXCLUDEItem(String LOCATION_EXCLUDEItem) {
    if (this.LOCATION_EXCLUDE == null) {
      this.LOCATION_EXCLUDE = new ArrayList<>();
    }
    this.LOCATION_EXCLUDE.add(LOCATION_EXCLUDEItem);
    return this;
  }

  /**
   * Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information.
   * @return LOCATION_EXCLUDE
   */
  
  @Schema(name = "LOCATION_EXCLUDE", description = "Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LOCATION_EXCLUDE")
  public List<String> getLOCATIONEXCLUDE() {
    return LOCATION_EXCLUDE;
  }

  public void setLOCATIONEXCLUDE(List<String> LOCATION_EXCLUDE) {
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
  }

  public TargetingSpec MAXIMUM_AGE(String MAXIMUM_AGE) {
    this.MAXIMUM_AGE = MAXIMUM_AGE;
    return this;
  }

  /**
   * Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
   * @return MAXIMUM_AGE
   */
  @Pattern(regexp = "^\\d+\\+?$") 
  @Schema(name = "MAXIMUM_AGE", example = "65+", description = "Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MAXIMUM_AGE")
  public String getMAXIMUMAGE() {
    return MAXIMUM_AGE;
  }

  public void setMAXIMUMAGE(String MAXIMUM_AGE) {
    this.MAXIMUM_AGE = MAXIMUM_AGE;
  }

  public TargetingSpec MINIMUM_AGE(String MINIMUM_AGE) {
    this.MINIMUM_AGE = MINIMUM_AGE;
    return this;
  }

  /**
   * Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
   * @return MINIMUM_AGE
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "MINIMUM_AGE", example = "18", description = "Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MINIMUM_AGE")
  public String getMINIMUMAGE() {
    return MINIMUM_AGE;
  }

  public void setMINIMUMAGE(String MINIMUM_AGE) {
    this.MINIMUM_AGE = MINIMUM_AGE;
  }

  public TargetingSpec SHOPPING_RETARGETING(List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = JsonNullable.of(SHOPPING_RETARGETING);
    return this;
  }

  public TargetingSpec addSHOPPINGRETARGETINGItem(TargetingSpecShoppingRetargeting SHOPPING_RETARGETINGItem) {
    if (this.SHOPPING_RETARGETING == null || !this.SHOPPING_RETARGETING.isPresent()) {
      this.SHOPPING_RETARGETING = JsonNullable.of(new ArrayList<>());
    }
    this.SHOPPING_RETARGETING.get().add(SHOPPING_RETARGETINGItem);
    return this;
  }

  /**
   * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
   * @return SHOPPING_RETARGETING
   */
  @Valid 
  @Schema(name = "SHOPPING_RETARGETING", description = "Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SHOPPING_RETARGETING")
  public JsonNullable<List<@Valid TargetingSpecShoppingRetargeting>> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }

  public void setSHOPPINGRETARGETING(JsonNullable<List<@Valid TargetingSpecShoppingRetargeting>> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
  }

  public TargetingSpec TARGETING_STRATEGY(List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = JsonNullable.of(TARGETING_STRATEGY);
    return this;
  }

  public TargetingSpec addTARGETINGSTRATEGYItem(TARGETINGSTRATEGYEnum TARGETING_STRATEGYItem) {
    if (this.TARGETING_STRATEGY == null || !this.TARGETING_STRATEGY.isPresent()) {
      this.TARGETING_STRATEGY = JsonNullable.of(new ArrayList<>());
    }
    this.TARGETING_STRATEGY.get().add(TARGETING_STRATEGYItem);
    return this;
  }

  /**
   * Get TARGETING_STRATEGY
   * @return TARGETING_STRATEGY
   */
  
  @Schema(name = "TARGETING_STRATEGY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TARGETING_STRATEGY")
  public JsonNullable<List<TARGETINGSTRATEGYEnum>> getTARGETINGSTRATEGY() {
    return TARGETING_STRATEGY;
  }

  public void setTARGETINGSTRATEGY(JsonNullable<List<TARGETINGSTRATEGYEnum>> TARGETING_STRATEGY) {
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
    return equalsNullable(this.AGE_BUCKET, targetingSpec.AGE_BUCKET) &&
        equalsNullable(this.APPTYPE, targetingSpec.APPTYPE) &&
        equalsNullable(this.AUDIENCE_EXCLUDE, targetingSpec.AUDIENCE_EXCLUDE) &&
        equalsNullable(this.AUDIENCE_INCLUDE, targetingSpec.AUDIENCE_INCLUDE) &&
        equalsNullable(this.GENDER, targetingSpec.GENDER) &&
        equalsNullable(this.GEO, targetingSpec.GEO) &&
        Objects.equals(this.GEO_EXCLUDE, targetingSpec.GEO_EXCLUDE) &&
        Objects.equals(this.INTEREST, targetingSpec.INTEREST) &&
        equalsNullable(this.LOCALE, targetingSpec.LOCALE) &&
        equalsNullable(this.LOCATION, targetingSpec.LOCATION) &&
        Objects.equals(this.LOCATION_EXCLUDE, targetingSpec.LOCATION_EXCLUDE) &&
        Objects.equals(this.MAXIMUM_AGE, targetingSpec.MAXIMUM_AGE) &&
        Objects.equals(this.MINIMUM_AGE, targetingSpec.MINIMUM_AGE) &&
        equalsNullable(this.SHOPPING_RETARGETING, targetingSpec.SHOPPING_RETARGETING) &&
        equalsNullable(this.TARGETING_STRATEGY, targetingSpec.TARGETING_STRATEGY);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(AGE_BUCKET), hashCodeNullable(APPTYPE), hashCodeNullable(AUDIENCE_EXCLUDE), hashCodeNullable(AUDIENCE_INCLUDE), hashCodeNullable(GENDER), hashCodeNullable(GEO), GEO_EXCLUDE, INTEREST, hashCodeNullable(LOCALE), hashCodeNullable(LOCATION), LOCATION_EXCLUDE, MAXIMUM_AGE, MINIMUM_AGE, hashCodeNullable(SHOPPING_RETARGETING), hashCodeNullable(TARGETING_STRATEGY));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

