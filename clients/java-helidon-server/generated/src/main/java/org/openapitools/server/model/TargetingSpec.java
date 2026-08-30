package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.TargetingSpecAgeBucket;
import org.openapitools.server.model.TargetingSpecAppType;
import org.openapitools.server.model.TargetingSpecGender;
import org.openapitools.server.model.TargetingSpecShoppingRetargeting;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"MINIMUM_AGE\":\"18\", \"MAXIMUM_AGE\":\"65+\"}`
 */
public class TargetingSpec   {

    private List<TargetingSpecAgeBucket> AGE_BUCKET;
    private List<TargetingSpecAppType> APPTYPE;
    private List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE;
    private List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE;
    private List<TargetingSpecGender> GENDER;
    private List<String> GEO;
    private List<String> GEO_EXCLUDE = new ArrayList<>();
    private List<String> INTEREST = new ArrayList<>();
    private List<String> LOCALE;
    private List<String> LOCATION;
    private List<String> LOCATION_EXCLUDE = new ArrayList<>();
    private String MAXIMUM_AGE;
    private String MINIMUM_AGE;
    private List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING;

    /**
    * Gets or Sets TARGETING_STRATEGY
    */
    public enum TARGETINGSTRATEGYEnum {
        CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
        FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
        RECONNECT_WITH_USERS("RECONNECT_WITH_USERS");

        private String value;

        TARGETINGSTRATEGYEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static TARGETINGSTRATEGYEnum fromValue(String text) {
            for (TARGETINGSTRATEGYEnum b : TARGETINGSTRATEGYEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY;

    /**
     * Default constructor.
     */
    public TargetingSpec() {
    // JSON-B / Jackson
    }

    /**
     * Create TargetingSpec.
     *
     * @param AGE_BUCKET **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
     * @param APPTYPE Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
     * @param AUDIENCE_EXCLUDE Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
     * @param AUDIENCE_INCLUDE Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
     * @param GENDER Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
     * @param GEO Region codes or postal codes to include for targeting.&lt;br /&gt;&lt;br /&gt; Region codes represent broader geographical areas. Example: &lt;code&gt;US-CA&lt;/code&gt; is the region code for California in the United States.&lt;br /&gt;&lt;br /&gt; Postal codes represent more granular, specific areas. Example: &lt;code&gt;94103&lt;/code&gt; is a postal code for a specifc area in San Francisco, California, U.S.A.&lt;br /&gt;&lt;br /&gt; For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like &lt;code&gt;US-CA&lt;/code&gt; or a more granular postal code within that regon, such as &lt;code&gt;94103&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt; You can specify multiple region codes or postal codes in an array, depending on which method you choose.&lt;br /&gt;&lt;br /&gt; Precede a region code array with the &lt;code&gt;region_codes&lt;/code&gt; key and a postal code value with the &lt;code&gt;postal_codes&lt;/code&gt; key. Examples:&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;geo\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;region_codes\&quot;: [\&quot;US-CA\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;geo\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;postal_codes\&quot;: [\&quot;94103\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; For each ad group, specify at least one &lt;code&gt;GEO&lt;/code&gt; or &lt;code&gt;LOCATION&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt; If you do not specifiy a &lt;code&gt;GEO&lt;/code&gt; code, only &lt;code&gt;LOCATION&lt;/code&gt; values will be targeted (See &lt;code&gt;LOCATION&lt;/code&gt; parameter in this targeting spec.).&lt;br /&gt;&lt;br /&gt; Learn how to &lt;a href&#x3D;\&quot;/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\&quot; target&#x3D;\&quot;_blank\&quot;&gt;get a current, complete list of codes&lt;/a&gt;.
     * @param GEO_EXCLUDE Region codes or postal codes to exclude from the targeting inclusion area.&lt;br /&gt;&lt;br /&gt; See &lt;code&gt;GEO&lt;/code&gt; parameter in this targeting spec for rules, syntax, and other information.&lt;br /&gt;
     * @param INTEREST Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
     * @param LOCALE 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
     * @param LOCATION Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.&lt;br /&gt;&lt;br /&gt; Precede country code values with the &lt;code&gt;country_codes&lt;/code&gt; key and metro code values with &lt;code&gt;metro_codes&lt;/code&gt; key. Example:&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;location\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;country_codes\&quot;: [\&quot;US\&quot;, \&quot;CA\&quot;],&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;metro_codes\&quot;: [\&quot;501\&quot;, \&quot;602\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; For each ad group, specify at least one &lt;code&gt;GEO&lt;/code&gt; or &lt;code&gt;LOCATION&lt;/code&gt; code. &lt;br /&gt;&lt;br /&gt; If you do not specify a &lt;code&gt;LOCATION&lt;/code&gt; code, only &lt;code&gt;GEO&lt;/code&gt; values will be targeted (See &lt;code&gt;GEO&lt;/code&gt; parameter in this targeting spec.).&lt;br /&gt;&lt;br /&gt; Learn how to &lt;a href&#x3D;\&quot;/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\&quot; target&#x3D;\&quot;_blank\&quot;&gt;get a current, complete list of codes&lt;/a&gt;.
     * @param LOCATION_EXCLUDE Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.&lt;br /&gt;&lt;br /&gt; See &lt;code&gt;LOCATION&lt;/code&gt; parameter in this targeting spec for rules, syntax, and other information.
     * @param MAXIMUM_AGE Maximum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;, \&quot;65+\&quot;. Must be used together with &#x60;MINIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.
     * @param MINIMUM_AGE Minimum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;. Note: 65+ is not allowed for minimum age. Must be used together with &#x60;MAXIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.
     * @param SHOPPING_RETARGETING Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
     * @param TARGETING_STRATEGY TARGETING_STRATEGY
     */
    public TargetingSpec(
        List<TargetingSpecAgeBucket> AGE_BUCKET, 
        List<TargetingSpecAppType> APPTYPE, 
        List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE, 
        List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE, 
        List<TargetingSpecGender> GENDER, 
        List<String> GEO, 
        List<String> GEO_EXCLUDE, 
        List<String> INTEREST, 
        List<String> LOCALE, 
        List<String> LOCATION, 
        List<String> LOCATION_EXCLUDE, 
        String MAXIMUM_AGE, 
        String MINIMUM_AGE, 
        List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING, 
        List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY
    ) {
        this.AGE_BUCKET = AGE_BUCKET;
        this.APPTYPE = APPTYPE;
        this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
        this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
        this.GENDER = GENDER;
        this.GEO = GEO;
        this.GEO_EXCLUDE = GEO_EXCLUDE;
        this.INTEREST = INTEREST;
        this.LOCALE = LOCALE;
        this.LOCATION = LOCATION;
        this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
        this.MAXIMUM_AGE = MAXIMUM_AGE;
        this.MINIMUM_AGE = MINIMUM_AGE;
        this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
        this.TARGETING_STRATEGY = TARGETING_STRATEGY;
    }



    /**
     * **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
     * @return AGE_BUCKET
     */
    public List<TargetingSpecAgeBucket> getAGEBUCKET() {
        return AGE_BUCKET;
    }

    public void setAGEBUCKET(List<TargetingSpecAgeBucket> AGE_BUCKET) {
        this.AGE_BUCKET = AGE_BUCKET;
    }

    /**
     * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
     * @return APPTYPE
     */
    public List<TargetingSpecAppType> getAPPTYPE() {
        return APPTYPE;
    }

    public void setAPPTYPE(List<TargetingSpecAppType> APPTYPE) {
        this.APPTYPE = APPTYPE;
    }

    /**
     * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
     * @return AUDIENCE_EXCLUDE
     */
    public List<@Pattern(regexp = "^\\d+$")String> getAUDIENCEEXCLUDE() {
        return AUDIENCE_EXCLUDE;
    }

    public void setAUDIENCEEXCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE) {
        this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
    }

    /**
     * Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
     * @return AUDIENCE_INCLUDE
     */
    public List<@Pattern(regexp = "^\\d+$")String> getAUDIENCEINCLUDE() {
        return AUDIENCE_INCLUDE;
    }

    public void setAUDIENCEINCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE) {
        this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
    }

    /**
     * Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
     * @return GENDER
     */
    public List<TargetingSpecGender> getGENDER() {
        return GENDER;
    }

    public void setGENDER(List<TargetingSpecGender> GENDER) {
        this.GENDER = GENDER;
    }

    /**
     * Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
     * @return GEO
     */
    public List<String> getGEO() {
        return GEO;
    }

