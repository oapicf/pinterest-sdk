package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEventsUserDataProperties   {
  
  private String clickId;
  private String clientIpAddress;
  private String clientUserAgent;
  private List<String> country = new ArrayList<>();
  private List<String> ct = new ArrayList<>();
  private List<String> db = new ArrayList<>();
  private List<String> em = new ArrayList<>();
  private List<String> externalId = new ArrayList<>();
  private List<String> fn = new ArrayList<>();
  private List<String> ge = new ArrayList<>();
  private List<String> hashedMaids = new ArrayList<>();
  private List<String> ln = new ArrayList<>();
  private String partnerId;
  private List<String> ph = new ArrayList<>();
  private List<String> st = new ArrayList<>();
  private List<String> zp = new ArrayList<>();

  public ConversionEventsUserDataProperties () {

  }

  public ConversionEventsUserDataProperties (String clickId, String clientIpAddress, String clientUserAgent, List<String> country, List<String> ct, List<String> db, List<String> em, List<String> externalId, List<String> fn, List<String> ge, List<String> hashedMaids, List<String> ln, String partnerId, List<String> ph, List<String> st, List<String> zp) {
    this.clickId = clickId;
    this.clientIpAddress = clientIpAddress;
    this.clientUserAgent = clientUserAgent;
    this.country = country;
    this.ct = ct;
    this.db = db;
    this.em = em;
    this.externalId = externalId;
    this.fn = fn;
    this.ge = ge;
    this.hashedMaids = hashedMaids;
    this.ln = ln;
    this.partnerId = partnerId;
    this.ph = ph;
    this.st = st;
    this.zp = zp;
  }

    
  @JsonProperty("click_id")
  public String getClickId() {
    return clickId;
  }
  public void setClickId(String clickId) {
    this.clickId = clickId;
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

    
  @JsonProperty("country")
  public List<String> getCountry() {
    return country;
  }
  public void setCountry(List<String> country) {
    this.country = country;
  }

    
  @JsonProperty("ct")
  public List<String> getCt() {
    return ct;
  }
  public void setCt(List<String> ct) {
    this.ct = ct;
  }

    
  @JsonProperty("db")
  public List<String> getDb() {
    return db;
  }
  public void setDb(List<String> db) {
    this.db = db;
  }

    
  @JsonProperty("em")
  public List<String> getEm() {
    return em;
  }
  public void setEm(List<String> em) {
    this.em = em;
  }

    
  @JsonProperty("external_id")
  public List<String> getExternalId() {
    return externalId;
  }
  public void setExternalId(List<String> externalId) {
    this.externalId = externalId;
  }

    
  @JsonProperty("fn")
  public List<String> getFn() {
    return fn;
  }
  public void setFn(List<String> fn) {
    this.fn = fn;
  }

    
  @JsonProperty("ge")
  public List<String> getGe() {
    return ge;
  }
  public void setGe(List<String> ge) {
    this.ge = ge;
  }

    
  @JsonProperty("hashed_maids")
  public List<String> getHashedMaids() {
    return hashedMaids;
  }
  public void setHashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
  }

    
  @JsonProperty("ln")
  public List<String> getLn() {
    return ln;
  }
  public void setLn(List<String> ln) {
    this.ln = ln;
  }

    
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

    
  @JsonProperty("ph")
  public List<String> getPh() {
    return ph;
  }
  public void setPh(List<String> ph) {
    this.ph = ph;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEventsUserDataProperties conversionEventsUserDataProperties = (ConversionEventsUserDataProperties) o;
    return Objects.equals(clickId, conversionEventsUserDataProperties.clickId) &&
        Objects.equals(clientIpAddress, conversionEventsUserDataProperties.clientIpAddress) &&
        Objects.equals(clientUserAgent, conversionEventsUserDataProperties.clientUserAgent) &&
        Objects.equals(country, conversionEventsUserDataProperties.country) &&
        Objects.equals(ct, conversionEventsUserDataProperties.ct) &&
        Objects.equals(db, conversionEventsUserDataProperties.db) &&
        Objects.equals(em, conversionEventsUserDataProperties.em) &&
        Objects.equals(externalId, conversionEventsUserDataProperties.externalId) &&
        Objects.equals(fn, conversionEventsUserDataProperties.fn) &&
        Objects.equals(ge, conversionEventsUserDataProperties.ge) &&
        Objects.equals(hashedMaids, conversionEventsUserDataProperties.hashedMaids) &&
        Objects.equals(ln, conversionEventsUserDataProperties.ln) &&
        Objects.equals(partnerId, conversionEventsUserDataProperties.partnerId) &&
        Objects.equals(ph, conversionEventsUserDataProperties.ph) &&
        Objects.equals(st, conversionEventsUserDataProperties.st) &&
        Objects.equals(zp, conversionEventsUserDataProperties.zp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickId, clientIpAddress, clientUserAgent, country, ct, db, em, externalId, fn, ge, hashedMaids, ln, partnerId, ph, st, zp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsUserDataProperties {\n");
    
    sb.append("    clickId: ").append(toIndentedString(clickId)).append("\n");
    sb.append("    clientIpAddress: ").append(toIndentedString(clientIpAddress)).append("\n");
    sb.append("    clientUserAgent: ").append(toIndentedString(clientUserAgent)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    ct: ").append(toIndentedString(ct)).append("\n");
    sb.append("    db: ").append(toIndentedString(db)).append("\n");
    sb.append("    em: ").append(toIndentedString(em)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    fn: ").append(toIndentedString(fn)).append("\n");
    sb.append("    ge: ").append(toIndentedString(ge)).append("\n");
    sb.append("    hashedMaids: ").append(toIndentedString(hashedMaids)).append("\n");
    sb.append("    ln: ").append(toIndentedString(ln)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    ph: ").append(toIndentedString(ph)).append("\n");
    sb.append("    st: ").append(toIndentedString(st)).append("\n");
    sb.append("    zp: ").append(toIndentedString(zp)).append("\n");
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
