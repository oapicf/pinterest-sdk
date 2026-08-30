package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroup;
import org.openapitools.model.PinterestLibBatchItemException;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupsCreate200ResponseItemsInner   {
  @JsonProperty("data")
  private AdGroup data;

  @JsonProperty("exceptions")
  private List<PinterestLibBatchItemException> exceptions = null;

  /**
   **/
  public AdGroupsCreate200ResponseItemsInner data(AdGroup data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public AdGroup getData() {
    return data;
  }
  public void setData(AdGroup data) {
    this.data = data;
  }

  /**
   **/
  public AdGroupsCreate200ResponseItemsInner exceptions(List<PinterestLibBatchItemException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exceptions")
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
    return Objects.equals(data, adGroupsCreate200ResponseItemsInner.data) &&
        Objects.equals(exceptions, adGroupsCreate200ResponseItemsInner.exceptions);
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

