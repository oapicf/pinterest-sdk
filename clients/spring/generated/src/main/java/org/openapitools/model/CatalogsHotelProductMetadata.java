package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Hotel product metadata entity
 */

@Schema(name = "CatalogsHotelProductMetadata", description = "Hotel product metadata entity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsHotelProductMetadata {

  private String hotelId;

  public CatalogsHotelProductMetadata() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsHotelProductMetadata(String hotelId) {
    this.hotelId = hotelId;
  }

  public CatalogsHotelProductMetadata hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  /**
   * The user-created unique ID that represents the hotel item.
   * @return hotelId
   */
  @NotNull 
  @Schema(name = "hotel_id", example = "123abc", description = "The user-created unique ID that represents the hotel item.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    return Objects.equals(this.hotelId, catalogsHotelProductMetadata.hotelId);
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

