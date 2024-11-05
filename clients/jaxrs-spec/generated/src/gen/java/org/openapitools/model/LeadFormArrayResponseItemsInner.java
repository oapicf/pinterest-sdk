package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Exception;
import org.openapitools.model.LeadFormResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("LeadFormArrayResponse_items_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadFormArrayResponseItemsInner   {
  private LeadFormResponse data;
  private @Valid List<@Valid Exception> exceptions = new ArrayList<>();

  /**
   **/
  public LeadFormArrayResponseItemsInner data(LeadFormResponse data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  @Valid public LeadFormResponse getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(LeadFormResponse data) {
    this.data = data;
  }

  /**
   **/
  public LeadFormArrayResponseItemsInner exceptions(List<@Valid Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exceptions")
  @Valid public List<@Valid Exception> getExceptions() {
    return exceptions;
  }

  @JsonProperty("exceptions")
  public void setExceptions(List<@Valid Exception> exceptions) {
    this.exceptions = exceptions;
  }

  public LeadFormArrayResponseItemsInner addExceptionsItem(Exception exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }

    this.exceptions.add(exceptionsItem);
    return this;
  }

  public LeadFormArrayResponseItemsInner removeExceptionsItem(Exception exceptionsItem) {
    if (exceptionsItem != null && this.exceptions != null) {
      this.exceptions.remove(exceptionsItem);
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
    LeadFormArrayResponseItemsInner leadFormArrayResponseItemsInner = (LeadFormArrayResponseItemsInner) o;
    return Objects.equals(this.data, leadFormArrayResponseItemsInner.data) &&
        Objects.equals(this.exceptions, leadFormArrayResponseItemsInner.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormArrayResponseItemsInner {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

