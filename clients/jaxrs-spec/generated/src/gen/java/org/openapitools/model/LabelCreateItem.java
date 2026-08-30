package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LabelType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LabelCreateItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelCreateItem   {
  private LabelType labelType;
  private String value;

  public LabelCreateItem() {
  }

  @JsonCreator
  public LabelCreateItem(
    @JsonProperty(required = true, value = "label_type") LabelType labelType,
    @JsonProperty(required = true, value = "value") String value
  ) {
    this.labelType = labelType;
    this.value = value;
  }

  /**
   **/
  public LabelCreateItem labelType(LabelType labelType) {
    this.labelType = labelType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "label_type")
  @NotNull public LabelType getLabelType() {
    return labelType;
  }

  @JsonProperty(required = true, value = "label_type")
  public void setLabelType(LabelType labelType) {
    this.labelType = labelType;
  }

  /**
   * Label name. 100-character limit.
   **/
  public LabelCreateItem value(String value) {
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
    LabelCreateItem labelCreateItem = (LabelCreateItem) o;
    return Objects.equals(this.labelType, labelCreateItem.labelType) &&
        Objects.equals(this.value, labelCreateItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelCreateItem {\n");
    
    sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
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
