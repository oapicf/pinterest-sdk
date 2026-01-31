package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LabelStatus;
import org.openapitools.model.LabelType;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class Label   {
  
  private String id;

  private LabelType labelType;

  private String parentId;


public enum ParentTypeEnum {

    @JsonProperty("CAMPAIGN") CAMPAIGN(String.valueOf("CAMPAIGN"));


    private String value;

    ParentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ParentTypeEnum fromValue(String value) {
        for (ParentTypeEnum b : ParentTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

  private ParentTypeEnum parentType;

  private LabelStatus status;

  private String value;

  /**
   * Label ID.
   **/
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
   **/
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
   **/
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
   **/
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
   **/
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
   **/
  public Label value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "Label name.")
  @JsonProperty("value")
 @Size(max=100)  public String getValue() {
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
        Objects.equals(this.labelType, label.labelType) &&
        Objects.equals(this.parentId, label.parentId) &&
        Objects.equals(this.parentType, label.parentType) &&
        Objects.equals(this.status, label.status) &&
        Objects.equals(this.value, label.value);
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

