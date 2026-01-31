package apimodels;

import apimodels.S3FilePart;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * S3MultipartUploadData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class S3MultipartUploadData   {
  @JsonProperty("file_parts")
  @Valid

  private List<@Valid S3FilePart> fileParts = null;

  public S3MultipartUploadData fileParts(List<@Valid S3FilePart> fileParts) {
    this.fileParts = fileParts;
    return this;
  }

  public S3MultipartUploadData addFilePartsItem(S3FilePart filePartsItem) {
    if (this.fileParts == null) {
      this.fileParts = new ArrayList<>();
    }
    this.fileParts.add(filePartsItem);
    return this;
  }

   /**
   * Array of file parts with pre-signed URLs.
   * @return fileParts
  **/
  public List<@Valid S3FilePart> getFileParts() {
    return fileParts;
  }

  public void setFileParts(List<@Valid S3FilePart> fileParts) {
    this.fileParts = fileParts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3MultipartUploadData s3MultipartUploadData = (S3MultipartUploadData) o;
    return Objects.equals(fileParts, s3MultipartUploadData.fileParts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileParts);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3MultipartUploadData {\n");
    
    sb.append("    fileParts: ").append(toIndentedString(fileParts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

