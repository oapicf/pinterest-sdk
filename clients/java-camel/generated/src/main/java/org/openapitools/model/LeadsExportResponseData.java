package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadsExportStatus;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LeadsExportResponseData
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadsExportResponseData {

  private LeadsExportStatus exportStatus;

  private JsonNullable<String> downloadUrl = JsonNullable.<String>undefined();

  public LeadsExportResponseData exportStatus(LeadsExportStatus exportStatus) {
    this.exportStatus = exportStatus;
    return this;
  }

  /**
   * Get exportStatus
   * @return exportStatus
   */
  @Valid 
  @Schema(name = "export_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("export_status")
  public LeadsExportStatus getExportStatus() {
    return exportStatus;
  }

  public void setExportStatus(LeadsExportStatus exportStatus) {
    this.exportStatus = exportStatus;
  }

  public LeadsExportResponseData downloadUrl(String downloadUrl) {
    this.downloadUrl = JsonNullable.of(downloadUrl);
    return this;
  }

  /**
   * Get downloadUrl
   * @return downloadUrl
   */
  
  @Schema(name = "download_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("download_url")
  public JsonNullable<String> getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(JsonNullable<String> downloadUrl) {
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
        equalsNullable(this.downloadUrl, leadsExportResponseData.downloadUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportStatus, hashCodeNullable(downloadUrl));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

