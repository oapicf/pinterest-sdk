package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemValidationEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing a creative assets item error
 */
@ApiModel(description="Object describing a creative assets item error")

public class CatalogsCreativeAssetsItemErrorResponse  {
  
public enum CatalogTypeEnum {

    @JsonProperty("CREATIVE_ASSETS") CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));

    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private CatalogTypeEnum catalogType;

 /**
  * The catalog creative assets id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", value = "The catalog creative assets id in the merchant namespace")
  private String creativeAssetsId;

 /**
  * Array with the errors for the item id requested
  */
  @ApiModelProperty(required = true, value = "Array with the errors for the item id requested")
  @Valid
  private List<@Valid ItemValidationEvent> errors = new ArrayList<>();

public enum ItemResponseKindEnum {

    @JsonProperty("creative_assets_item_error") CREATIVE_ASSETS_ITEM_ERROR(String.valueOf("creative_assets_item_error"));

    private String value;

    ItemResponseKindEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ItemResponseKindEnum fromValue(String value) {
        for (ItemResponseKindEnum b : ItemResponseKindEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  */
  @ApiModelProperty(required = true, value = "Discriminator literal identifying this leaf inside an `ItemResponse` payload.")
  private ItemResponseKindEnum itemResponseKind;
 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    return catalogType == null ? null : catalogType.value();
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsCreativeAssetsItemErrorResponse catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * The catalog creative assets id in the merchant namespace
  * @return creativeAssetsId
  */
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  /**
   * Sets the <code>creativeAssetsId</code> property.
   */
 public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  /**
   * Sets the <code>creativeAssetsId</code> property.
   */
  public CatalogsCreativeAssetsItemErrorResponse creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

 /**
  * Array with the errors for the item id requested
  * @return errors
  */
  @JsonProperty("errors")
  @NotNull
  public List<@Valid ItemValidationEvent> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
 public void setErrors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
  public CatalogsCreativeAssetsItemErrorResponse errors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   */
  public CatalogsCreativeAssetsItemErrorResponse addErrorsItem(ItemValidationEvent errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
  * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
  * @return itemResponseKind
  */
  @JsonProperty("item_response_kind")
  @NotNull
  public String getItemResponseKind() {
    return itemResponseKind == null ? null : itemResponseKind.value();
  }

  /**
   * Sets the <code>itemResponseKind</code> property.
   */
 public void setItemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }

  /**
   * Sets the <code>itemResponseKind</code> property.
   */
  public CatalogsCreativeAssetsItemErrorResponse itemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsItemErrorResponse catalogsCreativeAssetsItemErrorResponse = (CatalogsCreativeAssetsItemErrorResponse) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsItemErrorResponse.catalogType) &&
        Objects.equals(this.creativeAssetsId, catalogsCreativeAssetsItemErrorResponse.creativeAssetsId) &&
        Objects.equals(this.errors, catalogsCreativeAssetsItemErrorResponse.errors) &&
        Objects.equals(this.itemResponseKind, catalogsCreativeAssetsItemErrorResponse.itemResponseKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, creativeAssetsId, errors, itemResponseKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsItemErrorResponse {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    itemResponseKind: ").append(toIndentedString(itemResponseKind)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

