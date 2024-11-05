package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TargetingTemplateUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TargetingTemplateUpdateRequest   {
  /**
   * Gets or Sets operationType
   */
  public enum OperationTypeEnum {
    REMOVE("REMOVE");

    private final String value;

    OperationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationTypeEnum fromValue(String value) {
      for (OperationTypeEnum b : OperationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("operation_type")
  @NotNull

  private OperationTypeEnum operationType;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  public TargetingTemplateUpdateRequest operationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  public OperationTypeEnum getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
  }

  public TargetingTemplateUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Targeting template ID
   * @return id
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

