package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadsExportStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadsExportResponseData   {
  
  private LeadsExportStatus exportStatus;
  private String downloadUrl;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("export_status")
  public LeadsExportStatus getExportStatus() {
    return exportStatus;
  }
  public void setExportStatus(LeadsExportStatus exportStatus) {
    this.exportStatus = exportStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

