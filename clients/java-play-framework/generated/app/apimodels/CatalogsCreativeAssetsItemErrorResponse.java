package apimodels;

import apimodels.ItemValidationEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object describing a creative assets item error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsCreativeAssetsItemErrorResponse   {
  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String value) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("catalog_type")
  @NotNull

  private CatalogTypeEnum catalogType;

  @JsonProperty("creative_assets_id")
  
  private String creativeAssetsId;

  @JsonProperty("errors")
  @NotNull
@Valid

  private List<@Valid ItemValidationEvent> errors = new ArrayList<>();

  /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   */
  public enum ItemResponseKindEnum {
    CREATIVE_ASSETS_ITEM_ERROR("creative_assets_item_error");

    private final String value;

    ItemResponseKindEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ItemResponseKindEnum fromValue(String value) {
      for (ItemResponseKindEnum b : ItemResponseKindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("item_response_kind")
  @NotNull

  private ItemResponseKindEnum itemResponseKind;

  public CatalogsCreativeAssetsItemErrorResponse catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsItemErrorResponse creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

   /**
   * The catalog creative assets id in the merchant namespace
   * @return creativeAssetsId
  **/
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public CatalogsCreativeAssetsItemErrorResponse errors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  public CatalogsCreativeAssetsItemErrorResponse addErrorsItem(ItemValidationEvent errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Array with the errors for the item id requested
   * @return errors
  **/
  public List<@Valid ItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
  }

  public CatalogsCreativeAssetsItemErrorResponse itemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
    return this;
  }

   /**
   * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
   * @return itemResponseKind
  **/
  public ItemResponseKindEnum getItemResponseKind() {
    return itemResponseKind;
  }

  public void setItemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
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
    return Objects.equals(catalogType, catalogsCreativeAssetsItemErrorResponse.catalogType) &&
        Objects.equals(creativeAssetsId, catalogsCreativeAssetsItemErrorResponse.creativeAssetsId) &&
        Objects.equals(errors, catalogsCreativeAssetsItemErrorResponse.errors) &&
        Objects.equals(itemResponseKind, catalogsCreativeAssetsItemErrorResponse.itemResponseKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, creativeAssetsId, errors, itemResponseKind);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

