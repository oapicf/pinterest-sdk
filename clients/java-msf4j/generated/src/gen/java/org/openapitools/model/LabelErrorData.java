package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NullableLabelStatus;
import org.openapitools.model.NullableLabelType;

/**
 * LabelErrorData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelErrorData   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("label_type")
  private NullableLabelType labelType;

  @JsonProperty("status")
  private NullableLabelStatus status;

  @JsonProperty("value")
  private String value;

  public LabelErrorData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Label ID.
   * @return id
  **/
  @ApiModelProperty(example = "1106385754497", value = "Label ID.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Label name. 100-character limit.")
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
    return Objects.equals(this.id, labelErrorData.id) &&
        Objects.equals(this.labelType, labelErrorData.labelType) &&
        Objects.equals(this.status, labelErrorData.status) &&
        Objects.equals(this.value, labelErrorData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, labelType, status, value);
  }

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

