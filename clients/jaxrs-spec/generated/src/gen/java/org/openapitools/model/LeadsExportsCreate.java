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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("LeadsExportsCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadsExportsCreate   {
  private String adId;
  private String endDate;
  private String startDate;

  public LeadsExportsCreate() {
  }

  @JsonCreator
  public LeadsExportsCreate(
    @JsonProperty(required = true, value = "ad_id") String adId,
    @JsonProperty(required = true, value = "end_date") String endDate,
    @JsonProperty(required = true, value = "start_date") String startDate
  ) {
    this.adId = adId;
    this.endDate = endDate;
    this.startDate = startDate;
  }

  /**
   * ID for the ad collecting leads.
   **/
  public LeadsExportsCreate adId(String adId) {
    this.adId = adId;
    return this;
  }

  
  @ApiModelProperty(example = "687201361754", required = true, value = "ID for the ad collecting leads.")
  @JsonProperty(required = true, value = "ad_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getAdId() {
    return adId;
  }

  @JsonProperty(required = true, value = "ad_id")
  public void setAdId(String adId) {
    this.adId = adId;
  }

  /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
   **/
  public LeadsExportsCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.")
  @JsonProperty(required = true, value = "end_date")
  @NotNull  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")public String getEndDate() {
    return endDate;
  }

  @JsonProperty(required = true, value = "end_date")
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
   **/
  public LeadsExportsCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.")
  @JsonProperty(required = true, value = "start_date")
  @NotNull  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")public String getStartDate() {
    return startDate;
  }

  @JsonProperty(required = true, value = "start_date")
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsExportsCreate leadsExportsCreate = (LeadsExportsCreate) o;
    return Objects.equals(this.adId, leadsExportsCreate.adId) &&
        Objects.equals(this.endDate, leadsExportsCreate.endDate) &&
        Objects.equals(this.startDate, leadsExportsCreate.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadsExportsCreate {\n");
    
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
