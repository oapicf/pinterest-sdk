package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LabelStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelUpdateRequestLabelsInner  {
  
 /**
  * Label ID.
  */
  @ApiModelProperty(example = "1106385754497", required = true, value = "Label ID.")

  private String id;

  @ApiModelProperty(value = "")

  @Valid

  private LabelStatus status;

 /**
  * Label name. 100-character limit.
  */
  @ApiModelProperty(value = "Label name. 100-character limit.")

  private String value;
 /**
   * Label ID.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LabelUpdateRequestLabelsInner id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public LabelStatus getStatus() {
    return status;
  }

  public void setStatus(LabelStatus status) {
    this.status = status;
  }

  public LabelUpdateRequestLabelsInner status(LabelStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Label name. 100-character limit.
   * @return value
  **/
  @JsonProperty("value")
 @Size(max=100)  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public LabelUpdateRequestLabelsInner value(String value) {
    this.value = value;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

