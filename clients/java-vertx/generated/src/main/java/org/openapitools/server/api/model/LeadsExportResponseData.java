package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.LeadsExportStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadsExportResponseData   {
  
  private LeadsExportStatus exportStatus;
  private String downloadUrl;

  public LeadsExportResponseData () {

  }

  public LeadsExportResponseData (LeadsExportStatus exportStatus, String downloadUrl) {
    this.exportStatus = exportStatus;
    this.downloadUrl = downloadUrl;
  }

    
  @JsonProperty("export_status")
  public LeadsExportStatus getExportStatus() {
    return exportStatus;
  }
  public void setExportStatus(LeadsExportStatus exportStatus) {
    this.exportStatus = exportStatus;
  }

    
  @JsonProperty("download_url")
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
    LeadsExportResponseData leadsExportResponseData = (LeadsExportResponseData) o;
    return Objects.equals(exportStatus, leadsExportResponseData.exportStatus) &&
        Objects.equals(downloadUrl, leadsExportResponseData.downloadUrl);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
