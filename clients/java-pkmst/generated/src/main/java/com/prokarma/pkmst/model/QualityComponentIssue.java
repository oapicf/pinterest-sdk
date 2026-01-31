package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Details of an issue with a quality component.
 */
@ApiModel(description = "Details of an issue with a quality component.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class QualityComponentIssue   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("reason")
  private String reason;

  public QualityComponentIssue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the issue check.
   * @return id
   */
  @ApiModelProperty(required = true, value = "Unique identifier for the issue check.")
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
  @ApiModelProperty(required = true, value = "Human-readable name of the issue.")
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
  @ApiModelProperty(required = true, value = "Detailed reason for the issue.")
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

