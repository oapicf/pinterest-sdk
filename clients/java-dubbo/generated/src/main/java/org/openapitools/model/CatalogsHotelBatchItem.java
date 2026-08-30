package org.openapitools.model;

import org.openapitools.model.CatalogsCreateHotelItem;
import org.openapitools.model.CatalogsDeleteHotelItem;
import org.openapitools.model.CatalogsUpdatableHotelAttributes;
import org.openapitools.model.CatalogsUpdateHotelItem;
import org.openapitools.model.CatalogsUpsertHotelItem;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Hotel batch item
 */
public class CatalogsHotelBatchItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attributes")
  private CatalogsUpdatableHotelAttributes attributes;

  /**
   * The catalog hotel id in the merchant namespace
   */
  @JsonProperty("hotel_id")
  private String hotelId;

  @JsonProperty("operation")
  private String operation;

  /**
   * 
   * @return attributes
   */
  public CatalogsUpdatableHotelAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsUpdatableHotelAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * The catalog hotel id in the merchant namespace
   * @return hotelId
   */
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  /**
   * 
   * @return operation
   */
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelBatchItem catalogsHotelBatchItem = (CatalogsHotelBatchItem) o;
    return Objects.equals(this.attributes, catalogsHotelBatchItem.attributes) &&
        Objects.equals(this.hotelId, catalogsHotelBatchItem.hotelId) &&
        Objects.equals(this.operation, catalogsHotelBatchItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, hotelId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelBatchItem {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
