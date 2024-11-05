package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConversionEventsUserDataAnyOf1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEventsUserDataAnyOf1   {
  @JsonProperty("em")
  
  private List<String> em = null;

  @JsonProperty("hashed_maids")
  @NotNull

  private List<String> hashedMaids = new ArrayList<>();

  @JsonProperty("client_ip_address")
  
  private String clientIpAddress;

  @JsonProperty("client_user_agent")
  
  private String clientUserAgent;

  public ConversionEventsUserDataAnyOf1 em(List<String> em) {
    this.em = em;
    return this;
  }

  public ConversionEventsUserDataAnyOf1 addEmItem(String emItem) {
    if (this.em == null) {
      this.em = new ArrayList<>();
    }
    this.em.add(emItem);
    return this;
  }

   /**
   * Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   * @return em
  **/
  public List<String> getEm() {
    return em;
  }

  public void setEm(List<String> em) {
    this.em = em;
  }

  public ConversionEventsUserDataAnyOf1 hashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
    return this;
  }

  public ConversionEventsUserDataAnyOf1 addHashedMaidsItem(String hashedMaidsItem) {
    if (this.hashedMaids == null) {
      this.hashedMaids = new ArrayList<>();
    }
    this.hashedMaids.add(hashedMaidsItem);
    return this;
  }

   /**
   * Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   * @return hashedMaids
  **/
  public List<String> getHashedMaids() {
    return hashedMaids;
  }

  public void setHashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
  }

  public ConversionEventsUserDataAnyOf1 clientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
    return this;
  }

   /**
   * The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   * @return clientIpAddress
  **/
  public String getClientIpAddress() {
    return clientIpAddress;
  }

  public void setClientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }

  public ConversionEventsUserDataAnyOf1 clientUserAgent(String clientUserAgent) {
    this.clientUserAgent = clientUserAgent;
    return this;
  }

   /**
   * The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   * @return clientUserAgent
  **/
  public String getClientUserAgent() {
    return clientUserAgent;
  }

  public void setClientUserAgent(String clientUserAgent) {
    this.clientUserAgent = clientUserAgent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf1 = (ConversionEventsUserDataAnyOf1) o;
    return Objects.equals(em, conversionEventsUserDataAnyOf1.em) &&
        Objects.equals(hashedMaids, conversionEventsUserDataAnyOf1.hashedMaids) &&
        Objects.equals(clientIpAddress, conversionEventsUserDataAnyOf1.clientIpAddress) &&
        Objects.equals(clientUserAgent, conversionEventsUserDataAnyOf1.clientUserAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(em, hashedMaids, clientIpAddress, clientUserAgent);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsUserDataAnyOf1 {\n");
    
    sb.append("    em: ").append(toIndentedString(em)).append("\n");
    sb.append("    hashedMaids: ").append(toIndentedString(hashedMaids)).append("\n");
    sb.append("    clientIpAddress: ").append(toIndentedString(clientIpAddress)).append("\n");
    sb.append("    clientUserAgent: ").append(toIndentedString(clientUserAgent)).append("\n");
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

