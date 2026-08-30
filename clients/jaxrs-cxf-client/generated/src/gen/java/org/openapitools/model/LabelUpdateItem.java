package org.openapitools.model;

import org.openapitools.model.LabelStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelUpdateItem  {
  
 /**
  * Label ID.
  */
  @ApiModelProperty(example = "1106385754497", required = true, value = "Label ID.")

  private String id;

  @ApiModelProperty(value = "")

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
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LabelUpdateItem id(String id) {
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

  public LabelUpdateItem status(LabelStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Label name. 100-character limit.
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public LabelUpdateItem value(String value) {
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
    LabelUpdateItem labelUpdateItem = (LabelUpdateItem) o;
    return Objects.equals(this.id, labelUpdateItem.id) &&
        Objects.equals(this.status, labelUpdateItem.status) &&
        Objects.equals(this.value, labelUpdateItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelUpdateItem {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

