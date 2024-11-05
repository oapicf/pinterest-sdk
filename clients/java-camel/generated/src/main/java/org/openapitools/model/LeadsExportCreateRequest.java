package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LeadsExportCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadsExportCreateRequest {

  private String startDate;

  private String endDate;

  private String adId;

  public LeadsExportCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LeadsExportCreateRequest(String startDate, String endDate, String adId) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.adId = adId;
  }

  public LeadsExportCreateRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
   * @return startDate
   */
  @NotNull @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "start_date", example = "2020-12-20", description = "Export leads collected on and after start date (UTC). Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public LeadsExportCreateRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
   * @return endDate
   */
  @NotNull @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "end_date", example = "2020-12-20", description = "Export leads collected on and before end date (UTC). Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public LeadsExportCreateRequest adId(String adId) {
    this.adId = adId;
    return this;
  }

  /**
   * ID for the ad collecting leads
   * @return adId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_id", example = "687201361754", description = "ID for the ad collecting leads", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_id")
  public String getAdId() {
    return adId;
  }

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

