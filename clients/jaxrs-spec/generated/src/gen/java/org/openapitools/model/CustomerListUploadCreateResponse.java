package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CustomerListUpload;
import org.openapitools.model.S3MultipartUploadData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CustomerListUploadCreateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListUploadCreateResponse   {
  private CustomerListUpload customerListUpload;
  private S3MultipartUploadData s3MultipartUploadData;

  public CustomerListUploadCreateResponse() {
  }

  @JsonCreator
  public CustomerListUploadCreateResponse(
    @JsonProperty(required = true, value = "customer_list_upload") CustomerListUpload customerListUpload,
    @JsonProperty(required = true, value = "s3_multipart_upload_data") S3MultipartUploadData s3MultipartUploadData
  ) {
    this.customerListUpload = customerListUpload;
    this.s3MultipartUploadData = s3MultipartUploadData;
  }

  /**
   * The Customer List Upload created.
   **/
  public CustomerListUploadCreateResponse customerListUpload(CustomerListUpload customerListUpload) {
    this.customerListUpload = customerListUpload;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Customer List Upload created.")
  @JsonProperty(required = true, value = "customer_list_upload")
  @NotNull @Valid public CustomerListUpload getCustomerListUpload() {
    return customerListUpload;
  }

  @JsonProperty(required = true, value = "customer_list_upload")
  public void setCustomerListUpload(CustomerListUpload customerListUpload) {
    this.customerListUpload = customerListUpload;
  }

  /**
   * Pre-signed upload URLs corresponding to each part of the upload.
   **/
  public CustomerListUploadCreateResponse s3MultipartUploadData(S3MultipartUploadData s3MultipartUploadData) {
    this.s3MultipartUploadData = s3MultipartUploadData;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Pre-signed upload URLs corresponding to each part of the upload.")
  @JsonProperty(required = true, value = "s3_multipart_upload_data")
  @NotNull @Valid public S3MultipartUploadData getS3MultipartUploadData() {
    return s3MultipartUploadData;
  }

  @JsonProperty(required = true, value = "s3_multipart_upload_data")
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
