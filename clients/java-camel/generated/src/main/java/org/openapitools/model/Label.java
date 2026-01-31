package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LabelStatus;
import org.openapitools.model.LabelType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Label
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Label {

  private String id;

  private JsonNullable<LabelType> labelType = JsonNullable.<LabelType>undefined();

  private String parentId;

  /**
   * Label parent entity type.
   */
  public enum ParentTypeEnum {
    CAMPAIGN("CAMPAIGN");

    private final String value;

    ParentTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ParentTypeEnum fromValue(String value) {
      for (ParentTypeEnum b : ParentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<ParentTypeEnum> parentType = JsonNullable.<ParentTypeEnum>undefined();

  private JsonNullable<LabelStatus> status = JsonNullable.<LabelStatus>undefined();

  private String value;

  public Label id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Label ID.
   * @return id
   */
  
  @Schema(name = "id", example = "1106385754497", description = "Label ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Label labelType(LabelType labelType) {
    this.labelType = JsonNullable.of(labelType);
    return this;
  }

  /**
   * Get labelType
   * @return labelType
   */
  @Valid 
  @Schema(name = "label_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label_type")
  public JsonNullable<LabelType> getLabelType() {
    return labelType;
  }

  public void setLabelType(JsonNullable<LabelType> labelType) {
    this.labelType = labelType;
  }

  public Label parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Label parent entity ID.
   * @return parentId
   */
  
  @Schema(name = "parent_id", example = "626753052072", description = "Label parent entity ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Label parentType(ParentTypeEnum parentType) {
    this.parentType = JsonNullable.of(parentType);
    return this;
  }

  /**
   * Label parent entity type.
   * @return parentType
   */
  
  @Schema(name = "parent_type", example = "CAMPAIGN", description = "Label parent entity type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_type")
  public JsonNullable<ParentTypeEnum> getParentType() {
    return parentType;
  }

  public void setParentType(JsonNullable<ParentTypeEnum> parentType) {
    this.parentType = parentType;
  }

  public Label status(LabelStatus status) {
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
  public JsonNullable<LabelStatus> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<LabelStatus> status) {
    this.status = status;
  }

  public Label value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Label name.
   * @return value
   */
  @Size(max = 100) 
  @Schema(name = "value", description = "Label name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Label label = (Label) o;
    return Objects.equals(this.id, label.id) &&
        equalsNullable(this.labelType, label.labelType) &&
        Objects.equals(this.parentId, label.parentId) &&
        equalsNullable(this.parentType, label.parentType) &&
        equalsNullable(this.status, label.status) &&
        Objects.equals(this.value, label.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(labelType), parentId, hashCodeNullable(parentType), hashCodeNullable(status), value);
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
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

