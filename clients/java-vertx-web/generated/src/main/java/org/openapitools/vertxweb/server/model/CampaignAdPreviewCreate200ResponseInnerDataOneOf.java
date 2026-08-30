package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.PinterestLibError;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignAdPreviewCreate200ResponseInnerDataOneOf   {
  
  private PinterestLibError exceptions;

  public CampaignAdPreviewCreate200ResponseInnerDataOneOf () {

  }

  public CampaignAdPreviewCreate200ResponseInnerDataOneOf (PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }

    
  @JsonProperty("exceptions")
  public PinterestLibError getExceptions() {
    return exceptions;
  }
  public void setExceptions(PinterestLibError exceptions) {
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
    CampaignAdPreviewCreate200ResponseInnerDataOneOf campaignAdPreviewCreate200ResponseInnerDataOneOf = (CampaignAdPreviewCreate200ResponseInnerDataOneOf) o;
    return Objects.equals(exceptions, campaignAdPreviewCreate200ResponseInnerDataOneOf.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewCreate200ResponseInnerDataOneOf {\n");
    
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
