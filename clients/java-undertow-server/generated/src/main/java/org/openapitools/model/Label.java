/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LabelStatus;
import org.openapitools.model.LabelType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Label   {
  
  private String id;
  private LabelType labelType;
  private String parentId;


  public enum ParentTypeEnum {
    CAMPAIGN("CAMPAIGN");

    private String value;

    ParentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ParentTypeEnum parentType;
  private LabelStatus status;
  private String value;

  /**
   * Label ID.
   */
  public Label id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1106385754497", value = "Label ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   */
  public Label labelType(LabelType labelType) {
    this.labelType = labelType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("label_type")
  public LabelType getLabelType() {
    return labelType;
  }
  public void setLabelType(LabelType labelType) {
    this.labelType = labelType;
  }

  /**
   * Label parent entity ID.
   */
  public Label parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(example = "626753052072", value = "Label parent entity ID.")
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * Label parent entity type.
   */
  public Label parentType(ParentTypeEnum parentType) {
    this.parentType = parentType;
    return this;
  }

  
  @ApiModelProperty(example = "CAMPAIGN", value = "Label parent entity type.")
  @JsonProperty("parent_type")
  public ParentTypeEnum getParentType() {
    return parentType;
  }
  public void setParentType(ParentTypeEnum parentType) {
    this.parentType = parentType;
  }

  /**
   */
  public Label status(LabelStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public LabelStatus getStatus() {
    return status;
  }
  public void setStatus(LabelStatus status) {
    this.status = status;
  }

  /**
   * Label name.
   */
  public Label value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "Label name.")
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
    return Objects.equals(id, label.id) &&
        Objects.equals(labelType, label.labelType) &&
        Objects.equals(parentId, label.parentId) &&
        Objects.equals(parentType, label.parentType) &&
        Objects.equals(status, label.status) &&
        Objects.equals(value, label.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, labelType, parentId, parentType, status, value);
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

