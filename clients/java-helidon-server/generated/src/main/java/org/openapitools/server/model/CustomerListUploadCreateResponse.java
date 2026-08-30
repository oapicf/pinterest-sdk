package org.openapitools.server.model;

import org.openapitools.server.model.CustomerListUpload;
import org.openapitools.server.model.S3MultipartUploadData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomerListUploadCreateResponse   {

    private CustomerListUpload customerListUpload;
    private S3MultipartUploadData s3MultipartUploadData;

    /**
     * Default constructor.
     */
    public CustomerListUploadCreateResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomerListUploadCreateResponse.
     *
     * @param customerListUpload The Customer List Upload created.
     * @param s3MultipartUploadData Pre-signed upload URLs corresponding to each part of the upload.
     */
    public CustomerListUploadCreateResponse(
        CustomerListUpload customerListUpload, 
        S3MultipartUploadData s3MultipartUploadData
    ) {
        this.customerListUpload = customerListUpload;
        this.s3MultipartUploadData = s3MultipartUploadData;
    }



    /**
     * The Customer List Upload created.
     * @return customerListUpload
     */
    public CustomerListUpload getCustomerListUpload() {
        return customerListUpload;
    }

    public void setCustomerListUpload(CustomerListUpload customerListUpload) {
        this.customerListUpload = customerListUpload;
    }

    /**
     * Pre-signed upload URLs corresponding to each part of the upload.
     * @return s3MultipartUploadData
     */
    public S3MultipartUploadData getS3MultipartUploadData() {
        return s3MultipartUploadData;
    }

    public void setS3MultipartUploadData(S3MultipartUploadData s3MultipartUploadData) {
        this.s3MultipartUploadData = s3MultipartUploadData;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerListUploadCreateResponse {\n");
        
        sb.append("    customerListUpload: ").append(toIndentedString(customerListUpload)).append("\n");
        sb.append("    s3MultipartUploadData: ").append(toIndentedString(s3MultipartUploadData)).append("\n");
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

