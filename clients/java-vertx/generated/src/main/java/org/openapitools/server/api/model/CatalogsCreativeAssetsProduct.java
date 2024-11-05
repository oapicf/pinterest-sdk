package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.CatalogsCreativeAssetsProductMetadata;
import org.openapitools.server.api.model.Pin;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreativeAssetsProduct   {
  


  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CatalogTypeEnum catalogType;
  private CatalogsCreativeAssetsProductMetadata metadata;
  private Pin pin;

  public CatalogsCreativeAssetsProduct () {

  }

  public CatalogsCreativeAssetsProduct (CatalogTypeEnum catalogType, CatalogsCreativeAssetsProductMetadata metadata, Pin pin) {
    this.catalogType = catalogType;
    this.metadata = metadata;
    this.pin = pin;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("metadata")
  public CatalogsCreativeAssetsProductMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(CatalogsCreativeAssetsProductMetadata metadata) {
    this.metadata = metadata;
  }

    
  @JsonProperty("pin")
  public Pin getPin() {
    return pin;
  }
  public void setPin(Pin pin) {
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
    return Objects.equals(catalogType, catalogsCreativeAssetsProduct.catalogType) &&
        Objects.equals(metadata, catalogsCreativeAssetsProduct.metadata) &&
        Objects.equals(pin, catalogsCreativeAssetsProduct.pin);
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
