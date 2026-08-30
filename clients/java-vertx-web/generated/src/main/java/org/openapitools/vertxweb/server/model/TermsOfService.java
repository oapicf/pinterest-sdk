package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The ID of the ad account.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TermsOfService   {
  
  private String adAccountId;
  private Boolean hasAccepted;
  private String html;
  private String id;

  public TermsOfService () {

  }

  public TermsOfService (String adAccountId, Boolean hasAccepted, String html, String id) {
    this.adAccountId = adAccountId;
    this.hasAccepted = hasAccepted;
    this.html = html;
    this.id = id;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("has_accepted")
  public Boolean getHasAccepted() {
    return hasAccepted;
  }
  public void setHasAccepted(Boolean hasAccepted) {
    this.hasAccepted = hasAccepted;
  }

    
  @JsonProperty("html")
  public String getHtml() {
    return html;
  }
  public void setHtml(String html) {
    this.html = html;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
    return Objects.equals(adAccountId, termsOfService.adAccountId) &&
        Objects.equals(hasAccepted, termsOfService.hasAccepted) &&
        Objects.equals(html, termsOfService.html) &&
        Objects.equals(id, termsOfService.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, hasAccepted, html, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermsOfService {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    hasAccepted: ").append(toIndentedString(hasAccepted)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
