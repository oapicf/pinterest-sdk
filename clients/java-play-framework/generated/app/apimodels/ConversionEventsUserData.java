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
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  public ConversionEventsUserData ph(List<String> ph) {
    this.ph = ph;
    return this;
  }

  public ConversionEventsUserData addPhItem(String phItem) {
    if (this.ph == null) {
      this.ph = new ArrayList<>();
    }
    this.ph.add(phItem);
    return this;
  }

   /**
   * Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
   * @return ph
  **/
  public List<String> getPh() {
    return ph;
  }

  public void setPh(List<String> ph) {
    this.ph = ph;
  }

  public ConversionEventsUserData ge(List<String> ge) {
    this.ge = ge;
    return this;
  }

  public ConversionEventsUserData addGeItem(String geItem) {
    if (this.ge == null) {
      this.ge = new ArrayList<>();
    }
    this.ge.add(geItem);
    return this;
  }

   /**
   * Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender.
   * @return ge
  **/
  public List<String> getGe() {
    return ge;
  }

  public void setGe(List<String> ge) {
    this.ge = ge;
  }

  public ConversionEventsUserData db(List<String> db) {
    this.db = db;
    return this;
  }

  public ConversionEventsUserData addDbItem(String dbItem) {
    if (this.db == null) {
      this.db = new ArrayList<>();
    }
    this.db.add(dbItem);
    return this;
  }

   /**
   * Sha256 hashes of user's date of birthday, given as year, month, and day.
   * @return db
  **/
  public List<String> getDb() {
    return db;
  }

  public void setDb(List<String> db) {
    this.db = db;
  }

  public ConversionEventsUserData ln(List<String> ln) {
    this.ln = ln;
    return this;
  }

  public ConversionEventsUserData addLnItem(String lnItem) {
    if (this.ln == null) {
      this.ln = new ArrayList<>();
    }
    this.ln.add(lnItem);
    return this;
  }

   /**
   * Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
   * @return ln
  **/
  public List<String> getLn() {
    return ln;
  }

  public void setLn(List<String> ln) {
    this.ln = ln;
  }

  public ConversionEventsUserData fn(List<String> fn) {
    this.fn = fn;
    return this;
  }

  public ConversionEventsUserData addFnItem(String fnItem) {
    if (this.fn == null) {
      this.fn = new ArrayList<>();
    }
    this.fn.add(fnItem);
    return this;
  }

   /**
   * Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
   * @return fn
  **/
  public List<String> getFn() {
    return fn;
  }

  public void setFn(List<String> fn) {
    this.fn = fn;
  }

  public ConversionEventsUserData ct(List<String> ct) {
    this.ct = ct;
    return this;
  }

  public ConversionEventsUserData addCtItem(String ctItem) {
    if (this.ct == null) {
      this.ct = new ArrayList<>();
    }
    this.ct.add(ctItem);
    return this;
  }

   /**
   * Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing).
   * @return ct
  **/
  public List<String> getCt() {
    return ct;
  }

  public void setCt(List<String> ct) {
    this.ct = ct;
  }

  public ConversionEventsUserData st(List<String> st) {
    this.st = st;
    return this;
  }

  public ConversionEventsUserData addStItem(String stItem) {
    if (this.st == null) {
      this.st = new ArrayList<>();
    }
    this.st.add(stItem);
    return this;
  }

   /**
   * Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing).
   * @return st
  **/
  public List<String> getSt() {
    return st;
  }

  public void setSt(List<String> st) {
    this.st = st;
  }

  public ConversionEventsUserData zp(List<String> zp) {
    this.zp = zp;
    return this;
  }

  public ConversionEventsUserData addZpItem(String zpItem) {
    if (this.zp == null) {
      this.zp = new ArrayList<>();
    }
    this.zp.add(zpItem);
    return this;
  }

   /**
   * Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing).
   * @return zp
  **/
  public List<String> getZp() {
    return zp;
  }

  public void setZp(List<String> zp) {
    this.zp = zp;
  }

  public ConversionEventsUserData country(List<String> country) {
    this.country = country;
    return this;
  }

  public ConversionEventsUserData addCountryItem(String countryItem) {
    if (this.country == null) {
      this.country = new ArrayList<>();
    }
    this.country.add(countryItem);
    return this;
  }

   /**
   * Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase.
   * @return country
  **/
  public List<String> getCountry() {
    return country;
  }

  public void setCountry(List<String> country) {
    this.country = country;
  }

  public ConversionEventsUserData externalId(List<String> externalId) {
    this.externalId = externalId;
    return this;
  }

  public ConversionEventsUserData addExternalIdItem(String externalIdItem) {
    if (this.externalId == null) {
      this.externalId = new ArrayList<>();
    }
    this.externalId.add(externalIdItem);
    return this;
  }

   /**
   * Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA.
   * @return externalId
  **/
  public List<String> getExternalId() {
    return externalId;
  }

  public void setExternalId(List<String> externalId) {
    this.externalId = externalId;
  }

  public ConversionEventsUserData clickId(String clickId) {
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

  public ConversionEventsUserData partnerId(String partnerId) {
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
        Objects.equals(partnerId, conversionEventsUserData.partnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ph, ge, db, ln, fn, ct, st, zp, country, externalId, clickId, partnerId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

