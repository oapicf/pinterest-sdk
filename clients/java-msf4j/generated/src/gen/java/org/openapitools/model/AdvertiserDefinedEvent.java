package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AdvertiserDefinedEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-31T04:52:33.064583645Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdvertiserDefinedEvent   {
  @JsonProperty("name")
  private String name;

  /**
   * standard type mapped to ADE for optimization
   */
  public enum MappedConversionTypeEnum {
    PAGE_LOAD("PAGE_LOAD"),
    
    UNKNOWN("UNKNOWN"),
    
    INITIALIZED("INITIALIZED"),
    
    PAGE_VISIT("PAGE_VISIT"),
    
    SIGNUP("SIGNUP"),
    
    CHECKOUT("CHECKOUT"),
    
    CUSTOM("CUSTOM"),
    
    VIEW_CATEGORY("VIEW_CATEGORY"),
    
    SEARCH("SEARCH"),
    
    ADD_TO_CART("ADD_TO_CART"),
    
    WATCH_VIDEO("WATCH_VIDEO"),
    
    LEAD("LEAD"),
    
    APP_INSTALL("APP_INSTALL"),
    
    WEB_SESSION("WEB_SESSION"),
    
    EXTERNAL_MEASUREMENT("EXTERNAL_MEASUREMENT"),
    
    ADD_PAYMENT_INFO("ADD_PAYMENT_INFO"),
    
    ADD_TO_WISHLIST("ADD_TO_WISHLIST"),
    
    INITIATE_CHECKOUT("INITIATE_CHECKOUT"),
    
    SUBSCRIBE("SUBSCRIBE"),
    
    VIEW_CONTENT("VIEW_CONTENT"),
    
    ADVERTISER_DEFINED_EVENT("ADVERTISER_DEFINED_EVENT"),
    
    APP_OPEN("APP_OPEN"),
    
    CONTACT("CONTACT"),
    
    SCHEDULE("SCHEDULE"),
    
    FIND_LOCATION("FIND_LOCATION"),
    
    CUSTOMIZE_PRODUCT("CUSTOMIZE_PRODUCT"),
    
    SUBMIT_APPLICATION("SUBMIT_APPLICATION"),
    
    START_TRIAL("START_TRIAL");

    private String value;

    MappedConversionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MappedConversionTypeEnum fromValue(String text) {
      for (MappedConversionTypeEnum b : MappedConversionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mapped_conversion_type")
  private MappedConversionTypeEnum mappedConversionType;

  public AdvertiserDefinedEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * raw string name of the event, usually logged as raw_event_name in our dataset
   * @return name
  **/
  @ApiModelProperty(example = "download_picture", value = "raw string name of the event, usually logged as raw_event_name in our dataset")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdvertiserDefinedEvent mappedConversionType(MappedConversionTypeEnum mappedConversionType) {
    this.mappedConversionType = mappedConversionType;
    return this;
  }

   /**
   * standard type mapped to ADE for optimization
   * @return mappedConversionType
  **/
  @ApiModelProperty(value = "standard type mapped to ADE for optimization")
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

