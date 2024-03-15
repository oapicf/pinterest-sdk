/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelItemsFilter   {
  


  public enum CatalogTypeEnum {
    HOTEL("HOTEL");

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
  private List<String> hotelIds = new ArrayList<>();
  private String catalogId;

  /**
   */
  public CatalogsHotelItemsFilter catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   */
  public CatalogsHotelItemsFilter hotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hotel_ids")
  public List<String> getHotelIds() {
    return hotelIds;
  }
  public void setHotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
  }

  /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
   */
  public CatalogsHotelItemsFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(value = "Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog")
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelItemsFilter catalogsHotelItemsFilter = (CatalogsHotelItemsFilter) o;
    return Objects.equals(catalogType, catalogsHotelItemsFilter.catalogType) &&
        Objects.equals(hotelIds, catalogsHotelItemsFilter.hotelIds) &&
        Objects.equals(catalogId, catalogsHotelItemsFilter.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, hotelIds, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelItemsFilter {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    hotelIds: ").append(toIndentedString(hotelIds)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

