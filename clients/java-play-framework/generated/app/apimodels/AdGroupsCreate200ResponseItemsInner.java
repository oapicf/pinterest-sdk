package apimodels;

import apimodels.AdGroup;
import apimodels.PinterestLibBatchItemException;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * AdGroupsCreate200ResponseItemsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdGroupsCreate200ResponseItemsInner   {
  @JsonProperty("data")
  @Valid

  private AdGroup data;

  @JsonProperty("exceptions")
  @Valid

  private List<@Valid PinterestLibBatchItemException> exceptions = null;

  public AdGroupsCreate200ResponseItemsInner data(AdGroup data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public AdGroup getData() {
    return data;
  }

  public void setData(AdGroup data) {
    this.data = data;
  }

  public AdGroupsCreate200ResponseItemsInner exceptions(List<@Valid PinterestLibBatchItemException> exceptions) {
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
  **/
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
    AdGroupsCreate200ResponseItemsInner adGroupsCreate200ResponseItemsInner = (AdGroupsCreate200ResponseItemsInner) o;
    return Objects.equals(data, adGroupsCreate200ResponseItemsInner.data) &&
        Objects.equals(exceptions, adGroupsCreate200ResponseItemsInner.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

