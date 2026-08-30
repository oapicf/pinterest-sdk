package apimodels;

import apimodels.LabelType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LabelCreateItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LabelCreateItem   {
  @JsonProperty("label_type")
  @NotNull
@Valid

  private LabelType labelType;

  @JsonProperty("value")
  @NotNull
@Size(max=100)

  private String value;

  public LabelCreateItem labelType(LabelType labelType) {
    this.labelType = labelType;
    return this;
  }

   /**
   * Get labelType
   * @return labelType
  **/
  public LabelType getLabelType() {
    return labelType;
  }

  public void setLabelType(LabelType labelType) {
    this.labelType = labelType;
  }

  public LabelCreateItem value(String value) {
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
    LabelCreateItem labelCreateItem = (LabelCreateItem) o;
    return Objects.equals(labelType, labelCreateItem.labelType) &&
        Objects.equals(value, labelCreateItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelType, value);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

