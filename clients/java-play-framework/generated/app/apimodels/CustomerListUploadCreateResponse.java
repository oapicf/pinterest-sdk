package apimodels;

import apimodels.CustomerListUpload;
import apimodels.S3MultipartUploadData;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomerListUploadCreateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomerListUploadCreateResponse   {
  @JsonProperty("customer_list_upload")
  @NotNull
@Valid

  private CustomerListUpload customerListUpload;

  @JsonProperty("s3_multipart_upload_data")
  @NotNull
@Valid

  private S3MultipartUploadData s3MultipartUploadData;

  public CustomerListUploadCreateResponse customerListUpload(CustomerListUpload customerListUpload) {
    this.customerListUpload = customerListUpload;
    return this;
  }

   /**
   * The Customer List Upload created.
   * @return customerListUpload
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

