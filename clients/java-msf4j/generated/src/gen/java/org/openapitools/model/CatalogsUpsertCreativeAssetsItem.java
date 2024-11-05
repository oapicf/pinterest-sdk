package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;

/**
 * A creative assets item to be upserted.
 */
@ApiModel(description = "A creative assets item to be upserted.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsUpsertCreativeAssetsItem   {
  @JsonProperty("creative_assets_id")
  private String creativeAssetsId;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    UPSERT("UPSERT");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation;

  @JsonProperty("attributes")
  private CatalogsCreativeAssetsAttributes attributes;

  public CatalogsUpsertCreativeAssetsItem creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

   /**
   * The catalog creative assets id in the merchant namespace
   * @return creativeAssetsId
  **/
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog creative assets id in the merchant namespace")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public CatalogsUpsertCreativeAssetsItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public CatalogsUpsertCreativeAssetsItem attributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem = (CatalogsUpsertCreativeAssetsItem) o;
    return Objects.equals(this.creativeAssetsId, catalogsUpsertCreativeAssetsItem.creativeAssetsId) &&
        Objects.equals(this.operation, catalogsUpsertCreativeAssetsItem.operation) &&
        Objects.equals(this.attributes, catalogsUpsertCreativeAssetsItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeAssetsId, operation, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpsertCreativeAssetsItem {\n");
    
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

