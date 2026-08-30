package apimodels;

import apimodels.LeadForm;
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
 * LeadFormsCreate200ResponseItemsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LeadFormsCreate200ResponseItemsInner   {
  @JsonProperty("data")
  @Valid

  private LeadForm data;

  @JsonProperty("exceptions")
  @Valid

  private List<@Valid PinterestLibBatchItemException> exceptions = null;

  public LeadFormsCreate200ResponseItemsInner data(LeadForm data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
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
    LeadFormsCreate200ResponseItemsInner leadFormsCreate200ResponseItemsInner = (LeadFormsCreate200ResponseItemsInner) o;
    return Objects.equals(data, leadFormsCreate200ResponseItemsInner.data) &&
        Objects.equals(exceptions, leadFormsCreate200ResponseItemsInner.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

