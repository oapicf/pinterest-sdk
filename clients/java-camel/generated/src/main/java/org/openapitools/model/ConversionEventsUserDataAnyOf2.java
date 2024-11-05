package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConversionEventsUserDataAnyOf2
 */

@JsonTypeName("ConversionEventsUserData_anyOf_2")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ConversionEventsUserDataAnyOf2 {

  @Valid
  private List<String> em = new ArrayList<>();

  @Valid
  private List<String> hashedMaids = new ArrayList<>();

  private String clientIpAddress;

  private String clientUserAgent;

  public ConversionEventsUserDataAnyOf2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionEventsUserDataAnyOf2(String clientIpAddress, String clientUserAgent) {
    this.clientIpAddress = clientIpAddress;
    this.clientUserAgent = clientUserAgent;
  }

  public ConversionEventsUserDataAnyOf2 em(List<String> em) {
    this.em = em;
    return this;
  }

  public ConversionEventsUserDataAnyOf2 addEmItem(String emItem) {
    if (this.em == null) {
      this.em = new ArrayList<>();
    }
    this.em.add(emItem);
    return this;
  }

  /**
   * Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   * @return em
   */
  
  @Schema(name = "em", example = "[\"411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8\",\"09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969\"]", description = "Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("em")
  public List<String> getEm() {
    return em;
  }

  public void setEm(List<String> em) {
    this.em = em;
  }

  public ConversionEventsUserDataAnyOf2 hashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
    return this;
  }

  public ConversionEventsUserDataAnyOf2 addHashedMaidsItem(String hashedMaidsItem) {
    if (this.hashedMaids == null) {
      this.hashedMaids = new ArrayList<>();
    }
    this.hashedMaids.add(hashedMaidsItem);
    return this;
  }

  /**
   * Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   * @return hashedMaids
   */
  
  @Schema(name = "hashed_maids", example = "[\"0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1\",\"837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46\"]", description = "Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hashed_maids")
  public List<String> getHashedMaids() {
    return hashedMaids;
  }

  public void setHashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
  }

  public ConversionEventsUserDataAnyOf2 clientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
    return this;
  }

  /**
   * The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   * @return clientIpAddress
   */
  @NotNull 
  @Schema(name = "client_ip_address", example = "216.3.128.12", description = "The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("client_ip_address")
  public String getClientIpAddress() {
    return clientIpAddress;
  }

  public void setClientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }

  public ConversionEventsUserDataAnyOf2 clientUserAgent(String clientUserAgent) {
    this.clientUserAgent = clientUserAgent;
    return this;
  }

  /**
   * The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   * @return clientUserAgent
   */
  @NotNull 
  @Schema(name = "client_user_agent", example = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36", description = "The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.", requiredMode = Schema.RequiredMode.REQUIRED)
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

