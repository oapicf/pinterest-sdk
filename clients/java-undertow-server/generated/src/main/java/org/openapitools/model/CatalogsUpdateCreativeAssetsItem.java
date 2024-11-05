/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsUpdatableCreativeAssetsAttributes;



/**
 * A creative assets item to be updated.
 */

@ApiModel(description = "A creative assets item to be updated.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsUpdateCreativeAssetsItem   {
  
  private String creativeAssetsId;


  public enum OperationEnum {
    UPDATE("UPDATE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OperationEnum operation;
  private CatalogsUpdatableCreativeAssetsAttributes attributes;

  /**
   * The catalog creative assets item id in the merchant namespace
   */
  public CatalogsUpdateCreativeAssetsItem creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog creative assets item id in the merchant namespace")
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  /**
   */
  public CatalogsUpdateCreativeAssetsItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   */
  public CatalogsUpdateCreativeAssetsItem attributes(CatalogsUpdatableCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("attributes")
  public CatalogsUpdatableCreativeAssetsAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsUpdatableCreativeAssetsAttributes attributes) {
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
    CatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem = (CatalogsUpdateCreativeAssetsItem) o;
    return Objects.equals(creativeAssetsId, catalogsUpdateCreativeAssetsItem.creativeAssetsId) &&
        Objects.equals(operation, catalogsUpdateCreativeAssetsItem.operation) &&
        Objects.equals(attributes, catalogsUpdateCreativeAssetsItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeAssetsId, operation, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpdateCreativeAssetsItem {\n");
    
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

