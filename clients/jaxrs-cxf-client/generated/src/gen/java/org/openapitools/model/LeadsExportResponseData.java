package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadsExportStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadsExportResponseData  {
  
  @ApiModelProperty(value = "")
  private LeadsExportStatus exportStatus;

  @ApiModelProperty(value = "")
  private String downloadUrl;
 /**
   * Get exportStatus
   * @return exportStatus
  **/
  @JsonProperty("export_status")
  public LeadsExportStatus getExportStatus() {
    return exportStatus;
  }

  public void setExportStatus(LeadsExportStatus exportStatus) {
    this.exportStatus = exportStatus;
  }

  public LeadsExportResponseData exportStatus(LeadsExportStatus exportStatus) {
    this.exportStatus = exportStatus;
    return this;
  }

 /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @JsonProperty("download_url")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public LeadsExportResponseData downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsExportResponseData leadsExportResponseData = (LeadsExportResponseData) o;
    return Objects.equals(this.exportStatus, leadsExportResponseData.exportStatus) &&
        Objects.equals(this.downloadUrl, leadsExportResponseData.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportStatus, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadsExportResponseData {\n");
    
    sb.append("    exportStatus: ").append(toIndentedString(exportStatus)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

