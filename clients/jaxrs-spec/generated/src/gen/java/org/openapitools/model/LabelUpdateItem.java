package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LabelStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LabelUpdateItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelUpdateItem   {
  private String id;
  private LabelStatus status;
  private String value;

  public LabelUpdateItem() {
  }

  @JsonCreator
  public LabelUpdateItem(
    @JsonProperty(required = true, value = "id") String id
  ) {
    this.id = id;
  }

  /**
   * Label ID.
   **/
  public LabelUpdateItem id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1106385754497", required = true, value = "Label ID.")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public LabelUpdateItem status(LabelStatus status) {
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
   * Label name. 100-character limit.
   **/
  public LabelUpdateItem value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "Label name. 100-character limit.")
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
