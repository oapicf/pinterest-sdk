package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The ID of the ad account.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TermsOfService   {
  @JsonProperty("ad_account_id")
  
  private String adAccountId;

  @JsonProperty("has_accepted")
  
  private Boolean hasAccepted;

  @JsonProperty("html")
  
  private String html;

  @JsonProperty("id")
  
  private String id;

  public TermsOfService adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * The ID of the ad account.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public TermsOfService hasAccepted(Boolean hasAccepted) {
    this.hasAccepted = hasAccepted;
    return this;
  }

   /**
   * Whether the ad account has accepted terms of service.
   * @return hasAccepted
  **/
  public Boolean getHasAccepted() {
    return hasAccepted;
  }

  public void setHasAccepted(Boolean hasAccepted) {
    this.hasAccepted = hasAccepted;
  }

  public TermsOfService html(String html) {
    this.html = html;
    return this;
  }

   /**
   * The terms of service content
   * @return html
  **/
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public TermsOfService id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the terms of service
   * @return id
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

