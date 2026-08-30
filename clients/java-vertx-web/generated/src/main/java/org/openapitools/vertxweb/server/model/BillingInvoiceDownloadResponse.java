package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingInvoiceDownloadResponse   {
  
  private String downloadUrl;
  private String id;

  public BillingInvoiceDownloadResponse () {

  }

  public BillingInvoiceDownloadResponse (String downloadUrl, String id) {
    this.downloadUrl = downloadUrl;
    this.id = id;
  }

    
  @JsonProperty("download_url")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
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
    BillingInvoiceDownloadResponse billingInvoiceDownloadResponse = (BillingInvoiceDownloadResponse) o;
    return Objects.equals(downloadUrl, billingInvoiceDownloadResponse.downloadUrl) &&
        Objects.equals(id, billingInvoiceDownloadResponse.id);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
