package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CatalogsCreativeAssetsProductMetadata;
import org.openapitools.model.Pin;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsCreativeAssetsProduct
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsProduct implements CatalogsProduct {

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
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
    public static CatalogTypeEnum fromValue(String value) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CatalogTypeEnum catalogType;

  private CatalogsCreativeAssetsProductMetadata metadata;

  private JsonNullable<Pin> pin = JsonNullable.<Pin>undefined();

  public CatalogsCreativeAssetsProduct() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsCreativeAssetsProduct(CatalogTypeEnum catalogType, CatalogsCreativeAssetsProductMetadata metadata, Pin pin) {
    this.catalogType = catalogType;
    this.metadata = metadata;
    this.pin = JsonNullable.of(pin);
  }

  public CatalogsCreativeAssetsProduct catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @NotNull 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsProduct metadata(CatalogsCreativeAssetsProductMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @NotNull @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("metadata")
  public CatalogsCreativeAssetsProductMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(CatalogsCreativeAssetsProductMetadata metadata) {
    this.metadata = metadata;
  }

  public CatalogsCreativeAssetsProduct pin(Pin pin) {
    this.pin = JsonNullable.of(pin);
    return this;
  }

  /**
   * Get pin
   * @return pin
   */
  @NotNull @Valid 
  @Schema(name = "pin", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pin")
  public JsonNullable<Pin> getPin() {
    return pin;
  }

  public void setPin(JsonNullable<Pin> pin) {
    this.pin = pin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct = (CatalogsCreativeAssetsProduct) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsProduct.catalogType) &&
        Objects.equals(this.metadata, catalogsCreativeAssetsProduct.metadata) &&
        Objects.equals(this.pin, catalogsCreativeAssetsProduct.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, metadata, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProduct {\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

