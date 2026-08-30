package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CampaignAdPreviewCreate200ResponseInnerData;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignAdPreviewCreate200ResponseInner   {
  
  private CampaignAdPreviewCreate200ResponseInnerData data;

  public CampaignAdPreviewCreate200ResponseInner () {

  }

  public CampaignAdPreviewCreate200ResponseInner (CampaignAdPreviewCreate200ResponseInnerData data) {
    this.data = data;
  }

    
  @JsonProperty("data")
  public CampaignAdPreviewCreate200ResponseInnerData getData() {
    return data;
  }
  public void setData(CampaignAdPreviewCreate200ResponseInnerData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignAdPreviewCreate200ResponseInner campaignAdPreviewCreate200ResponseInner = (CampaignAdPreviewCreate200ResponseInner) o;
    return Objects.equals(data, campaignAdPreviewCreate200ResponseInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewCreate200ResponseInner {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
