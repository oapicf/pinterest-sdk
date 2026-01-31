package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ConversionEventsUserDataProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionEventsUserDataProperties   {
  private String clickId;
  private String clientIpAddress;
  private String clientUserAgent;
  private @Valid List<String> country = new ArrayList<>();
  private @Valid List<String> ct = new ArrayList<>();
  private @Valid List<String> db = new ArrayList<>();
  private @Valid List<String> em = new ArrayList<>();
  private @Valid List<String> externalId = new ArrayList<>();
  private @Valid List<String> fn = new ArrayList<>();
  private @Valid List<String> ge = new ArrayList<>();
  private @Valid List<String> hashedMaids = new ArrayList<>();
  private @Valid List<String> ln = new ArrayList<>();
  private String partnerId;
  private @Valid List<String> ph = new ArrayList<>();
  private @Valid List<String> st = new ArrayList<>();
  private @Valid List<String> zp = new ArrayList<>();

  public ConversionEventsUserDataProperties() {
  }

  /**
   * The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
   **/
  public ConversionEventsUserDataProperties clickId(String clickId) {
    this.clickId = clickId;
    return this;
  }

  
  @ApiModelProperty(example = "dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv", value = "The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.")
  @JsonProperty("click_id")
  public String getClickId() {
    return clickId;
  }

  @JsonProperty("click_id")
  public void setClickId(String clickId) {
    this.clickId = clickId;
  }

  /**
   * The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   **/
  public ConversionEventsUserDataProperties clientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
    return this;
  }

  
  @ApiModelProperty(example = "216.3.128.12", value = "The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.")
  @JsonProperty("client_ip_address")
  public String getClientIpAddress() {
    return clientIpAddress;
  }

  @JsonProperty("client_ip_address")
  public void setClientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }

  /**
   * The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   **/
  public ConversionEventsUserDataProperties clientUserAgent(String clientUserAgent) {
    this.clientUserAgent = clientUserAgent;
    return this;
  }

  
  @ApiModelProperty(value = "The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.")
  @JsonProperty("client_user_agent")
  public String getClientUserAgent() {
    return clientUserAgent;
  }

  @JsonProperty("client_user_agent")
  public void setClientUserAgent(String clientUserAgent) {
    this.clientUserAgent = clientUserAgent;
  }

  /**
   * Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties country(List<String> country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(example = "[\"9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d\"]", value = "Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.")
  @JsonProperty("country")
  public List<String> getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(List<String> country) {
    this.country = country;
  }

  public ConversionEventsUserDataProperties addCountryItem(String countryItem) {
    if (this.country == null) {
      this.country = new ArrayList<>();
    }

    this.country.add(countryItem);
    return this;
  }

  public ConversionEventsUserDataProperties removeCountryItem(String countryItem) {
    if (countryItem != null && this.country != null) {
      this.country.remove(countryItem);
    }

    return this;
  }
  /**
   * Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties ct(List<String> ct) {
    this.ct = ct;
    return this;
  }

  
  @ApiModelProperty(example = "[\"4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36\"]", value = "Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.")
  @JsonProperty("ct")
  public List<String> getCt() {
    return ct;
  }

  @JsonProperty("ct")
  public void setCt(List<String> ct) {
    this.ct = ct;
  }

  public ConversionEventsUserDataProperties addCtItem(String ctItem) {
    if (this.ct == null) {
      this.ct = new ArrayList<>();
    }

    this.ct.add(ctItem);
    return this;
  }

  public ConversionEventsUserDataProperties removeCtItem(String ctItem) {
    if (ctItem != null && this.ct != null) {
      this.ct.remove(ctItem);
    }

    return this;
  }
  /**
   * Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties db(List<String> db) {
    this.db = db;
    return this;
  }

  
  @ApiModelProperty(example = "[\"d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739\"]", value = "Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.")
  @JsonProperty("db")
  public List<String> getDb() {
    return db;
  }

  @JsonProperty("db")
  public void setDb(List<String> db) {
    this.db = db;
  }

  public ConversionEventsUserDataProperties addDbItem(String dbItem) {
    if (this.db == null) {
      this.db = new ArrayList<>();
    }

    this.db.add(dbItem);
    return this;
  }

  public ConversionEventsUserDataProperties removeDbItem(String dbItem) {
    if (dbItem != null && this.db != null) {
      this.db.remove(dbItem);
    }

    return this;
  }
  /**
   * Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties em(List<String> em) {
    this.em = em;
    return this;
  }

  
  @ApiModelProperty(example = "[\"411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8\",\"09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969\"]", value = "Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("em")
  public List<String> getEm() {
    return em;
  }

  @JsonProperty("em")
  public void setEm(List<String> em) {
    this.em = em;
  }

  public ConversionEventsUserDataProperties addEmItem(String emItem) {
    if (this.em == null) {
      this.em = new ArrayList<>();
    }

    this.em.add(emItem);
    return this;
  }

  public ConversionEventsUserDataProperties removeEmItem(String emItem) {
    if (emItem != null && this.em != null) {
      this.em.remove(emItem);
    }

    return this;
  }
  /**
   * Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties externalId(List<String> externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @ApiModelProperty(example = "[\"6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee\"]", value = "Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("external_id")
  public List<String> getExternalId() {
    return externalId;
  }

  @JsonProperty("external_id")
  public void setExternalId(List<String> externalId) {
    this.externalId = externalId;
  }

  public ConversionEventsUserDataProperties addExternalIdItem(String externalIdItem) {
    if (this.externalId == null) {
      this.externalId = new ArrayList<>();
    }

    this.externalId.add(externalIdItem);
    return this;
  }

  public ConversionEventsUserDataProperties removeExternalIdItem(String externalIdItem) {
    if (externalIdItem != null && this.externalId != null) {
      this.externalId.remove(externalIdItem);
    }

    return this;
  }
  /**
   * Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties fn(List<String> fn) {
    this.fn = fn;
    return this;
  }

  
  @ApiModelProperty(example = "[\"ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2\"]", value = "Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("fn")
  public List<String> getFn() {
    return fn;
  }

  @JsonProperty("fn")
  public void setFn(List<String> fn) {
    this.fn = fn;
  }

  public ConversionEventsUserDataProperties addFnItem(String fnItem) {
    if (this.fn == null) {
      this.fn = new ArrayList<>();
    }

    this.fn.add(fnItem);
    return this;
  }

  public ConversionEventsUserDataProperties removeFnItem(String fnItem) {
    if (fnItem != null && this.fn != null) {
      this.fn.remove(fnItem);
    }

    return this;
  }
  /**
   * Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties ge(List<String> ge) {
    this.ge = ge;
    return this;
  }

  
  @ApiModelProperty(example = "[\"0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf\"]", value = "Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.")
  @JsonProperty("ge")
  public List<String> getGe() {
    return ge;
  }

  @JsonProperty("ge")
  public void setGe(List<String> ge) {
    this.ge = ge;
  }

  public ConversionEventsUserDataProperties addGeItem(String geItem) {
    if (this.ge == null) {
      this.ge = new ArrayList<>();
    }

    this.ge.add(geItem);
    return this;
  }

  public ConversionEventsUserDataProperties removeGeItem(String geItem) {
    if (geItem != null && this.ge != null) {
      this.ge.remove(geItem);
    }

    return this;
  }
  /**
   * Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties hashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
    return this;
  }

  
  @ApiModelProperty(example = "[\"0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1\",\"837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46\"]", value = "Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("hashed_maids")
  public List<String> getHashedMaids() {
    return hashedMaids;
  }

  @JsonProperty("hashed_maids")
  public void setHashedMaids(List<String> hashedMaids) {
    this.hashedMaids = hashedMaids;
  }

  public ConversionEventsUserDataProperties addHashedMaidsItem(String hashedMaidsItem) {
    if (this.hashedMaids == null) {
      this.hashedMaids = new ArrayList<>();
    }

    this.hashedMaids.add(hashedMaidsItem);
    return this;
  }

  public ConversionEventsUserDataProperties removeHashedMaidsItem(String hashedMaidsItem) {
    if (hashedMaidsItem != null && this.hashedMaids != null) {
      this.hashedMaids.remove(hashedMaidsItem);
    }

    return this;
  }
  /**
   * Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties ln(List<String> ln) {
    this.ln = ln;
    return this;
  }

  
  @ApiModelProperty(example = "[\"7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19\"]", value = "Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("ln")
  public List<String> getLn() {
    return ln;
  }

  @JsonProperty("ln")
  public void setLn(List<String> ln) {
    this.ln = ln;
  }

  public ConversionEventsUserDataProperties addLnItem(String lnItem) {
    if (this.ln == null) {
      this.ln = new ArrayList<>();
    }

    this.ln.add(lnItem);
    return this;
  }

  public ConversionEventsUserDataProperties removeLnItem(String lnItem) {
    if (lnItem != null && this.ln != null) {
      this.ln.remove(lnItem);
    }

    return this;
  }
  /**
   * A unique identifier of visitors&#39; information defined by third party partners. e.g RampID
   **/
  public ConversionEventsUserDataProperties partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  
  @ApiModelProperty(example = "BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc", value = "A unique identifier of visitors' information defined by third party partners. e.g RampID")
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }

  @JsonProperty("partner_id")
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties ph(List<String> ph) {
    this.ph = ph;
    return this;
  }

  
  @ApiModelProperty(example = "[\"45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d\"]", value = "Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.")
  @JsonProperty("ph")
  public List<String> getPh() {
    return ph;
  }

  @JsonProperty("ph")
  public void setPh(List<String> ph) {
    this.ph = ph;
  }

  public ConversionEventsUserDataProperties addPhItem(String phItem) {
    if (this.ph == null) {
      this.ph = new ArrayList<>();
    }

    this.ph.add(phItem);
    return this;
  }

  public ConversionEventsUserDataProperties removePhItem(String phItem) {
    if (phItem != null && this.ph != null) {
      this.ph.remove(phItem);
    }

    return this;
  }
  /**
   * Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties st(List<String> st) {
    this.st = st;
    return this;
  }

  
  @ApiModelProperty(example = "[\"49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34\"]", value = "Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.")
  @JsonProperty("st")
  public List<String> getSt() {
    return st;
  }

  @JsonProperty("st")
  public void setSt(List<String> st) {
    this.st = st;
  }

  public ConversionEventsUserDataProperties addStItem(String stItem) {
    if (this.st == null) {
      this.st = new ArrayList<>();
    }

    this.st.add(stItem);
    return this;
  }

  public ConversionEventsUserDataProperties removeStItem(String stItem) {
    if (stItem != null && this.st != null) {
      this.st.remove(stItem);
    }

    return this;
  }
  /**
   * Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
   **/
  public ConversionEventsUserDataProperties zp(List<String> zp) {
    this.zp = zp;
    return this;
  }

  
  @ApiModelProperty(example = "[\"fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145\"]", value = "Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.")
  @JsonProperty("zp")
  public List<String> getZp() {
    return zp;
  }

  @JsonProperty("zp")
  public void setZp(List<String> zp) {
    this.zp = zp;
  }

  public ConversionEventsUserDataProperties addZpItem(String zpItem) {
    if (this.zp == null) {
      this.zp = new ArrayList<>();
    }

    this.zp.add(zpItem);
    return this;
  }

  public ConversionEventsUserDataProperties removeZpItem(String zpItem) {
    if (zpItem != null && this.zp != null) {
      this.zp.remove(zpItem);
    }

    return this;
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
    return Objects.equals(this.clickId, conversionEventsUserDataProperties.clickId) &&
        Objects.equals(this.clientIpAddress, conversionEventsUserDataProperties.clientIpAddress) &&
        Objects.equals(this.clientUserAgent, conversionEventsUserDataProperties.clientUserAgent) &&
        Objects.equals(this.country, conversionEventsUserDataProperties.country) &&
        Objects.equals(this.ct, conversionEventsUserDataProperties.ct) &&
        Objects.equals(this.db, conversionEventsUserDataProperties.db) &&
        Objects.equals(this.em, conversionEventsUserDataProperties.em) &&
        Objects.equals(this.externalId, conversionEventsUserDataProperties.externalId) &&
        Objects.equals(this.fn, conversionEventsUserDataProperties.fn) &&
        Objects.equals(this.ge, conversionEventsUserDataProperties.ge) &&
        Objects.equals(this.hashedMaids, conversionEventsUserDataProperties.hashedMaids) &&
        Objects.equals(this.ln, conversionEventsUserDataProperties.ln) &&
        Objects.equals(this.partnerId, conversionEventsUserDataProperties.partnerId) &&
        Objects.equals(this.ph, conversionEventsUserDataProperties.ph) &&
        Objects.equals(this.st, conversionEventsUserDataProperties.st) &&
        Objects.equals(this.zp, conversionEventsUserDataProperties.zp);
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

