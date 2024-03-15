package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TermsOfService   {
  
  private String id;
  private String html;
  private Boolean hasAccepted;
  private String adAccountId;

  public TermsOfService () {

  }

  public TermsOfService (String id, String html, Boolean hasAccepted, String adAccountId) {
    this.id = id;
    this.html = html;
    this.hasAccepted = hasAccepted;
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("html")
  public String getHtml() {
    return html;
  }
  public void setHtml(String html) {
    this.html = html;
  }

    
  @JsonProperty("has_accepted")
  public Boolean getHasAccepted() {
    return hasAccepted;
  }
  public void setHasAccepted(Boolean hasAccepted) {
    this.hasAccepted = hasAccepted;
  }

    
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
    return Objects.equals(id, termsOfService.id) &&
        Objects.equals(html, termsOfService.html) &&
        Objects.equals(hasAccepted, termsOfService.hasAccepted) &&
        Objects.equals(adAccountId, termsOfService.adAccountId);
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
