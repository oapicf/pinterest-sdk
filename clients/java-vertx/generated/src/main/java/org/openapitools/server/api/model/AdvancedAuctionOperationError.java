package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error which occurred when applying a bid options operation to a specific item.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedAuctionOperationError   {
  
  private Integer code;
  private String message;

  public AdvancedAuctionOperationError () {

  }

  public AdvancedAuctionOperationError (Integer code, String message) {
    this.code = code;
    this.message = message;
  }

    
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedAuctionOperationError advancedAuctionOperationError = (AdvancedAuctionOperationError) o;
    return Objects.equals(code, advancedAuctionOperationError.code) &&
        Objects.equals(message, advancedAuctionOperationError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionOperationError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
