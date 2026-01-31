package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.LabelType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LabelCreateRequestLabelsInner
 */

@JsonTypeName("LabelCreateRequest_labels_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LabelCreateRequestLabelsInner {

  private JsonNullable<LabelType> labelType = JsonNullable.<LabelType>undefined();

  private String value;

  public LabelCreateRequestLabelsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LabelCreateRequestLabelsInner(LabelType labelType, String value) {
    this.labelType = JsonNullable.of(labelType);
    this.value = value;
  }

  public LabelCreateRequestLabelsInner labelType(LabelType labelType) {
    this.labelType = JsonNullable.of(labelType);
    return this;
  }

  /**
   * Get labelType
   * @return labelType
   */
  @NotNull @Valid 
  @Schema(name = "label_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("label_type")
  public JsonNullable<LabelType> getLabelType() {
    return labelType;
  }

  public void setLabelType(JsonNullable<LabelType> labelType) {
    this.labelType = labelType;
  }

  public LabelCreateRequestLabelsInner value(String value) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

