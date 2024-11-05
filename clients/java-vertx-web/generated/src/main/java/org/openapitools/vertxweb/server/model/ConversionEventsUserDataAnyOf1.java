package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEventsUserDataAnyOf1   {
  
  private List<String> em = new ArrayList<>();
  private List<String> hashedMaids = new ArrayList<>();
  private String clientIpAddress;
  private String clientUserAgent;

  public ConversionEventsUserDataAnyOf1 () {

  }

  public ConversionEventsUserDataAnyOf1 (List<String> em, List<String> hashedMaids, String clientIpAddress, String clientUserAgent) {
    this.em = em;
    this.hashedMaids = hashedMaids;
    this.clientIpAddress = clientIpAddress;
    this.clientUserAgent = clientUserAgent;
  }

    
  @JsonProperty("em")
  public List<String> getEm() {
    return em;
  }
  public void setEm(List<String> em) {
    this.em = em;
  }

    
  @JsonProperty("hashed_maids")
  public List<String> getHashedMaids() {
    return hashedMaids;
  }
  public void setHashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
  }

    
  @JsonProperty("client_ip_address")
  public String getClientIpAddress() {
    return clientIpAddress;
  }
  public void setClientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }

    
  @JsonProperty("client_user_agent")
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
