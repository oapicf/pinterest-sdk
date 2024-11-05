package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionBidOptions;
import org.openapitools.model.AdvancedAuctionItemsSubmitRecord;
import org.openapitools.model.AdvancedAuctionOperation;
import org.openapitools.model.AdvancedAuctionOperationError;
import org.openapitools.model.Country;
import org.openapitools.model.Language;
import org.openapitools.model.UpdateMaskBidOptionField;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object describing the result of an operation on an item bid option
 */

@Schema(name = "AdvancedAuctionProcessedItem", description = "Object describing the result of an operation on an item bid option")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionProcessedItem extends AdvancedAuctionItemsSubmitRecord {

  @Valid
  private List<@Valid AdvancedAuctionOperationError> errors = new ArrayList<>();

  public AdvancedAuctionProcessedItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdvancedAuctionProcessedItem(AdvancedAuctionOperation operation, String itemId, Country country, Language language, AdvancedAuctionBidOptions bidOptions, List<UpdateMaskBidOptionField> updateMask) {
    super(operation, itemId, country, language, bidOptions, updateMask);
  }

  public AdvancedAuctionProcessedItem errors(List<@Valid AdvancedAuctionOperationError> errors) {
    this.errors = errors;
    return this;
  }

  public AdvancedAuctionProcessedItem addErrorsItem(AdvancedAuctionOperationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", description = "Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid AdvancedAuctionOperationError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid AdvancedAuctionOperationError> errors) {
    this.errors = errors;
  }


  public AdvancedAuctionProcessedItem operation(AdvancedAuctionOperation operation) {
    super.operation(operation);
    return this;
  }

  public AdvancedAuctionProcessedItem itemId(String itemId) {
    super.itemId(itemId);
    return this;
  }

  public AdvancedAuctionProcessedItem country(Country country) {
    super.country(country);
    return this;
  }

  public AdvancedAuctionProcessedItem language(Language language) {
    super.language(language);
    return this;
  }

  public AdvancedAuctionProcessedItem bidOptions(AdvancedAuctionBidOptions bidOptions) {
    super.bidOptions(bidOptions);
    return this;
  }

  public AdvancedAuctionProcessedItem updateMask(List<UpdateMaskBidOptionField> updateMask) {
    super.updateMask(updateMask);
    return this;
  }

  public AdvancedAuctionProcessedItem addUpdateMaskItem(UpdateMaskBidOptionField updateMaskItem) {
    super.addUpdateMaskItem(updateMaskItem);
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
    AdvancedAuctionProcessedItem advancedAuctionProcessedItem = (AdvancedAuctionProcessedItem) o;
    return Objects.equals(this.errors, advancedAuctionProcessedItem.errors) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionProcessedItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

