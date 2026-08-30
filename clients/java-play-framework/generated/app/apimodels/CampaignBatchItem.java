package apimodels;

import apimodels.CampaignBatchResponseData;
import apimodels.Exception;
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
 * Item in a batch campaign response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignBatchItem   {
  @JsonProperty("data")
  @Valid

  private CampaignBatchResponseData data;

  @JsonProperty("exceptions")
  @Valid

  private List<@Valid Exception> exceptions = null;

  public CampaignBatchItem data(CampaignBatchResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Campaign data on success.
   * @return data
  **/
  public CampaignBatchResponseData getData() {
    return data;
  }

  public void setData(CampaignBatchResponseData data) {
    this.data = data;
  }

  public CampaignBatchItem exceptions(List<@Valid Exception> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public CampaignBatchItem addExceptionsItem(Exception exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

   /**
   * Exceptions on failure.
   * @return exceptions
  **/
  public List<@Valid Exception> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<@Valid Exception> exceptions) {
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
    CampaignBatchItem campaignBatchItem = (CampaignBatchItem) o;
    return Objects.equals(data, campaignBatchItem.data) &&
        Objects.equals(exceptions, campaignBatchItem.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBatchItem {\n");
    
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

