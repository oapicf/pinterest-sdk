package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateUpdateRequest   {
  

  /**
   * Gets or Sets operationType
   */
  public enum OperationTypeEnum {
    REMOVE("REMOVE");
    private String value;

    OperationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private OperationTypeEnum operationType;
  private String id;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation_type")
  @NotNull
  public OperationTypeEnum getOperationType() {
    return operationType;
  }
  public void setOperationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
  }

  /**
   * Targeting template ID
   **/
  
  @ApiModelProperty(example = "643", required = true, value = "Targeting template ID")
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingTemplateUpdateRequest targetingTemplateUpdateRequest = (TargetingTemplateUpdateRequest) o;
    return Objects.equals(this.operationType, targetingTemplateUpdateRequest.operationType) &&
        Objects.equals(this.id, targetingTemplateUpdateRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateUpdateRequest {\n");
    
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

