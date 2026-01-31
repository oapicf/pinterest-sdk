package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsItemErrorResponse;
import org.openapitools.model.CatalogsHotelItemErrorResponse;
import org.openapitools.model.CatalogsRetailItemErrorResponse;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemValidationEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsItemErrorResponse.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelItemErrorResponse.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailItemErrorResponse.class, name = "RETAIL"),
})
/**
 * Error item response
 **/
@ApiModel(description = "Error item response")
@JsonTypeName("ItemResponse_oneOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemResponseOneOf1   {
  private CatalogsType catalogType;
  private @Valid List<@Valid ItemValidationEvent> errors = new ArrayList<>();
  private String itemId;
  private String hotelId;
  private String creativeAssetsId;

  public ItemResponseOneOf1() {
  }

  @JsonCreator
  public ItemResponseOneOf1(
    @JsonProperty(required = true, value = "catalog_type") CatalogsType catalogType,
    @JsonProperty(required = true, value = "errors") List<@Valid ItemValidationEvent> errors
  ) {
    this.catalogType = catalogType;
    this.errors = errors;
  }

  /**
   **/
  public ItemResponseOneOf1 catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "catalog_type")
  @NotNull public CatalogsType getCatalogType() {
    return catalogType;
  }

  @JsonProperty(required = true, value = "catalog_type")
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  public ItemResponseOneOf1 errors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "errors")
  @NotNull @Valid public List<@Valid ItemValidationEvent> getErrors() {
    return errors;
  }

  @JsonProperty(required = true, value = "errors")
  public void setErrors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
  }

  public ItemResponseOneOf1 addErrorsItem(ItemValidationEvent errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }

    this.errors.add(errorsItem);
    return this;
  }

  public ItemResponseOneOf1 removeErrorsItem(ItemValidationEvent errorsItem) {
    if (errorsItem != null && this.errors != null) {
      this.errors.remove(errorsItem);
    }

    return this;
  }
  /**
   * The catalog item id in the merchant namespace
   **/
  public ItemResponseOneOf1 itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog item id in the merchant namespace")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  @JsonProperty("item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The catalog hotel id in the merchant namespace
   **/
  public ItemResponseOneOf1 hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }

  @JsonProperty("hotel_id")
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  /**
   * The catalog creative assets id in the merchant namespace
   **/
  public ItemResponseOneOf1 creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog creative assets id in the merchant namespace")
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  @JsonProperty("creative_assets_id")
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResponseOneOf1 itemResponseOneOf1 = (ItemResponseOneOf1) o;
    return Objects.equals(this.catalogType, itemResponseOneOf1.catalogType) &&
        Objects.equals(this.errors, itemResponseOneOf1.errors) &&
        Objects.equals(this.itemId, itemResponseOneOf1.itemId) &&
        Objects.equals(this.hotelId, itemResponseOneOf1.hotelId) &&
        Objects.equals(this.creativeAssetsId, itemResponseOneOf1.creativeAssetsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, errors, itemId, hotelId, creativeAssetsId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponseOneOf1 {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
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

