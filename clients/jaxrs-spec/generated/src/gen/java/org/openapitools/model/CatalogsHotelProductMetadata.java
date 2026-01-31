package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Hotel product metadata entity
 **/
@ApiModel(description = "Hotel product metadata entity")
@JsonTypeName("CatalogsHotelProductMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-26T05:38:03.166641305Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsHotelProductMetadata   {
  private String hotelId;

  public CatalogsHotelProductMetadata() {
  }

  @JsonCreator
  public CatalogsHotelProductMetadata(
    @JsonProperty(required = true, value = "hotel_id") String hotelId
  ) {
    this.hotelId = hotelId;
  }

  /**
   * The user-created unique ID that represents the hotel item.
   **/
  public CatalogsHotelProductMetadata hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  
  @ApiModelProperty(example = "123abc", required = true, value = "The user-created unique ID that represents the hotel item.")
  @JsonProperty(required = true, value = "hotel_id")
  @NotNull public String getHotelId() {
    return hotelId;
  }

  @JsonProperty(required = true, value = "hotel_id")
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

