package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.LabelType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelCreateRequestLabelsInner  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private LabelType labelType;

 /**
  * Label name. 100-character limit.
  */
  @ApiModelProperty(required = true, value = "Label name. 100-character limit.")

  private String value;
 /**
   * Get labelType
   * @return labelType
  **/
  @JsonProperty("label_type")
  @NotNull
  public LabelType getLabelType() {
    return labelType;
  }

  public void setLabelType(LabelType labelType) {
    this.labelType = labelType;
  }

  public LabelCreateRequestLabelsInner labelType(LabelType labelType) {
    this.labelType = labelType;
    return this;
  }

 /**
   * Label name. 100-character limit.
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
 @Size(max=100)  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public LabelCreateRequestLabelsInner value(String value) {
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
    LabelCreateRequestLabelsInner labelCreateRequestLabelsInner = (LabelCreateRequestLabelsInner) o;
    return Objects.equals(this.labelType, labelCreateRequestLabelsInner.labelType) &&
        Objects.equals(this.value, labelCreateRequestLabelsInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelCreateRequestLabelsInner {\n");
    
    sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

