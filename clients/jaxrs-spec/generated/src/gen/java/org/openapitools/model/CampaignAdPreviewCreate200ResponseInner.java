package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInnerData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("campaign_ad_preview_create_200_response_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignAdPreviewCreate200ResponseInner   {
  private CampaignAdPreviewCreate200ResponseInnerData data;

  public CampaignAdPreviewCreate200ResponseInner() {
  }

  @JsonCreator
  public CampaignAdPreviewCreate200ResponseInner(
    @JsonProperty(required = true, value = "data") CampaignAdPreviewCreate200ResponseInnerData data
  ) {
    this.data = data;
  }

  /**
   **/
  public CampaignAdPreviewCreate200ResponseInner data(CampaignAdPreviewCreate200ResponseInnerData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "data")
  @NotNull @Valid public CampaignAdPreviewCreate200ResponseInnerData getData() {
    return data;
  }

  @JsonProperty(required = true, value = "data")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
