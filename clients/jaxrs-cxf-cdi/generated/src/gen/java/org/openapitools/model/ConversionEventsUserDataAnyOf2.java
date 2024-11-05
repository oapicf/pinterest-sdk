package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ConversionEventsUserDataAnyOf2   {
  
  private List<String> em = new ArrayList<>();

  private List<String> hashedMaids = new ArrayList<>();

  private String clientIpAddress;

  private String clientUserAgent;

  /**
   * Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataAnyOf2 em(List<String> em) {
    this.em = em;
    return this;
  }

  
  @ApiModelProperty(example = "[\"411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8\",\"09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969\"]", value = "Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("em")
  public List<String> getEm() {
    return em;
  }
  public void setEm(List<String> em) {
    this.em = em;
  }

  public ConversionEventsUserDataAnyOf2 addEmItem(String emItem) {
    if (this.em == null) {
      this.em = new ArrayList<>();
    }
    this.em.add(emItem);
    return this;
  }


  /**
   * Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataAnyOf2 hashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
    return this;
  }

  
  @ApiModelProperty(example = "[\"0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1\",\"837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46\"]", value = "Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("hashed_maids")
  public List<String> getHashedMaids() {
    return hashedMaids;
  }
  public void setHashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
  }

  public ConversionEventsUserDataAnyOf2 addHashedMaidsItem(String hashedMaidsItem) {
    if (this.hashedMaids == null) {
      this.hashedMaids = new ArrayList<>();
    }
    this.hashedMaids.add(hashedMaidsItem);
    return this;
  }


  /**
   * The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   **/
  public ConversionEventsUserDataAnyOf2 clientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
    return this;
  }

  
  @ApiModelProperty(example = "216.3.128.12", required = true, value = "The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.")
  @JsonProperty("client_ip_address")
  @NotNull
  public String getClientIpAddress() {
    return clientIpAddress;
  }
  public void setClientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }


  /**
   * The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   **/
  public ConversionEventsUserDataAnyOf2 clientUserAgent(String clientUserAgent) {
    this.clientUserAgent = clientUserAgent;
    return this;
  }

  
  @ApiModelProperty(example = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36", required = true, value = "The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.")
  @JsonProperty("client_user_agent")
  @NotNull
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
    ConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf2 = (ConversionEventsUserDataAnyOf2) o;
    return Objects.equals(this.em, conversionEventsUserDataAnyOf2.em) &&
        Objects.equals(this.hashedMaids, conversionEventsUserDataAnyOf2.hashedMaids) &&
        Objects.equals(this.clientIpAddress, conversionEventsUserDataAnyOf2.clientIpAddress) &&
        Objects.equals(this.clientUserAgent, conversionEventsUserDataAnyOf2.clientUserAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(em, hashedMaids, clientIpAddress, clientUserAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsUserDataAnyOf2 {\n");
    
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

