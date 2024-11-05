package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TargetingSpecSHOPPINGRETARGETING;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#x60;
 */

@Schema(name = "TargetingSpec", description = "Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}`")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingSpec {

  /**
   * Gets or Sets AGE_BUCKET
   */
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  @Valid
  private JsonNullable<List<AGEBUCKETEnum>> AGE_BUCKET = JsonNullable.<List<AGEBUCKETEnum>>undefined();

  /**
   * Gets or Sets APPTYPE
   */
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  @Valid
  private JsonNullable<List<APPTYPEEnum>> APPTYPE = JsonNullable.<List<APPTYPEEnum>>undefined();

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> AUDIENCE_EXCLUDE = JsonNullable.<List<@Pattern(regexp = "^\\d+$")String>>undefined();

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^\\d+$")String>> AUDIENCE_INCLUDE = JsonNullable.<List<@Pattern(regexp = "^\\d+$")String>>undefined();

  /**
   * Gets or Sets GENDER
   */
  public enum GENDEREnum {
    UNKNOWN("unknown"),
    
    MALE("male"),
    
    FEMALE("female");

    private String value;

    GENDEREnum(String value) {
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
    public static GENDEREnum fromValue(String value) {
      for (GENDEREnum b : GENDEREnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private JsonNullable<List<GENDEREnum>> GENDER = JsonNullable.<List<GENDEREnum>>undefined();

  @Valid
  private JsonNullable<List<String>> GEO = JsonNullable.<List<String>>undefined();

  @Valid
  private List<String> INTEREST = new ArrayList<>();

  @Valid
  private JsonNullable<List<String>> LOCALE = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> LOCATION = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<@Valid TargetingSpecSHOPPINGRETARGETING>> SHOPPING_RETARGETING = JsonNullable.<List<@Valid TargetingSpecSHOPPINGRETARGETING>>undefined();

  /**
   * Gets or Sets TARGETING_STRATEGY
   */
  public enum TARGETINGSTRATEGYEnum {
    CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
    
    FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
    
    RECONNECT_WITH_USERS("RECONNECT_WITH_USERS");

    private String value;

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

  public TargetingSpec AGE_BUCKET(List<AGEBUCKETEnum> AGE_BUCKET) {
    this.AGE_BUCKET = JsonNullable.of(AGE_BUCKET);
    return this;
  }

  public TargetingSpec addAGEBUCKETItem(AGEBUCKETEnum AGE_BUCKETItem) {
    if (this.AGE_BUCKET == null || !this.AGE_BUCKET.isPresent()) {
      this.AGE_BUCKET = JsonNullable.of(new ArrayList<>());
    }
    this.AGE_BUCKET.get().add(AGE_BUCKETItem);
    return this;
  }

  /**
   * Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
   * @return AGE_BUCKET
   */
  
  @Schema(name = "AGE_BUCKET", example = "[\"35-44\",\"50-54\"]", description = "Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AGE_BUCKET")
  public JsonNullable<List<AGEBUCKETEnum>> getAGEBUCKET() {
    return AGE_BUCKET;
  }

  public void setAGEBUCKET(JsonNullable<List<AGEBUCKETEnum>> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  public TargetingSpec APPTYPE(List<APPTYPEEnum> APPTYPE) {
    this.APPTYPE = JsonNullable.of(APPTYPE);
    return this;
  }

  public TargetingSpec addAPPTYPEItem(APPTYPEEnum APPTYPEItem) {
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
  
  @Schema(name = "APPTYPE", example = "[\"ipad\",\"iphone\"]", description = "Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("APPTYPE")
  public JsonNullable<List<APPTYPEEnum>> getAPPTYPE() {
    return APPTYPE;
  }

  public void setAPPTYPE(JsonNullable<List<APPTYPEEnum>> APPTYPE) {
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

  public TargetingSpec GENDER(List<GENDEREnum> GENDER) {
    this.GENDER = JsonNullable.of(GENDER);
    return this;
  }

  public TargetingSpec addGENDERItem(GENDEREnum GENDERItem) {
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
  
  @Schema(name = "GENDER", description = "Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GENDER")
  public JsonNullable<List<GENDEREnum>> getGENDER() {
    return GENDER;
  }

  public void setGENDER(JsonNullable<List<GENDEREnum>> GENDER) {
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
   * Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).
   * @return GEO
   */
  
  @Schema(name = "GEO", description = "Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GEO")
  public JsonNullable<List<String>> getGEO() {
    return GEO;
  }

  public void setGEO(JsonNullable<List<String>> GEO) {
    this.GEO = GEO;
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
   * 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.
   * @return LOCALE
   */
  
  @Schema(name = "LOCALE", description = "24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
   * 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).
   * @return LOCATION
   */
  
  @Schema(name = "LOCATION", description = "22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LOCATION")
  public JsonNullable<List<String>> getLOCATION() {
    return LOCATION;
  }

  public void setLOCATION(JsonNullable<List<String>> LOCATION) {
    this.LOCATION = LOCATION;
  }

  public TargetingSpec SHOPPING_RETARGETING(List<@Valid TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = JsonNullable.of(SHOPPING_RETARGETING);
    return this;
  }

  public TargetingSpec addSHOPPINGRETARGETINGItem(TargetingSpecSHOPPINGRETARGETING SHOPPING_RETARGETINGItem) {
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
  public JsonNullable<List<@Valid TargetingSpecSHOPPINGRETARGETING>> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }

  public void setSHOPPINGRETARGETING(JsonNullable<List<@Valid TargetingSpecSHOPPINGRETARGETING>> SHOPPING_RETARGETING) {
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
   * 
   * @return TARGETING_STRATEGY
   */
  
  @Schema(name = "TARGETING_STRATEGY", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        Objects.equals(this.INTEREST, targetingSpec.INTEREST) &&
        equalsNullable(this.LOCALE, targetingSpec.LOCALE) &&
        equalsNullable(this.LOCATION, targetingSpec.LOCATION) &&
        equalsNullable(this.SHOPPING_RETARGETING, targetingSpec.SHOPPING_RETARGETING) &&
        equalsNullable(this.TARGETING_STRATEGY, targetingSpec.TARGETING_STRATEGY);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(AGE_BUCKET), hashCodeNullable(APPTYPE), hashCodeNullable(AUDIENCE_EXCLUDE), hashCodeNullable(AUDIENCE_INCLUDE), hashCodeNullable(GENDER), hashCodeNullable(GEO), INTEREST, hashCodeNullable(LOCALE), hashCodeNullable(LOCATION), hashCodeNullable(SHOPPING_RETARGETING), hashCodeNullable(TARGETING_STRATEGY));
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

