package org.openapitools.model;

import org.openapitools.model.S3FilePart;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class S3MultipartUploadData implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Array of file parts with pre-signed URLs.
   */
  @JsonProperty("file_parts")
  private List<S3FilePart> fileParts = new ArrayList<>();

  /**
   * Array of file parts with pre-signed URLs.
   * @return fileParts
   */
  public List<S3FilePart> getFileParts() {
    return fileParts;
  }

  public void setFileParts(List<S3FilePart> fileParts) {
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
    return Objects.equals(this.fileParts, s3MultipartUploadData.fileParts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileParts);
  }

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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
