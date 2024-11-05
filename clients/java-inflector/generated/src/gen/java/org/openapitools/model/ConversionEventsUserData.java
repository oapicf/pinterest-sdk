package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventsUserDataAnyOf;
import org.openapitools.model.ConversionEventsUserDataAnyOf1;
import org.openapitools.model.ConversionEventsUserDataAnyOf2;



/**
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 **/

@ApiModel(description = "Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ConversionEventsUserData   {
  @JsonProperty("ph")
  private List<String> ph = null;

  @JsonProperty("ge")
  private List<String> ge = null;

  @JsonProperty("db")
  private List<String> db = null;

  @JsonProperty("ln")
  private List<String> ln = null;

  @JsonProperty("fn")
  private List<String> fn = null;

  @JsonProperty("ct")
  private List<String> ct = null;

  @JsonProperty("st")
  private List<String> st = null;

  @JsonProperty("zp")
  private List<String> zp = null;

  @JsonProperty("country")
  private List<String> country = null;

  @JsonProperty("external_id")
  private List<String> externalId = null;

  @JsonProperty("click_id")
  private String clickId;

  @JsonProperty("partner_id")
  private String partnerId;

  @JsonProperty("em")
  private List<String> em = new ArrayList<>();

  @JsonProperty("hashed_maids")
  private List<String> hashedMaids = new ArrayList<>();

  @JsonProperty("client_ip_address")
  private String clientIpAddress;

  @JsonProperty("client_user_agent")
  private String clientUserAgent;

  /**
   * Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData ph(List<String> ph) {
    this.ph = ph;
    return this;
  }

  
  @ApiModelProperty(example = "[\"45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d\"]", value = "Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("ph")
  public List<String> getPh() {
    return ph;
  }
  public void setPh(List<String> ph) {
    this.ph = ph;
  }

  /**
   * Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData ge(List<String> ge) {
    this.ge = ge;
    return this;
  }

  
  @ApiModelProperty(example = "[\"0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf\"]", value = "Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.")
  @JsonProperty("ge")
  public List<String> getGe() {
    return ge;
  }
  public void setGe(List<String> ge) {
    this.ge = ge;
  }

  /**
   * Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData db(List<String> db) {
    this.db = db;
    return this;
  }

  
  @ApiModelProperty(example = "[\"d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739\"]", value = "Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.")
  @JsonProperty("db")
  public List<String> getDb() {
    return db;
  }
  public void setDb(List<String> db) {
    this.db = db;
  }

  /**
   * Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData ln(List<String> ln) {
    this.ln = ln;
    return this;
  }

  
  @ApiModelProperty(example = "[\"7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19\"]", value = "Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("ln")
  public List<String> getLn() {
    return ln;
  }
  public void setLn(List<String> ln) {
    this.ln = ln;
  }

  /**
   * Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData fn(List<String> fn) {
    this.fn = fn;
    return this;
  }

  
  @ApiModelProperty(example = "[\"ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2\"]", value = "Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("fn")
  public List<String> getFn() {
    return fn;
  }
  public void setFn(List<String> fn) {
    this.fn = fn;
  }

  /**
   * Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData ct(List<String> ct) {
    this.ct = ct;
    return this;
  }

  
  @ApiModelProperty(example = "[\"4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36\"]", value = "Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.")
  @JsonProperty("ct")
  public List<String> getCt() {
    return ct;
  }
  public void setCt(List<String> ct) {
    this.ct = ct;
  }

  /**
   * Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData st(List<String> st) {
    this.st = st;
    return this;
  }

  
  @ApiModelProperty(example = "[\"49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34\"]", value = "Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.")
  @JsonProperty("st")
  public List<String> getSt() {
    return st;
  }
  public void setSt(List<String> st) {
    this.st = st;
  }

  /**
   * Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData zp(List<String> zp) {
    this.zp = zp;
    return this;
  }

  
  @ApiModelProperty(example = "[\"fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145\"]", value = "Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.")
  @JsonProperty("zp")
  public List<String> getZp() {
    return zp;
  }
  public void setZp(List<String> zp) {
    this.zp = zp;
  }

  /**
   * Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData country(List<String> country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(example = "[\"9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d\"]", value = "Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.")
  @JsonProperty("country")
  public List<String> getCountry() {
    return country;
  }
  public void setCountry(List<String> country) {
    this.country = country;
  }

  /**
   * Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData externalId(List<String> externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @ApiModelProperty(example = "[\"6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee\"]", value = "Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("external_id")
  public List<String> getExternalId() {
    return externalId;
  }
  public void setExternalId(List<String> externalId) {
    this.externalId = externalId;
  }

  /**
   * The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
   **/
  public ConversionEventsUserData clickId(String clickId) {
    this.clickId = clickId;
    return this;
  }

  
  @ApiModelProperty(example = "dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv", value = "The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.")
  @JsonProperty("click_id")
  public String getClickId() {
    return clickId;
  }
  public void setClickId(String clickId) {
    this.clickId = clickId;
  }

  /**
   * A unique identifier of visitors' information defined by third party partners. e.g RampID
   **/
  public ConversionEventsUserData partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  
  @ApiModelProperty(example = "BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc", value = "A unique identifier of visitors' information defined by third party partners. e.g RampID")
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData em(List<String> em) {
    this.em = em;
    return this;
  }

  
  @ApiModelProperty(example = "[411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8, 09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969]", required = true, value = "Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("em")
  public List<String> getEm() {
    return em;
  }
  public void setEm(List<String> em) {
    this.em = em;
  }

  /**
   * Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserData hashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
    return this;
  }

  
  @ApiModelProperty(example = "[0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1, 837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46]", required = true, value = "Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("hashed_maids")
  public List<String> getHashedMaids() {
    return hashedMaids;
  }
  public void setHashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
  }

  /**
   * The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   **/
  public ConversionEventsUserData clientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
    return this;
  }

  
  @ApiModelProperty(example = "216.3.128.12", required = true, value = "The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.")
  @JsonProperty("client_ip_address")
  public String getClientIpAddress() {
    return clientIpAddress;
  }
  public void setClientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }

  /**
   * The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   **/
  public ConversionEventsUserData clientUserAgent(String clientUserAgent) {
    this.clientUserAgent = clientUserAgent;
    return this;
  }

  
  @ApiModelProperty(example = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36", required = true, value = "The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.")
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
    ConversionEventsUserData conversionEventsUserData = (ConversionEventsUserData) o;
    return Objects.equals(ph, conversionEventsUserData.ph) &&
        Objects.equals(ge, conversionEventsUserData.ge) &&
        Objects.equals(db, conversionEventsUserData.db) &&
        Objects.equals(ln, conversionEventsUserData.ln) &&
        Objects.equals(fn, conversionEventsUserData.fn) &&
        Objects.equals(ct, conversionEventsUserData.ct) &&
        Objects.equals(st, conversionEventsUserData.st) &&
        Objects.equals(zp, conversionEventsUserData.zp) &&
        Objects.equals(country, conversionEventsUserData.country) &&
        Objects.equals(externalId, conversionEventsUserData.externalId) &&
        Objects.equals(clickId, conversionEventsUserData.clickId) &&
        Objects.equals(partnerId, conversionEventsUserData.partnerId) &&
        Objects.equals(em, conversionEventsUserData.em) &&
        Objects.equals(hashedMaids, conversionEventsUserData.hashedMaids) &&
        Objects.equals(clientIpAddress, conversionEventsUserData.clientIpAddress) &&
        Objects.equals(clientUserAgent, conversionEventsUserData.clientUserAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ph, ge, db, ln, fn, ct, st, zp, country, externalId, clickId, partnerId, em, hashedMaids, clientIpAddress, clientUserAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsUserData {\n");
    
    sb.append("    ph: ").append(toIndentedString(ph)).append("\n");
    sb.append("    ge: ").append(toIndentedString(ge)).append("\n");
    sb.append("    db: ").append(toIndentedString(db)).append("\n");
    sb.append("    ln: ").append(toIndentedString(ln)).append("\n");
    sb.append("    fn: ").append(toIndentedString(fn)).append("\n");
    sb.append("    ct: ").append(toIndentedString(ct)).append("\n");
    sb.append("    st: ").append(toIndentedString(st)).append("\n");
    sb.append("    zp: ").append(toIndentedString(zp)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    clickId: ").append(toIndentedString(clickId)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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

