package apimodels;

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
 * CatalogsHotelItemsFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsHotelItemsFilter   {
  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    HOTEL("HOTEL");

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

  @JsonProperty("hotel_ids")
  @NotNull
@Size(min=1,max=100)

  private List<String> hotelIds = new ArrayList<>();

  @JsonProperty("catalog_id")
  @Pattern(regexp="^\\d+$")

  private String catalogId;

  public CatalogsHotelItemsFilter catalogType(CatalogTypeEnum catalogType) {
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

  public CatalogsHotelItemsFilter hotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
    return this;
  }

  public CatalogsHotelItemsFilter addHotelIdsItem(String hotelIdsItem) {
    if (this.hotelIds == null) {
      this.hotelIds = new ArrayList<>();
    }
    this.hotelIds.add(hotelIdsItem);
    return this;
  }

   /**
   * Get hotelIds
   * @return hotelIds
  **/
  public List<String> getHotelIds() {
    return hotelIds;
  }

  public void setHotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
  }

  public CatalogsHotelItemsFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
   * @return catalogId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

