package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ConversionEventsDataInnerCustomDataContentsInner;

/**
 * Object containing other custom data.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEventsDataInnerCustomData   {
  
  private String currency;
  private String value;
  private List<String> contentIds;
  private String contentName;
  private String contentCategory;
  private String contentBrand;
  private List<ConversionEventsDataInnerCustomDataContentsInner> contents;
  private Long numItems;
  private String orderId;
  private String searchString;
  private String optOutType;
  private String np;

  public ConversionEventsDataInnerCustomData () {

  }

  public ConversionEventsDataInnerCustomData (String currency, String value, List<String> contentIds, String contentName, String contentCategory, String contentBrand, List<ConversionEventsDataInnerCustomDataContentsInner> contents, Long numItems, String orderId, String searchString, String optOutType, String np) {
    this.currency = currency;
    this.value = value;
    this.contentIds = contentIds;
    this.contentName = contentName;
    this.contentCategory = contentCategory;
    this.contentBrand = contentBrand;
    this.contents = contents;
    this.numItems = numItems;
    this.orderId = orderId;
    this.searchString = searchString;
    this.optOutType = optOutType;
    this.np = np;
  }

    
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

    
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

    
  @JsonProperty("content_ids")
  public List<String> getContentIds() {
    return contentIds;
  }
  public void setContentIds(List<String> contentIds) {
    this.contentIds = contentIds;
  }

    
  @JsonProperty("content_name")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

    
  @JsonProperty("content_category")
  public String getContentCategory() {
    return contentCategory;
  }
  public void setContentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
  }

    
  @JsonProperty("content_brand")
  public String getContentBrand() {
    return contentBrand;
  }
  public void setContentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
  }

    
  @JsonProperty("contents")
  public List<ConversionEventsDataInnerCustomDataContentsInner> getContents() {
    return contents;
  }
  public void setContents(List<ConversionEventsDataInnerCustomDataContentsInner> contents) {
    this.contents = contents;
  }

    
  @JsonProperty("num_items")
  public Long getNumItems() {
    return numItems;
  }
  public void setNumItems(Long numItems) {
    this.numItems = numItems;
  }

    
  @JsonProperty("order_id")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

    
  @JsonProperty("search_string")
  public String getSearchString() {
    return searchString;
  }
  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

    
  @JsonProperty("opt_out_type")
  public String getOptOutType() {
    return optOutType;
  }
  public void setOptOutType(String optOutType) {
    this.optOutType = optOutType;
  }

    
  @JsonProperty("np")
  public String getNp() {
    return np;
  }
  public void setNp(String np) {
    this.np = np;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEventsDataInnerCustomData conversionEventsDataInnerCustomData = (ConversionEventsDataInnerCustomData) o;
    return Objects.equals(currency, conversionEventsDataInnerCustomData.currency) &&
        Objects.equals(value, conversionEventsDataInnerCustomData.value) &&
        Objects.equals(contentIds, conversionEventsDataInnerCustomData.contentIds) &&
        Objects.equals(contentName, conversionEventsDataInnerCustomData.contentName) &&
        Objects.equals(contentCategory, conversionEventsDataInnerCustomData.contentCategory) &&
        Objects.equals(contentBrand, conversionEventsDataInnerCustomData.contentBrand) &&
        Objects.equals(contents, conversionEventsDataInnerCustomData.contents) &&
        Objects.equals(numItems, conversionEventsDataInnerCustomData.numItems) &&
        Objects.equals(orderId, conversionEventsDataInnerCustomData.orderId) &&
        Objects.equals(searchString, conversionEventsDataInnerCustomData.searchString) &&
        Objects.equals(optOutType, conversionEventsDataInnerCustomData.optOutType) &&
        Objects.equals(np, conversionEventsDataInnerCustomData.np);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value, contentIds, contentName, contentCategory, contentBrand, contents, numItems, orderId, searchString, optOutType, np);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsDataInnerCustomData {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    contentIds: ").append(toIndentedString(contentIds)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contentCategory: ").append(toIndentedString(contentCategory)).append("\n");
    sb.append("    contentBrand: ").append(toIndentedString(contentBrand)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    numItems: ").append(toIndentedString(numItems)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
    sb.append("    optOutType: ").append(toIndentedString(optOutType)).append("\n");
    sb.append("    np: ").append(toIndentedString(np)).append("\n");
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
