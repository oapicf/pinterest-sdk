package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsCreateCreativeAssetsItem;
import org.openapitools.model.CatalogsDeleteCreativeAssetsItem;
import org.openapitools.model.CatalogsUpdatableCreativeAssetsAttributes;
import org.openapitools.model.CatalogsUpdateCreativeAssetsItem;
import org.openapitools.model.CatalogsUpsertCreativeAssetsItem;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Creative assets batch item")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operation", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreateCreativeAssetsItem.class, name = "CREATE"),
  @JsonSubTypes.Type(value = CatalogsDeleteCreativeAssetsItem.class, name = "DELETE"),
  @JsonSubTypes.Type(value = CatalogsUpdateCreativeAssetsItem.class, name = "UPDATE"),
  @JsonSubTypes.Type(value = CatalogsUpsertCreativeAssetsItem.class, name = "UPSERT"),
})

public class CatalogsCreativeAssetsBatchItem   {
  
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private OperationEnum operation;
  private CatalogsUpdatableCreativeAssetsAttributes attributes;

  /**
   * The catalog creative assets id in the merchant namespace
   **/
  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog creative assets id in the merchant namespace")
  @JsonProperty("creative_assets_id")
  @NotNull
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("attributes")
  @NotNull
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
    CatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem = (CatalogsCreativeAssetsBatchItem) o;
    return Objects.equals(this.creativeAssetsId, catalogsCreativeAssetsBatchItem.creativeAssetsId) &&
        Objects.equals(this.operation, catalogsCreativeAssetsBatchItem.operation) &&
        Objects.equals(this.attributes, catalogsCreativeAssetsBatchItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeAssetsId, operation, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsBatchItem {\n");
    
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

