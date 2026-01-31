package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdvertiserDefinedEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

    private final String value;

    MappedConversionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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
    return Objects.equals(name, advertiserDefinedEvent.name) &&
        Objects.equals(mappedConversionType, advertiserDefinedEvent.mappedConversionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mappedConversionType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

