package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.TargetingSpecSHOPPINGRETARGETING;

/**
 * Ad group targeting specification defining the ad group target audience. For example, {\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public TargetingSpec () {

  }

  public TargetingSpec (List<AGEBUCKETEnum> AGE_BUCKET, List<APPTYPEEnum> APPTYPE, List<String> AUDIENCE_EXCLUDE, List<String> auDIENCEINCLUDEQuote, List<GENDEREnum> GENDER, List<String> GEO, List<String> INTEREST, List<String> LOCALE, List<String> LOCATION, List<TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING, List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
    this.AGE_BUCKET = AGE_BUCKET;
    this.APPTYPE = APPTYPE;
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
    this.auDIENCEINCLUDEQuote = auDIENCEINCLUDEQuote;
    this.GENDER = GENDER;
    this.GEO = GEO;
    this.INTEREST = INTEREST;
    this.LOCALE = LOCALE;
    this.LOCATION = LOCATION;
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
  }

    
  @JsonProperty("AGE_BUCKET")
  public List<AGEBUCKETEnum> getAGEBUCKET() {
    return AGE_BUCKET;
  }
  public void setAGEBUCKET(List<AGEBUCKETEnum> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

    
  @JsonProperty("APPTYPE")
  public List<APPTYPEEnum> getAPPTYPE() {
    return APPTYPE;
  }
  public void setAPPTYPE(List<APPTYPEEnum> APPTYPE) {
    this.APPTYPE = APPTYPE;
  }

    
  @JsonProperty("AUDIENCE_EXCLUDE")
  public List<String> getAUDIENCEEXCLUDE() {
    return AUDIENCE_EXCLUDE;
  }
  public void setAUDIENCEEXCLUDE(List<String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
  }

    
  @JsonProperty("AUDIENCE_INCLUDE&#39;")
  public List<String> getAuDIENCEINCLUDEQuote() {
    return auDIENCEINCLUDEQuote;
  }
  public void setAuDIENCEINCLUDEQuote(List<String> auDIENCEINCLUDEQuote) {
    this.auDIENCEINCLUDEQuote = auDIENCEINCLUDEQuote;
  }

    
  @JsonProperty("GENDER")
  public List<GENDEREnum> getGENDER() {
    return GENDER;
  }
  public void setGENDER(List<GENDEREnum> GENDER) {
    this.GENDER = GENDER;
  }

    
  @JsonProperty("GEO")
  public List<String> getGEO() {
    return GEO;
  }
  public void setGEO(List<String> GEO) {
    this.GEO = GEO;
  }

    
  @JsonProperty("INTEREST")
  public List<String> getINTEREST() {
    return INTEREST;
  }
  public void setINTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
  }

    
  @JsonProperty("LOCALE")
  public List<String> getLOCALE() {
    return LOCALE;
  }
  public void setLOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
  }

    
  @JsonProperty("LOCATION")
  public List<String> getLOCATION() {
    return LOCATION;
  }
  public void setLOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
  }

    
  @JsonProperty("SHOPPING_RETARGETING")
  public List<TargetingSpecSHOPPINGRETARGETING> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }
  public void setSHOPPINGRETARGETING(List<TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
  }

    
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
