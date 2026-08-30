package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.LabelStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LabelUpdateItem
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelUpdateItem   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("status")
  private LabelStatus status;

  @JsonProperty("value")
  private String value;

  public LabelUpdateItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Label ID.
   * @return id
   */
  @ApiModelProperty(example = "1106385754497", required = true, value = "Label ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LabelUpdateItem status(LabelStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public LabelStatus getStatus() {
    return status;
  }

  public void setStatus(LabelStatus status) {
    this.status = status;
  }

  public LabelUpdateItem value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Label name. 100-character limit.
   * @return value
   */
  @ApiModelProperty(value = "Label name. 100-character limit.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

