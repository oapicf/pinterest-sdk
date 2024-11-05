package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.AdvancedAuctionItemsSubmitDeleteRecord;
import org.openapitools.model.AdvancedAuctionItemsSubmitUpsertRecord;
import org.openapitools.model.AdvancedAuctionOperation;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import org.openapitools.model.UpdateMaskBidOptionField;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operation", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AdvancedAuctionItemsSubmitDeleteRecord.class, name = "DELETE"),
  @JsonSubTypes.Type(value = AdvancedAuctionItemsSubmitUpsertRecord.class, name = "UPSERT"),
})
/**
 * Object describing an item bid option operation
 **/
@ApiModel(description = "Object describing an item bid option operation")
@JsonTypeName("AdvancedAuctionItemsSubmitRecord")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionItemsSubmitRecord   {
  private AdvancedAuctionOperation operation;
  private String itemId;
  private Country country;
  private Language language;
  private AdvancedAuctionBidOptions bidOptions;
  private @Valid List<UpdateMaskBidOptionField> updateMask;

  /**
   **/
  public AdvancedAuctionItemsSubmitRecord operation(AdvancedAuctionOperation operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull public AdvancedAuctionOperation getOperation() {
    return operation;
  }

  @JsonProperty("operation")
  public void setOperation(AdvancedAuctionOperation operation) {
    this.operation = operation;
  }

  /**
   * The catalog retail item id in the merchant namespace
   **/
  public AdvancedAuctionItemsSubmitRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog retail item id in the merchant namespace")
  @JsonProperty("item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty("item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   **/
  public AdvancedAuctionItemsSubmitRecord country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("country")
  @NotNull public Country getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  public AdvancedAuctionItemsSubmitRecord language(Language language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("language")
  @NotNull public Language getLanguage() {
    return language;
  }

  @JsonProperty("language")
  public void setLanguage(Language language) {
    this.language = language;
  }

  /**
   **/
  public AdvancedAuctionItemsSubmitRecord bidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("bid_options")
  @NotNull @Valid public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }

  @JsonProperty("bid_options")
  public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }

  /**
   * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;.
   **/
  public AdvancedAuctionItemsSubmitRecord updateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  
  @ApiModelProperty(example = "[BID, APP_TYPE_BID_MULTIPLIER_SET]", required = true, value = "The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.")
  @JsonProperty("update_mask")
  @NotNull public List<UpdateMaskBidOptionField> getUpdateMask() {
    return updateMask;
  }

  @JsonProperty("update_mask")
  public void setUpdateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = updateMask;
  }

  public AdvancedAuctionItemsSubmitRecord addUpdateMaskItem(UpdateMaskBidOptionField updateMaskItem) {
    if (this.updateMask == null) {
      this.updateMask = new ArrayList<>();
    }

    this.updateMask.add(updateMaskItem);
    return this;
  }

  public AdvancedAuctionItemsSubmitRecord removeUpdateMaskItem(UpdateMaskBidOptionField updateMaskItem) {
    if (updateMaskItem != null && this.updateMask != null) {
      this.updateMask.remove(updateMaskItem);
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
    AdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord = (AdvancedAuctionItemsSubmitRecord) o;
    return Objects.equals(this.operation, advancedAuctionItemsSubmitRecord.operation) &&
        Objects.equals(this.itemId, advancedAuctionItemsSubmitRecord.itemId) &&
        Objects.equals(this.country, advancedAuctionItemsSubmitRecord.country) &&
        Objects.equals(this.language, advancedAuctionItemsSubmitRecord.language) &&
        Objects.equals(this.bidOptions, advancedAuctionItemsSubmitRecord.bidOptions) &&
        Objects.equals(this.updateMask, advancedAuctionItemsSubmitRecord.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, itemId, country, language, bidOptions, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItemsSubmitRecord {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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

