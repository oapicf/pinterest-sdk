package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BillingInvoiceDownloadResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BillingInvoiceDownloadResponse {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String downloadUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  public BillingInvoiceDownloadResponse downloadUrl(@Nullable String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * The download url for the billing invoice
   * @return downloadUrl
   */
  
  @Schema(name = "download_url", description = "The download url for the billing invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("download_url")
  public @Nullable String getDownloadUrl() {
    return downloadUrl;
  }

  @JsonProperty("download_url")
  public void setDownloadUrl(@Nullable String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public BillingInvoiceDownloadResponse id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The billing invoice id
   * @return id
   */
  
  @Schema(name = "id", description = "The billing invoice id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
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
    BillingInvoiceDownloadResponse billingInvoiceDownloadResponse = (BillingInvoiceDownloadResponse) o;
    return Objects.equals(this.downloadUrl, billingInvoiceDownloadResponse.downloadUrl) &&
        Objects.equals(this.id, billingInvoiceDownloadResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoiceDownloadResponse {\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

