package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Details of an issue with a quality component.
 */
@ApiModel(description="Details of an issue with a quality component.")

public class QualityComponentIssue  {
  
 /**
  * Unique identifier for the issue check.
  */
  @ApiModelProperty(required = true, value = "Unique identifier for the issue check.")
  private String id;

 /**
  * Human-readable name of the issue.
  */
  @ApiModelProperty(required = true, value = "Human-readable name of the issue.")
  private String name;

 /**
  * Detailed reason for the issue.
  */
  @ApiModelProperty(required = true, value = "Detailed reason for the issue.")
  private String reason;
 /**
  * Unique identifier for the issue check.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public QualityComponentIssue id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Human-readable name of the issue.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public QualityComponentIssue name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Detailed reason for the issue.
  * @return reason
  */
  @JsonProperty("reason")
  @NotNull
  public String getReason() {
    return reason;
  }

  /**
   * Sets the <code>reason</code> property.
   */
 public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Sets the <code>reason</code> property.
   */
  public QualityComponentIssue reason(String reason) {
    this.reason = reason;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

