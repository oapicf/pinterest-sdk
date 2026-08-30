package apimodels;

import apimodels.NullableLabelStatus;
import apimodels.NullableLabelType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LabelErrorData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LabelErrorData   {
  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("label_type")
  @Valid

  private NullableLabelType labelType;

  @JsonProperty("status")
  @Valid

  private NullableLabelStatus status;

  @JsonProperty("value")
  @Size(max=100)

  private String value;

  public LabelErrorData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Label ID.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LabelErrorData labelType(NullableLabelType labelType) {
    this.labelType = labelType;
    return this;
  }

   /**
   * Get labelType
   * @return labelType
  **/
  public NullableLabelType getLabelType() {
    return labelType;
  }

  public void setLabelType(NullableLabelType labelType) {
    this.labelType = labelType;
  }

  public LabelErrorData status(NullableLabelStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public NullableLabelStatus getStatus() {
    return status;
  }

  public void setStatus(NullableLabelStatus status) {
    this.status = status;
  }

  public LabelErrorData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Label name. 100-character limit.
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelErrorData labelErrorData = (LabelErrorData) o;
    return Objects.equals(id, labelErrorData.id) &&
        Objects.equals(labelType, labelErrorData.labelType) &&
        Objects.equals(status, labelErrorData.status) &&
        Objects.equals(value, labelErrorData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, labelType, status, value);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelErrorData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

