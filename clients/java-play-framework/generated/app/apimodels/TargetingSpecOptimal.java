package apimodels;

import apimodels.TargetingSpecAgeBucket;
import apimodels.TargetingSpecAppType;
import apimodels.TargetingSpecGender;
import apimodels.TargetingSpecShoppingRetargeting;
import apimodels.TargetingStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TargetingSpecOptimal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TargetingSpecOptimal   {
  @JsonProperty("AGE_BUCKET")
  @Valid

  private List<TargetingSpecAgeBucket> AGE_BUCKET = null;

  @JsonProperty("APPTYPE")
  @Valid

  private List<TargetingSpecAppType> APPTYPE = null;

  @JsonProperty("AUDIENCE_EXCLUDE")
  
  private List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE = null;

  @JsonProperty("AUDIENCE_INCLUDE")
  
  private List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE = null;

  @JsonProperty("GENDER")
  @Valid

  private List<TargetingSpecGender> GENDER = null;

  @JsonProperty("GEO")
  
  private List<String> GEO = null;

  @JsonProperty("GEO_EXCLUDE")
  
  private List<String> GEO_EXCLUDE = null;

  @JsonProperty("INTEREST")
  
  private List<String> INTEREST = null;

  @JsonProperty("LOCALE")
  
  private List<String> LOCALE = null;

  @JsonProperty("LOCATION")
  
  private List<String> LOCATION = null;

  @JsonProperty("LOCATION_EXCLUDE")
  
  private List<String> LOCATION_EXCLUDE = null;

  @JsonProperty("MAXIMUM_AGE")
  @Pattern(regexp="^\\d+\\+?$")

  private String MAXIMUM_AGE;

  @JsonProperty("MINIMUM_AGE")
  @Pattern(regexp="^\\d+$")

  private String MINIMUM_AGE;

  @JsonProperty("SHOPPING_RETARGETING")
  @Valid

  private List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING = null;

  @JsonProperty("TARGETING_STRATEGY")
  @Valid

  private List<TargetingStrategy> TARGETING_STRATEGY = null;

  public TargetingSpecOptimal AGE_BUCKET(List<TargetingSpecAgeBucket> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
    return this;
  }

  public TargetingSpecOptimal addAGEBUCKETItem(TargetingSpecAgeBucket AGE_BUCKETItem) {
    if (this.AGE_BUCKET == null) {
      this.AGE_BUCKET = new ArrayList<>();
    }
    this.AGE_BUCKET.add(AGE_BUCKETItem);
    return this;
  }

   /**
   * **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
   * @return AGE_BUCKET
  **/
  public List<TargetingSpecAgeBucket> getAGEBUCKET() {
    return AGE_BUCKET;
  }

  public void setAGEBUCKET(List<TargetingSpecAgeBucket> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  public TargetingSpecOptimal APPTYPE(List<TargetingSpecAppType> APPTYPE) {
    this.APPTYPE = APPTYPE;
    return this;
  }

  public TargetingSpecOptimal addAPPTYPEItem(TargetingSpecAppType APPTYPEItem) {
    if (this.APPTYPE == null) {
      this.APPTYPE = new ArrayList<>();
    }
    this.APPTYPE.add(APPTYPEItem);
    return this;
  }

   /**
   * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
   * @return APPTYPE
  **/
  public List<TargetingSpecAppType> getAPPTYPE() {
    return APPTYPE;
  }

  public void setAPPTYPE(List<TargetingSpecAppType> APPTYPE) {
    this.APPTYPE = APPTYPE;
  }

  public TargetingSpecOptimal AUDIENCE_EXCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
    return this;
  }

  public TargetingSpecOptimal addAUDIENCEEXCLUDEItem(String AUDIENCE_EXCLUDEItem) {
    if (this.AUDIENCE_EXCLUDE == null) {
      this.AUDIENCE_EXCLUDE = new ArrayList<>();
    }
    this.AUDIENCE_EXCLUDE.add(AUDIENCE_EXCLUDEItem);
    return this;
  }

   /**
   * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
   * @return AUDIENCE_EXCLUDE
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getAUDIENCEEXCLUDE() {
    return AUDIENCE_EXCLUDE;
  }

  public void setAUDIENCEEXCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
  }

  public TargetingSpecOptimal AUDIENCE_INCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE) {
    this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
    return this;
  }

  public TargetingSpecOptimal addAUDIENCEINCLUDEItem(String AUDIENCE_INCLUDEItem) {
    if (this.AUDIENCE_INCLUDE == null) {
      this.AUDIENCE_INCLUDE = new ArrayList<>();
    }
    this.AUDIENCE_INCLUDE.add(AUDIENCE_INCLUDEItem);
    return this;
  }

   /**
   * Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
   * @return AUDIENCE_INCLUDE
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getAUDIENCEINCLUDE() {
    return AUDIENCE_INCLUDE;
  }

  public void setAUDIENCEINCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE) {
    this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
  }

  public TargetingSpecOptimal GENDER(List<TargetingSpecGender> GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  public TargetingSpecOptimal addGENDERItem(TargetingSpecGender GENDERItem) {
    if (this.GENDER == null) {
      this.GENDER = new ArrayList<>();
    }
    this.GENDER.add(GENDERItem);
    return this;
  }

   /**
   * Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
   * @return GENDER
  **/
  public List<TargetingSpecGender> getGENDER() {
    return GENDER;
  }

  public void setGENDER(List<TargetingSpecGender> GENDER) {
    this.GENDER = GENDER;
  }

  public TargetingSpecOptimal GEO(List<String> GEO) {
    this.GEO = GEO;
    return this;
  }

  public TargetingSpecOptimal addGEOItem(String GEOItem) {
    if (this.GEO == null) {
      this.GEO = new ArrayList<>();
    }
    this.GEO.add(GEOItem);
    return this;
  }

   /**
   * Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: `US-CA` is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: `94103` is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like `US-CA` or a more granular postal code within that regon, such as `94103`.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the `region_codes` key and a postal code value with the `postal_codes` key. Examples:  ``` \"geo\": {   \"region_codes\": [\"US-CA\"] } ```  ``` \"geo\": {   \"postal_codes\": [\"94103\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION`.  If you do not specifiy a `GEO` code, only `LOCATION` values will be targeted (See `LOCATION` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
   * @return GEO
  **/
  public List<String> getGEO() {
    return GEO;
  }

  public void setGEO(List<String> GEO) {
    this.GEO = GEO;
  }

  public TargetingSpecOptimal GEO_EXCLUDE(List<String> GEO_EXCLUDE) {
    this.GEO_EXCLUDE = GEO_EXCLUDE;
    return this;
  }

  public TargetingSpecOptimal addGEOEXCLUDEItem(String GEO_EXCLUDEItem) {
    if (this.GEO_EXCLUDE == null) {
      this.GEO_EXCLUDE = new ArrayList<>();
    }
    this.GEO_EXCLUDE.add(GEO_EXCLUDEItem);
    return this;
  }

   /**
   * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See `GEO` parameter in this targeting spec for rules, syntax, and other information.
   * @return GEO_EXCLUDE
  **/
  public List<String> getGEOEXCLUDE() {
    return GEO_EXCLUDE;
  }

  public void setGEOEXCLUDE(List<String> GEO_EXCLUDE) {
    this.GEO_EXCLUDE = GEO_EXCLUDE;
  }

  public TargetingSpecOptimal INTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
    return this;
  }

  public TargetingSpecOptimal addINTERESTItem(String INTERESTItem) {
    if (this.INTEREST == null) {
      this.INTEREST = new ArrayList<>();
    }
    this.INTEREST.add(INTERESTItem);
    return this;
  }

   /**
   * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
   * @return INTEREST
  **/
  public List<String> getINTEREST() {
    return INTEREST;
  }

  public void setINTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
  }

  public TargetingSpecOptimal LOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
    return this;
  }

  public TargetingSpecOptimal addLOCALEItem(String LOCALEItem) {
    if (this.LOCALE == null) {
      this.LOCALE = new ArrayList<>();
    }
    this.LOCALE.add(LOCALEItem);
    return this;
  }

   /**
   * 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
   * @return LOCALE
  **/
  public List<String> getLOCALE() {
    return LOCALE;
  }

  public void setLOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
  }

  public TargetingSpecOptimal LOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }

  public TargetingSpecOptimal addLOCATIONItem(String LOCATIONItem) {
    if (this.LOCATION == null) {
      this.LOCATION = new ArrayList<>();
    }
    this.LOCATION.add(LOCATIONItem);
    return this;
  }

   /**
   * Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the `country_codes` key and metro code values with `metro_codes` key. Example:  ``` \"location\": {   \"country_codes\": [\"US\", \"CA\"],   \"metro_codes\": [\"501\", \"602\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION` code.  If you do not specify a `LOCATION` code, only `GEO` values will be targeted (See `GEO` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
   * @return LOCATION
  **/
  public List<String> getLOCATION() {
    return LOCATION;
  }

  public void setLOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
  }

  public TargetingSpecOptimal LOCATION_EXCLUDE(List<String> LOCATION_EXCLUDE) {
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
    return this;
  }

  public TargetingSpecOptimal addLOCATIONEXCLUDEItem(String LOCATION_EXCLUDEItem) {
    if (this.LOCATION_EXCLUDE == null) {
      this.LOCATION_EXCLUDE = new ArrayList<>();
    }
    this.LOCATION_EXCLUDE.add(LOCATION_EXCLUDEItem);
    return this;
  }

   /**
   * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See `LOCATION` parameter in this targeting spec for rules, syntax, and other information.
   * @return LOCATION_EXCLUDE
  **/
  public List<String> getLOCATIONEXCLUDE() {
    return LOCATION_EXCLUDE;
  }

  public void setLOCATIONEXCLUDE(List<String> LOCATION_EXCLUDE) {
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
  }

  public TargetingSpecOptimal MAXIMUM_AGE(String MAXIMUM_AGE) {
    this.MAXIMUM_AGE = MAXIMUM_AGE;
    return this;
  }

   /**
   * Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
   * @return MAXIMUM_AGE
  **/
  public String getMAXIMUMAGE() {
    return MAXIMUM_AGE;
  }

  public void setMAXIMUMAGE(String MAXIMUM_AGE) {
    this.MAXIMUM_AGE = MAXIMUM_AGE;
  }

  public TargetingSpecOptimal MINIMUM_AGE(String MINIMUM_AGE) {
    this.MINIMUM_AGE = MINIMUM_AGE;
    return this;
  }

   /**
   * Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
   * @return MINIMUM_AGE
  **/
  public String getMINIMUMAGE() {
    return MINIMUM_AGE;
  }

  public void setMINIMUMAGE(String MINIMUM_AGE) {
    this.MINIMUM_AGE = MINIMUM_AGE;
  }

  public TargetingSpecOptimal SHOPPING_RETARGETING(List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
    return this;
  }

  public TargetingSpecOptimal addSHOPPINGRETARGETINGItem(TargetingSpecShoppingRetargeting SHOPPING_RETARGETINGItem) {
    if (this.SHOPPING_RETARGETING == null) {
      this.SHOPPING_RETARGETING = new ArrayList<>();
    }
    this.SHOPPING_RETARGETING.add(SHOPPING_RETARGETINGItem);
    return this;
  }

   /**
   * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
   * @return SHOPPING_RETARGETING
  **/
  public List<@Valid TargetingSpecShoppingRetargeting> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }

  public void setSHOPPINGRETARGETING(List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
  }

  public TargetingSpecOptimal TARGETING_STRATEGY(List<TargetingStrategy> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
    return this;
  }

  public TargetingSpecOptimal addTARGETINGSTRATEGYItem(TargetingStrategy TARGETING_STRATEGYItem) {
    if (this.TARGETING_STRATEGY == null) {
      this.TARGETING_STRATEGY = new ArrayList<>();
    }
    this.TARGETING_STRATEGY.add(TARGETING_STRATEGYItem);
    return this;
  }

   /**
   * Get TARGETING_STRATEGY
   * @return TARGETING_STRATEGY
  **/
  public List<TargetingStrategy> getTARGETINGSTRATEGY() {
    return TARGETING_STRATEGY;
  }

  public void setTARGETINGSTRATEGY(List<TargetingStrategy> TARGETING_STRATEGY) {
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
    TargetingSpecOptimal targetingSpecOptimal = (TargetingSpecOptimal) o;
    return Objects.equals(AGE_BUCKET, targetingSpecOptimal.AGE_BUCKET) &&
        Objects.equals(APPTYPE, targetingSpecOptimal.APPTYPE) &&
        Objects.equals(AUDIENCE_EXCLUDE, targetingSpecOptimal.AUDIENCE_EXCLUDE) &&
        Objects.equals(AUDIENCE_INCLUDE, targetingSpecOptimal.AUDIENCE_INCLUDE) &&
        Objects.equals(GENDER, targetingSpecOptimal.GENDER) &&
        Objects.equals(GEO, targetingSpecOptimal.GEO) &&
        Objects.equals(GEO_EXCLUDE, targetingSpecOptimal.GEO_EXCLUDE) &&
        Objects.equals(INTEREST, targetingSpecOptimal.INTEREST) &&
        Objects.equals(LOCALE, targetingSpecOptimal.LOCALE) &&
        Objects.equals(LOCATION, targetingSpecOptimal.LOCATION) &&
        Objects.equals(LOCATION_EXCLUDE, targetingSpecOptimal.LOCATION_EXCLUDE) &&
        Objects.equals(MAXIMUM_AGE, targetingSpecOptimal.MAXIMUM_AGE) &&
        Objects.equals(MINIMUM_AGE, targetingSpecOptimal.MINIMUM_AGE) &&
        Objects.equals(SHOPPING_RETARGETING, targetingSpecOptimal.SHOPPING_RETARGETING) &&
        Objects.equals(TARGETING_STRATEGY, targetingSpecOptimal.TARGETING_STRATEGY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AGE_BUCKET, APPTYPE, AUDIENCE_EXCLUDE, AUDIENCE_INCLUDE, GENDER, GEO, GEO_EXCLUDE, INTEREST, LOCALE, LOCATION, LOCATION_EXCLUDE, MAXIMUM_AGE, MINIMUM_AGE, SHOPPING_RETARGETING, TARGETING_STRATEGY);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

