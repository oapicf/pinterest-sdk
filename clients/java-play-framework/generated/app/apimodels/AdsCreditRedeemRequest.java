package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdsCreditRedeemRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdsCreditRedeemRequest   {
  @JsonProperty("offerCodeHash")
  @NotNull
@Pattern(regexp="^[a-z0-9]*$")

  private String offerCodeHash;

  @JsonProperty("validateOnly")
  @NotNull

  private Boolean validateOnly;

  public AdsCreditRedeemRequest offerCodeHash(String offerCodeHash) {
    this.offerCodeHash = offerCodeHash;
    return this;
  }

   /**
   * Takes in a SHA256 hash of the offerCode.
   * @return offerCodeHash
  **/
  public String getOfferCodeHash() {
    return offerCodeHash;
  }

  public void setOfferCodeHash(String offerCodeHash) {
    this.offerCodeHash = offerCodeHash;
  }

  public AdsCreditRedeemRequest validateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

   /**
   * If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
   * @return validateOnly
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

