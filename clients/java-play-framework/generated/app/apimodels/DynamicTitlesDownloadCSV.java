package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DynamicTitlesDownloadCSV
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-07T04:05:46.315568162Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DynamicTitlesDownloadCSV   {
  @JsonProperty("download_url")
  
  private String downloadUrl;

  public DynamicTitlesDownloadCSV downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Pre-signed S3 URL to download the CSV file.
   * @return downloadUrl
  **/
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicTitlesDownloadCSV dynamicTitlesDownloadCSV = (DynamicTitlesDownloadCSV) o;
    return Objects.equals(downloadUrl, dynamicTitlesDownloadCSV.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTitlesDownloadCSV {\n");
    
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

