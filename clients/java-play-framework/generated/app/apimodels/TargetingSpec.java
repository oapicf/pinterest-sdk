package apimodels;

import apimodels.TargetingSpecSHOPPINGRETARGETING;
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
 * Ad group targeting specification defining the ad group target audience. For example, {\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TargetingSpec   {
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

    private final String value;

    AGEBUCKETEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("AGE_BUCKET")
  
  private List<AGEBUCKETEnum> AGE_BUCKET = null;

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

    private final String value;

    APPTYPEEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("APPTYPE")
  
  private List<APPTYPEEnum> APPTYPE = null;

  @JsonProperty("AUDIENCE_EXCLUDE")
  
  private List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE = null;

  @JsonProperty("AUDIENCE_INCLUDE&#39;")
  
  private List<@Pattern(regexp = "^\\d+$")String> auDIENCEINCLUDEQuote = null;

  /**
   * Gets or Sets GENDER
   */
  public enum GENDEREnum {
    UNKNOWN("unknown"),
    
    MALE("male"),
    
    FEMALE("female");

    private final String value;

    GENDEREnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("GENDER")
  
  private List<GENDEREnum> GENDER = null;

  @JsonProperty("GEO")
  
  private List<String> GEO = null;

  @JsonProperty("INTEREST")
  
  private List<String> INTEREST = null;

  @JsonProperty("LOCALE")
  
  private List<String> LOCALE = null;

  @JsonProperty("LOCATION")
  
  private List<String> LOCATION = null;

  @JsonProperty("SHOPPING_RETARGETING")
  @Valid

  private List<@Valid TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING = null;

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

    @Override
    @JsonValue
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

  @JsonProperty("TARGETING_STRATEGY")
  
  private List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY = null;

  public TargetingSpec AGE_BUCKET(List<AGEBUCKETEnum> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
    return this;
  }

  public TargetingSpec addAGEBUCKETItem(AGEBUCKETEnum AGE_BUCKETItem) {
    if (this.AGE_BUCKET == null) {
      this.AGE_BUCKET = new ArrayList<>();
    }
    this.AGE_BUCKET.add(AGE_BUCKETItem);
    return this;
  }

   /**
   * Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
   * @return AGE_BUCKET
  **/
  public List<AGEBUCKETEnum> getAGEBUCKET() {
    return AGE_BUCKET;
  }

  public void setAGEBUCKET(List<AGEBUCKETEnum> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  public TargetingSpec APPTYPE(List<APPTYPEEnum> APPTYPE) {
    this.APPTYPE = APPTYPE;
    return this;
  }

  public TargetingSpec addAPPTYPEItem(APPTYPEEnum APPTYPEItem) {
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
  public List<APPTYPEEnum> getAPPTYPE() {
    return APPTYPE;
  }

  public void setAPPTYPE(List<APPTYPEEnum> APPTYPE) {
    this.APPTYPE = APPTYPE;
  }

  public TargetingSpec AUDIENCE_EXCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
    return this;
  }

  public TargetingSpec addAUDIENCEEXCLUDEItem(String AUDIENCE_EXCLUDEItem) {
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

  public TargetingSpec auDIENCEINCLUDEQuote(List<@Pattern(regexp = "^\\d+$")String> auDIENCEINCLUDEQuote) {
    this.auDIENCEINCLUDEQuote = auDIENCEINCLUDEQuote;
    return this;
  }

  public TargetingSpec addAuDIENCEINCLUDEQuoteItem(String auDIENCEINCLUDEQuoteItem) {
    if (this.auDIENCEINCLUDEQuote == null) {
      this.auDIENCEINCLUDEQuote = new ArrayList<>();
    }
    this.auDIENCEINCLUDEQuote.add(auDIENCEINCLUDEQuoteItem);
    return this;
  }

   /**
   * Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
   * @return auDIENCEINCLUDEQuote
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getAuDIENCEINCLUDEQuote() {
    return auDIENCEINCLUDEQuote;
  }

  public void setAuDIENCEINCLUDEQuote(List<@Pattern(regexp = "^\\d+$")String> auDIENCEINCLUDEQuote) {
    this.auDIENCEINCLUDEQuote = auDIENCEINCLUDEQuote;
  }

  public TargetingSpec GENDER(List<GENDEREnum> GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  public TargetingSpec addGENDERItem(GENDEREnum GENDERItem) {
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
  public List<GENDEREnum> getGENDER() {
    return GENDER;
  }

  public void setGENDER(List<GENDEREnum> GENDER) {
    this.GENDER = GENDER;
  }

  public TargetingSpec GEO(List<String> GEO) {
    this.GEO = GEO;
    return this;
  }

  public TargetingSpec addGEOItem(String GEOItem) {
    if (this.GEO == null) {
      this.GEO = new ArrayList<>();
    }
    this.GEO.add(GEOItem);
    return this;
  }

   /**
   * Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. If the GEO field is missing, the default behavior in terms of ad delivery is that **No geos will be selected**.
   * @return GEO
  **/
  public List<String> getGEO() {
    return GEO;
  }

  public void setGEO(List<String> GEO) {
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
  **/
  public List<String> getINTEREST() {
    return INTEREST;
  }

  public void setINTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
  }

  public TargetingSpec LOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
    return this;
  }

  public TargetingSpec addLOCALEItem(String LOCALEItem) {
    if (this.LOCALE == null) {
      this.LOCALE = new ArrayList<>();
    }
    this.LOCALE.add(LOCALEItem);
    return this;
  }

   /**
   * 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be target, only english non-sublanguage will be targeted**.
   * @return LOCALE
  **/
  public List<String> getLOCALE() {
    return LOCALE;
  }

  public void setLOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
  }

  public TargetingSpec LOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }

  public TargetingSpec addLOCATIONItem(String LOCATIONItem) {
    if (this.LOCATION == null) {
      this.LOCATION = new ArrayList<>();
    }
    this.LOCATION.add(LOCATIONItem);
    return this;
  }

   /**
   * 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. If the LOCATION field is missing, the default behavior in terms of ad delivery is that **Selects default country if not specified (US) and all regions within that country**.
   * @return LOCATION
  **/
  public List<String> getLOCATION() {
    return LOCATION;
  }

  public void setLOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
  }

  public TargetingSpec SHOPPING_RETARGETING(List<@Valid TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
    return this;
  }

  public TargetingSpec addSHOPPINGRETARGETINGItem(TargetingSpecSHOPPINGRETARGETING SHOPPING_RETARGETINGItem) {
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
  public List<@Valid TargetingSpecSHOPPINGRETARGETING> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }

  public void setSHOPPINGRETARGETING(List<@Valid TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
  }

  public TargetingSpec TARGETING_STRATEGY(List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
    return this;
  }

  public TargetingSpec addTARGETINGSTRATEGYItem(TARGETINGSTRATEGYEnum TARGETING_STRATEGYItem) {
    if (this.TARGETING_STRATEGY == null) {
      this.TARGETING_STRATEGY = new ArrayList<>();
    }
    this.TARGETING_STRATEGY.add(TARGETING_STRATEGYItem);
    return this;
  }

   /**
   * 
   * @return TARGETING_STRATEGY
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

