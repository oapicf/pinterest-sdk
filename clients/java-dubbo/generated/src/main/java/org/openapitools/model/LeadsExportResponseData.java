package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadsExportStatus;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LeadsExportResponseData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("download_url")
  private String downloadUrl;

  @JsonProperty("export_status")
  private LeadsExportStatus exportStatus;

  /**
   * 
   * @return downloadUrl
   */
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  /**
   * 
   * @return exportStatus
   */
  public LeadsExportStatus getExportStatus() {
    return exportStatus;
  }

  public void setExportStatus(LeadsExportStatus exportStatus) {
    this.exportStatus = exportStatus;
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
    return Objects.equals(this.downloadUrl, leadsExportResponseData.downloadUrl) &&
        Objects.equals(this.exportStatus, leadsExportResponseData.exportStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, exportStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadsExportResponseData {\n");
    
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    exportStatus: ").append(toIndentedString(exportStatus)).append("\n");
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
