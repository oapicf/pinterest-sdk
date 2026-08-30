package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.LabelType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelCreateItem  {
  
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
  */
  @JsonProperty("label_type")
  @NotNull
  public LabelType getLabelType() {
    return labelType;
  }

  /**
   * Sets the <code>labelType</code> property.
   */
 public void setLabelType(LabelType labelType) {
    this.labelType = labelType;
  }

  /**
   * Sets the <code>labelType</code> property.
   */
  public LabelCreateItem labelType(LabelType labelType) {
    this.labelType = labelType;
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

