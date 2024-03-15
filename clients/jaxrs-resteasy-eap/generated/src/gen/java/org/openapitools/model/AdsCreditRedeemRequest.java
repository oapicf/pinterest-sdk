package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdsCreditRedeemRequest   {
  
  private String offerCodeHash;
  private Boolean validateOnly;

  /**
   * Takes in a SHA256 hash of the offerCode.
   **/
  
  @ApiModelProperty(example = "138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67", required = true, value = "Takes in a SHA256 hash of the offerCode.")
  @JsonProperty("offerCodeHash")
  @NotNull
 @Pattern(regexp="^[a-z0-9]*$")  public String getOfferCodeHash() {
    return offerCodeHash;
  }
  public void setOfferCodeHash(String offerCodeHash) {
    this.offerCodeHash = offerCodeHash;
  }

  /**
   * If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
   **/
  
  @ApiModelProperty(example = "true", required = true, value = "If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account")
  @JsonProperty("validateOnly")
  @NotNull
  public Boolean getValidateOnly() {
    return validateOnly;
  }
  public void setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsCreditRedeemRequest adsCreditRedeemRequest = (AdsCreditRedeemRequest) o;
    return Objects.equals(this.offerCodeHash, adsCreditRedeemRequest.offerCodeHash) &&
        Objects.equals(this.validateOnly, adsCreditRedeemRequest.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerCodeHash, validateOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsCreditRedeemRequest {\n");
    
    sb.append("    offerCodeHash: ").append(toIndentedString(offerCodeHash)).append("\n");
    sb.append("    validateOnly: ").append(toIndentedString(validateOnly)).append("\n");
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

