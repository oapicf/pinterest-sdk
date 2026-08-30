package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BillingInvoiceDownloadResponse   {
  @JsonProperty("download_url")
  private String downloadUrl;

  @JsonProperty("id")
  private String id;

  /**
   * The download url for the billing invoice
   **/
  public BillingInvoiceDownloadResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  
  @ApiModelProperty(value = "The download url for the billing invoice")
  @JsonProperty("download_url")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  /**
   * The billing invoice id
   **/
  public BillingInvoiceDownloadResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The billing invoice id")
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

