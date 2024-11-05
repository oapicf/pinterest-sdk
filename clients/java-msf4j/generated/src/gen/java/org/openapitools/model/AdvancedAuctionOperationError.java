package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Error which occurred when applying a bid options operation to a specific item.
 */
@ApiModel(description = "Error which occurred when applying a bid options operation to a specific item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionOperationError   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  public AdvancedAuctionOperationError code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * The error code for the item bid option operation validation error
   * @return code
  **/
  @ApiModelProperty(example = "6", value = "The error code for the item bid option operation validation error")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public AdvancedAuctionOperationError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message describing the item bid option operation validation error
   * @return message
  **/
  @ApiModelProperty(example = "Bid in micro currency should be non-negative", value = "Message describing the item bid option operation validation error")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

