package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A creative assets item to be deleted
 */

@Schema(name = "CatalogsDeleteCreativeAssetsItem", description = "A creative assets item to be deleted")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsDeleteCreativeAssetsItem {

  private String creativeAssetsId;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    DELETE("DELETE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperationEnum operation;

  public CatalogsDeleteCreativeAssetsItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsDeleteCreativeAssetsItem(String creativeAssetsId, OperationEnum operation) {
    this.creativeAssetsId = creativeAssetsId;
    this.operation = operation;
  }

  public CatalogsDeleteCreativeAssetsItem creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

  /**
   * The catalog creative assets id in the merchant namespace
   * @return creativeAssetsId
   */
  @NotNull 
  @Schema(name = "creative_assets_id", example = "DS0294-M", description = "The catalog creative assets id in the merchant namespace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public CatalogsDeleteCreativeAssetsItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @NotNull 
  @Schema(name = "operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem = (CatalogsDeleteCreativeAssetsItem) o;
    return Objects.equals(this.creativeAssetsId, catalogsDeleteCreativeAssetsItem.creativeAssetsId) &&
        Objects.equals(this.operation, catalogsDeleteCreativeAssetsItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeAssetsId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsDeleteCreativeAssetsItem {\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

