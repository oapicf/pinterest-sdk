package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SSIOInsertionOrderStatus   {
  
  private String pinOrderId;
  private String status;
  private String creationTime;

  public SSIOInsertionOrderStatus () {

  }

  public SSIOInsertionOrderStatus (String pinOrderId, String status, String creationTime) {
    this.pinOrderId = pinOrderId;
    this.status = status;
    this.creationTime = creationTime;
  }

    
  @JsonProperty("pin_order_id")
  public String getPinOrderId() {
    return pinOrderId;
  }
  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }

    
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

    
  @JsonProperty("creation_time")
  public String getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOInsertionOrderStatus ssIOInsertionOrderStatus = (SSIOInsertionOrderStatus) o;
    return Objects.equals(pinOrderId, ssIOInsertionOrderStatus.pinOrderId) &&
        Objects.equals(status, ssIOInsertionOrderStatus.status) &&
        Objects.equals(creationTime, ssIOInsertionOrderStatus.creationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinOrderId, status, creationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOInsertionOrderStatus {\n");
    
    sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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
