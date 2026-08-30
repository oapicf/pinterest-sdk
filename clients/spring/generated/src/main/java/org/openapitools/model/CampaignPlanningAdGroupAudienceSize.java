package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
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
 * Range audience size for an ad group.
 */

@Schema(name = "CampaignPlanningAdGroupAudienceSize", description = "Range audience size for an ad group.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningAdGroupAudienceSize {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer countLower;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer countUpper;

  public CampaignPlanningAdGroupAudienceSize countLower(@Nullable Integer countLower) {
    this.countLower = countLower;
    return this;
  }

  /**
   * Lower bound of the audience size estimate.
   * minimum: 0
   * @return countLower
   */
  @Min(value = 0) 
  @Schema(name = "count_lower", example = "1000000", description = "Lower bound of the audience size estimate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count_lower")
  public @Nullable Integer getCountLower() {
    return countLower;
  }

  @JsonProperty("count_lower")
  public void setCountLower(@Nullable Integer countLower) {
    this.countLower = countLower;
  }

  public CampaignPlanningAdGroupAudienceSize countUpper(@Nullable Integer countUpper) {
    this.countUpper = countUpper;
    return this;
  }

  /**
   * Upper bound of the audience size estimate.
   * minimum: 0
   * @return countUpper
   */
  @Min(value = 0) 
  @Schema(name = "count_upper", example = "2000000", description = "Upper bound of the audience size estimate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count_upper")
  public @Nullable Integer getCountUpper() {
    return countUpper;
  }

  @JsonProperty("count_upper")
  public void setCountUpper(@Nullable Integer countUpper) {
    this.countUpper = countUpper;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningAdGroupAudienceSize campaignPlanningAdGroupAudienceSize = (CampaignPlanningAdGroupAudienceSize) o;
    return Objects.equals(this.countLower, campaignPlanningAdGroupAudienceSize.countLower) &&
        Objects.equals(this.countUpper, campaignPlanningAdGroupAudienceSize.countUpper);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countLower, countUpper);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningAdGroupAudienceSize {\n");
    sb.append("    countLower: ").append(toIndentedString(countLower)).append("\n");
    sb.append("    countUpper: ").append(toIndentedString(countUpper)).append("\n");
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

