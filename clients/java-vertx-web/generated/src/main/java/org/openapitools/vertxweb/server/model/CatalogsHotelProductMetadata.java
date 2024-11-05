package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hotel product metadata entity
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelProductMetadata   {
  
  private String hotelId;

  public CatalogsHotelProductMetadata () {

  }

  public CatalogsHotelProductMetadata (String hotelId) {
    this.hotelId = hotelId;
  }

    
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelProductMetadata catalogsHotelProductMetadata = (CatalogsHotelProductMetadata) o;
    return Objects.equals(hotelId, catalogsHotelProductMetadata.hotelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductMetadata {\n");
    
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
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
