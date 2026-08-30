package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.AdGroup;
import com.prokarma.pkmst.model.PinterestLibBatchItemException;
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
 * AdGroupsCreate200ResponseItemsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupsCreate200ResponseItemsInner   {
  @JsonProperty("data")
  private AdGroup data;

  @JsonProperty("exceptions")
  
  private List<PinterestLibBatchItemException> exceptions = null;

  public AdGroupsCreate200ResponseItemsInner data(AdGroup data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @ApiModelProperty(value = "")
  public AdGroup getData() {
    return data;
  }

  public void setData(AdGroup data) {
    this.data = data;
  }

  public AdGroupsCreate200ResponseItemsInner exceptions(List<PinterestLibBatchItemException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public AdGroupsCreate200ResponseItemsInner addExceptionsItem(PinterestLibBatchItemException exceptionsItem) {
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
  @ApiModelProperty(value = "")
  public List<PinterestLibBatchItemException> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<PinterestLibBatchItemException> exceptions) {
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

