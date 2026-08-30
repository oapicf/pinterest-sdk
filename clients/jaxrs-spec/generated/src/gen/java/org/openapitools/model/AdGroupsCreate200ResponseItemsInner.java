package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroup;
import org.openapitools.model.PinterestLibBatchItemException;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ad_groups_create_200_response_items_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupsCreate200ResponseItemsInner   {
  private AdGroup data;
  private @Valid List<@Valid PinterestLibBatchItemException> exceptions = new ArrayList<>();

  public AdGroupsCreate200ResponseItemsInner() {
  }

  /**
   **/
  public AdGroupsCreate200ResponseItemsInner data(AdGroup data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  @Valid public AdGroup getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(AdGroup data) {
    this.data = data;
  }

  /**
   **/
  public AdGroupsCreate200ResponseItemsInner exceptions(List<@Valid PinterestLibBatchItemException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exceptions")
  @Valid public List<@Valid PinterestLibBatchItemException> getExceptions() {
    return exceptions;
  }

  @JsonProperty("exceptions")
  public void setExceptions(List<@Valid PinterestLibBatchItemException> exceptions) {
    this.exceptions = exceptions;
  }

  public AdGroupsCreate200ResponseItemsInner addExceptionsItem(PinterestLibBatchItemException exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }

    this.exceptions.add(exceptionsItem);
    return this;
  }

  public AdGroupsCreate200ResponseItemsInner removeExceptionsItem(PinterestLibBatchItemException exceptionsItem) {
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
    AdGroupsCreate200ResponseItemsInner adGroupsCreate200ResponseItemsInner = (AdGroupsCreate200ResponseItemsInner) o;
    return Objects.equals(this.data, adGroupsCreate200ResponseItemsInner.data) &&
        Objects.equals(this.exceptions, adGroupsCreate200ResponseItemsInner.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupsCreate200ResponseItemsInner {\n");
    
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
