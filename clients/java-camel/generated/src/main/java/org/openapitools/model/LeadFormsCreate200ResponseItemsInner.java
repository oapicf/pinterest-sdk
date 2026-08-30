package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LeadForm;
import org.openapitools.model.PinterestLibBatchItemException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LeadFormsCreate200ResponseItemsInner
 */

@JsonTypeName("lead_forms_create_200_response_items_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadFormsCreate200ResponseItemsInner {

  private LeadForm data;

  @Valid
  private List<@Valid PinterestLibBatchItemException> exceptions = new ArrayList<>();

  public LeadFormsCreate200ResponseItemsInner data(LeadForm data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public LeadForm getData() {
    return data;
  }

  public void setData(LeadForm data) {
    this.data = data;
  }

  public LeadFormsCreate200ResponseItemsInner exceptions(List<@Valid PinterestLibBatchItemException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public LeadFormsCreate200ResponseItemsInner addExceptionsItem(PinterestLibBatchItemException exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

  /**
   * Get exceptions
   * @return exceptions
   */
  @Valid 
  @Schema(name = "exceptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptions")
  public List<@Valid PinterestLibBatchItemException> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<@Valid PinterestLibBatchItemException> exceptions) {
    this.exceptions = exceptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormsCreate200ResponseItemsInner leadFormsCreate200ResponseItemsInner = (LeadFormsCreate200ResponseItemsInner) o;
    return Objects.equals(this.data, leadFormsCreate200ResponseItemsInner.data) &&
        Objects.equals(this.exceptions, leadFormsCreate200ResponseItemsInner.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormsCreate200ResponseItemsInner {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

