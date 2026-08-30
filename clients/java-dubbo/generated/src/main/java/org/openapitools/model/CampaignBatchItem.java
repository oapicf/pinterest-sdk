package org.openapitools.model;

import org.openapitools.model.CampaignBatchResponseData;
import org.openapitools.model.Exception;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Item in a batch campaign response.
 */
public class CampaignBatchItem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Campaign data on success.
   */
  @JsonProperty("data")
  private CampaignBatchResponseData data;

  /**
   * Exceptions on failure.
   */
  @JsonProperty("exceptions")
  private List<Exception> exceptions = new ArrayList<>();

  /**
   * Campaign data on success.
   * @return data
   */
  public CampaignBatchResponseData getData() {
    return data;
  }

  public void setData(CampaignBatchResponseData data) {
    this.data = data;
  }

  /**
   * Exceptions on failure.
   * @return exceptions
   */
  public List<Exception> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<Exception> exceptions) {
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
    return Objects.equals(this.data, campaignBatchItem.data) &&
        Objects.equals(this.exceptions, campaignBatchItem.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

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
