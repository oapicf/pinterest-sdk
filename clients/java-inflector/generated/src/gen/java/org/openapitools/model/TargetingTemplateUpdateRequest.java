package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

    @JsonCreator
    public static OperationTypeEnum fromValue(String text) {
      for (OperationTypeEnum b : OperationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("operation_type")
  private OperationTypeEnum operationType;

  @JsonProperty("id")
  private String id;

  /**
   **/
  public TargetingTemplateUpdateRequest operationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation_type")
  public OperationTypeEnum getOperationType() {
    return operationType;
  }
  public void setOperationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
  }

  /**
   * Targeting template ID
   **/
  public TargetingTemplateUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "643", required = true, value = "Targeting template ID")
  @JsonProperty("id")
  public String getId() {
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
    return Objects.equals(operationType, targetingTemplateUpdateRequest.operationType) &&
        Objects.equals(id, targetingTemplateUpdateRequest.id);
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

