package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "LeadsExportsCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadsExportsCreate {

  private String adId;

  private String endDate;

  private String startDate;

  public LeadsExportsCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LeadsExportsCreate(String adId, String endDate, String startDate) {
    this.adId = adId;
    this.endDate = endDate;
    this.startDate = startDate;
  }

  public LeadsExportsCreate adId(String adId) {
    this.adId = adId;
    return this;
  }

  /**
   * ID for the ad collecting leads.
   * @return adId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_id", example = "687201361754", description = "ID for the ad collecting leads.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_id")
  public String getAdId() {
    return adId;
  }

  @JsonProperty("ad_id")
  public void setAdId(String adId) {
    this.adId = adId;
  }

  public LeadsExportsCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
   * @return endDate
   */
  @NotNull @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "end_date", example = "2020-12-20", description = "Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public LeadsExportsCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
   * @return startDate
   */
  @NotNull @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "start_date", example = "2020-12-20", description = "Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

