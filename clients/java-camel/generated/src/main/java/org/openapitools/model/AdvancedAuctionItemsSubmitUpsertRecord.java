package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import org.openapitools.model.UpdateMaskBidOptionField;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object describing an item bid option upsert operation
 */

@Schema(name = "AdvancedAuctionItemsSubmitUpsertRecord", description = "Object describing an item bid option upsert operation")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionItemsSubmitUpsertRecord implements AdvancedAuctionItemsSubmitRecord {

  private String itemId;

  private Country country;

  private Language language;

  private AdvancedAuctionBidOptions bidOptions;

  @Valid
  private JsonNullable<List<UpdateMaskBidOptionField>> updateMask = JsonNullable.<List<UpdateMaskBidOptionField>>undefined();

  private AdvancedAuctionOperation operation;

  public AdvancedAuctionItemsSubmitUpsertRecord() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdvancedAuctionItemsSubmitUpsertRecord(String itemId, Country country, Language language, AdvancedAuctionBidOptions bidOptions, List<UpdateMaskBidOptionField> updateMask) {
    this.itemId = itemId;
    this.country = country;
    this.language = language;
    this.bidOptions = bidOptions;
    this.updateMask = JsonNullable.of(updateMask);
    this.operation = operation;
  }

  public AdvancedAuctionItemsSubmitUpsertRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The catalog retail item id in the merchant namespace
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", example = "DS0294-M", description = "The catalog retail item id in the merchant namespace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public AdvancedAuctionItemsSubmitUpsertRecord country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @NotNull @Valid 
  @Schema(name = "country", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public AdvancedAuctionItemsSubmitUpsertRecord language(Language language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @NotNull @Valid 
  @Schema(name = "language", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public AdvancedAuctionItemsSubmitUpsertRecord bidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
    return this;
  }

  /**
   * Get bidOptions
   * @return bidOptions
   */
  @NotNull @Valid 
  @Schema(name = "bid_options", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bid_options")
  public AdvancedAuctionBidOptions getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(AdvancedAuctionBidOptions bidOptions) {
    this.bidOptions = bidOptions;
  }

  public AdvancedAuctionItemsSubmitUpsertRecord updateMask(List<UpdateMaskBidOptionField> updateMask) {
    this.updateMask = JsonNullable.of(updateMask);
    return this;
  }

  public AdvancedAuctionItemsSubmitUpsertRecord addUpdateMaskItem(UpdateMaskBidOptionField updateMaskItem) {
    if (this.updateMask == null || !this.updateMask.isPresent()) {
      this.updateMask = JsonNullable.of(new ArrayList<>());
    }
    this.updateMask.get().add(updateMaskItem);
    return this;
  }

  /**
   * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
   * @return updateMask
   */
  @NotNull @Valid 
  @Schema(name = "update_mask", example = "[\"BID\",\"APP_TYPE_BID_MULTIPLIER_SET\"]", description = "The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("update_mask")
  public JsonNullable<List<UpdateMaskBidOptionField>> getUpdateMask() {
    return updateMask;
  }

  public void setUpdateMask(JsonNullable<List<UpdateMaskBidOptionField>> updateMask) {
    this.updateMask = updateMask;
  }

  public AdvancedAuctionItemsSubmitUpsertRecord operation(AdvancedAuctionOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @NotNull @Valid 
  @Schema(name = "operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation")
  public AdvancedAuctionOperation getOperation() {
    return operation;
  }

  public void setOperation(AdvancedAuctionOperation operation) {
    this.operation = operation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedAuctionItemsSubmitUpsertRecord advancedAuctionItemsSubmitUpsertRecord = (AdvancedAuctionItemsSubmitUpsertRecord) o;
    return Objects.equals(this.itemId, advancedAuctionItemsSubmitUpsertRecord.itemId) &&
        Objects.equals(this.country, advancedAuctionItemsSubmitUpsertRecord.country) &&
        Objects.equals(this.language, advancedAuctionItemsSubmitUpsertRecord.language) &&
        Objects.equals(this.bidOptions, advancedAuctionItemsSubmitUpsertRecord.bidOptions) &&
        Objects.equals(this.updateMask, advancedAuctionItemsSubmitUpsertRecord.updateMask) &&
        Objects.equals(this.operation, advancedAuctionItemsSubmitUpsertRecord.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, country, language, bidOptions, updateMask, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItemsSubmitUpsertRecord {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

