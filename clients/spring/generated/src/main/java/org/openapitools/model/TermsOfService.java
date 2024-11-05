package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TermsOfService
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TermsOfService {

  private String id;

  private JsonNullable<String> html = JsonNullable.<String>undefined();

  private Boolean hasAccepted;

  private String adAccountId;

  public TermsOfService id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the terms of service
   * @return id
   */
  
  @Schema(name = "id", example = "2650449554526", description = "The ID of the terms of service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TermsOfService html(String html) {
    this.html = JsonNullable.of(html);
    return this;
  }

  /**
   * The terms of service content
   * @return html
   */
  
  @Schema(name = "html", example = "example test", description = "The terms of service content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html")
  public JsonNullable<String> getHtml() {
    return html;
  }

  public void setHtml(JsonNullable<String> html) {
    this.html = html;
  }

  public TermsOfService hasAccepted(Boolean hasAccepted) {
    this.hasAccepted = hasAccepted;
    return this;
  }

  /**
   * Whether the ad account has accepted terms of service.
   * @return hasAccepted
   */
  
  @Schema(name = "has_accepted", example = "true", description = "Whether the ad account has accepted terms of service.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_accepted")
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
   */
  
  @Schema(name = "ad_account_id", example = "549755885175", description = "The ID of the ad account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        equalsNullable(this.html, termsOfService.html) &&
        Objects.equals(this.hasAccepted, termsOfService.hasAccepted) &&
        Objects.equals(this.adAccountId, termsOfService.adAccountId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(html), hasAccepted, adAccountId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

