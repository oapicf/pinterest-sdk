package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NullableLabelStatus;
import org.openapitools.model.NullableLabelType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Label  {
  
 /**
  * Label ID.
  */
  @ApiModelProperty(example = "1106385754497", required = true, value = "Label ID.")
  private String id;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private NullableLabelType labelType;

  @ApiModelProperty(value = "")
  @Valid
  private NullableLabelStatus status;

 /**
  * Label name. 100-character limit.
  */
  @ApiModelProperty(required = true, value = "Label name. 100-character limit.")
  private String value;
 /**
  * Label ID.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
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
  public Label id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get labelType
  * @return labelType
  */
  @JsonProperty("label_type")
  @NotNull
  public NullableLabelType getLabelType() {
    return labelType;
  }

  /**
   * Sets the <code>labelType</code> property.
   */
 public void setLabelType(NullableLabelType labelType) {
    this.labelType = labelType;
  }

  /**
   * Sets the <code>labelType</code> property.
   */
  public Label labelType(NullableLabelType labelType) {
    this.labelType = labelType;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public NullableLabelStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(NullableLabelStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public Label status(NullableLabelStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Label name. 100-character limit.
  * @return value
  */
  @JsonProperty("value")
  @NotNull
 @Size(max=100)  public String getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(String value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
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

