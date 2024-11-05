package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object describing the result of an operation on an item bid option
 **/
@ApiModel(description="Object describing the result of an operation on an item bid option")

public class AdvancedAuctionProcessedItem extends AdvancedAuctionItemsSubmitRecord {
  
  @ApiModelProperty(value = "Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.")
 /**
   * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  **/
  private List<AdvancedAuctionOperationError> errors = new ArrayList<>();
 /**
   * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<AdvancedAuctionOperationError> getErrors() {
    return errors;
  }

  public void setErrors(List<AdvancedAuctionOperationError> errors) {
    this.errors = errors;
  }

  public AdvancedAuctionProcessedItem errors(List<AdvancedAuctionOperationError> errors) {
    this.errors = errors;
    return this;
  }

  public AdvancedAuctionProcessedItem addErrorsItem(AdvancedAuctionOperationError errorsItem) {
    this.errors.add(errorsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

