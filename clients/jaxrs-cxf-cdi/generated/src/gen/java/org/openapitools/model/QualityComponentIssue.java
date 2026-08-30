package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Details of an issue with a quality component.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Details of an issue with a quality component.")
public class QualityComponentIssue   {
  
  private String id;

  private String name;

  private String reason;

  /**
   * Unique identifier for the issue check.
   **/
  public QualityComponentIssue id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier for the issue check.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Human-readable name of the issue.
   **/
  public QualityComponentIssue name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Human-readable name of the issue.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Detailed reason for the issue.
   **/
  public QualityComponentIssue reason(String reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Detailed reason for the issue.")
  @JsonProperty("reason")
  @NotNull
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

