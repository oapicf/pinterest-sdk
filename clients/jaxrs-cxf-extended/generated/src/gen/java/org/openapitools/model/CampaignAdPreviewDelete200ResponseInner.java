package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CampaignAdPreviewDelete200ResponseInnerStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignAdPreviewDelete200ResponseInner  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CampaignAdPreviewDelete200ResponseInnerStatus status;
 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public CampaignAdPreviewDelete200ResponseInnerStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(CampaignAdPreviewDelete200ResponseInnerStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public CampaignAdPreviewDelete200ResponseInner status(CampaignAdPreviewDelete200ResponseInnerStatus status) {
    this.status = status;
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
    CampaignAdPreviewDelete200ResponseInner campaignAdPreviewDelete200ResponseInner = (CampaignAdPreviewDelete200ResponseInner) o;
    return Objects.equals(this.status, campaignAdPreviewDelete200ResponseInner.status);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

