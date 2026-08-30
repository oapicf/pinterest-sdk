package org.openapitools.model;

import org.openapitools.model.LabelType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LabelCreateItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("label_type")
  private LabelType labelType;

  /**
   * Label name. 100-character limit.
   */
  @JsonProperty("value")
  private String value;

  /**
   * 
   * @return labelType
   */
  public LabelType getLabelType() {
    return labelType;
  }

  public void setLabelType(LabelType labelType) {
    this.labelType = labelType;
  }

  /**
   * Label name. 100-character limit.
   * @return value
   */
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
