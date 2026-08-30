package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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

    /**
     * Default constructor.
     */
    public ConversionEventsUserDataProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionEventsUserDataProperties.
     *
     * @param clickId The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
     * @param clientIpAddress The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
     * @param clientUserAgent The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
     * @param country Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format.
     * @param ct Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
     * @param db Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
     * @param em Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @param externalId Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @param fn Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @param ge Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format.
     * @param hashedMaids Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @param ln Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @param partnerId A unique identifier of visitors&#39; information defined by third party partners. e.g RampID
     * @param ph Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @param st Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
     * @param zp Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
     */
    public ConversionEventsUserDataProperties(
        String clickId, 
        String clientIpAddress, 
        String clientUserAgent, 
        List<String> country, 
        List<String> ct, 
        List<String> db, 
        List<String> em, 
        List<String> externalId, 
        List<String> fn, 
        List<String> ge, 
        List<String> hashedMaids, 
        List<String> ln, 
        String partnerId, 
        List<String> ph, 
        List<String> st, 
        List<String> zp
    ) {
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



    /**
     * The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
     * @return clickId
     */
    public String getClickId() {
        return clickId;
    }

    public void setClickId(String clickId) {
        this.clickId = clickId;
    }

    /**
     * The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
     * @return clientIpAddress
     */
    public String getClientIpAddress() {
        return clientIpAddress;
    }

    public void setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
    }

    /**
     * The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
     * @return clientUserAgent
     */
    public String getClientUserAgent() {
        return clientUserAgent;
    }

    public void setClientUserAgent(String clientUserAgent) {
        this.clientUserAgent = clientUserAgent;
    }

    /**
     * Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
     * @return country
     */
    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }

    /**
     * Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
     * @return ct
     */
    public List<String> getCt() {
        return ct;
    }

    public void setCt(List<String> ct) {
        this.ct = ct;
    }

    /**
     * Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
     * @return db
     */
    public List<String> getDb() {
        return db;
    }

    public void setDb(List<String> db) {
        this.db = db;
    }

    /**
     * Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @return em
     */
    public List<String> getEm() {
        return em;
    }

    public void setEm(List<String> em) {
        this.em = em;
    }

    /**
     * Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @return externalId
     */
    public List<String> getExternalId() {
        return externalId;
    }

    public void setExternalId(List<String> externalId) {
        this.externalId = externalId;
    }

    /**
     * Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @return fn
     */
    public List<String> getFn() {
        return fn;
    }

    public void setFn(List<String> fn) {
        this.fn = fn;
    }

    /**
     * Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
     * @return ge
     */
    public List<String> getGe() {
        return ge;
    }

    public void setGe(List<String> ge) {
        this.ge = ge;
    }

    /**
     * Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @return hashedMaids
     */
    public List<String> getHashedMaids() {
        return hashedMaids;
    }

    public void setHashedMaids(List<String> hashedMaids) {
        this.hashedMaids = hashedMaids;
    }

    /**
     * Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @return ln
     */
    public List<String> getLn() {
        return ln;
    }

    public void setLn(List<String> ln) {
        this.ln = ln;
    }

    /**
     * A unique identifier of visitors' information defined by third party partners. e.g RampID
     * @return partnerId
     */
    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     * @return ph
     */
    public List<String> getPh() {
        return ph;
    }

    public void setPh(List<String> ph) {
        this.ph = ph;
    }

    /**
     * Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
     * @return st
     */
    public List<String> getSt() {
        return st;
    }

    public void setSt(List<String> st) {
        this.st = st;
    }

    /**
     * Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
     * @return zp
     */
    public List<String> getZp() {
        return zp;
    }

    public void setZp(List<String> zp) {
        this.zp = zp;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

