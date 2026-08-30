package apimodels;

import apimodels.OrderLine;
import apimodels.OrderLineMutationError;
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
 * OrderLineMutationResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderLineMutationResult   {
  @JsonProperty("errors")
  @Valid

  private List<@Valid OrderLineMutationError> errors = null;

  @JsonProperty("order_line")
  @Valid

  private List<@Valid OrderLine> orderLine = null;

  public OrderLineMutationResult errors(List<@Valid OrderLineMutationError> errors) {
    this.errors = errors;
    return this;
  }

  public OrderLineMutationResult addErrorsItem(OrderLineMutationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Error list if update(s) fail.
   * @return errors
  **/
  public List<@Valid OrderLineMutationError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid OrderLineMutationError> errors) {
    this.errors = errors;
  }

  public OrderLineMutationResult orderLine(List<@Valid OrderLine> orderLine) {
    this.orderLine = orderLine;
    return this;
  }

  public OrderLineMutationResult addOrderLineItem(OrderLine orderLineItem) {
    if (this.orderLine == null) {
      this.orderLine = new ArrayList<>();
    }
    this.orderLine.add(orderLineItem);
    return this;
  }

   /**
   * Order Line object array.
   * @return orderLine
  **/
  public List<@Valid OrderLine> getOrderLine() {
    return orderLine;
  }

  public void setOrderLine(List<@Valid OrderLine> orderLine) {
    this.orderLine = orderLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLineMutationResult orderLineMutationResult = (OrderLineMutationResult) o;
    return Objects.equals(errors, orderLineMutationResult.errors) &&
        Objects.equals(orderLine, orderLineMutationResult.orderLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, orderLine);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineMutationResult {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    orderLine: ").append(toIndentedString(orderLine)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

