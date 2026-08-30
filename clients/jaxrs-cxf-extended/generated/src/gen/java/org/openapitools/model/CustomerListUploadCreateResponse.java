package org.openapitools.model;

import org.openapitools.model.CustomerListUpload;
import org.openapitools.model.S3MultipartUploadData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerListUploadCreateResponse  {
  
 /**
  * The Customer List Upload created.
  */
  @ApiModelProperty(required = true, value = "The Customer List Upload created.")
  @Valid
  private CustomerListUpload customerListUpload;

 /**
  * Pre-signed upload URLs corresponding to each part of the upload.
  */
  @ApiModelProperty(required = true, value = "Pre-signed upload URLs corresponding to each part of the upload.")
  @Valid
  private S3MultipartUploadData s3MultipartUploadData;
 /**
  * The Customer List Upload created.
  * @return customerListUpload
  */
  @JsonProperty("customer_list_upload")
  @NotNull
  public CustomerListUpload getCustomerListUpload() {
    return customerListUpload;
  }

  /**
   * Sets the <code>customerListUpload</code> property.
   */
 public void setCustomerListUpload(CustomerListUpload customerListUpload) {
    this.customerListUpload = customerListUpload;
  }

  /**
   * Sets the <code>customerListUpload</code> property.
   */
  public CustomerListUploadCreateResponse customerListUpload(CustomerListUpload customerListUpload) {
    this.customerListUpload = customerListUpload;
    return this;
  }

 /**
  * Pre-signed upload URLs corresponding to each part of the upload.
  * @return s3MultipartUploadData
  */
  @JsonProperty("s3_multipart_upload_data")
  @NotNull
  public S3MultipartUploadData getS3MultipartUploadData() {
    return s3MultipartUploadData;
  }

  /**
   * Sets the <code>s3MultipartUploadData</code> property.
   */
 public void setS3MultipartUploadData(S3MultipartUploadData s3MultipartUploadData) {
    this.s3MultipartUploadData = s3MultipartUploadData;
  }

  /**
   * Sets the <code>s3MultipartUploadData</code> property.
   */
  public CustomerListUploadCreateResponse s3MultipartUploadData(S3MultipartUploadData s3MultipartUploadData) {
    this.s3MultipartUploadData = s3MultipartUploadData;
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
    CustomerListUploadCreateResponse customerListUploadCreateResponse = (CustomerListUploadCreateResponse) o;
    return Objects.equals(this.customerListUpload, customerListUploadCreateResponse.customerListUpload) &&
        Objects.equals(this.s3MultipartUploadData, customerListUploadCreateResponse.s3MultipartUploadData);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

