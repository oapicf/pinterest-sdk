package org.openapitools.model;

import org.openapitools.model.LabelType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelCreateItem  {
  
  @ApiModelProperty(required = true, value = "")

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
  public LabelType getLabelType() {
    return labelType;
  }

  public void setLabelType(LabelType labelType) {
    this.labelType = labelType;
  }

  public LabelCreateItem labelType(LabelType labelType) {
    this.labelType = labelType;
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

  public LabelCreateItem value(String value) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

