package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConversionEventsUserDataProperties
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventsUserDataProperties {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> clickId = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String clientIpAddress;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String clientUserAgent;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> country = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> ct = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> db = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> em = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> externalId = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> fn = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> ge = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> hashedMaids = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> ln = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> partnerId = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> ph = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> st = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> zp = new ArrayList<>();

  public ConversionEventsUserDataProperties clickId(String clickId) {
    this.clickId = JsonNullable.of(clickId);
    return this;
  }

  /**
   * The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
   * @return clickId
   */
  
  @Schema(name = "click_id", example = "dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv", description = "The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click_id")
  public JsonNullable<String> getClickId() {
    return clickId;
  }

  public void setClickId(JsonNullable<String> clickId) {
    this.clickId = clickId;
  }

  public ConversionEventsUserDataProperties clientIpAddress(@Nullable String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
    return this;
  }

  /**
   * The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   * @return clientIpAddress
   */
  
  @Schema(name = "client_ip_address", example = "216.3.128.12", description = "The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client_ip_address")
  public @Nullable String getClientIpAddress() {
    return clientIpAddress;
  }

  @JsonProperty("client_ip_address")
  public void setClientIpAddress(@Nullable String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }

  public ConversionEventsUserDataProperties clientUserAgent(@Nullable String clientUserAgent) {
    this.clientUserAgent = clientUserAgent;
    return this;
  }

  /**
   * The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
   * @return clientUserAgent
   */
  
  @Schema(name = "client_user_agent", description = "The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client_user_agent")
  public @Nullable String getClientUserAgent() {
    return clientUserAgent;
  }

  @JsonProperty("client_user_agent")
  public void setClientUserAgent(@Nullable String clientUserAgent) {
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
   */
  
  @Schema(name = "country", example = "[\"9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d\"]", description = "Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public List<String> getCountry() {
    return country;
  }

  @JsonProperty("country")
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
   */
  
  @Schema(name = "ct", example = "[\"4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36\"]", description = "Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ct")
  public List<String> getCt() {
    return ct;
  }

  @JsonProperty("ct")
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
   */
  
  @Schema(name = "db", example = "[\"d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739\"]", description = "Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("db")
  public List<String> getDb() {
    return db;
  }

  @JsonProperty("db")
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
   */
  
  @Schema(name = "em", example = "[\"411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8\",\"09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969\"]", description = "Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("em")
  public List<String> getEm() {
    return em;
  }

  @JsonProperty("em")
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
   */
  
  @Schema(name = "external_id", example = "[\"6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee\"]", description = "Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_id")
  public List<String> getExternalId() {
    return externalId;
  }

  @JsonProperty("external_id")
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
   */
  
  @Schema(name = "fn", description = "Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fn")
  public List<String> getFn() {
    return fn;
  }

  @JsonProperty("fn")
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
   */
  
  @Schema(name = "ge", example = "[\"0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf\"]", description = "Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ge")
  public List<String> getGe() {
    return ge;
  }

  @JsonProperty("ge")
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
   */
  
  @Schema(name = "hashed_maids", example = "[\"0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1\",\"837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46\"]", description = "Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hashed_maids")
  public List<String> getHashedMaids() {
    return hashedMaids;
  }

  @JsonProperty("hashed_maids")
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
   */
  
  @Schema(name = "ln", example = "[\"7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19\"]", description = "Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ln")
  public List<String> getLn() {
    return ln;
  }

  @JsonProperty("ln")
  public void setLn(List<String> ln) {
    this.ln = ln;
  }

  public ConversionEventsUserDataProperties partnerId(String partnerId) {
    this.partnerId = JsonNullable.of(partnerId);
    return this;
  }

  /**
   * A unique identifier of visitors' information defined by third party partners. e.g RampID
   * @return partnerId
   */
  
  @Schema(name = "partner_id", example = "BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc", description = "A unique identifier of visitors' information defined by third party partners. e.g RampID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_id")
  public JsonNullable<String> getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(JsonNullable<String> partnerId) {
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
   */
  
  @Schema(name = "ph", example = "[\"45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d\"]", description = "Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ph")
  public List<String> getPh() {
    return ph;
  }

  @JsonProperty("ph")
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
   */
  
  @Schema(name = "st", example = "[\"49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34\"]", description = "Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("st")
  public List<String> getSt() {
    return st;
  }

  @JsonProperty("st")
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
   */
  
  @Schema(name = "zp", example = "[\"fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145\"]", description = "Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zp")
  public List<String> getZp() {
    return zp;
  }

  @JsonProperty("zp")
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
    return equalsNullable(this.clickId, conversionEventsUserDataProperties.clickId) &&
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
        equalsNullable(this.partnerId, conversionEventsUserDataProperties.partnerId) &&
        Objects.equals(this.ph, conversionEventsUserDataProperties.ph) &&
        Objects.equals(this.st, conversionEventsUserDataProperties.st) &&
        Objects.equals(this.zp, conversionEventsUserDataProperties.zp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(clickId), clientIpAddress, clientUserAgent, country, ct, db, em, externalId, fn, ge, hashedMaids, ln, hashCodeNullable(partnerId), ph, st, zp);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

