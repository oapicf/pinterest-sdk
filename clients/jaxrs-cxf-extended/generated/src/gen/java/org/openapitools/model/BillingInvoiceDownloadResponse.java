package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BillingInvoiceDownloadResponse  {
  
 /**
  * The download url for the billing invoice
  */
  @ApiModelProperty(value = "The download url for the billing invoice")
  private String downloadUrl;

 /**
  * The billing invoice id
  */
  @ApiModelProperty(value = "The billing invoice id")
  private String id;
 /**
  * The download url for the billing invoice
  * @return downloadUrl
  */
  @JsonProperty("download_url")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  /**
   * Sets the <code>downloadUrl</code> property.
   */
 public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  /**
   * Sets the <code>downloadUrl</code> property.
   */
  public BillingInvoiceDownloadResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

 /**
  * The billing invoice id
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public BillingInvoiceDownloadResponse id(String id) {
    this.id = id;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

