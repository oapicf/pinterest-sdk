package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsCreditRedeemRequest   {
  
  private String offerCodeHash;
  private Boolean validateOnly;

  public AdsCreditRedeemRequest () {

  }

  public AdsCreditRedeemRequest (String offerCodeHash, Boolean validateOnly) {
    this.offerCodeHash = offerCodeHash;
    this.validateOnly = validateOnly;
  }

    
  @JsonProperty("offerCodeHash")
  public String getOfferCodeHash() {
    return offerCodeHash;
  }
  public void setOfferCodeHash(String offerCodeHash) {
    this.offerCodeHash = offerCodeHash;
  }

    
  @JsonProperty("validateOnly")
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
    return Objects.equals(offerCodeHash, adsCreditRedeemRequest.offerCodeHash) &&
        Objects.equals(validateOnly, adsCreditRedeemRequest.validateOnly);
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
