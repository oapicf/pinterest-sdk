package org.openapitools.model;

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
import org.openapitools.model.TargetingStrategy;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TargetingSpecOptimal")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingSpecOptimal   {
  private @Valid List<TargetingSpecAgeBucket> AGE_BUCKET;
  private @Valid List<TargetingSpecAppType> APPTYPE;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE;
  private @Valid List<TargetingSpecGender> GENDER;
  private @Valid List<String> GEO;
  private @Valid List<String> GEO_EXCLUDE = new ArrayList<>();
  private @Valid List<String> INTEREST = new ArrayList<>();
  private @Valid List<String> LOCALE;
  private @Valid List<String> LOCATION;
  private @Valid List<String> LOCATION_EXCLUDE = new ArrayList<>();
  private String MAXIMUM_AGE;
  private String MINIMUM_AGE;
  private @Valid List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING;
  private @Valid List<TargetingStrategy> TARGETING_STRATEGY;

  public TargetingSpecOptimal() {
  }

  /**
   * **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
   **/
  public TargetingSpecOptimal AGE_BUCKET(List<TargetingSpecAgeBucket> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
    return this;
  }

  
  @ApiModelProperty(value = "**Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.")
  @JsonProperty("AGE_BUCKET")
  public List<TargetingSpecAgeBucket> getAGEBUCKET() {
    return AGE_BUCKET;
  }

  @JsonProperty("AGE_BUCKET")
  public void setAGEBUCKET(List<TargetingSpecAgeBucket> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  public TargetingSpecOptimal addAGEBUCKETItem(TargetingSpecAgeBucket AGE_BUCKETItem) {
    if (this.AGE_BUCKET == null) {
      this.AGE_BUCKET = new ArrayList<>();
    }

    this.AGE_BUCKET.add(AGE_BUCKETItem);
    return this;
  }

  public TargetingSpecOptimal removeAGEBUCKETItem(TargetingSpecAgeBucket AGE_BUCKETItem) {
    if (AGE_BUCKETItem != null && this.AGE_BUCKET != null) {
      this.AGE_BUCKET.remove(AGE_BUCKETItem);
    }

    return this;
  }
  /**
   * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
   **/
  public TargetingSpecOptimal APPTYPE(List<TargetingSpecAppType> APPTYPE) {
    this.APPTYPE = APPTYPE;
    return this;
  }

  
  @ApiModelProperty(value = "Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.")
  @JsonProperty("APPTYPE")
  public List<TargetingSpecAppType> getAPPTYPE() {
    return APPTYPE;
  }

  @JsonProperty("APPTYPE")
  public void setAPPTYPE(List<TargetingSpecAppType> APPTYPE) {
    this.APPTYPE = APPTYPE;
  }

  public TargetingSpecOptimal addAPPTYPEItem(TargetingSpecAppType APPTYPEItem) {
    if (this.APPTYPE == null) {
      this.APPTYPE = new ArrayList<>();
    }

    this.APPTYPE.add(APPTYPEItem);
    return this;
  }

  public TargetingSpecOptimal removeAPPTYPEItem(TargetingSpecAppType APPTYPEItem) {
    if (APPTYPEItem != null && this.APPTYPE != null) {
      this.APPTYPE.remove(APPTYPEItem);
    }

    return this;
  }
  /**
   * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
   **/
  public TargetingSpecOptimal AUDIENCE_EXCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE) {
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

  public TargetingSpecOptimal addAUDIENCEEXCLUDEItem(String AUDIENCE_EXCLUDEItem) {
    if (this.AUDIENCE_EXCLUDE == null) {
      this.AUDIENCE_EXCLUDE = new ArrayList<>();
    }

    this.AUDIENCE_EXCLUDE.add(AUDIENCE_EXCLUDEItem);
    return this;
  }

  public TargetingSpecOptimal removeAUDIENCEEXCLUDEItem(String AUDIENCE_EXCLUDEItem) {
    if (AUDIENCE_EXCLUDEItem != null && this.AUDIENCE_EXCLUDE != null) {
      this.AUDIENCE_EXCLUDE.remove(AUDIENCE_EXCLUDEItem);
    }

    return this;
  }
  /**
   * Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
   **/
  public TargetingSpecOptimal AUDIENCE_INCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE) {
    this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.")
  @JsonProperty("AUDIENCE_INCLUDE")
  public List< @Pattern(regexp="^\\d+$")String> getAUDIENCEINCLUDE() {
    return AUDIENCE_INCLUDE;
  }

  @JsonProperty("AUDIENCE_INCLUDE")
  public void setAUDIENCEINCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE) {
    this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
  }

  public TargetingSpecOptimal addAUDIENCEINCLUDEItem(String AUDIENCE_INCLUDEItem) {
    if (this.AUDIENCE_INCLUDE == null) {
      this.AUDIENCE_INCLUDE = new ArrayList<>();
    }

    this.AUDIENCE_INCLUDE.add(AUDIENCE_INCLUDEItem);
    return this;
  }

  public TargetingSpecOptimal removeAUDIENCEINCLUDEItem(String AUDIENCE_INCLUDEItem) {
    if (AUDIENCE_INCLUDEItem != null && this.AUDIENCE_INCLUDE != null) {
      this.AUDIENCE_INCLUDE.remove(AUDIENCE_INCLUDEItem);
    }

    return this;
  }
  /**
   * Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
   **/
  public TargetingSpecOptimal GENDER(List<TargetingSpecGender> GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.")
  @JsonProperty("GENDER")
  public List<TargetingSpecGender> getGENDER() {
    return GENDER;
  }

  @JsonProperty("GENDER")
  public void setGENDER(List<TargetingSpecGender> GENDER) {
    this.GENDER = GENDER;
  }

  public TargetingSpecOptimal addGENDERItem(TargetingSpecGender GENDERItem) {
    if (this.GENDER == null) {
      this.GENDER = new ArrayList<>();
    }

    this.GENDER.add(GENDERItem);
    return this;
  }

  public TargetingSpecOptimal removeGENDERItem(TargetingSpecGender GENDERItem) {
    if (GENDERItem != null && this.GENDER != null) {
      this.GENDER.remove(GENDERItem);
    }

    return this;
  }
  /**
   * Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: &#x60;US-CA&#x60; is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: &#x60;94103&#x60; is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like &#x60;US-CA&#x60; or a more granular postal code within that regon, such as &#x60;94103&#x60;.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the &#x60;region_codes&#x60; key and a postal code value with the &#x60;postal_codes&#x60; key. Examples:  &#x60;&#x60;&#x60; \&quot;geo\&quot;: {   \&quot;region_codes\&quot;: [\&quot;US-CA\&quot;] } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; \&quot;geo\&quot;: {   \&quot;postal_codes\&quot;: [\&quot;94103\&quot;] } &#x60;&#x60;&#x60;  For each ad group, specify at least one &#x60;GEO&#x60; or &#x60;LOCATION&#x60;.  If you do not specifiy a &#x60;GEO&#x60; code, only &#x60;LOCATION&#x60; values will be targeted (See &#x60;LOCATION&#x60; parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
   **/
  public TargetingSpecOptimal GEO(List<String> GEO) {
    this.GEO = GEO;
    return this;
  }

  
  @ApiModelProperty(value = "Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: `US-CA` is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: `94103` is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like `US-CA` or a more granular postal code within that regon, such as `94103`.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the `region_codes` key and a postal code value with the `postal_codes` key. Examples:  ``` \"geo\": {   \"region_codes\": [\"US-CA\"] } ```  ``` \"geo\": {   \"postal_codes\": [\"94103\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION`.  If you do not specifiy a `GEO` code, only `LOCATION` values will be targeted (See `LOCATION` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).")
  @JsonProperty("GEO")
  public List<String> getGEO() {
    return GEO;
  }

  @JsonProperty("GEO")
  public void setGEO(List<String> GEO) {
    this.GEO = GEO;
  }

  public TargetingSpecOptimal addGEOItem(String GEOItem) {
    if (this.GEO == null) {
      this.GEO = new ArrayList<>();
    }

    this.GEO.add(GEOItem);
    return this;
  }

  public TargetingSpecOptimal removeGEOItem(String GEOItem) {
    if (GEOItem != null && this.GEO != null) {
      this.GEO.remove(GEOItem);
    }

    return this;
  }
  /**
   * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See &#x60;GEO&#x60; parameter in this targeting spec for rules, syntax, and other information.
   **/
  public TargetingSpecOptimal GEO_EXCLUDE(List<String> GEO_EXCLUDE) {
    this.GEO_EXCLUDE = GEO_EXCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See `GEO` parameter in this targeting spec for rules, syntax, and other information.")
  @JsonProperty("GEO_EXCLUDE")
  public List<String> getGEOEXCLUDE() {
    return GEO_EXCLUDE;
  }

  @JsonProperty("GEO_EXCLUDE")
  public void setGEOEXCLUDE(List<String> GEO_EXCLUDE) {
    this.GEO_EXCLUDE = GEO_EXCLUDE;
  }

  public TargetingSpecOptimal addGEOEXCLUDEItem(String GEO_EXCLUDEItem) {
    if (this.GEO_EXCLUDE == null) {
      this.GEO_EXCLUDE = new ArrayList<>();
    }

    this.GEO_EXCLUDE.add(GEO_EXCLUDEItem);
    return this;
  }

  public TargetingSpecOptimal removeGEOEXCLUDEItem(String GEO_EXCLUDEItem) {
    if (GEO_EXCLUDEItem != null && this.GEO_EXCLUDE != null) {
      this.GEO_EXCLUDE.remove(GEO_EXCLUDEItem);
    }

    return this;
  }
  /**
   * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
   **/
  public TargetingSpecOptimal INTEREST(List<String> INTEREST) {
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

  public TargetingSpecOptimal addINTERESTItem(String INTERESTItem) {
    if (this.INTEREST == null) {
      this.INTEREST = new ArrayList<>();
    }

    this.INTEREST.add(INTERESTItem);
    return this;
  }

  public TargetingSpecOptimal removeINTERESTItem(String INTERESTItem) {
    if (INTERESTItem != null && this.INTEREST != null) {
      this.INTEREST.remove(INTERESTItem);
    }

    return this;
  }
  /**
   * 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
   **/
  public TargetingSpecOptimal LOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
    return this;
  }

  
  @ApiModelProperty(value = "24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.")
  @JsonProperty("LOCALE")
  public List<String> getLOCALE() {
    return LOCALE;
  }

  @JsonProperty("LOCALE")
  public void setLOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
  }

  public TargetingSpecOptimal addLOCALEItem(String LOCALEItem) {
    if (this.LOCALE == null) {
      this.LOCALE = new ArrayList<>();
    }

    this.LOCALE.add(LOCALEItem);
    return this;
  }

  public TargetingSpecOptimal removeLOCALEItem(String LOCALEItem) {
    if (LOCALEItem != null && this.LOCALE != null) {
      this.LOCALE.remove(LOCALEItem);
    }

    return this;
  }
  /**
   * Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the &#x60;country_codes&#x60; key and metro code values with &#x60;metro_codes&#x60; key. Example:  &#x60;&#x60;&#x60; \&quot;location\&quot;: {   \&quot;country_codes\&quot;: [\&quot;US\&quot;, \&quot;CA\&quot;],   \&quot;metro_codes\&quot;: [\&quot;501\&quot;, \&quot;602\&quot;] } &#x60;&#x60;&#x60;  For each ad group, specify at least one &#x60;GEO&#x60; or &#x60;LOCATION&#x60; code.  If you do not specify a &#x60;LOCATION&#x60; code, only &#x60;GEO&#x60; values will be targeted (See &#x60;GEO&#x60; parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
   **/
  public TargetingSpecOptimal LOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }

  
  @ApiModelProperty(value = "Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the `country_codes` key and metro code values with `metro_codes` key. Example:  ``` \"location\": {   \"country_codes\": [\"US\", \"CA\"],   \"metro_codes\": [\"501\", \"602\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION` code.  If you do not specify a `LOCATION` code, only `GEO` values will be targeted (See `GEO` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).")
  @JsonProperty("LOCATION")
  public List<String> getLOCATION() {
    return LOCATION;
  }

  @JsonProperty("LOCATION")
  public void setLOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
  }

  public TargetingSpecOptimal addLOCATIONItem(String LOCATIONItem) {
    if (this.LOCATION == null) {
      this.LOCATION = new ArrayList<>();
    }

    this.LOCATION.add(LOCATIONItem);
    return this;
  }

  public TargetingSpecOptimal removeLOCATIONItem(String LOCATIONItem) {
    if (LOCATIONItem != null && this.LOCATION != null) {
      this.LOCATION.remove(LOCATIONItem);
    }

    return this;
  }
  /**
   * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See &#x60;LOCATION&#x60; parameter in this targeting spec for rules, syntax, and other information.
   **/
  public TargetingSpecOptimal LOCATION_EXCLUDE(List<String> LOCATION_EXCLUDE) {
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See `LOCATION` parameter in this targeting spec for rules, syntax, and other information.")
  @JsonProperty("LOCATION_EXCLUDE")
  public List<String> getLOCATIONEXCLUDE() {
    return LOCATION_EXCLUDE;
  }

  @JsonProperty("LOCATION_EXCLUDE")
  public void setLOCATIONEXCLUDE(List<String> LOCATION_EXCLUDE) {
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
  }

  public TargetingSpecOptimal addLOCATIONEXCLUDEItem(String LOCATION_EXCLUDEItem) {
    if (this.LOCATION_EXCLUDE == null) {
      this.LOCATION_EXCLUDE = new ArrayList<>();
    }

    this.LOCATION_EXCLUDE.add(LOCATION_EXCLUDEItem);
    return this;
  }

  public TargetingSpecOptimal removeLOCATIONEXCLUDEItem(String LOCATION_EXCLUDEItem) {
    if (LOCATION_EXCLUDEItem != null && this.LOCATION_EXCLUDE != null) {
      this.LOCATION_EXCLUDE.remove(LOCATION_EXCLUDEItem);
    }

    return this;
  }
  /**
   * Maximum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;, \&quot;65+\&quot;. Must be used together with &#x60;MINIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.
   **/
  public TargetingSpecOptimal MAXIMUM_AGE(String MAXIMUM_AGE) {
    this.MAXIMUM_AGE = MAXIMUM_AGE;
    return this;
  }

  
  @ApiModelProperty(value = "Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.")
  @JsonProperty("MAXIMUM_AGE")
   @Pattern(regexp="^\\d+\\+?$")public String getMAXIMUMAGE() {
    return MAXIMUM_AGE;
  }

  @JsonProperty("MAXIMUM_AGE")
  public void setMAXIMUMAGE(String MAXIMUM_AGE) {
    this.MAXIMUM_AGE = MAXIMUM_AGE;
  }

  /**
   * Minimum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;. Note: 65+ is not allowed for minimum age. Must be used together with &#x60;MAXIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.
   **/
  public TargetingSpecOptimal MINIMUM_AGE(String MINIMUM_AGE) {
    this.MINIMUM_AGE = MINIMUM_AGE;
    return this;
  }

  
  @ApiModelProperty(value = "Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.")
  @JsonProperty("MINIMUM_AGE")
   @Pattern(regexp="^\\d+$")public String getMINIMUMAGE() {
    return MINIMUM_AGE;
  }

  @JsonProperty("MINIMUM_AGE")
  public void setMINIMUMAGE(String MINIMUM_AGE) {
    this.MINIMUM_AGE = MINIMUM_AGE;
  }

  /**
   * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
   **/
  public TargetingSpecOptimal SHOPPING_RETARGETING(List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
    return this;
  }

  
  @ApiModelProperty(value = "Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting")
  @JsonProperty("SHOPPING_RETARGETING")
  @Valid public List<@Valid TargetingSpecShoppingRetargeting> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }

  @JsonProperty("SHOPPING_RETARGETING")
  public void setSHOPPINGRETARGETING(List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
  }

  public TargetingSpecOptimal addSHOPPINGRETARGETINGItem(TargetingSpecShoppingRetargeting SHOPPING_RETARGETINGItem) {
    if (this.SHOPPING_RETARGETING == null) {
      this.SHOPPING_RETARGETING = new ArrayList<>();
    }

    this.SHOPPING_RETARGETING.add(SHOPPING_RETARGETINGItem);
    return this;
  }

  public TargetingSpecOptimal removeSHOPPINGRETARGETINGItem(TargetingSpecShoppingRetargeting SHOPPING_RETARGETINGItem) {
    if (SHOPPING_RETARGETINGItem != null && this.SHOPPING_RETARGETING != null) {
      this.SHOPPING_RETARGETING.remove(SHOPPING_RETARGETINGItem);
    }

    return this;
  }
  /**
   **/
  public TargetingSpecOptimal TARGETING_STRATEGY(List<TargetingStrategy> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("TARGETING_STRATEGY")
  public List<TargetingStrategy> getTARGETINGSTRATEGY() {
    return TARGETING_STRATEGY;
  }

  @JsonProperty("TARGETING_STRATEGY")
  public void setTARGETINGSTRATEGY(List<TargetingStrategy> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
  }

  public TargetingSpecOptimal addTARGETINGSTRATEGYItem(TargetingStrategy TARGETING_STRATEGYItem) {
    if (this.TARGETING_STRATEGY == null) {
      this.TARGETING_STRATEGY = new ArrayList<>();
    }

    this.TARGETING_STRATEGY.add(TARGETING_STRATEGYItem);
    return this;
  }

  public TargetingSpecOptimal removeTARGETINGSTRATEGYItem(TargetingStrategy TARGETING_STRATEGYItem) {
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
    TargetingSpecOptimal targetingSpecOptimal = (TargetingSpecOptimal) o;
    return Objects.equals(this.AGE_BUCKET, targetingSpecOptimal.AGE_BUCKET) &&
        Objects.equals(this.APPTYPE, targetingSpecOptimal.APPTYPE) &&
        Objects.equals(this.AUDIENCE_EXCLUDE, targetingSpecOptimal.AUDIENCE_EXCLUDE) &&
        Objects.equals(this.AUDIENCE_INCLUDE, targetingSpecOptimal.AUDIENCE_INCLUDE) &&
        Objects.equals(this.GENDER, targetingSpecOptimal.GENDER) &&
        Objects.equals(this.GEO, targetingSpecOptimal.GEO) &&
        Objects.equals(this.GEO_EXCLUDE, targetingSpecOptimal.GEO_EXCLUDE) &&
        Objects.equals(this.INTEREST, targetingSpecOptimal.INTEREST) &&
        Objects.equals(this.LOCALE, targetingSpecOptimal.LOCALE) &&
        Objects.equals(this.LOCATION, targetingSpecOptimal.LOCATION) &&
        Objects.equals(this.LOCATION_EXCLUDE, targetingSpecOptimal.LOCATION_EXCLUDE) &&
        Objects.equals(this.MAXIMUM_AGE, targetingSpecOptimal.MAXIMUM_AGE) &&
        Objects.equals(this.MINIMUM_AGE, targetingSpecOptimal.MINIMUM_AGE) &&
        Objects.equals(this.SHOPPING_RETARGETING, targetingSpecOptimal.SHOPPING_RETARGETING) &&
        Objects.equals(this.TARGETING_STRATEGY, targetingSpecOptimal.TARGETING_STRATEGY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AGE_BUCKET, APPTYPE, AUDIENCE_EXCLUDE, AUDIENCE_INCLUDE, GENDER, GEO, GEO_EXCLUDE, INTEREST, LOCALE, LOCATION, LOCATION_EXCLUDE, MAXIMUM_AGE, MINIMUM_AGE, SHOPPING_RETARGETING, TARGETING_STRATEGY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecOptimal {\n");
    
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
