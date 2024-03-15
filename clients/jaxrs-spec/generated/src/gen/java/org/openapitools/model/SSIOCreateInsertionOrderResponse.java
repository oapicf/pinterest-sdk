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



@JsonTypeName("SSIOCreateInsertionOrderResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SSIOCreateInsertionOrderResponse   {
  private @Valid String pinOrderId;

  /**
   * Salesforce order id
   **/
  public SSIOCreateInsertionOrderResponse pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

  
  @ApiModelProperty(value = "Salesforce order id")
  @JsonProperty("pin_order_id")
  public String getPinOrderId() {
    return pinOrderId;
  }

  @JsonProperty("pin_order_id")
  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOCreateInsertionOrderResponse ssIOCreateInsertionOrderResponse = (SSIOCreateInsertionOrderResponse) o;
    return Objects.equals(this.pinOrderId, ssIOCreateInsertionOrderResponse.pinOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOCreateInsertionOrderResponse {\n");
    
    sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
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

