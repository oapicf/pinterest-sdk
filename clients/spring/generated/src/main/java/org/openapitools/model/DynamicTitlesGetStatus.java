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
 * DynamicTitlesGetStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DynamicTitlesGetStatus {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer generatedCount;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isReady;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer reviewedCount;

  public DynamicTitlesGetStatus generatedCount(@Nullable Integer generatedCount) {
    this.generatedCount = generatedCount;
    return this;
  }

  /**
   * The count of generated titles.
   * @return generatedCount
   */
  
  @Schema(name = "generated_count", example = "987", description = "The count of generated titles.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generated_count")
  public @Nullable Integer getGeneratedCount() {
    return generatedCount;
  }

  @JsonProperty("generated_count")
  public void setGeneratedCount(@Nullable Integer generatedCount) {
    this.generatedCount = generatedCount;
  }

  public DynamicTitlesGetStatus isReady(@Nullable Boolean isReady) {
    this.isReady = isReady;
    return this;
  }

  /**
   * Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
   * @return isReady
   */
  
  @Schema(name = "is_ready", example = "true", description = "Whether dynamic titles have been generated and are ready to be reviewed for the ad group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_ready")
  public @Nullable Boolean getIsReady() {
    return isReady;
  }

  @JsonProperty("is_ready")
  public void setIsReady(@Nullable Boolean isReady) {
    this.isReady = isReady;
  }

  public DynamicTitlesGetStatus reviewedCount(@Nullable Integer reviewedCount) {
    this.reviewedCount = reviewedCount;
    return this;
  }

  /**
   * The count of advertiser reviewed titles.
   * @return reviewedCount
   */
  
  @Schema(name = "reviewed_count", example = "456", description = "The count of advertiser reviewed titles.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reviewed_count")
  public @Nullable Integer getReviewedCount() {
    return reviewedCount;
  }

  @JsonProperty("reviewed_count")
  public void setReviewedCount(@Nullable Integer reviewedCount) {
    this.reviewedCount = reviewedCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicTitlesGetStatus dynamicTitlesGetStatus = (DynamicTitlesGetStatus) o;
    return Objects.equals(this.generatedCount, dynamicTitlesGetStatus.generatedCount) &&
        Objects.equals(this.isReady, dynamicTitlesGetStatus.isReady) &&
        Objects.equals(this.reviewedCount, dynamicTitlesGetStatus.reviewedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generatedCount, isReady, reviewedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTitlesGetStatus {\n");
    sb.append("    generatedCount: ").append(toIndentedString(generatedCount)).append("\n");
    sb.append("    isReady: ").append(toIndentedString(isReady)).append("\n");
    sb.append("    reviewedCount: ").append(toIndentedString(reviewedCount)).append("\n");
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

