package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LabelStatus;
import org.openapitools.model.LabelType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("Label")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Label   {
  private String id;
  private LabelType labelType;
  private String parentId;
  public enum ParentTypeEnum {

    CAMPAIGN(String.valueOf("CAMPAIGN"));


    private String value;

    ParentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ParentTypeEnum fromString(String s) {
        for (ParentTypeEnum b : ParentTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        return null;
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

  private ParentTypeEnum parentType;
  private LabelStatus status;
  private String value;

  public Label() {
  }

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

  @JsonProperty("id")
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

  @JsonProperty("label_type")
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

  @JsonProperty("parent_id")
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

  @JsonProperty("parent_type")
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

  @JsonProperty("status")
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
   @Size(max=100)public String getValue() {
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

