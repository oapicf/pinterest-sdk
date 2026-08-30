package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CustomerListUpload;
import org.openapitools.model.S3MultipartUploadData;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListUploadCreateResponse   {
  
  private CustomerListUpload customerListUpload;
  private S3MultipartUploadData s3MultipartUploadData;

  /**
   * The Customer List Upload created.
   **/
  
  @ApiModelProperty(required = true, value = "The Customer List Upload created.")
  @JsonProperty("customer_list_upload")
  @NotNull
  public CustomerListUpload getCustomerListUpload() {
    return customerListUpload;
  }
  public void setCustomerListUpload(CustomerListUpload customerListUpload) {
    this.customerListUpload = customerListUpload;
  }

  /**
   * Pre-signed upload URLs corresponding to each part of the upload.
   **/
  
  @ApiModelProperty(required = true, value = "Pre-signed upload URLs corresponding to each part of the upload.")
  @JsonProperty("s3_multipart_upload_data")
  @NotNull
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

