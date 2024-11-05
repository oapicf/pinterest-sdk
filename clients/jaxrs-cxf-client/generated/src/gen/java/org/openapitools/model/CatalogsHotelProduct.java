package org.openapitools.model;

import org.openapitools.model.CatalogsHotelProductMetadata;
import org.openapitools.model.Pin;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsHotelProduct  {
  
public enum CatalogTypeEnum {

HOTEL(String.valueOf("HOTEL"));


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
  private CatalogsHotelProductMetadata metadata;

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

  public CatalogsHotelProduct catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * Get metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public CatalogsHotelProductMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(CatalogsHotelProductMetadata metadata) {
    this.metadata = metadata;
  }

  public CatalogsHotelProduct metadata(CatalogsHotelProductMetadata metadata) {
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

  public CatalogsHotelProduct pin(Pin pin) {
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
    CatalogsHotelProduct catalogsHotelProduct = (CatalogsHotelProduct) o;
    return Objects.equals(this.catalogType, catalogsHotelProduct.catalogType) &&
        Objects.equals(this.metadata, catalogsHotelProduct.metadata) &&
        Objects.equals(this.pin, catalogsHotelProduct.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, metadata, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProduct {\n");
    
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

