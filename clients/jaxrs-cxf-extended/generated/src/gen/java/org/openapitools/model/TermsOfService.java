package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TermsOfService  {
  
 /**
  * The ID of the terms of service
  */
  @ApiModelProperty(example = "2650449554526", value = "The ID of the terms of service")
  private String id;

 /**
  * The terms of service content
  */
  @ApiModelProperty(example = "example test", value = "The terms of service content")
  private String html;

 /**
  * Whether the ad account has accepted terms of service.
  */
  @ApiModelProperty(example = "true", value = "Whether the ad account has accepted terms of service.")
  private Boolean hasAccepted;

 /**
  * The ID of the ad account.
  */
  @ApiModelProperty(example = "549755885175", value = "The ID of the ad account.")
  private String adAccountId;
 /**
  * The ID of the terms of service
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public TermsOfService id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The terms of service content
  * @return html
  */
  @JsonProperty("html")
  public String getHtml() {
    return html;
  }

  /**
   * Sets the <code>html</code> property.
   */
 public void setHtml(String html) {
    this.html = html;
  }

  /**
   * Sets the <code>html</code> property.
   */
  public TermsOfService html(String html) {
    this.html = html;
    return this;
  }

 /**
  * Whether the ad account has accepted terms of service.
  * @return hasAccepted
  */
  @JsonProperty("has_accepted")
  public Boolean getHasAccepted() {
    return hasAccepted;
  }

  /**
   * Sets the <code>hasAccepted</code> property.
   */
 public void setHasAccepted(Boolean hasAccepted) {
    this.hasAccepted = hasAccepted;
  }

  /**
   * Sets the <code>hasAccepted</code> property.
   */
  public TermsOfService hasAccepted(Boolean hasAccepted) {
    this.hasAccepted = hasAccepted;
    return this;
  }

 /**
  * The ID of the ad account.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public TermsOfService adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
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
    TermsOfService termsOfService = (TermsOfService) o;
    return Objects.equals(this.id, termsOfService.id) &&
        Objects.equals(this.html, termsOfService.html) &&
        Objects.equals(this.hasAccepted, termsOfService.hasAccepted) &&
        Objects.equals(this.adAccountId, termsOfService.adAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, html, hasAccepted, adAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermsOfService {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    hasAccepted: ").append(toIndentedString(hasAccepted)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
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

