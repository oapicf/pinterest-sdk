package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdsCreditRedeemRequest  {
  
  @ApiModelProperty(example = "138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67", required = true, value = "Takes in a SHA256 hash of the offerCode.")
 /**
   * Takes in a SHA256 hash of the offerCode.
  **/
  private String offerCodeHash;

  @ApiModelProperty(example = "true", required = true, value = "If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account")
 /**
   * If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
  **/
  private Boolean validateOnly;
 /**
   * Takes in a SHA256 hash of the offerCode.
   * @return offerCodeHash
  **/
  @JsonProperty("offerCodeHash")
  public String getOfferCodeHash() {
    return offerCodeHash;
  }

  public void setOfferCodeHash(String offerCodeHash) {
    this.offerCodeHash = offerCodeHash;
  }

  public AdsCreditRedeemRequest offerCodeHash(String offerCodeHash) {
    this.offerCodeHash = offerCodeHash;
    return this;
  }

 /**
   * If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
   * @return validateOnly
  **/
  @JsonProperty("validateOnly")
  public Boolean getValidateOnly() {
    return validateOnly;
  }

  public void setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
  }

  public AdsCreditRedeemRequest validateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

