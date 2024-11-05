package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.CatalogsCreateCreativeAssetsItem;
import org.openapitools.server.api.model.CatalogsDeleteCreativeAssetsItem;
import org.openapitools.server.api.model.CatalogsUpdatableCreativeAssetsAttributes;
import org.openapitools.server.api.model.CatalogsUpdateCreativeAssetsItem;
import org.openapitools.server.api.model.CatalogsUpsertCreativeAssetsItem;

/**
 * Creative assets batch item
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreativeAssetsBatchItem   {
  
  private String creativeAssetsId;


  public enum OperationEnum {
    DELETE("DELETE");

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

  public CatalogsCreativeAssetsBatchItem () {

  }

  public CatalogsCreativeAssetsBatchItem (String creativeAssetsId, OperationEnum operation, CatalogsUpdatableCreativeAssetsAttributes attributes) {
    this.creativeAssetsId = creativeAssetsId;
    this.operation = operation;
    this.attributes = attributes;
  }

    
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

    
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

    
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
    CatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem = (CatalogsCreativeAssetsBatchItem) o;
    return Objects.equals(creativeAssetsId, catalogsCreativeAssetsBatchItem.creativeAssetsId) &&
        Objects.equals(operation, catalogsCreativeAssetsBatchItem.operation) &&
        Objects.equals(attributes, catalogsCreativeAssetsBatchItem.attributes);
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
