package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Error which occurred when applying a bid options operation to a specific item.
 **/
@ApiModel(description="Error which occurred when applying a bid options operation to a specific item.")

public class AdvancedAuctionOperationError  {
  
  @ApiModelProperty(example = "6", value = "The error code for the item bid option operation validation error")
 /**
   * The error code for the item bid option operation validation error
  **/
  private Integer code;

  @ApiModelProperty(example = "Bid in micro currency should be non-negative", value = "Message describing the item bid option operation validation error")
 /**
   * Message describing the item bid option operation validation error
  **/
  private String message;
 /**
   * The error code for the item bid option operation validation error
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public AdvancedAuctionOperationError code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * Message describing the item bid option operation validation error
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AdvancedAuctionOperationError message(String message) {
    this.message = message;
    return this;
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
    return Objects.equals(this.code, advancedAuctionOperationError.code) &&
        Objects.equals(this.message, advancedAuctionOperationError.message);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

