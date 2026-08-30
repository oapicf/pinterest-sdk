package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NullableLabelStatus;
import org.openapitools.model.NullableLabelType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("Label")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Label   {
  private String id;
  private NullableLabelType labelType;
  private NullableLabelStatus status;
  private String value;

  public Label() {
  }

  @JsonCreator
  public Label(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "label_type") NullableLabelType labelType,
    @JsonProperty(required = true, value = "value") String value
  ) {
    this.id = id;
    this.labelType = labelType;
    this.value = value;
  }

  /**
   * Label ID.
   **/
  public Label id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1106385754497", required = true, value = "Label ID.")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public Label labelType(NullableLabelType labelType) {
    this.labelType = labelType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "label_type")
  @NotNull public NullableLabelType getLabelType() {
    return labelType;
  }

  @JsonProperty(required = true, value = "label_type")
  public void setLabelType(NullableLabelType labelType) {
    this.labelType = labelType;
  }

  /**
   **/
  public Label status(NullableLabelStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public NullableLabelStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(NullableLabelStatus status) {
    this.status = status;
  }

  /**
   * Label name. 100-character limit.
   **/
  public Label value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Label name. 100-character limit.")
  @JsonProperty(required = true, value = "value")
  @NotNull  @Size(max=100)public String getValue() {
    return value;
  }

  @JsonProperty(required = true, value = "value")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
