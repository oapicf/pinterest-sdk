package apimodels;

import apimodels.AdvancedAuctionBidOptions;
import apimodels.AdvancedAuctionItemsSubmitRecord;
import apimodels.AdvancedAuctionOperation;
import apimodels.AdvancedAuctionOperationError;
import apimodels.Country;
import apimodels.Language;
import apimodels.UpdateMaskBidOptionField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object describing the result of an operation on an item bid option
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdvancedAuctionProcessedItem extends AdvancedAuctionItemsSubmitRecord  {
  @JsonProperty("errors")
  @Valid

  private List<@Valid AdvancedAuctionOperationError> errors = null;

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
  **/
  public List<@Valid AdvancedAuctionOperationError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid AdvancedAuctionOperationError> errors) {
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
    return Objects.equals(errors, advancedAuctionProcessedItem.errors) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

