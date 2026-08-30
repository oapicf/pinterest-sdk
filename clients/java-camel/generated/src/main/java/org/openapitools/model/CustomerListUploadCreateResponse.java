package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CustomerListUpload;
import org.openapitools.model.S3MultipartUploadData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CustomerListUploadCreateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListUploadCreateResponse {

  private CustomerListUpload customerListUpload;

  private S3MultipartUploadData s3MultipartUploadData;

  public CustomerListUploadCreateResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerListUploadCreateResponse(CustomerListUpload customerListUpload, S3MultipartUploadData s3MultipartUploadData) {
    this.customerListUpload = customerListUpload;
    this.s3MultipartUploadData = s3MultipartUploadData;
  }

  public CustomerListUploadCreateResponse customerListUpload(CustomerListUpload customerListUpload) {
    this.customerListUpload = customerListUpload;
    return this;
  }

  /**
   * The Customer List Upload created.
   * @return customerListUpload
   */
  @NotNull @Valid 
  @Schema(name = "customer_list_upload", description = "The Customer List Upload created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customer_list_upload")
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
  @NotNull @Valid 
  @Schema(name = "s3_multipart_upload_data", description = "Pre-signed upload URLs corresponding to each part of the upload.", requiredMode = Schema.RequiredMode.REQUIRED)
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

