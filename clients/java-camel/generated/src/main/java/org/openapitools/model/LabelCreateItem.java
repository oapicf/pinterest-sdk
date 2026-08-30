package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.LabelType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LabelCreateItem
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelCreateItem {

  private LabelType labelType;

  private String value;

  public LabelCreateItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LabelCreateItem(LabelType labelType, String value) {
    this.labelType = labelType;
    this.value = value;
  }

  public LabelCreateItem labelType(LabelType labelType) {
    this.labelType = labelType;
    return this;
  }

  /**
   * Get labelType
   * @return labelType
   */
  @NotNull @Valid 
  @Schema(name = "label_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("label_type")
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
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "value", description = "Label name. 100-character limit.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
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

