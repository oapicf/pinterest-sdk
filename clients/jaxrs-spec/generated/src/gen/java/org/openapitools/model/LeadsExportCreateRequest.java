package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("LeadsExportCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadsExportCreateRequest   {
  private String startDate;
  private String endDate;
  private String adId;

  /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
   **/
  public LeadsExportCreateRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Export leads collected on and after start date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  @NotNull  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
   **/
  public LeadsExportCreateRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Export leads collected on and before end date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("end_date")
  @NotNull  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * ID for the ad collecting leads
   **/
  public LeadsExportCreateRequest adId(String adId) {
    this.adId = adId;
    return this;
  }

  
  @ApiModelProperty(example = "687201361754", required = true, value = "ID for the ad collecting leads")
  @JsonProperty("ad_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getAdId() {
    return adId;
  }

  @JsonProperty("ad_id")
  public void setAdId(String adId) {
    this.adId = adId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsExportCreateRequest leadsExportCreateRequest = (LeadsExportCreateRequest) o;
    return Objects.equals(this.startDate, leadsExportCreateRequest.startDate) &&
        Objects.equals(this.endDate, leadsExportCreateRequest.endDate) &&
        Objects.equals(this.adId, leadsExportCreateRequest.adId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, adId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadsExportCreateRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
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

