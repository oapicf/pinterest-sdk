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
 * ConversionEventsUserDataAnyOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEventsUserDataAnyOf   {
  @JsonProperty("em")
  @NotNull

  private List<String> em = new ArrayList<>();

  @JsonProperty("hashed_maids")
  
  private List<String> hashedMaids = null;

  @JsonProperty("client_ip_address")
  
  private String clientIpAddress;

  @JsonProperty("client_user_agent")
  
  private String clientUserAgent;

  public ConversionEventsUserDataAnyOf em(List<String> em) {
    this.em = em;
    return this;
  }

  public ConversionEventsUserDataAnyOf addEmItem(String emItem) {
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

  public ConversionEventsUserDataAnyOf hashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
    return this;
  }

  public ConversionEventsUserDataAnyOf addHashedMaidsItem(String hashedMaidsItem) {
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

  public ConversionEventsUserDataAnyOf clientIpAddress(String clientIpAddress) {
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

  public ConversionEventsUserDataAnyOf clientUserAgent(String clientUserAgent) {
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
    ConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf = (ConversionEventsUserDataAnyOf) o;
    return Objects.equals(em, conversionEventsUserDataAnyOf.em) &&
        Objects.equals(hashedMaids, conversionEventsUserDataAnyOf.hashedMaids) &&
        Objects.equals(clientIpAddress, conversionEventsUserDataAnyOf.clientIpAddress) &&
        Objects.equals(clientUserAgent, conversionEventsUserDataAnyOf.clientUserAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(em, hashedMaids, clientIpAddress, clientUserAgent);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsUserDataAnyOf {\n");
    
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

