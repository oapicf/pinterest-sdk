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
  
  private String contentBrand;
  private String contentCategory;
  private List<String> contentIds = new ArrayList<>();
  private String contentName;
  private List<ConversionEventsDataInnerCustomDataContentsInner> contents = new ArrayList<>();
  private String currency;
  private String externalMeasurementId;
  private Integer externalMeasurementVendorId;
  private String np;
  private Long numItems;
  private String optOutType;
  private String orderId;
  private String predictedLtv;
  private String searchString;
  private String value;

  public ConversionEventsDataInnerCustomData () {

  }

  public ConversionEventsDataInnerCustomData (String contentBrand, String contentCategory, List<String> contentIds, String contentName, List<ConversionEventsDataInnerCustomDataContentsInner> contents, String currency, String externalMeasurementId, Integer externalMeasurementVendorId, String np, Long numItems, String optOutType, String orderId, String predictedLtv, String searchString, String value) {
    this.contentBrand = contentBrand;
    this.contentCategory = contentCategory;
    this.contentIds = contentIds;
    this.contentName = contentName;
    this.contents = contents;
    this.currency = currency;
    this.externalMeasurementId = externalMeasurementId;
    this.externalMeasurementVendorId = externalMeasurementVendorId;
    this.np = np;
    this.numItems = numItems;
    this.optOutType = optOutType;
    this.orderId = orderId;
    this.predictedLtv = predictedLtv;
    this.searchString = searchString;
    this.value = value;
  }

    
  @JsonProperty("content_brand")
  public String getContentBrand() {
    return contentBrand;
  }
  public void setContentBrand(String contentBrand) {
    this.contentBrand = contentBrand;
  }

    
  @JsonProperty("content_category")
  public String getContentCategory() {
    return contentCategory;
  }
  public void setContentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
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

    
  @JsonProperty("contents")
  public List<ConversionEventsDataInnerCustomDataContentsInner> getContents() {
    return contents;
  }
  public void setContents(List<ConversionEventsDataInnerCustomDataContentsInner> contents) {
    this.contents = contents;
  }

    
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

    
  @JsonProperty("external_measurement_id")
  public String getExternalMeasurementId() {
    return externalMeasurementId;
  }
  public void setExternalMeasurementId(String externalMeasurementId) {
    this.externalMeasurementId = externalMeasurementId;
  }

    
  @JsonProperty("external_measurement_vendor_id")
  public Integer getExternalMeasurementVendorId() {
    return externalMeasurementVendorId;
  }
  public void setExternalMeasurementVendorId(Integer externalMeasurementVendorId) {
    this.externalMeasurementVendorId = externalMeasurementVendorId;
  }

    
  @JsonProperty("np")
  public String getNp() {
    return np;
  }
  public void setNp(String np) {
    this.np = np;
  }

    
  @JsonProperty("num_items")
  public Long getNumItems() {
    return numItems;
  }
  public void setNumItems(Long numItems) {
    this.numItems = numItems;
  }

    
  @JsonProperty("opt_out_type")
  public String getOptOutType() {
    return optOutType;
  }
  public void setOptOutType(String optOutType) {
    this.optOutType = optOutType;
  }

    
  @JsonProperty("order_id")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

    
  @JsonProperty("predicted_ltv")
  public String getPredictedLtv() {
    return predictedLtv;
  }
  public void setPredictedLtv(String predictedLtv) {
    this.predictedLtv = predictedLtv;
  }

    
  @JsonProperty("search_string")
  public String getSearchString() {
    return searchString;
  }
  public void setSearchString(String searchString) {
    this.searchString = searchString;
  }

    
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
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
    return Objects.equals(contentBrand, conversionEventsDataInnerCustomData.contentBrand) &&
        Objects.equals(contentCategory, conversionEventsDataInnerCustomData.contentCategory) &&
        Objects.equals(contentIds, conversionEventsDataInnerCustomData.contentIds) &&
        Objects.equals(contentName, conversionEventsDataInnerCustomData.contentName) &&
        Objects.equals(contents, conversionEventsDataInnerCustomData.contents) &&
        Objects.equals(currency, conversionEventsDataInnerCustomData.currency) &&
        Objects.equals(externalMeasurementId, conversionEventsDataInnerCustomData.externalMeasurementId) &&
        Objects.equals(externalMeasurementVendorId, conversionEventsDataInnerCustomData.externalMeasurementVendorId) &&
        Objects.equals(np, conversionEventsDataInnerCustomData.np) &&
        Objects.equals(numItems, conversionEventsDataInnerCustomData.numItems) &&
        Objects.equals(optOutType, conversionEventsDataInnerCustomData.optOutType) &&
        Objects.equals(orderId, conversionEventsDataInnerCustomData.orderId) &&
        Objects.equals(predictedLtv, conversionEventsDataInnerCustomData.predictedLtv) &&
        Objects.equals(searchString, conversionEventsDataInnerCustomData.searchString) &&
        Objects.equals(value, conversionEventsDataInnerCustomData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentBrand, contentCategory, contentIds, contentName, contents, currency, externalMeasurementId, externalMeasurementVendorId, np, numItems, optOutType, orderId, predictedLtv, searchString, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsDataInnerCustomData {\n");
    
    sb.append("    contentBrand: ").append(toIndentedString(contentBrand)).append("\n");
    sb.append("    contentCategory: ").append(toIndentedString(contentCategory)).append("\n");
    sb.append("    contentIds: ").append(toIndentedString(contentIds)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    externalMeasurementId: ").append(toIndentedString(externalMeasurementId)).append("\n");
    sb.append("    externalMeasurementVendorId: ").append(toIndentedString(externalMeasurementVendorId)).append("\n");
    sb.append("    np: ").append(toIndentedString(np)).append("\n");
    sb.append("    numItems: ").append(toIndentedString(numItems)).append("\n");
    sb.append("    optOutType: ").append(toIndentedString(optOutType)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    predictedLtv: ").append(toIndentedString(predictedLtv)).append("\n");
    sb.append("    searchString: ").append(toIndentedString(searchString)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
