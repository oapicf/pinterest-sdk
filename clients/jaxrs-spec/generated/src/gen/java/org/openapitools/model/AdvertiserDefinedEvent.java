package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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



@JsonTypeName("AdvertiserDefinedEvent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdvertiserDefinedEvent   {
  private String name;
  public enum MappedConversionTypeEnum {

    PAGE_LOAD(String.valueOf("PAGE_LOAD")), UNKNOWN(String.valueOf("UNKNOWN")), INITIALIZED(String.valueOf("INITIALIZED")), PAGE_VISIT(String.valueOf("PAGE_VISIT")), SIGNUP(String.valueOf("SIGNUP")), CHECKOUT(String.valueOf("CHECKOUT")), CUSTOM(String.valueOf("CUSTOM")), VIEW_CATEGORY(String.valueOf("VIEW_CATEGORY")), SEARCH(String.valueOf("SEARCH")), ADD_TO_CART(String.valueOf("ADD_TO_CART")), WATCH_VIDEO(String.valueOf("WATCH_VIDEO")), LEAD(String.valueOf("LEAD")), APP_INSTALL(String.valueOf("APP_INSTALL")), WEB_SESSION(String.valueOf("WEB_SESSION")), EXTERNAL_MEASUREMENT(String.valueOf("EXTERNAL_MEASUREMENT")), ADD_PAYMENT_INFO(String.valueOf("ADD_PAYMENT_INFO")), ADD_TO_WISHLIST(String.valueOf("ADD_TO_WISHLIST")), INITIATE_CHECKOUT(String.valueOf("INITIATE_CHECKOUT")), SUBSCRIBE(String.valueOf("SUBSCRIBE")), VIEW_CONTENT(String.valueOf("VIEW_CONTENT")), ADVERTISER_DEFINED_EVENT(String.valueOf("ADVERTISER_DEFINED_EVENT")), APP_OPEN(String.valueOf("APP_OPEN")), CONTACT(String.valueOf("CONTACT")), SCHEDULE(String.valueOf("SCHEDULE")), FIND_LOCATION(String.valueOf("FIND_LOCATION")), CUSTOMIZE_PRODUCT(String.valueOf("CUSTOMIZE_PRODUCT")), SUBMIT_APPLICATION(String.valueOf("SUBMIT_APPLICATION")), START_TRIAL(String.valueOf("START_TRIAL"));


    private String value;

    MappedConversionTypeEnum (String v) {
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
    public static MappedConversionTypeEnum fromString(String s) {
        for (MappedConversionTypeEnum b : MappedConversionTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        return null;
    }

    @JsonCreator
    public static MappedConversionTypeEnum fromValue(String value) {
        for (MappedConversionTypeEnum b : MappedConversionTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

  private MappedConversionTypeEnum mappedConversionType;

  public AdvertiserDefinedEvent() {
  }

  /**
   * raw string name of the event, usually logged as raw_event_name in our dataset
   **/
  public AdvertiserDefinedEvent name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "download_picture", value = "raw string name of the event, usually logged as raw_event_name in our dataset")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * standard type mapped to ADE for optimization
   **/
  public AdvertiserDefinedEvent mappedConversionType(MappedConversionTypeEnum mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
    return this;
  }

  
  @ApiModelProperty(value = "standard type mapped to ADE for optimization")
  @JsonProperty("mapped_conversion_type")
  public MappedConversionTypeEnum getMappedConversionType() {
    return mappedConversionType;
  }

  @JsonProperty("mapped_conversion_type")
  public void setMappedConversionType(MappedConversionTypeEnum mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDefinedEvent advertiserDefinedEvent = (AdvertiserDefinedEvent) o;
    return Objects.equals(this.name, advertiserDefinedEvent.name) &&
        Objects.equals(this.mappedConversionType, advertiserDefinedEvent.mappedConversionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mappedConversionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDefinedEvent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mappedConversionType: ").append(toIndentedString(mappedConversionType)).append("\n");
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

