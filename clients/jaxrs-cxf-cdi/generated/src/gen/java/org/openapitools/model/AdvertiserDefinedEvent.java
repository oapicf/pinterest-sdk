package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class AdvertiserDefinedEvent   {
  
  private String name;


public enum MappedConversionTypeEnum {

    @JsonProperty("PAGE_LOAD") PAGE_LOAD(String.valueOf("PAGE_LOAD")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN")), @JsonProperty("INITIALIZED") INITIALIZED(String.valueOf("INITIALIZED")), @JsonProperty("PAGE_VISIT") PAGE_VISIT(String.valueOf("PAGE_VISIT")), @JsonProperty("SIGNUP") SIGNUP(String.valueOf("SIGNUP")), @JsonProperty("CHECKOUT") CHECKOUT(String.valueOf("CHECKOUT")), @JsonProperty("CUSTOM") CUSTOM(String.valueOf("CUSTOM")), @JsonProperty("VIEW_CATEGORY") VIEW_CATEGORY(String.valueOf("VIEW_CATEGORY")), @JsonProperty("SEARCH") SEARCH(String.valueOf("SEARCH")), @JsonProperty("ADD_TO_CART") ADD_TO_CART(String.valueOf("ADD_TO_CART")), @JsonProperty("WATCH_VIDEO") WATCH_VIDEO(String.valueOf("WATCH_VIDEO")), @JsonProperty("LEAD") LEAD(String.valueOf("LEAD")), @JsonProperty("APP_INSTALL") APP_INSTALL(String.valueOf("APP_INSTALL")), @JsonProperty("WEB_SESSION") WEB_SESSION(String.valueOf("WEB_SESSION")), @JsonProperty("EXTERNAL_MEASUREMENT") EXTERNAL_MEASUREMENT(String.valueOf("EXTERNAL_MEASUREMENT")), @JsonProperty("ADD_PAYMENT_INFO") ADD_PAYMENT_INFO(String.valueOf("ADD_PAYMENT_INFO")), @JsonProperty("ADD_TO_WISHLIST") ADD_TO_WISHLIST(String.valueOf("ADD_TO_WISHLIST")), @JsonProperty("INITIATE_CHECKOUT") INITIATE_CHECKOUT(String.valueOf("INITIATE_CHECKOUT")), @JsonProperty("SUBSCRIBE") SUBSCRIBE(String.valueOf("SUBSCRIBE")), @JsonProperty("VIEW_CONTENT") VIEW_CONTENT(String.valueOf("VIEW_CONTENT")), @JsonProperty("ADVERTISER_DEFINED_EVENT") ADVERTISER_DEFINED_EVENT(String.valueOf("ADVERTISER_DEFINED_EVENT")), @JsonProperty("APP_OPEN") APP_OPEN(String.valueOf("APP_OPEN")), @JsonProperty("CONTACT") CONTACT(String.valueOf("CONTACT")), @JsonProperty("SCHEDULE") SCHEDULE(String.valueOf("SCHEDULE")), @JsonProperty("FIND_LOCATION") FIND_LOCATION(String.valueOf("FIND_LOCATION")), @JsonProperty("CUSTOMIZE_PRODUCT") CUSTOMIZE_PRODUCT(String.valueOf("CUSTOMIZE_PRODUCT")), @JsonProperty("SUBMIT_APPLICATION") SUBMIT_APPLICATION(String.valueOf("SUBMIT_APPLICATION")), @JsonProperty("START_TRIAL") START_TRIAL(String.valueOf("START_TRIAL"));


    private String value;

    MappedConversionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

