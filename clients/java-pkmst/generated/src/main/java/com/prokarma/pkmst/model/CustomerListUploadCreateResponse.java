package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CustomerListUpload;
import com.prokarma.pkmst.model.S3MultipartUploadData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CustomerListUploadCreateResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListUploadCreateResponse   {
  @JsonProperty("customer_list_upload")
  private CustomerListUpload customerListUpload;

  @JsonProperty("s3_multipart_upload_data")
  private S3MultipartUploadData s3MultipartUploadData;

  public CustomerListUploadCreateResponse customerListUpload(CustomerListUpload customerListUpload) {
    this.customerListUpload = customerListUpload;
    return this;
  }

  /**
   * The Customer List Upload created.
   * @return customerListUpload
   */
  @ApiModelProperty(required = true, value = "The Customer List Upload created.")
  public CustomerListUpload getCustomerListUpload() {
    return customerListUpload;
  }

  public void setCustomerListUpload(CustomerListUpload customerListUpload) {
    this.customerListUpload = customerListUpload;
  }

  public CustomerListUploadCreateResponse s3MultipartUploadData(S3MultipartUploadData s3MultipartUploadData) {
    this.s3MultipartUploadData = s3MultipartUploadData;
    return this;
  }

  /**
   * Pre-signed upload URLs corresponding to each part of the upload.
   * @return s3MultipartUploadData
   */
  @ApiModelProperty(required = true, value = "Pre-signed upload URLs corresponding to each part of the upload.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

