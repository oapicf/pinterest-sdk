package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TotalCountByEntityStatus {

  private Integer ACTIVE;

  private Integer ARCHIVED;

  private Integer PAUSED;

  public TotalCountByEntityStatus ACTIVE(Integer ACTIVE) {
    this.ACTIVE = ACTIVE;
    return this;
  }

  /**
   * Count of ACTIVE assets
   * @return ACTIVE
   */
  
  @Schema(name = "ACTIVE", description = "Count of ACTIVE assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ACTIVE")
  public Integer getACTIVE() {
    return ACTIVE;
  }

  public void setACTIVE(Integer ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

  public TotalCountByEntityStatus ARCHIVED(Integer ARCHIVED) {
    this.ARCHIVED = ARCHIVED;
    return this;
  }

  /**
   * Count of ARCHIVED assets
   * @return ARCHIVED
   */
  
  @Schema(name = "ARCHIVED", description = "Count of ARCHIVED assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ARCHIVED")
  public Integer getARCHIVED() {
    return ARCHIVED;
  }

  public void setARCHIVED(Integer ARCHIVED) {
    this.ARCHIVED = ARCHIVED;
  }

  public TotalCountByEntityStatus PAUSED(Integer PAUSED) {
    this.PAUSED = PAUSED;
    return this;
  }

  /**
   * Count of PAUSED assets
   * @return PAUSED
   */
  
  @Schema(name = "PAUSED", description = "Count of PAUSED assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PAUSED")
  public Integer getPAUSED() {
    return PAUSED;
  }

  public void setPAUSED(Integer PAUSED) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

