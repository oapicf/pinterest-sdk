package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsCreditRedeemCreate   {
  
  private String offerCodeHash;
  private Boolean validateOnly;

  public AdsCreditRedeemCreate () {

  }

  public AdsCreditRedeemCreate (String offerCodeHash, Boolean validateOnly) {
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
    AdsCreditRedeemCreate adsCreditRedeemCreate = (AdsCreditRedeemCreate) o;
    return Objects.equals(offerCodeHash, adsCreditRedeemCreate.offerCodeHash) &&
        Objects.equals(validateOnly, adsCreditRedeemCreate.validateOnly);
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
