package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Details of an issue with a quality component.
 */
public class QualityComponentIssue implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique identifier for the issue check.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Human-readable name of the issue.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Detailed reason for the issue.
   */
  @JsonProperty("reason")
  private String reason;

  /**
   * Unique identifier for the issue check.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Human-readable name of the issue.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Detailed reason for the issue.
   * @return reason
   */
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
