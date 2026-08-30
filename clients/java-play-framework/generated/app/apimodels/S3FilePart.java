package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * S3FilePart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class S3FilePart   {
  @JsonProperty("part_number")
  @NotNull

  private Integer partNumber;

  @JsonProperty("presigned_url")
  @NotNull

  private String presignedUrl;

  public S3FilePart partNumber(Integer partNumber) {
    this.partNumber = partNumber;
    return this;
  }

   /**
   * Part number for upload.
   * @return partNumber
  **/
  public Integer getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(Integer partNumber) {
    this.partNumber = partNumber;
  }

  public S3FilePart presignedUrl(String presignedUrl) {
    this.presignedUrl = presignedUrl;
    return this;
  }

   /**
   * Pre-signed URL.
   * @return presignedUrl
  **/
  public String getPresignedUrl() {
    return presignedUrl;
  }

  public void setPresignedUrl(String presignedUrl) {
    this.presignedUrl = presignedUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3FilePart s3FilePart = (S3FilePart) o;
    return Objects.equals(partNumber, s3FilePart.partNumber) &&
        Objects.equals(presignedUrl, s3FilePart.presignedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partNumber, presignedUrl);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3FilePart {\n");
    
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    presignedUrl: ").append(toIndentedString(presignedUrl)).append("\n");
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

