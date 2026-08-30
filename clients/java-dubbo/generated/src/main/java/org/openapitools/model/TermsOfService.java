package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The ID of the ad account.
 */
public class TermsOfService implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of the ad account.
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  /**
   * Whether the ad account has accepted terms of service.
   */
  @JsonProperty("has_accepted")
  private Boolean hasAccepted;

  /**
   * The terms of service content
   */
  @JsonProperty("html")
  private String html;

  /**
   * The ID of the terms of service
   */
  @JsonProperty("id")
  private String id;

  /**
   * The ID of the ad account.
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Whether the ad account has accepted terms of service.
   * @return hasAccepted
   */
  public Boolean getHasAccepted() {
    return hasAccepted;
  }

  public void setHasAccepted(Boolean hasAccepted) {
    this.hasAccepted = hasAccepted;
  }

  /**
   * The terms of service content
   * @return html
   */
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  /**
   * The ID of the terms of service
   * @return id
   */
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
    return Objects.equals(this.adAccountId, termsOfService.adAccountId) &&
        Objects.equals(this.hasAccepted, termsOfService.hasAccepted) &&
        Objects.equals(this.html, termsOfService.html) &&
        Objects.equals(this.id, termsOfService.id);
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
