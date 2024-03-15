package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemValidationEvent;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object describing a hotel item error
 */

@Schema(name = "CatalogsHotelItemErrorResponse", description = "Object describing a hotel item error")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelItemErrorResponse implements ItemResponseAnyOf1 {

  private CatalogsType catalogType;

  private String hotelId;

  @Valid
  private List<@Valid ItemValidationEvent> errors;

  public CatalogsHotelItemErrorResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsHotelItemErrorResponse(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelItemErrorResponse catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
  */
  @NotNull @Valid 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelItemErrorResponse hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  /**
   * The catalog hotel id in the merchant namespace
   * @return hotelId
  */
  
  @Schema(name = "hotel_id", example = "DS0294-M", description = "The catalog hotel id in the merchant namespace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public CatalogsHotelItemErrorResponse errors(List<@Valid ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  public CatalogsHotelItemErrorResponse addErrorsItem(ItemValidationEvent errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Array with the errors for the item id requested
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", description = "Array with the errors for the item id requested", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ItemValidationEvent> errors) {
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
    return Objects.equals(this.catalogType, catalogsHotelItemErrorResponse.catalogType) &&
        Objects.equals(this.hotelId, catalogsHotelItemErrorResponse.hotelId) &&
        Objects.equals(this.errors, catalogsHotelItemErrorResponse.errors);
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

