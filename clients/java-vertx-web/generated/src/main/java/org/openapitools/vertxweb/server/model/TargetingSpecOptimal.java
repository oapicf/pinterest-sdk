package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.TargetingSpecAgeBucket;
import org.openapitools.vertxweb.server.model.TargetingSpecAppType;
import org.openapitools.vertxweb.server.model.TargetingSpecGender;
import org.openapitools.vertxweb.server.model.TargetingSpecShoppingRetargeting;
import org.openapitools.vertxweb.server.model.TargetingStrategy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetingSpecOptimal   {
  
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
  private List<TargetingStrategy> TARGETING_STRATEGY;

  public TargetingSpecOptimal () {

  }

  public TargetingSpecOptimal (List<TargetingSpecAgeBucket> AGE_BUCKET, List<TargetingSpecAppType> APPTYPE, List<String> AUDIENCE_EXCLUDE, List<String> AUDIENCE_INCLUDE, List<TargetingSpecGender> GENDER, List<String> GEO, List<String> GEO_EXCLUDE, List<String> INTEREST, List<String> LOCALE, List<String> LOCATION, List<String> LOCATION_EXCLUDE, String MAXIMUM_AGE, String MINIMUM_AGE, List<TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING, List<TargetingStrategy> TARGETING_STRATEGY) {
    this.AGE_BUCKET = AGE_BUCKET;
    this.APPTYPE = APPTYPE;
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
    this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
    this.GENDER = GENDER;
    this.GEO = GEO;
    this.GEO_EXCLUDE = GEO_EXCLUDE;
    this.INTEREST = INTEREST;
    this.LOCALE = LOCALE;
    this.LOCATION = LOCATION;
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
    this.MAXIMUM_AGE = MAXIMUM_AGE;
    this.MINIMUM_AGE = MINIMUM_AGE;
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
  }

    
  @JsonProperty("AGE_BUCKET")
  public List<TargetingSpecAgeBucket> getAGEBUCKET() {
    return AGE_BUCKET;
  }
  public void setAGEBUCKET(List<TargetingSpecAgeBucket> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

    
  @JsonProperty("APPTYPE")
  public List<TargetingSpecAppType> getAPPTYPE() {
    return APPTYPE;
  }
  public void setAPPTYPE(List<TargetingSpecAppType> APPTYPE) {
    this.APPTYPE = APPTYPE;
  }

    
  @JsonProperty("AUDIENCE_EXCLUDE")
  public List<String> getAUDIENCEEXCLUDE() {
    return AUDIENCE_EXCLUDE;
  }
  public void setAUDIENCEEXCLUDE(List<String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
  }

    
  @JsonProperty("AUDIENCE_INCLUDE")
  public List<String> getAUDIENCEINCLUDE() {
    return AUDIENCE_INCLUDE;
  }
  public void setAUDIENCEINCLUDE(List<String> AUDIENCE_INCLUDE) {
    this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
  }

    
  @JsonProperty("GENDER")
  public List<TargetingSpecGender> getGENDER() {
    return GENDER;
  }
  public void setGENDER(List<TargetingSpecGender> GENDER) {
    this.GENDER = GENDER;
  }

    
  @JsonProperty("GEO")
  public List<String> getGEO() {
    return GEO;
  }
  public void setGEO(List<String> GEO) {
    this.GEO = GEO;
  }

    
  @JsonProperty("GEO_EXCLUDE")
  public List<String> getGEOEXCLUDE() {
    return GEO_EXCLUDE;
  }
  public void setGEOEXCLUDE(List<String> GEO_EXCLUDE) {
    this.GEO_EXCLUDE = GEO_EXCLUDE;
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

    
  @JsonProperty("LOCATION_EXCLUDE")
  public List<String> getLOCATIONEXCLUDE() {
    return LOCATION_EXCLUDE;
  }
  public void setLOCATIONEXCLUDE(List<String> LOCATION_EXCLUDE) {
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
  }

    
  @JsonProperty("MAXIMUM_AGE")
  public String getMAXIMUMAGE() {
    return MAXIMUM_AGE;
  }
  public void setMAXIMUMAGE(String MAXIMUM_AGE) {
    this.MAXIMUM_AGE = MAXIMUM_AGE;
  }

    
  @JsonProperty("MINIMUM_AGE")
  public String getMINIMUMAGE() {
    return MINIMUM_AGE;
  }
  public void setMINIMUMAGE(String MINIMUM_AGE) {
    this.MINIMUM_AGE = MINIMUM_AGE;
  }

    
  @JsonProperty("SHOPPING_RETARGETING")
  public List<TargetingSpecShoppingRetargeting> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }
  public void setSHOPPINGRETARGETING(List<TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
  }

    
  @JsonProperty("TARGETING_STRATEGY")
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
