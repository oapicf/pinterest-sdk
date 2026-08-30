package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLineMutationError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrderLineMutationResult
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrderLineMutationResult {

  @Valid
  private List<@Valid OrderLineMutationError> errors = new ArrayList<>();

  @Valid
  private List<@Valid OrderLine> orderLine = new ArrayList<>();

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
   */
  @Valid 
  @Schema(name = "errors", description = "Error list if update(s) fail.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
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
   */
  @Valid 
  @Schema(name = "order_line", description = "Order Line object array.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order_line")
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
    return Objects.equals(this.errors, orderLineMutationResult.errors) &&
        Objects.equals(this.orderLine, orderLineMutationResult.orderLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, orderLine);
  }

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

