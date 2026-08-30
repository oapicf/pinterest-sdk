package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Details of an issue with a quality component.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class QualityComponentIssue   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("reason")
  @NotNull

  private String reason;

  public QualityComponentIssue id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the issue check.
   * @return id
  **/
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
  **/
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
  **/
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
    return Objects.equals(id, qualityComponentIssue.id) &&
        Objects.equals(name, qualityComponentIssue.name) &&
        Objects.equals(reason, qualityComponentIssue.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, reason);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

