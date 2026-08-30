package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CatalogsHotelAttributes;

/**
 * A hotel item to be created.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreateHotelItem   {
  
  private CatalogsHotelAttributes attributes;
  private String hotelId;


  public enum OperationEnum {
    CREATE("CREATE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OperationEnum operation;

  public CatalogsCreateHotelItem () {

  }

  public CatalogsCreateHotelItem (CatalogsHotelAttributes attributes, String hotelId, OperationEnum operation) {
    this.attributes = attributes;
    this.hotelId = hotelId;
    this.operation = operation;
  }

    
  @JsonProperty("attributes")
  public CatalogsHotelAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
  }

    
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

    
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
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
    CatalogsCreateHotelItem catalogsCreateHotelItem = (CatalogsCreateHotelItem) o;
    return Objects.equals(attributes, catalogsCreateHotelItem.attributes) &&
        Objects.equals(hotelId, catalogsCreateHotelItem.hotelId) &&
        Objects.equals(operation, catalogsCreateHotelItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, hotelId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreateHotelItem {\n");
    
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
