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
 * Breakdown of asset counts by entity status.
 */

@Schema(name = "TotalCountByEntityStatus", description = "Breakdown of asset counts by entity status.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-07T03:00:15.291566106Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TotalCountByEntityStatus {

  private @Nullable Integer ACTIVE;

  private @Nullable Integer ARCHIVED;

  private @Nullable Integer PAUSED;

  public TotalCountByEntityStatus ACTIVE(@Nullable Integer ACTIVE) {
    this.ACTIVE = ACTIVE;
    return this;
  }

  /**
   * Count of ACTIVE assets
   * @return ACTIVE
   */
  
  @Schema(name = "ACTIVE", description = "Count of ACTIVE assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ACTIVE")
  public @Nullable Integer getACTIVE() {
    return ACTIVE;
  }

  @JsonProperty("ACTIVE")
  public void setACTIVE(@Nullable Integer ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

  public TotalCountByEntityStatus ARCHIVED(@Nullable Integer ARCHIVED) {
    this.ARCHIVED = ARCHIVED;
    return this;
  }

  /**
   * Count of ARCHIVED assets
   * @return ARCHIVED
   */
  
  @Schema(name = "ARCHIVED", description = "Count of ARCHIVED assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ARCHIVED")
  public @Nullable Integer getARCHIVED() {
    return ARCHIVED;
  }

  @JsonProperty("ARCHIVED")
  public void setARCHIVED(@Nullable Integer ARCHIVED) {
    this.ARCHIVED = ARCHIVED;
  }

  public TotalCountByEntityStatus PAUSED(@Nullable Integer PAUSED) {
    this.PAUSED = PAUSED;
    return this;
  }

  /**
   * Count of PAUSED assets
   * @return PAUSED
   */
  
  @Schema(name = "PAUSED", description = "Count of PAUSED assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PAUSED")
  public @Nullable Integer getPAUSED() {
    return PAUSED;
  }

  @JsonProperty("PAUSED")
  public void setPAUSED(@Nullable Integer PAUSED) {
    this.PAUSED = PAUSED;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalCountByEntityStatus totalCountByEntityStatus = (TotalCountByEntityStatus) o;
    return Objects.equals(this.ACTIVE, totalCountByEntityStatus.ACTIVE) &&
        Objects.equals(this.ARCHIVED, totalCountByEntityStatus.ARCHIVED) &&
        Objects.equals(this.PAUSED, totalCountByEntityStatus.PAUSED);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ACTIVE, ARCHIVED, PAUSED);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalCountByEntityStatus {\n");
    sb.append("    ACTIVE: ").append(toIndentedString(ACTIVE)).append("\n");
    sb.append("    ARCHIVED: ").append(toIndentedString(ARCHIVED)).append("\n");
    sb.append("    PAUSED: ").append(toIndentedString(PAUSED)).append("\n");
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

