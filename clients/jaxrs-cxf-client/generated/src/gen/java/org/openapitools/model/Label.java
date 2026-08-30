package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NullableLabelStatus;
import org.openapitools.model.NullableLabelType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Label  {
  
 /**
  * Label ID.
  */
  @ApiModelProperty(example = "1106385754497", required = true, value = "Label ID.")

  private String id;

  @ApiModelProperty(required = true, value = "")

  private NullableLabelType labelType;

  @ApiModelProperty(value = "")

  private NullableLabelStatus status;

 /**
  * Label name. 100-character limit.
  */
  @ApiModelProperty(required = true, value = "Label name. 100-character limit.")

  private String value;
 /**
   * Label ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Label id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get labelType
   * @return labelType
  **/
  @JsonProperty("label_type")
  public NullableLabelType getLabelType() {
    return labelType;
  }

  public void setLabelType(NullableLabelType labelType) {
    this.labelType = labelType;
  }

  public Label labelType(NullableLabelType labelType) {
    this.labelType = labelType;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public NullableLabelStatus getStatus() {
    return status;
  }

  public void setStatus(NullableLabelStatus status) {
    this.status = status;
  }

  public Label status(NullableLabelStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Label name. 100-character limit.
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Label value(String value) {
    this.value = value;
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
    Label label = (Label) o;
    return Objects.equals(this.id, label.id) &&
        Objects.equals(this.labelType, label.labelType) &&
        Objects.equals(this.status, label.status) &&
        Objects.equals(this.value, label.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, labelType, status, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

