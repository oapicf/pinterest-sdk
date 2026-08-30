package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInnerData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignAdPreviewCreate200ResponseInner  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private CampaignAdPreviewCreate200ResponseInnerData data;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  @NotNull
  public CampaignAdPreviewCreate200ResponseInnerData getData() {
    return data;
  }

  public void setData(CampaignAdPreviewCreate200ResponseInnerData data) {
    this.data = data;
  }

  public CampaignAdPreviewCreate200ResponseInner data(CampaignAdPreviewCreate200ResponseInnerData data) {
    this.data = data;
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
    CampaignAdPreviewCreate200ResponseInner campaignAdPreviewCreate200ResponseInner = (CampaignAdPreviewCreate200ResponseInner) o;
    return Objects.equals(this.data, campaignAdPreviewCreate200ResponseInner.data);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

