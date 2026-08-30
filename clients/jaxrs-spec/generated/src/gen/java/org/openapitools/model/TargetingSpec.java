package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TargetingSpecAgeBucket;
import org.openapitools.model.TargetingSpecAppType;
import org.openapitools.model.TargetingSpecGender;
import org.openapitools.model.TargetingSpecShoppingRetargeting;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;MINIMUM_AGE\&quot;:\&quot;18\&quot;, \&quot;MAXIMUM_AGE\&quot;:\&quot;65+\&quot;}&#x60;
 **/
@ApiModel(description = "Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"MINIMUM_AGE\":\"18\", \"MAXIMUM_AGE\":\"65+\"}`")
@JsonTypeName("TargetingSpec")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingSpec   {
  private @Valid List<TargetingSpecAgeBucket> AGE_BUCKET;
  private @Valid List<TargetingSpecAppType> APPTYPE;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE;
  private @Valid List<TargetingSpecGender> GENDER;
  private @Valid List<String> GEO;
  private @Valid List<String> GEO_EXCLUDE = new ArrayList<>();
  private @Valid List<String> INTEREST = new ArrayList<>();
  private @Valid List<String> LOCALE;
  private @Valid List<String> LOCATION;
  private @Valid List<String> LOCATION_EXCLUDE = new ArrayList<>();
  private String MAXIMUM_AGE;
  private String MINIMUM_AGE;
  private @Valid List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING;
  public enum TARGETINGSTRATEGYEnum {

    CHOOSE_YOUR_OWN(String.valueOf("CHOOSE_YOUR_OWN")), FIND_NEW_CUSTOMERS(String.valueOf("FIND_NEW_CUSTOMERS")), RECONNECT_WITH_USERS(String.valueOf("RECONNECT_WITH_USERS"));


    private String value;

    TARGETINGSTRATEGYEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TARGETINGSTRATEGYEnum fromString(String s) {
        for (TARGETINGSTRATEGYEnum b : TARGETINGSTRATEGYEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static TARGETINGSTRATEGYEnum fromValue(String value) {
        for (TARGETINGSTRATEGYEnum b : TARGETINGSTRATEGYEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY;

  public TargetingSpec() {
  }

  /**
   * **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
   **/
  public TargetingSpec AGE_BUCKET(List<TargetingSpecAgeBucket> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
    return this;
  }

  
  @ApiModelProperty(example = "[\"35-44\",\"50-54\"]", value = "**Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.")
  @JsonProperty("AGE_BUCKET")
  public List<TargetingSpecAgeBucket> getAGEBUCKET() {
    return AGE_BUCKET;
  }

  @JsonProperty("AGE_BUCKET")
  public void setAGEBUCKET(List<TargetingSpecAgeBucket> AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  public TargetingSpec addAGEBUCKETItem(TargetingSpecAgeBucket AGE_BUCKETItem) {
    if (this.AGE_BUCKET == null) {
      this.AGE_BUCKET = new ArrayList<>();
    }

    this.AGE_BUCKET.add(AGE_BUCKETItem);
    return this;
  }

  public TargetingSpec removeAGEBUCKETItem(TargetingSpecAgeBucket AGE_BUCKETItem) {
    if (AGE_BUCKETItem != null && this.AGE_BUCKET != null) {
      this.AGE_BUCKET.remove(AGE_BUCKETItem);
    }

    return this;
  }
  /**
   * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
   **/
  public TargetingSpec APPTYPE(List<TargetingSpecAppType> APPTYPE) {
    this.APPTYPE = APPTYPE;
    return this;
  }

  
  @ApiModelProperty(example = "[\"ipad\",\"iphone\"]", value = "Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.")
  @JsonProperty("APPTYPE")
  public List<TargetingSpecAppType> getAPPTYPE() {
    return APPTYPE;
  }

  @JsonProperty("APPTYPE")
  public void setAPPTYPE(List<TargetingSpecAppType> APPTYPE) {
    this.APPTYPE = APPTYPE;
  }

  public TargetingSpec addAPPTYPEItem(TargetingSpecAppType APPTYPEItem) {
    if (this.APPTYPE == null) {
      this.APPTYPE = new ArrayList<>();
    }

    this.APPTYPE.add(APPTYPEItem);
    return this;
  }

  public TargetingSpec removeAPPTYPEItem(TargetingSpecAppType APPTYPEItem) {
    if (APPTYPEItem != null && this.APPTYPE != null) {
      this.APPTYPE.remove(APPTYPEItem);
    }

    return this;
  }
  /**
   * Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
   **/
  public TargetingSpec AUDIENCE_EXCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.")
  @JsonProperty("AUDIENCE_EXCLUDE")
  public List< @Pattern(regexp="^\\d+$")String> getAUDIENCEEXCLUDE() {
    return AUDIENCE_EXCLUDE;
  }

  @JsonProperty("AUDIENCE_EXCLUDE")
  public void setAUDIENCEEXCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_EXCLUDE) {
    this.AUDIENCE_EXCLUDE = AUDIENCE_EXCLUDE;
  }

  public TargetingSpec addAUDIENCEEXCLUDEItem(String AUDIENCE_EXCLUDEItem) {
    if (this.AUDIENCE_EXCLUDE == null) {
      this.AUDIENCE_EXCLUDE = new ArrayList<>();
    }

    this.AUDIENCE_EXCLUDE.add(AUDIENCE_EXCLUDEItem);
    return this;
  }

  public TargetingSpec removeAUDIENCEEXCLUDEItem(String AUDIENCE_EXCLUDEItem) {
    if (AUDIENCE_EXCLUDEItem != null && this.AUDIENCE_EXCLUDE != null) {
      this.AUDIENCE_EXCLUDE.remove(AUDIENCE_EXCLUDEItem);
    }

    return this;
  }
  /**
   * Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
   **/
  public TargetingSpec AUDIENCE_INCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE) {
    this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.")
  @JsonProperty("AUDIENCE_INCLUDE")
  public List< @Pattern(regexp="^\\d+$")String> getAUDIENCEINCLUDE() {
    return AUDIENCE_INCLUDE;
  }

  @JsonProperty("AUDIENCE_INCLUDE")
  public void setAUDIENCEINCLUDE(List<@Pattern(regexp = "^\\d+$")String> AUDIENCE_INCLUDE) {
    this.AUDIENCE_INCLUDE = AUDIENCE_INCLUDE;
  }

  public TargetingSpec addAUDIENCEINCLUDEItem(String AUDIENCE_INCLUDEItem) {
    if (this.AUDIENCE_INCLUDE == null) {
      this.AUDIENCE_INCLUDE = new ArrayList<>();
    }

    this.AUDIENCE_INCLUDE.add(AUDIENCE_INCLUDEItem);
    return this;
  }

  public TargetingSpec removeAUDIENCEINCLUDEItem(String AUDIENCE_INCLUDEItem) {
    if (AUDIENCE_INCLUDEItem != null && this.AUDIENCE_INCLUDE != null) {
      this.AUDIENCE_INCLUDE.remove(AUDIENCE_INCLUDEItem);
    }

    return this;
  }
  /**
   * Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
   **/
  public TargetingSpec GENDER(List<TargetingSpecGender> GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.")
  @JsonProperty("GENDER")
  public List<TargetingSpecGender> getGENDER() {
    return GENDER;
  }

  @JsonProperty("GENDER")
  public void setGENDER(List<TargetingSpecGender> GENDER) {
    this.GENDER = GENDER;
  }

  public TargetingSpec addGENDERItem(TargetingSpecGender GENDERItem) {
    if (this.GENDER == null) {
      this.GENDER = new ArrayList<>();
    }

    this.GENDER.add(GENDERItem);
    return this;
  }

  public TargetingSpec removeGENDERItem(TargetingSpecGender GENDERItem) {
    if (GENDERItem != null && this.GENDER != null) {
      this.GENDER.remove(GENDERItem);
    }

    return this;
  }
  /**
   * Region codes or postal codes to include for targeting.&lt;br /&gt;&lt;br /&gt; Region codes represent broader geographical areas. Example: &lt;code&gt;US-CA&lt;/code&gt; is the region code for California in the United States.&lt;br /&gt;&lt;br /&gt; Postal codes represent more granular, specific areas. Example: &lt;code&gt;94103&lt;/code&gt; is a postal code for a specifc area in San Francisco, California, U.S.A.&lt;br /&gt;&lt;br /&gt; For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like &lt;code&gt;US-CA&lt;/code&gt; or a more granular postal code within that regon, such as &lt;code&gt;94103&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt; You can specify multiple region codes or postal codes in an array, depending on which method you choose.&lt;br /&gt;&lt;br /&gt; Precede a region code array with the &lt;code&gt;region_codes&lt;/code&gt; key and a postal code value with the &lt;code&gt;postal_codes&lt;/code&gt; key. Examples:&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;geo\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;region_codes\&quot;: [\&quot;US-CA\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;geo\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;postal_codes\&quot;: [\&quot;94103\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; For each ad group, specify at least one &lt;code&gt;GEO&lt;/code&gt; or &lt;code&gt;LOCATION&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt; If you do not specifiy a &lt;code&gt;GEO&lt;/code&gt; code, only &lt;code&gt;LOCATION&lt;/code&gt; values will be targeted (See &lt;code&gt;LOCATION&lt;/code&gt; parameter in this targeting spec.).&lt;br /&gt;&lt;br /&gt; Learn how to &lt;a href&#x3D;\&quot;/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\&quot; target&#x3D;\&quot;_blank\&quot;&gt;get a current, complete list of codes&lt;/a&gt;.
   **/
  public TargetingSpec GEO(List<String> GEO) {
    this.GEO = GEO;
    return this;
  }

  
  @ApiModelProperty(value = "Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.")
  @JsonProperty("GEO")
  public List<String> getGEO() {
    return GEO;
  }

  @JsonProperty("GEO")
  public void setGEO(List<String> GEO) {
    this.GEO = GEO;
  }

  public TargetingSpec addGEOItem(String GEOItem) {
    if (this.GEO == null) {
      this.GEO = new ArrayList<>();
    }

    this.GEO.add(GEOItem);
    return this;
  }

  public TargetingSpec removeGEOItem(String GEOItem) {
    if (GEOItem != null && this.GEO != null) {
      this.GEO.remove(GEOItem);
    }

    return this;
  }
  /**
   * Region codes or postal codes to exclude from the targeting inclusion area.&lt;br /&gt;&lt;br /&gt; See &lt;code&gt;GEO&lt;/code&gt; parameter in this targeting spec for rules, syntax, and other information.&lt;br /&gt;
   **/
  public TargetingSpec GEO_EXCLUDE(List<String> GEO_EXCLUDE) {
    this.GEO_EXCLUDE = GEO_EXCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br />")
  @JsonProperty("GEO_EXCLUDE")
  public List<String> getGEOEXCLUDE() {
    return GEO_EXCLUDE;
  }

  @JsonProperty("GEO_EXCLUDE")
  public void setGEOEXCLUDE(List<String> GEO_EXCLUDE) {
    this.GEO_EXCLUDE = GEO_EXCLUDE;
  }

  public TargetingSpec addGEOEXCLUDEItem(String GEO_EXCLUDEItem) {
    if (this.GEO_EXCLUDE == null) {
      this.GEO_EXCLUDE = new ArrayList<>();
    }

    this.GEO_EXCLUDE.add(GEO_EXCLUDEItem);
    return this;
  }

  public TargetingSpec removeGEOEXCLUDEItem(String GEO_EXCLUDEItem) {
    if (GEO_EXCLUDEItem != null && this.GEO_EXCLUDE != null) {
      this.GEO_EXCLUDE.remove(GEO_EXCLUDEItem);
    }

    return this;
  }
  /**
   * Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
   **/
  public TargetingSpec INTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
    return this;
  }

  
  @ApiModelProperty(value = "Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.")
  @JsonProperty("INTEREST")
  public List<String> getINTEREST() {
    return INTEREST;
  }

  @JsonProperty("INTEREST")
  public void setINTEREST(List<String> INTEREST) {
    this.INTEREST = INTEREST;
  }

  public TargetingSpec addINTERESTItem(String INTERESTItem) {
    if (this.INTEREST == null) {
      this.INTEREST = new ArrayList<>();
    }

    this.INTEREST.add(INTERESTItem);
    return this;
  }

  public TargetingSpec removeINTERESTItem(String INTERESTItem) {
    if (INTERESTItem != null && this.INTEREST != null) {
      this.INTEREST.remove(INTERESTItem);
    }

    return this;
  }
  /**
   * 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
   **/
  public TargetingSpec LOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
    return this;
  }

  
  @ApiModelProperty(value = "24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.")
  @JsonProperty("LOCALE")
  public List<String> getLOCALE() {
    return LOCALE;
  }

  @JsonProperty("LOCALE")
  public void setLOCALE(List<String> LOCALE) {
    this.LOCALE = LOCALE;
  }

  public TargetingSpec addLOCALEItem(String LOCALEItem) {
    if (this.LOCALE == null) {
      this.LOCALE = new ArrayList<>();
    }

    this.LOCALE.add(LOCALEItem);
    return this;
  }

  public TargetingSpec removeLOCALEItem(String LOCALEItem) {
    if (LOCALEItem != null && this.LOCALE != null) {
      this.LOCALE.remove(LOCALEItem);
    }

    return this;
  }
  /**
   * Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.&lt;br /&gt;&lt;br /&gt; Precede country code values with the &lt;code&gt;country_codes&lt;/code&gt; key and metro code values with &lt;code&gt;metro_codes&lt;/code&gt; key. Example:&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;location\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;country_codes\&quot;: [\&quot;US\&quot;, \&quot;CA\&quot;],&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;metro_codes\&quot;: [\&quot;501\&quot;, \&quot;602\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; For each ad group, specify at least one &lt;code&gt;GEO&lt;/code&gt; or &lt;code&gt;LOCATION&lt;/code&gt; code. &lt;br /&gt;&lt;br /&gt; If you do not specify a &lt;code&gt;LOCATION&lt;/code&gt; code, only &lt;code&gt;GEO&lt;/code&gt; values will be targeted (See &lt;code&gt;GEO&lt;/code&gt; parameter in this targeting spec.).&lt;br /&gt;&lt;br /&gt; Learn how to &lt;a href&#x3D;\&quot;/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\&quot; target&#x3D;\&quot;_blank\&quot;&gt;get a current, complete list of codes&lt;/a&gt;.
   **/
  public TargetingSpec LOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }

  
  @ApiModelProperty(value = "Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.")
  @JsonProperty("LOCATION")
  public List<String> getLOCATION() {
    return LOCATION;
  }

  @JsonProperty("LOCATION")
  public void setLOCATION(List<String> LOCATION) {
    this.LOCATION = LOCATION;
  }

  public TargetingSpec addLOCATIONItem(String LOCATIONItem) {
    if (this.LOCATION == null) {
      this.LOCATION = new ArrayList<>();
    }

    this.LOCATION.add(LOCATIONItem);
    return this;
  }

  public TargetingSpec removeLOCATIONItem(String LOCATIONItem) {
    if (LOCATIONItem != null && this.LOCATION != null) {
      this.LOCATION.remove(LOCATIONItem);
    }

    return this;
  }
  /**
   * Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.&lt;br /&gt;&lt;br /&gt; See &lt;code&gt;LOCATION&lt;/code&gt; parameter in this targeting spec for rules, syntax, and other information.
   **/
  public TargetingSpec LOCATION_EXCLUDE(List<String> LOCATION_EXCLUDE) {
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
    return this;
  }

  
  @ApiModelProperty(value = "Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information.")
  @JsonProperty("LOCATION_EXCLUDE")
  public List<String> getLOCATIONEXCLUDE() {
    return LOCATION_EXCLUDE;
  }

  @JsonProperty("LOCATION_EXCLUDE")
  public void setLOCATIONEXCLUDE(List<String> LOCATION_EXCLUDE) {
    this.LOCATION_EXCLUDE = LOCATION_EXCLUDE;
  }

  public TargetingSpec addLOCATIONEXCLUDEItem(String LOCATION_EXCLUDEItem) {
    if (this.LOCATION_EXCLUDE == null) {
      this.LOCATION_EXCLUDE = new ArrayList<>();
    }

    this.LOCATION_EXCLUDE.add(LOCATION_EXCLUDEItem);
    return this;
  }

  public TargetingSpec removeLOCATIONEXCLUDEItem(String LOCATION_EXCLUDEItem) {
    if (LOCATION_EXCLUDEItem != null && this.LOCATION_EXCLUDE != null) {
      this.LOCATION_EXCLUDE.remove(LOCATION_EXCLUDEItem);
    }

    return this;
  }
  /**
   * Maximum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;, \&quot;65+\&quot;. Must be used together with &#x60;MINIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.
   **/
  public TargetingSpec MAXIMUM_AGE(String MAXIMUM_AGE) {
    this.MAXIMUM_AGE = MAXIMUM_AGE;
    return this;
  }

  
  @ApiModelProperty(example = "65+", value = "Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.")
  @JsonProperty("MAXIMUM_AGE")
   @Pattern(regexp="^\\d+\\+?$")public String getMAXIMUMAGE() {
    return MAXIMUM_AGE;
  }

  @JsonProperty("MAXIMUM_AGE")
  public void setMAXIMUMAGE(String MAXIMUM_AGE) {
    this.MAXIMUM_AGE = MAXIMUM_AGE;
  }

  /**
   * Minimum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;. Note: 65+ is not allowed for minimum age. Must be used together with &#x60;MAXIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.
   **/
  public TargetingSpec MINIMUM_AGE(String MINIMUM_AGE) {
    this.MINIMUM_AGE = MINIMUM_AGE;
    return this;
  }

  
  @ApiModelProperty(example = "18", value = "Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.")
  @JsonProperty("MINIMUM_AGE")
   @Pattern(regexp="^\\d+$")public String getMINIMUMAGE() {
    return MINIMUM_AGE;
  }

  @JsonProperty("MINIMUM_AGE")
  public void setMINIMUMAGE(String MINIMUM_AGE) {
    this.MINIMUM_AGE = MINIMUM_AGE;
  }

  /**
   * Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
   **/
  public TargetingSpec SHOPPING_RETARGETING(List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
    return this;
  }

  
  @ApiModelProperty(value = "Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting")
  @JsonProperty("SHOPPING_RETARGETING")
  @Valid public List<@Valid TargetingSpecShoppingRetargeting> getSHOPPINGRETARGETING() {
    return SHOPPING_RETARGETING;
  }

  @JsonProperty("SHOPPING_RETARGETING")
  public void setSHOPPINGRETARGETING(List<@Valid TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING) {
    this.SHOPPING_RETARGETING = SHOPPING_RETARGETING;
  }

  public TargetingSpec addSHOPPINGRETARGETINGItem(TargetingSpecShoppingRetargeting SHOPPING_RETARGETINGItem) {
    if (this.SHOPPING_RETARGETING == null) {
      this.SHOPPING_RETARGETING = new ArrayList<>();
    }

    this.SHOPPING_RETARGETING.add(SHOPPING_RETARGETINGItem);
    return this;
  }

  public TargetingSpec removeSHOPPINGRETARGETINGItem(TargetingSpecShoppingRetargeting SHOPPING_RETARGETINGItem) {
    if (SHOPPING_RETARGETINGItem != null && this.SHOPPING_RETARGETING != null) {
      this.SHOPPING_RETARGETING.remove(SHOPPING_RETARGETINGItem);
    }

    return this;
  }
  /**
   **/
  public TargetingSpec TARGETING_STRATEGY(List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("TARGETING_STRATEGY")
  public List<TARGETINGSTRATEGYEnum> getTARGETINGSTRATEGY() {
    return TARGETING_STRATEGY;
  }

  @JsonProperty("TARGETING_STRATEGY")
  public void setTARGETINGSTRATEGY(List<TARGETINGSTRATEGYEnum> TARGETING_STRATEGY) {
    this.TARGETING_STRATEGY = TARGETING_STRATEGY;
  }

  public TargetingSpec addTARGETINGSTRATEGYItem(TARGETINGSTRATEGYEnum TARGETING_STRATEGYItem) {
    if (this.TARGETING_STRATEGY == null) {
      this.TARGETING_STRATEGY = new ArrayList<>();
    }

    this.TARGETING_STRATEGY.add(TARGETING_STRATEGYItem);
    return this;
  }

  public TargetingSpec removeTARGETINGSTRATEGYItem(TARGETINGSTRATEGYEnum TARGETING_STRATEGYItem) {
    if (TARGETING_STRATEGYItem != null && this.TARGETING_STRATEGY != null) {
      this.TARGETING_STRATEGY.remove(TARGETING_STRATEGYItem);
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
    TargetingSpec targetingSpec = (TargetingSpec) o;
    return Objects.equals(this.AGE_BUCKET, targetingSpec.AGE_BUCKET) &&
        Objects.equals(this.APPTYPE, targetingSpec.APPTYPE) &&
        Objects.equals(this.AUDIENCE_EXCLUDE, targetingSpec.AUDIENCE_EXCLUDE) &&
        Objects.equals(this.AUDIENCE_INCLUDE, targetingSpec.AUDIENCE_INCLUDE) &&
        Objects.equals(this.GENDER, targetingSpec.GENDER) &&
        Objects.equals(this.GEO, targetingSpec.GEO) &&
        Objects.equals(this.GEO_EXCLUDE, targetingSpec.GEO_EXCLUDE) &&
        Objects.equals(this.INTEREST, targetingSpec.INTEREST) &&
        Objects.equals(this.LOCALE, targetingSpec.LOCALE) &&
        Objects.equals(this.LOCATION, targetingSpec.LOCATION) &&
        Objects.equals(this.LOCATION_EXCLUDE, targetingSpec.LOCATION_EXCLUDE) &&
        Objects.equals(this.MAXIMUM_AGE, targetingSpec.MAXIMUM_AGE) &&
        Objects.equals(this.MINIMUM_AGE, targetingSpec.MINIMUM_AGE) &&
        Objects.equals(this.SHOPPING_RETARGETING, targetingSpec.SHOPPING_RETARGETING) &&
        Objects.equals(this.TARGETING_STRATEGY, targetingSpec.TARGETING_STRATEGY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AGE_BUCKET, APPTYPE, AUDIENCE_EXCLUDE, AUDIENCE_INCLUDE, GENDER, GEO, GEO_EXCLUDE, INTEREST, LOCALE, LOCATION, LOCATION_EXCLUDE, MAXIMUM_AGE, MINIMUM_AGE, SHOPPING_RETARGETING, TARGETING_STRATEGY);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
