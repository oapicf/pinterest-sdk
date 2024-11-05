package org.openapitools.model;

import org.openapitools.model.CatalogsCreativeAssetsProductMetadata;
import org.openapitools.model.Pin;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsCreativeAssetsProduct  {
  
public enum CatalogTypeEnum {

CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));


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

  @ApiModelProperty(required = true, value = "")
  private CatalogsCreativeAssetsProductMetadata metadata;

  @ApiModelProperty(required = true, value = "")
  private Pin pin;
 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsProduct catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * Get metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public CatalogsCreativeAssetsProductMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(CatalogsCreativeAssetsProductMetadata metadata) {
    this.metadata = metadata;
  }

  public CatalogsCreativeAssetsProduct metadata(CatalogsCreativeAssetsProductMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Get pin
   * @return pin
  **/
  @JsonProperty("pin")
  public Pin getPin() {
    return pin;
  }

  public void setPin(Pin pin) {
    this.pin = pin;
  }

  public CatalogsCreativeAssetsProduct pin(Pin pin) {
    this.pin = pin;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

