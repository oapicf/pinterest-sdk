package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NullableLabelStatus;
import org.openapitools.model.NullableLabelType;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Label
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Label {

  private String id;

  private JsonNullable<NullableLabelType> labelType = JsonNullable.<NullableLabelType>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<NullableLabelStatus> status = JsonNullable.<NullableLabelStatus>undefined();

  private String value;

  public Label() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Label(String id, NullableLabelType labelType, String value) {
    this.id = id;
    this.labelType = JsonNullable.of(labelType);
    this.value = value;
  }

  public Label id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Label ID.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "1106385754497", description = "Label ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public Label labelType(NullableLabelType labelType) {
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
  public JsonNullable<NullableLabelType> getLabelType() {
    return labelType;
  }

  @JsonProperty("label_type")
  public void setLabelType(JsonNullable<NullableLabelType> labelType) {
    this.labelType = labelType;
  }

  public Label status(NullableLabelStatus status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public JsonNullable<NullableLabelStatus> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<NullableLabelStatus> status) {
    this.status = status;
  }

  public Label value(String value) {
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

  @JsonProperty("value")
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
        equalsNullable(this.status, label.status) &&
        Objects.equals(this.value, label.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, labelType, hashCodeNullable(status), value);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

