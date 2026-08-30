package org.openapitools.model;

import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountAnalyticsItems  {
  
  @ApiModelProperty(required = true, value = "")
  private String AD_ACCOUNT_ID;

  @ApiModelProperty(value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate DATE;
 /**
  * Get AD_ACCOUNT_ID
  * @return AD_ACCOUNT_ID
  */
  @JsonProperty("AD_ACCOUNT_ID")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getADACCOUNTID() {
    return AD_ACCOUNT_ID;
  }

  /**
   * Sets the <code>AD_ACCOUNT_ID</code> property.
   */
 public void setADACCOUNTID(String AD_ACCOUNT_ID) {
    this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
  }

  /**
   * Sets the <code>AD_ACCOUNT_ID</code> property.
   */
  public AdAccountAnalyticsItems AD_ACCOUNT_ID(String AD_ACCOUNT_ID) {
    this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
    return this;
  }

 /**
  * Get DATE
  * @return DATE
  */
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }

  /**
   * Sets the <code>DATE</code> property.
   */
 public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }

  /**
   * Sets the <code>DATE</code> property.
   */
  public AdAccountAnalyticsItems DATE(LocalDate DATE) {
    this.DATE = DATE;
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
    AdAccountAnalyticsItems adAccountAnalyticsItems = (AdAccountAnalyticsItems) o;
    return Objects.equals(this.AD_ACCOUNT_ID, adAccountAnalyticsItems.AD_ACCOUNT_ID) &&
        Objects.equals(this.DATE, adAccountAnalyticsItems.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_ACCOUNT_ID, DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountAnalyticsItems {\n");
    
    sb.append("    AD_ACCOUNT_ID: ").append(toIndentedString(AD_ACCOUNT_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

