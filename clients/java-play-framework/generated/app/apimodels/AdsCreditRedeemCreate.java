package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdsCreditRedeemCreate   {
  @JsonProperty("offerCodeHash")
  @NotNull
@Pattern(regexp="^[a-z0-9]*$")

  private String offerCodeHash;

  @JsonProperty("validateOnly")
  @NotNull

  private Boolean validateOnly;

  public AdsCreditRedeemCreate offerCodeHash(String offerCodeHash) {
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

  public AdsCreditRedeemCreate validateOnly(Boolean validateOnly) {
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
    AdsCreditRedeemCreate adsCreditRedeemCreate = (AdsCreditRedeemCreate) o;
    return Objects.equals(offerCodeHash, adsCreditRedeemCreate.offerCodeHash) &&
        Objects.equals(validateOnly, adsCreditRedeemCreate.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerCodeHash, validateOnly);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

