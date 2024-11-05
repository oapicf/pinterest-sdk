package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Object describing the result of an operation on an item bid option
 **/
@ApiModel(description = "Object describing the result of an operation on an item bid option")
@JsonTypeName("AdvancedAuctionProcessedItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionProcessedItem extends AdvancedAuctionItemsSubmitRecord  {
  private @Valid List<@Valid AdvancedAuctionOperationError> errors = new ArrayList<>();

  /**
   * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
   **/
  public AdvancedAuctionProcessedItem errors(List<@Valid AdvancedAuctionOperationError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.")
  @JsonProperty("errors")
  @Valid public List<@Valid AdvancedAuctionOperationError> getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(List<@Valid AdvancedAuctionOperationError> errors) {
    this.errors = errors;
  }

  public AdvancedAuctionProcessedItem addErrorsItem(AdvancedAuctionOperationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }

    this.errors.add(errorsItem);
    return this;
  }

  public AdvancedAuctionProcessedItem removeErrorsItem(AdvancedAuctionOperationError errorsItem) {
    if (errorsItem != null && this.errors != null) {
      this.errors.remove(errorsItem);
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

