package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BillingInvoiceDownloadResponse   {

    private String downloadUrl;
    private String id;

    /**
     * Default constructor.
     */
    public BillingInvoiceDownloadResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create BillingInvoiceDownloadResponse.
     *
     * @param downloadUrl The download url for the billing invoice
     * @param id The billing invoice id
     */
    public BillingInvoiceDownloadResponse(
        String downloadUrl, 
        String id
    ) {
        this.downloadUrl = downloadUrl;
        this.id = id;
    }



    /**
     * The download url for the billing invoice
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * The billing invoice id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

