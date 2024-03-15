package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetMMMReportResponseData
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GetMMMReportResponseData {

  /**
   * Gets or Sets reportStatus
   */
  public enum ReportStatusEnum {
    DOES_NOT_EXIST("DOES_NOT_EXIST"),
    
    FINISHED("FINISHED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    EXPIRED("EXPIRED"),
    
    FAILED("FAILED"),
    
    CANCELLED("CANCELLED");

    private String value;

    ReportStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReportStatusEnum fromValue(String value) {
      for (ReportStatusEnum b : ReportStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReportStatusEnum reportStatus;

  private JsonNullable<String> url = JsonNullable.<String>undefined();

  private JsonNullable<BigDecimal> size = JsonNullable.<BigDecimal>undefined();

  public GetMMMReportResponseData reportStatus(ReportStatusEnum reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

  /**
   * Get reportStatus
   * @return reportStatus
  */
  
  @Schema(name = "report_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("report_status")
  public ReportStatusEnum getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(ReportStatusEnum reportStatus) {
    this.reportStatus = reportStatus;
  }

  public GetMMMReportResponseData url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }

  public GetMMMReportResponseData size(BigDecimal size) {
    this.size = JsonNullable.of(size);
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @Valid 
  @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public JsonNullable<BigDecimal> getSize() {
    return size;
  }

  public void setSize(JsonNullable<BigDecimal> size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMMMReportResponseData getMMMReportResponseData = (GetMMMReportResponseData) o;
    return Objects.equals(this.reportStatus, getMMMReportResponseData.reportStatus) &&
        equalsNullable(this.url, getMMMReportResponseData.url) &&
        equalsNullable(this.size, getMMMReportResponseData.size);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportStatus, hashCodeNullable(url), hashCodeNullable(size));
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
    sb.append("class GetMMMReportResponseData {\n");
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

