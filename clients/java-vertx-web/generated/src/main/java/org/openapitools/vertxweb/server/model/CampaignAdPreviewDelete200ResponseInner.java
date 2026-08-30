package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CampaignAdPreviewDelete200ResponseInnerStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignAdPreviewDelete200ResponseInner   {
  
  private CampaignAdPreviewDelete200ResponseInnerStatus status;

  public CampaignAdPreviewDelete200ResponseInner () {

  }

  public CampaignAdPreviewDelete200ResponseInner (CampaignAdPreviewDelete200ResponseInnerStatus status) {
    this.status = status;
  }

    
  @JsonProperty("status")
  public CampaignAdPreviewDelete200ResponseInnerStatus getStatus() {
    return status;
  }
  public void setStatus(CampaignAdPreviewDelete200ResponseInnerStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignAdPreviewDelete200ResponseInner campaignAdPreviewDelete200ResponseInner = (CampaignAdPreviewDelete200ResponseInner) o;
    return Objects.equals(status, campaignAdPreviewDelete200ResponseInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewDelete200ResponseInner {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
