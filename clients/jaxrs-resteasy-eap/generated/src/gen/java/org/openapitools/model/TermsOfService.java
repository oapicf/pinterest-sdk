package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TermsOfService   {
  
  private String id;
  private String html;
  private Boolean hasAccepted;
  private String adAccountId;

  /**
   * The ID of the terms of service
   **/
  
  @ApiModelProperty(example = "2650449554526", value = "The ID of the terms of service")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The terms of service content
   **/
  
  @ApiModelProperty(example = "example test", value = "The terms of service content")
  @JsonProperty("html")
  public String getHtml() {
    return html;
  }
  public void setHtml(String html) {
    this.html = html;
  }

  /**
   * Whether the ad account has accepted terms of service.
   **/
  
  @ApiModelProperty(example = "true", value = "Whether the ad account has accepted terms of service.")
  @JsonProperty("has_accepted")
  public Boolean getHasAccepted() {
    return hasAccepted;
  }
  public void setHasAccepted(Boolean hasAccepted) {
    this.hasAccepted = hasAccepted;
  }

  /**
   * The ID of the ad account.
   **/
  
  @ApiModelProperty(example = "549755885175", value = "The ID of the ad account.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