    public void setGEO(List<String> GEO) {
        this.GEO = GEO;
    }

    /**
     * Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br />
     * @return GEO_EXCLUDE
     */
    public List<String> getGEOEXCLUDE() {
        return GEO_EXCLUDE;
    }

    public void setGEOEXCLUDE(List<String> GEO_EXCLUDE) {
        this.GEO_EXCLUDE = GEO_EXCLUDE;
    }

    /**
     * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
     * @return INTEREST
     */
    public List<String> getINTEREST() {
        return INTEREST;
    }

    public void setINTEREST(List<String> INTEREST) {
        this.INTEREST = INTEREST;
    }

    /**
     * 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
     * @return LOCALE
     */
    public List<String> getLOCALE() {
        return LOCALE;
    }

    public void setLOCALE(List<String> LOCALE) {
        this.LOCALE = LOCALE;
    }

    /**
     * Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
     * @return LOCATION
     */
    public List<String> getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(List<String> LOCATION) {
        this.LOCATION = LOCATION;
    }

    /**
     * Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information.
     * @return LOCATION_EXCLUDE
     */
    public List<String> getLOCATIONEXCLUDE() {
        return LOCATION_EXCLUDE;
    }

    public void setLOCATIONEXCLUDE(List<String> LOCATION_EXCLUDE) {
        this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
    }

    /**
     * Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
     * @return MAXIMUM_AGE
     */
    public String getMAXIMUMAGE() {
        return MAXIMUM_AGE;
    }

    public void setMAXIMUMAGE(String MAXIMUM_AGE) {
        this.MAXIMUM_AGE = MAXIMUM_AGE;
    }

    /**
     * Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
     * @return MINIMUM_AGE
     */
    public String getMINIMUMAGE() {
        return MINIMUM_AGE;
    }

    public void setMINIMUMAGE(String MINIMUM_AGE) {
        this.MINIMUM_AGE = MINIMUM_AGE;
    }

    /**
     * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
     * @return SHOPPING_RETARGETING
     */
    public List<@Valid TargetingSpecShoppingRetargeting> getSHOPPINGRETARGETING() {
        return SHOPPING_RETARGETING;
    }

    public void setSHOPPINGRETARGETING(List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING) {
        this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
    }

    /**
     * Get TARGETING_STRATEGY
     * @return TARGETING_STRATEGY
     */
    public List<TARGETINGSTRATEGYEnum> getTARGETINGSTRATEGY() {
        return TARGETING_STRATEGY;
    }

    public void setTARGETINGSTRATEGY(List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
        this.TARGETING_STRATEGY = TARGETING_STRATEGY;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetingSpec {\n");
        
        sb.append("    AGE_BUCKET: ").append(toIndentedString(AGE_BUCKET)).append("\n");
        sb.append("    APPTYPE: ").append(toIndentedString(APPTYPE)).append("\n");
        sb.append("    AUDIENCE_EXCLUDE: ").append(toIndentedString(AUDIENCE_EXCLUDE)).append("\n");
        sb.append("    AUDIENCE_INCLUDE: ").append(toIndentedString(AUDIENCE_INCLUDE)).append("\n");
        sb.append("    GENDER: ").append(toIndentedString(GENDER)).append("\n");
        sb.append("    GEO: ").append(toIndentedString(GEO)).append("\n");
        sb.append("    GEO_EXCLUDE: ").append(toIndentedString(GEO_EXCLUDE)).append("\n");
        sb.append("    INTEREST: ").append(toIndentedString(INTEREST)).append("\n");
        sb.append("    LOCALE: ").append(toIndentedString(LOCALE)).append("\n");
        sb.append("    LOCATION: ").append(toIndentedString(LOCATION)).append("\n");
        sb.append("    LOCATION_EXCLUDE: ").append(toIndentedString(LOCATION_EXCLUDE)).append("\n");
        sb.append("    MAXIMUM_AGE: ").append(toIndentedString(MAXIMUM_AGE)).append("\n");
        sb.append("    MINIMUM_AGE: ").append(toIndentedString(MINIMUM_AGE)).append("\n");
        sb.append("    SHOPPING_RETARGETING: ").append(toIndentedString(SHOPPING_RETARGETING)).append("\n");
        sb.append("    TARGETING_STRATEGY: ").append(toIndentedString(TARGETING_STRATEGY)).append("\n");
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

