package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TermsOfService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TermsOfService   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("html")
  
  private String html;

  @JsonProperty("has_accepted")
  
  private Boolean hasAccepted;

  @JsonProperty("ad_account_id")
  
  private String adAccountId;

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

  @SuppressWarnings("StringBufferReplaceableByString")
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

