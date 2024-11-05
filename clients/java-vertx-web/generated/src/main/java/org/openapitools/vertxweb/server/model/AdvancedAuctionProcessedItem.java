package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdvancedAuctionBidOptions;
import org.openapitools.vertxweb.server.model.AdvancedAuctionItemsSubmitRecord;
import org.openapitools.vertxweb.server.model.AdvancedAuctionOperation;
import org.openapitools.vertxweb.server.model.AdvancedAuctionOperationError;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.Language;
import org.openapitools.vertxweb.server.model.UpdateMaskBidOptionField;

/**
 * Object describing the result of an operation on an item bid option
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedAuctionProcessedItem extends AdvancedAuctionItemsSubmitRecord  {
  
  private List<AdvancedAuctionOperationError> errors = new ArrayList<>();

  public AdvancedAuctionProcessedItem () {

  }

  public AdvancedAuctionProcessedItem (List<AdvancedAuctionOperationError> errors) {
    this.errors = errors;
  }

    
  @JsonProperty("errors")
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
    return super.equals(o) && Objects.equals(errors, advancedAuctionProcessedItem.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), errors);
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
