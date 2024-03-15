package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelIdFilter   {
  
  private CatalogsProductGroupMultipleStringCriteria HOTEL_ID;

  public HotelIdFilter () {

  }

  public HotelIdFilter (CatalogsProductGroupMultipleStringCriteria HOTEL_ID) {
    this.HOTEL_ID = HOTEL_ID;
  }

    
  @JsonProperty("HOTEL_ID")
  public CatalogsProductGroupMultipleStringCriteria getHOTELID() {
    return HOTEL_ID;
  }
  public void setHOTELID(CatalogsProductGroupMultipleStringCriteria HOTEL_ID) {
    this.HOTEL_ID = HOTEL_ID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelIdFilter hotelIdFilter = (HotelIdFilter) o;
    return Objects.equals(HOTEL_ID, hotelIdFilter.HOTEL_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(HOTEL_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelIdFilter {\n");
    
    sb.append("    HOTEL_ID: ").append(toIndentedString(HOTEL_ID)).append("\n");
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
