package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of an issue with a quality component.
 */

@Schema(name = "QualityComponentIssue", description = "Details of an issue with a quality component.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class QualityComponentIssue {

  private String id;

  private String name;

  private String reason;

  public QualityComponentIssue() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QualityComponentIssue(String id, String name, String reason) {
    this.id = id;
    this.name = name;
    this.reason = reason;
  }

  public QualityComponentIssue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the issue check.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Unique identifier for the issue check.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QualityComponentIssue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the issue.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Human-readable name of the issue.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QualityComponentIssue reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Detailed reason for the issue.
   * @return reason
   */
  @NotNull 
  @Schema(name = "reason", description = "Detailed reason for the issue.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityComponentIssue qualityComponentIssue = (QualityComponentIssue) o;
    return Objects.equals(this.id, qualityComponentIssue.id) &&
        Objects.equals(this.name, qualityComponentIssue.name) &&
        Objects.equals(this.reason, qualityComponentIssue.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityComponentIssue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

