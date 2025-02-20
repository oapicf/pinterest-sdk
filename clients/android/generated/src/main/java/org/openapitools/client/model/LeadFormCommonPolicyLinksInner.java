/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LeadFormCommonPolicyLinksInner {
  
  @SerializedName("label")
  private String label = null;
  @SerializedName("link")
  private String link = null;

  /**
   * Policy label for an additional policy link.
   **/
  @ApiModelProperty(value = "Policy label for an additional policy link.")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Policy link for an additional policy link.
   **/
  @ApiModelProperty(value = "Policy link for an additional policy link.")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner = (LeadFormCommonPolicyLinksInner) o;
    return (this.label == null ? leadFormCommonPolicyLinksInner.label == null : this.label.equals(leadFormCommonPolicyLinksInner.label)) &&
        (this.link == null ? leadFormCommonPolicyLinksInner.link == null : this.link.equals(leadFormCommonPolicyLinksInner.link));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.label == null ? 0: this.label.hashCode());
    result = 31 * result + (this.link == null ? 0: this.link.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormCommonPolicyLinksInner {\n");
    
    sb.append("  label: ").append(label).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
