package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CustomerListUpload;
import org.openapitools.vertxweb.server.model.S3MultipartUploadData;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerListUploadCreateResponse   {
  
  private CustomerListUpload customerListUpload;
  private S3MultipartUploadData s3MultipartUploadData;

  public CustomerListUploadCreateResponse () {

  }

  public CustomerListUploadCreateResponse (CustomerListUpload customerListUpload, S3MultipartUploadData s3MultipartUploadData) {
    this.customerListUpload = customerListUpload;
    this.s3MultipartUploadData = s3MultipartUploadData;
  }

    
  @JsonProperty("customer_list_upload")
  public CustomerListUpload getCustomerListUpload() {
    return customerListUpload;
  }
  public void setCustomerListUpload(CustomerListUpload customerListUpload) {
    this.customerListUpload = customerListUpload;
  }

    
  @JsonProperty("s3_multipart_upload_data")
  public S3MultipartUploadData getS3MultipartUploadData() {
    return s3MultipartUploadData;
  }
  public void setS3MultipartUploadData(S3MultipartUploadData s3MultipartUploadData) {
    this.s3MultipartUploadData = s3MultipartUploadData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerListUploadCreateResponse customerListUploadCreateResponse = (CustomerListUploadCreateResponse) o;
    return Objects.equals(customerListUpload, customerListUploadCreateResponse.customerListUpload) &&
        Objects.equals(s3MultipartUploadData, customerListUploadCreateResponse.s3MultipartUploadData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerListUpload, s3MultipartUploadData);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
