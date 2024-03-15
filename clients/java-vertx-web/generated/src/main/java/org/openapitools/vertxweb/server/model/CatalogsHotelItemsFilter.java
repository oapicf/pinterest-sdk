package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public CatalogsHotelItemsFilter () {

  }

  public CatalogsHotelItemsFilter (CatalogTypeEnum catalogType, List<String> hotelIds, String catalogId) {
    this.catalogType = catalogType;
    this.hotelIds = hotelIds;
    this.catalogId = catalogId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("hotel_ids")
  public List<String> getHotelIds() {
    return hotelIds;
  }
  public void setHotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
  }

    
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
