package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LabelBulkUpdateRequest  {
  
 /**
  * Label ID.
  */
  @ApiModelProperty(example = "1106385754497", required = true, value = "Label ID.")

  private String id;

public enum StatusEnum {

ARCHIVED(String.valueOf("ARCHIVED"));


    private String value;

    StatusEnum (String v) {
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

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Set status to `ARCHIVED` to remove the label from the parent entity.
  */
  @ApiModelProperty(example = "ARCHIVED", value = "Set status to `ARCHIVED` to remove the label from the parent entity.")

  private StatusEnum status;

 /**
  * </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
  */
  @ApiModelProperty(value = "</p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.")

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

  public LabelBulkUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public LabelBulkUpdateRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; value field will be deprecated. Label name. 100-character limit.
   * @return value
  **/
  @JsonProperty("value")
 @Size(max=100)  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public LabelBulkUpdateRequest value(String value) {
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
    LabelBulkUpdateRequest labelBulkUpdateRequest = (LabelBulkUpdateRequest) o;
    return Objects.equals(this.id, labelBulkUpdateRequest.id) &&
        Objects.equals(this.status, labelBulkUpdateRequest.status) &&
        Objects.equals(this.value, labelBulkUpdateRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelBulkUpdateRequest {\n");
    
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

