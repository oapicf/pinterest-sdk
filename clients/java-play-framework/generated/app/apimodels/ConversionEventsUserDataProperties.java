package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConversionEventsUserDataProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEventsUserDataProperties   {
  @JsonProperty("click_id")
  
  private String clickId;

  @JsonProperty("client_ip_address")
  
  private String clientIpAddress;

  @JsonProperty("client_user_agent")
  
  private String clientUserAgent;

  @JsonProperty("country")
  
  private List<String> country = null;

  @JsonProperty("ct")
  
  private List<String> ct = null;

  @JsonProperty("db")
  
  private List<String> db = null;

  @JsonProperty("em")
  
  private List<String> em = null;

  @JsonProperty("external_id")
  
  private List<String> externalId = null;

  @JsonProperty("fn")
  
  private List<String> fn = null;

  @JsonProperty("ge")
  
  private List<String> ge = null;

  @JsonProperty("hashed_maids")
  
  private List<String> hashedMaids = null;

  @JsonProperty("ln")
  
  private List<String> ln = null;

  @JsonProperty("partner_id")
  
  private String partnerId;

  @JsonProperty("ph")
  
  private List<String> ph = null;

  @JsonProperty("st")
  
  private List<String> st = null;

  @JsonProperty("zp")
  
  private List<String> zp = null;

  public ConversionEventsUserDataProperties clickId(String clickId) {
    this.clickId = clickId;
    return this;
  }

   /**
   * The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
   * @return clickId
  **/
  public String getClickId() {
    return clickId;
  }

  public void setClickId(String clickId) {
    this.clickId = clickId;
  }

  public ConversionEventsUserDataProperties clientIpAddress(String clientIpAddress) {
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

  public ConversionEventsUserDataProperties clientUserAgent(String clientUserAgent) {
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

  public ConversionEventsUserDataProperties country(List<String> country) {
    this.country = country;
    return this;
  }

  public ConversionEventsUserDataProperties addCountryItem(String countryItem) {
    if (this.country == null) {
      this.country = new ArrayList<>();
    }
    this.country.add(countryItem);
    return this;
  }

   /**
   * Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
   * @return country
  **/
  public List<String> getCountry() {
    return country;
  }

  public void setCountry(List<String> country) {
    this.country = country;
  }

  public ConversionEventsUserDataProperties ct(List<String> ct) {
    this.ct = ct;
    return this;
  }

  public ConversionEventsUserDataProperties addCtItem(String ctItem) {
    if (this.ct == null) {
      this.ct = new ArrayList<>();
    }
    this.ct.add(ctItem);
    return this;
  }

   /**
   * Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
   * @return ct
  **/
  public List<String> getCt() {
    return ct;
  }

  public void setCt(List<String> ct) {
    this.ct = ct;
  }

  public ConversionEventsUserDataProperties db(List<String> db) {
    this.db = db;
    return this;
  }

  public ConversionEventsUserDataProperties addDbItem(String dbItem) {
    if (this.db == null) {
      this.db = new ArrayList<>();
    }
    this.db.add(dbItem);
    return this;
  }

   /**
   * Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
   * @return db
  **/
  public List<String> getDb() {
    return db;
  }

  public void setDb(List<String> db) {
    this.db = db;
  }

  public ConversionEventsUserDataProperties em(List<String> em) {
    this.em = em;
    return this;
  }

  public ConversionEventsUserDataProperties addEmItem(String emItem) {
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

  public ConversionEventsUserDataProperties externalId(List<String> externalId) {
    this.externalId = externalId;
    return this;
  }

  public ConversionEventsUserDataProperties addExternalIdItem(String externalIdItem) {
    if (this.externalId == null) {
      this.externalId = new ArrayList<>();
    }
    this.externalId.add(externalIdItem);
    return this;
  }

   /**
   * Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   * @return externalId
  **/
  public List<String> getExternalId() {
    return externalId;
  }

  public void setExternalId(List<String> externalId) {
    this.externalId = externalId;
  }

  public ConversionEventsUserDataProperties fn(List<String> fn) {
    this.fn = fn;
    return this;
  }

  public ConversionEventsUserDataProperties addFnItem(String fnItem) {
    if (this.fn == null) {
      this.fn = new ArrayList<>();
    }
    this.fn.add(fnItem);
    return this;
  }

   /**
   * Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   * @return fn
  **/
  public List<String> getFn() {
    return fn;
  }

  public void setFn(List<String> fn) {
    this.fn = fn;
  }

  public ConversionEventsUserDataProperties ge(List<String> ge) {
    this.ge = ge;
    return this;
  }

  public ConversionEventsUserDataProperties addGeItem(String geItem) {
    if (this.ge == null) {
      this.ge = new ArrayList<>();
    }
    this.ge.add(geItem);
    return this;
  }

   /**
   * Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
   * @return ge
  **/
  public List<String> getGe() {
    return ge;
  }

  public void setGe(List<String> ge) {
    this.ge = ge;
  }

  public ConversionEventsUserDataProperties hashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
    return this;
  }

  public ConversionEventsUserDataProperties addHashedMaidsItem(String hashedMaidsItem) {
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

  public ConversionEventsUserDataProperties ln(List<String> ln) {
    this.ln = ln;
    return this;
  }

  public ConversionEventsUserDataProperties addLnItem(String lnItem) {
    if (this.ln == null) {
      this.ln = new ArrayList<>();
    }
    this.ln.add(lnItem);
    return this;
  }

   /**
   * Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   * @return ln
  **/
  public List<String> getLn() {
    return ln;
  }

  public void setLn(List<String> ln) {
    this.ln = ln;
  }

  public ConversionEventsUserDataProperties partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * A unique identifier of visitors' information defined by third party partners. e.g RampID
   * @return partnerId
  **/
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public ConversionEventsUserDataProperties ph(List<String> ph) {
    this.ph = ph;
    return this;
  }

  public ConversionEventsUserDataProperties addPhItem(String phItem) {
    if (this.ph == null) {
      this.ph = new ArrayList<>();
    }
    this.ph.add(phItem);
    return this;
  }

   /**
   * Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   * @return ph
  **/
  public List<String> getPh() {
    return ph;
  }

  public void setPh(List<String> ph) {
    this.ph = ph;
  }

  public ConversionEventsUserDataProperties st(List<String> st) {
    this.st = st;
    return this;
  }

  public ConversionEventsUserDataProperties addStItem(String stItem) {
    if (this.st == null) {
      this.st = new ArrayList<>();
    }
    this.st.add(stItem);
    return this;
  }

   /**
   * Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
   * @return st
  **/
  public List<String> getSt() {
    return st;
  }

  public void setSt(List<String> st) {
    this.st = st;
  }

  public ConversionEventsUserDataProperties zp(List<String> zp) {
    this.zp = zp;
    return this;
  }

  public ConversionEventsUserDataProperties addZpItem(String zpItem) {
    if (this.zp == null) {
      this.zp = new ArrayList<>();
    }
    this.zp.add(zpItem);
    return this;
  }

   /**
   * Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
   * @return zp
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

