package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("CampaignAdPreviewCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignAdPreviewCreate   {
  private String adGroupId;

  public CampaignAdPreviewCreate() {
  }

  @JsonCreator
  public CampaignAdPreviewCreate(
    @JsonProperty(required = true, value = "ad_group_id") String adGroupId
  ) {
    this.adGroupId = adGroupId;
  }

  /**
   * Ad group ID to create a preview record for.
   **/
  public CampaignAdPreviewCreate adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890", required = true, value = "Ad group ID to create a preview record for.")
  @JsonProperty(required = true, value = "ad_group_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)public String getAdGroupId() {
    return adGroupId;
  }

  @JsonProperty(required = true, value = "ad_group_id")
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignAdPreviewCreate campaignAdPreviewCreate = (CampaignAdPreviewCreate) o;
    return Objects.equals(this.adGroupId, campaignAdPreviewCreate.adGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewCreate {\n");
    
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
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
