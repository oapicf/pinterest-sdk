package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AdvancedAuctionBidOptions;
import com.prokarma.pkmst.model.AdvancedAuctionItemsSubmitRecord;
import com.prokarma.pkmst.model.AdvancedAuctionOperation;
import com.prokarma.pkmst.model.AdvancedAuctionOperationError;
import com.prokarma.pkmst.model.Country;
import com.prokarma.pkmst.model.Language;
import com.prokarma.pkmst.model.UpdateMaskBidOptionField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Object describing the result of an operation on an item bid option
 */
@ApiModel(description = "Object describing the result of an operation on an item bid option")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionProcessedItem extends AdvancedAuctionItemsSubmitRecord  {
  @JsonProperty("errors")
  
  private List<AdvancedAuctionOperationError> errors = null;

  public AdvancedAuctionProcessedItem errors(List<AdvancedAuctionOperationError> errors) {
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
  @ApiModelProperty(value = "Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.")
  public List<AdvancedAuctionOperationError> getErrors() {
    return errors;
  }

  public void setErrors(List<AdvancedAuctionOperationError> errors) {
    this.errors = errors;
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

