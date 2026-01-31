package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LabelStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class LabelUpdateRequestLabelsInner   {
  
  private String id;

  private LabelStatus status;

  private String value;

  /**
   * Label ID.
   **/
  public LabelUpdateRequestLabelsInner id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1106385754497", required = true, value = "Label ID.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public LabelUpdateRequestLabelsInner status(LabelStatus status) {
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
   * Label name. 100-character limit.
   **/
  public LabelUpdateRequestLabelsInner value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "Label name. 100-character limit.")
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
    LabelUpdateRequestLabelsInner labelUpdateRequestLabelsInner = (LabelUpdateRequestLabelsInner) o;
    return Objects.equals(this.id, labelUpdateRequestLabelsInner.id) &&
        Objects.equals(this.status, labelUpdateRequestLabelsInner.status) &&
        Objects.equals(this.value, labelUpdateRequestLabelsInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelUpdateRequestLabelsInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

