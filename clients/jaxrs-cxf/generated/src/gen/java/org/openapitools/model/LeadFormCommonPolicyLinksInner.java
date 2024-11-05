package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadFormCommonPolicyLinksInner  {
  
  @ApiModelProperty(value = "Policy label for an additional policy link.")
 /**
   * Policy label for an additional policy link.
  **/
  private String label;

  @ApiModelProperty(value = "Policy link for an additional policy link.")
 /**
   * Policy link for an additional policy link.
  **/
  private String link;
 /**
   * Policy label for an additional policy link.
   * @return label
  **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LeadFormCommonPolicyLinksInner label(String label) {
    this.label = label;
    return this;
  }

 /**
   * Policy link for an additional policy link.
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public LeadFormCommonPolicyLinksInner link(String link) {
    this.link = link;
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
    LeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner = (LeadFormCommonPolicyLinksInner) o;
    return Objects.equals(this.label, leadFormCommonPolicyLinksInner.label) &&
        Objects.equals(this.link, leadFormCommonPolicyLinksInner.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormCommonPolicyLinksInner {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

