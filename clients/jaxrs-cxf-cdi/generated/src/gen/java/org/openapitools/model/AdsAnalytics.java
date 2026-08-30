package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class AdsAnalytics   {
  
  private String AD_ID;

  private LocalDate DATE;

  /**
   **/
  public AdsAnalytics AD_ID(String AD_ID) {
    this.AD_ID = AD_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("AD_ID")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getADID() {
    return AD_ID;
  }
  public void setADID(String AD_ID) {
    this.AD_ID = AD_ID;
  }


  /**
   **/
  public AdsAnalytics DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }
  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsAnalytics adsAnalytics = (AdsAnalytics) o;
    return Objects.equals(this.AD_ID, adsAnalytics.AD_ID) &&
        Objects.equals(this.DATE, adsAnalytics.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_ID, DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalytics {\n");
    
    sb.append("    AD_ID: ").append(toIndentedString(AD_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
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

