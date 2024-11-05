package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ConversionEventsUserDataAnyOf;
import org.openapitools.vertxweb.server.model.ConversionEventsUserDataAnyOf1;
import org.openapitools.vertxweb.server.model.ConversionEventsUserDataAnyOf2;

/**
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEventsUserData   {
  
  private List<String> ph = new ArrayList<>();
  private List<String> ge = new ArrayList<>();
  private List<String> db = new ArrayList<>();
  private List<String> ln = new ArrayList<>();
  private List<String> fn = new ArrayList<>();
  private List<String> ct = new ArrayList<>();
  private List<String> st = new ArrayList<>();
  private List<String> zp = new ArrayList<>();
  private List<String> country = new ArrayList<>();
  private List<String> externalId = new ArrayList<>();
  private String clickId;
  private String partnerId;
  private List<String> em = new ArrayList<>();
  private List<String> hashedMaids = new ArrayList<>();
  private String clientIpAddress;
  private String clientUserAgent;

  public ConversionEventsUserData () {

  }

  public ConversionEventsUserData (List<String> ph, List<String> ge, List<String> db, List<String> ln, List<String> fn, List<String> ct, List<String> st, List<String> zp, List<String> country, List<String> externalId, String clickId, String partnerId, List<String> em, List<String> hashedMaids, String clientIpAddress, String clientUserAgent) {
    this.ph = ph;
    this.ge = ge;
    this.db = db;
    this.ln = ln;
    this.fn = fn;
    this.ct = ct;
    this.st = st;
    this.zp = zp;
    this.country = country;
    this.externalId = externalId;
    this.clickId = clickId;
    this.partnerId = partnerId;
    this.em = em;
    this.hashedMaids = hashedMaids;
    this.clientIpAddress = clientIpAddress;
    this.clientUserAgent = clientUserAgent;
  }

    
  @JsonProperty("ph")
  public List<String> getPh() {
    return ph;
  }
  public void setPh(List<String> ph) {
    this.ph = ph;
  }

    
  @JsonProperty("ge")
  public List<String> getGe() {
    return ge;
  }
  public void setGe(List<String> ge) {
    this.ge = ge;
  }

    
  @JsonProperty("db")
  public List<String> getDb() {
    return db;
  }
  public void setDb(List<String> db) {
    this.db = db;
  }

    
  @JsonProperty("ln")
  public List<String> getLn() {
    return ln;
  }
  public void setLn(List<String> ln) {
    this.ln = ln;
  }

    
  @JsonProperty("fn")
  public List<String> getFn() {
    return fn;
  }
  public void setFn(List<String> fn) {
    this.fn = fn;
  }

    
  @JsonProperty("ct")
  public List<String> getCt() {
    return ct;
  }
  public void setCt(List<String> ct) {
    this.ct = ct;
  }

    
  @JsonProperty("st")
  public List<String> getSt() {
    return st;
  }
  public void setSt(List<String> st) {
    this.st = st;
  }

    
  @JsonProperty("zp")
  public List<String> getZp() {
    return zp;
  }
  public void setZp(List<String> zp) {
    this.zp = zp;
  }

    
  @JsonProperty("country")
  public List<String> getCountry() {
    return country;
  }
  public void setCountry(List<String> country) {
    this.country = country;
  }

    
  @JsonProperty("external_id")
  public List<String> getExternalId() {
    return externalId;
  }
  public void setExternalId(List<String> externalId) {
    this.externalId = externalId;
  }

    
  @JsonProperty("click_id")
  public String getClickId() {
    return clickId;
  }
  public void setClickId(String clickId) {
    this.clickId = clickId;
  }

    
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
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
