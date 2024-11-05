package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LeadFormCommonPolicyLinksInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadFormCommonPolicyLinksInner   {
  @JsonProperty("label")
  private String label;

  @JsonProperty("link")
  private String link;

  public LeadFormCommonPolicyLinksInner label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Policy label for an additional policy link.
   * @return label
   */
  @ApiModelProperty(value = "Policy label for an additional policy link.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LeadFormCommonPolicyLinksInner link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Policy link for an additional policy link.
   * @return link
   */
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

