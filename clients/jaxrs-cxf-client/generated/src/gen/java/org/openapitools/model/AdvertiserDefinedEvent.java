package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdvertiserDefinedEvent  {
  
 /**
  * raw string name of the event, usually logged as raw_event_name in our dataset
  */
  @ApiModelProperty(example = "download_picture", value = "raw string name of the event, usually logged as raw_event_name in our dataset")

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

 /**
  * standard type mapped to ADE for optimization
  */
  @ApiModelProperty(value = "standard type mapped to ADE for optimization")

  private MappedConversionTypeEnum mappedConversionType;
 /**
   * raw string name of the event, usually logged as raw_event_name in our dataset
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdvertiserDefinedEvent name(String name) {
    this.name = name;
    return this;
  }

 /**
   * standard type mapped to ADE for optimization
   * @return mappedConversionType
  **/
  @JsonProperty("mapped_conversion_type")
  public String getMappedConversionType() {
    if (mappedConversionType == null) {
      return null;
    }
    return mappedConversionType.value();
  }

  public void setMappedConversionType(MappedConversionTypeEnum mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
  }

  public AdvertiserDefinedEvent mappedConversionType(MappedConversionTypeEnum mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

