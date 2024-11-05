package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Hotel product metadata entity
 */
@ApiModel(description = "Hotel product metadata entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsHotelProductMetadata   {
  @JsonProperty("hotel_id")
  private String hotelId;

  public CatalogsHotelProductMetadata hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

   /**
   * The user-created unique ID that represents the hotel item.
   * @return hotelId
  **/
  @ApiModelProperty(example = "123abc", required = true, value = "The user-created unique ID that represents the hotel item.")
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

