package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.LabelStatus;
import org.openapitools.vertxweb.server.model.LabelType;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public Label () {

  }

  public Label (String id, LabelType labelType, String parentId, ParentTypeEnum parentType, LabelStatus status, String value) {
    this.id = id;
    this.labelType = labelType;
    this.parentId = parentId;
    this.parentType = parentType;
    this.status = status;
    this.value = value;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("label_type")
  public LabelType getLabelType() {
    return labelType;
  }
  public void setLabelType(LabelType labelType) {
    this.labelType = labelType;
  }

    
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

    
  @JsonProperty("parent_type")
  public ParentTypeEnum getParentType() {
    return parentType;
  }
  public void setParentType(ParentTypeEnum parentType) {
    this.parentType = parentType;
  }

    
  @JsonProperty("status")
  public LabelStatus getStatus() {
    return status;
  }
  public void setStatus(LabelStatus status) {
    this.status = status;
  }

    
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
