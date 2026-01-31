package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class S3FilePart   {
  
  private Integer partNumber;
  private String presignedUrl;

  public S3FilePart () {

  }

  public S3FilePart (Integer partNumber, String presignedUrl) {
    this.partNumber = partNumber;
    this.presignedUrl = presignedUrl;
  }

    
  @JsonProperty("part_number")
  public Integer getPartNumber() {
    return partNumber;
  }
  public void setPartNumber(Integer partNumber) {
    this.partNumber = partNumber;
  }

    
  @JsonProperty("presigned_url")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
