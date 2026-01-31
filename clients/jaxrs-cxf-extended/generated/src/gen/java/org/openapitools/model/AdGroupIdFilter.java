package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupIdFilter  {
  
 /**
  * List of ad group ids
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad group ids")
  private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();
 /**
  * List of ad group ids
  * @return adGroupIds
  */
  @JsonProperty("ad_group_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }

  /**
   * Sets the <code>adGroupIds</code> property.
   */
 public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   * Sets the <code>adGroupIds</code> property.
   */
  public AdGroupIdFilter adGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  /**
   * Adds a new item to the <code>adGroupIds</code> list.
   */
  public AdGroupIdFilter addAdGroupIdsItem(String adGroupIdsItem) {
    this.adGroupIds.add(adGroupIdsItem);
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
    AdGroupIdFilter adGroupIdFilter = (AdGroupIdFilter) o;
    return Objects.equals(this.adGroupIds, adGroupIdFilter.adGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupIdFilter {\n");
    
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

