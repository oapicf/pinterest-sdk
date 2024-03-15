package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CatalogsType;
import org.openapitools.vertxweb.server.model.ItemValidationEvent;

/**
 * Object describing a hotel item error
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelItemErrorResponse   {
  
  private CatalogsType catalogType;
  private String hotelId;
  private List<ItemValidationEvent> errors;

  public CatalogsHotelItemErrorResponse () {

  }

  public CatalogsHotelItemErrorResponse (CatalogsType catalogType, String hotelId, List<ItemValidationEvent> errors) {
    this.catalogType = catalogType;
    this.hotelId = hotelId;
    this.errors = errors;
  }

    
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

    
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }
  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse = (CatalogsHotelItemErrorResponse) o;
    return Objects.equals(catalogType, catalogsHotelItemErrorResponse.catalogType) &&
        Objects.equals(hotelId, catalogsHotelItemErrorResponse.hotelId) &&
        Objects.equals(errors, catalogsHotelItemErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, hotelId, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelItemErrorResponse {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
