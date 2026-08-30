package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdsCreditRedeemCreate   {
  @JsonProperty("offerCodeHash")
  private String offerCodeHash;

  @JsonProperty("validateOnly")
  private Boolean validateOnly;

  public AdsCreditRedeemCreate offerCodeHash(String offerCodeHash) {
    this.offerCodeHash = offerCodeHash;
    return this;
  }

   /**
   * Takes in a SHA256 hash of the offerCode.
   * @return offerCodeHash
  **/
  @ApiModelProperty(example = "138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67", required = true, value = "Takes in a SHA256 hash of the offerCode.")
  public String getOfferCodeHash() {
    return offerCodeHash;
  }

  public void setOfferCodeHash(String offerCodeHash) {
    this.offerCodeHash = offerCodeHash;
  }

  public AdsCreditRedeemCreate validateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

   /**
   * If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
   * @return validateOnly
  **/
  @ApiModelProperty(example = "true", required = true, value = "If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account")
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
    AdsCreditRedeemCreate adsCreditRedeemCreate = (AdsCreditRedeemCreate) o;
    return Objects.equals(this.offerCodeHash, adsCreditRedeemCreate.offerCodeHash) &&
        Objects.equals(this.validateOnly, adsCreditRedeemCreate.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerCodeHash, validateOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsCreditRedeemCreate {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

