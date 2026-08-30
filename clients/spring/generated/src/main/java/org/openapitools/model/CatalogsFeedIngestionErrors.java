package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsFeedIngestionErrors
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedIngestionErrors {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer ACCOUNT_FLAGGED;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer FETCH_GOOGLE_SHEET_NOT_SHARED;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer IMAGE_FILE_NOT_ACCESSIBLE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer IMAGE_FILE_NOT_FOUND;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer IMAGE_INVALID_FILE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer IMAGE_LEVEL_INTERNAL_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer IMAGE_MALFORMED_URL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer LARGE_PRODUCT_COUNT_DECREASE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer LINE_LEVEL_INTERNAL_ERROR;

  public CatalogsFeedIngestionErrors ACCOUNT_FLAGGED(@Nullable Integer ACCOUNT_FLAGGED) {
    this.ACCOUNT_FLAGGED = ACCOUNT_FLAGGED;
    return this;
  }

  /**
   * We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
   * @return ACCOUNT_FLAGGED
   */
  
  @Schema(name = "ACCOUNT_FLAGGED", description = "We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ACCOUNT_FLAGGED")
  public @Nullable Integer getACCOUNTFLAGGED() {
    return ACCOUNT_FLAGGED;
  }

  @JsonProperty("ACCOUNT_FLAGGED")
  public void setACCOUNTFLAGGED(@Nullable Integer ACCOUNT_FLAGGED) {
    this.ACCOUNT_FLAGGED = ACCOUNT_FLAGGED;
  }

  public CatalogsFeedIngestionErrors FETCH_GOOGLE_SHEET_NOT_SHARED(@Nullable Integer FETCH_GOOGLE_SHEET_NOT_SHARED) {
    this.FETCH_GOOGLE_SHEET_NOT_SHARED = FETCH_GOOGLE_SHEET_NOT_SHARED;
    return this;
  }

  /**
   * Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file.
   * @return FETCH_GOOGLE_SHEET_NOT_SHARED
   */
  
  @Schema(name = "FETCH_GOOGLE_SHEET_NOT_SHARED", description = "Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FETCH_GOOGLE_SHEET_NOT_SHARED")
  public @Nullable Integer getFETCHGOOGLESHEETNOTSHARED() {
    return FETCH_GOOGLE_SHEET_NOT_SHARED;
  }

  @JsonProperty("FETCH_GOOGLE_SHEET_NOT_SHARED")
  public void setFETCHGOOGLESHEETNOTSHARED(@Nullable Integer FETCH_GOOGLE_SHEET_NOT_SHARED) {
    this.FETCH_GOOGLE_SHEET_NOT_SHARED = FETCH_GOOGLE_SHEET_NOT_SHARED;
  }

  public CatalogsFeedIngestionErrors IMAGE_FILE_NOT_ACCESSIBLE(@Nullable Integer IMAGE_FILE_NOT_ACCESSIBLE) {
    this.IMAGE_FILE_NOT_ACCESSIBLE = IMAGE_FILE_NOT_ACCESSIBLE;
    return this;
  }

  /**
   * Image files are unreadable. Please upload new files to continue.
   * @return IMAGE_FILE_NOT_ACCESSIBLE
   */
  
  @Schema(name = "IMAGE_FILE_NOT_ACCESSIBLE", description = "Image files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_FILE_NOT_ACCESSIBLE")
  public @Nullable Integer getIMAGEFILENOTACCESSIBLE() {
    return IMAGE_FILE_NOT_ACCESSIBLE;
  }

  @JsonProperty("IMAGE_FILE_NOT_ACCESSIBLE")
  public void setIMAGEFILENOTACCESSIBLE(@Nullable Integer IMAGE_FILE_NOT_ACCESSIBLE) {
    this.IMAGE_FILE_NOT_ACCESSIBLE = IMAGE_FILE_NOT_ACCESSIBLE;
  }

  public CatalogsFeedIngestionErrors IMAGE_FILE_NOT_FOUND(@Nullable Integer IMAGE_FILE_NOT_FOUND) {
    this.IMAGE_FILE_NOT_FOUND = IMAGE_FILE_NOT_FOUND;
    return this;
  }

  /**
   * Image files are unreadable. Please upload new files to continue.
   * @return IMAGE_FILE_NOT_FOUND
   */
  
  @Schema(name = "IMAGE_FILE_NOT_FOUND", description = "Image files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_FILE_NOT_FOUND")
  public @Nullable Integer getIMAGEFILENOTFOUND() {
    return IMAGE_FILE_NOT_FOUND;
  }

  @JsonProperty("IMAGE_FILE_NOT_FOUND")
  public void setIMAGEFILENOTFOUND(@Nullable Integer IMAGE_FILE_NOT_FOUND) {
    this.IMAGE_FILE_NOT_FOUND = IMAGE_FILE_NOT_FOUND;
  }

  public CatalogsFeedIngestionErrors IMAGE_INVALID_FILE(@Nullable Integer IMAGE_INVALID_FILE) {
    this.IMAGE_INVALID_FILE = IMAGE_INVALID_FILE;
    return this;
  }

  /**
   * Image files are unreadable. Please upload new files to continue.
   * @return IMAGE_INVALID_FILE
   */
  
  @Schema(name = "IMAGE_INVALID_FILE", description = "Image files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_INVALID_FILE")
  public @Nullable Integer getIMAGEINVALIDFILE() {
    return IMAGE_INVALID_FILE;
  }

  @JsonProperty("IMAGE_INVALID_FILE")
  public void setIMAGEINVALIDFILE(@Nullable Integer IMAGE_INVALID_FILE) {
    this.IMAGE_INVALID_FILE = IMAGE_INVALID_FILE;
  }

  public CatalogsFeedIngestionErrors IMAGE_LEVEL_INTERNAL_ERROR(@Nullable Integer IMAGE_LEVEL_INTERNAL_ERROR) {
    this.IMAGE_LEVEL_INTERNAL_ERROR = IMAGE_LEVEL_INTERNAL_ERROR;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
   * @return IMAGE_LEVEL_INTERNAL_ERROR
   */
  
  @Schema(name = "IMAGE_LEVEL_INTERNAL_ERROR", description = "We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_LEVEL_INTERNAL_ERROR")
  public @Nullable Integer getIMAGELEVELINTERNALERROR() {
    return IMAGE_LEVEL_INTERNAL_ERROR;
  }

  @JsonProperty("IMAGE_LEVEL_INTERNAL_ERROR")
  public void setIMAGELEVELINTERNALERROR(@Nullable Integer IMAGE_LEVEL_INTERNAL_ERROR) {
    this.IMAGE_LEVEL_INTERNAL_ERROR = IMAGE_LEVEL_INTERNAL_ERROR;
  }

  public CatalogsFeedIngestionErrors IMAGE_MALFORMED_URL(@Nullable Integer IMAGE_MALFORMED_URL) {
    this.IMAGE_MALFORMED_URL = IMAGE_MALFORMED_URL;
    return this;
  }

  /**
   * Image files are unreadable. Please check your link and upload new files to continue.
   * @return IMAGE_MALFORMED_URL
   */
  
  @Schema(name = "IMAGE_MALFORMED_URL", description = "Image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_MALFORMED_URL")
  public @Nullable Integer getIMAGEMALFORMEDURL() {
    return IMAGE_MALFORMED_URL;
  }

  @JsonProperty("IMAGE_MALFORMED_URL")
  public void setIMAGEMALFORMEDURL(@Nullable Integer IMAGE_MALFORMED_URL) {
    this.IMAGE_MALFORMED_URL = IMAGE_MALFORMED_URL;
  }

  public CatalogsFeedIngestionErrors LARGE_PRODUCT_COUNT_DECREASE(@Nullable Integer LARGE_PRODUCT_COUNT_DECREASE) {
    this.LARGE_PRODUCT_COUNT_DECREASE = LARGE_PRODUCT_COUNT_DECREASE;
    return this;
  }

  /**
   * The product count has decreased by more than 99% compared to the last successful ingestion.
   * @return LARGE_PRODUCT_COUNT_DECREASE
   */
  
  @Schema(name = "LARGE_PRODUCT_COUNT_DECREASE", description = "The product count has decreased by more than 99% compared to the last successful ingestion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LARGE_PRODUCT_COUNT_DECREASE")
  public @Nullable Integer getLARGEPRODUCTCOUNTDECREASE() {
    return LARGE_PRODUCT_COUNT_DECREASE;
  }

  @JsonProperty("LARGE_PRODUCT_COUNT_DECREASE")
  public void setLARGEPRODUCTCOUNTDECREASE(@Nullable Integer LARGE_PRODUCT_COUNT_DECREASE) {
    this.LARGE_PRODUCT_COUNT_DECREASE = LARGE_PRODUCT_COUNT_DECREASE;
  }

  public CatalogsFeedIngestionErrors LINE_LEVEL_INTERNAL_ERROR(@Nullable Integer LINE_LEVEL_INTERNAL_ERROR) {
    this.LINE_LEVEL_INTERNAL_ERROR = LINE_LEVEL_INTERNAL_ERROR;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
   * @return LINE_LEVEL_INTERNAL_ERROR
   */
  
  @Schema(name = "LINE_LEVEL_INTERNAL_ERROR", description = "We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LINE_LEVEL_INTERNAL_ERROR")
  public @Nullable Integer getLINELEVELINTERNALERROR() {
    return LINE_LEVEL_INTERNAL_ERROR;
  }

  @JsonProperty("LINE_LEVEL_INTERNAL_ERROR")
  public void setLINELEVELINTERNALERROR(@Nullable Integer LINE_LEVEL_INTERNAL_ERROR) {
    this.LINE_LEVEL_INTERNAL_ERROR = LINE_LEVEL_INTERNAL_ERROR;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedIngestionErrors catalogsFeedIngestionErrors = (CatalogsFeedIngestionErrors) o;
    return Objects.equals(this.ACCOUNT_FLAGGED, catalogsFeedIngestionErrors.ACCOUNT_FLAGGED) &&
        Objects.equals(this.FETCH_GOOGLE_SHEET_NOT_SHARED, catalogsFeedIngestionErrors.FETCH_GOOGLE_SHEET_NOT_SHARED) &&
        Objects.equals(this.IMAGE_FILE_NOT_ACCESSIBLE, catalogsFeedIngestionErrors.IMAGE_FILE_NOT_ACCESSIBLE) &&
        Objects.equals(this.IMAGE_FILE_NOT_FOUND, catalogsFeedIngestionErrors.IMAGE_FILE_NOT_FOUND) &&
        Objects.equals(this.IMAGE_INVALID_FILE, catalogsFeedIngestionErrors.IMAGE_INVALID_FILE) &&
        Objects.equals(this.IMAGE_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionErrors.IMAGE_LEVEL_INTERNAL_ERROR) &&
        Objects.equals(this.IMAGE_MALFORMED_URL, catalogsFeedIngestionErrors.IMAGE_MALFORMED_URL) &&
        Objects.equals(this.LARGE_PRODUCT_COUNT_DECREASE, catalogsFeedIngestionErrors.LARGE_PRODUCT_COUNT_DECREASE) &&
        Objects.equals(this.LINE_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionErrors.LINE_LEVEL_INTERNAL_ERROR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ACCOUNT_FLAGGED, FETCH_GOOGLE_SHEET_NOT_SHARED, IMAGE_FILE_NOT_ACCESSIBLE, IMAGE_FILE_NOT_FOUND, IMAGE_INVALID_FILE, IMAGE_LEVEL_INTERNAL_ERROR, IMAGE_MALFORMED_URL, LARGE_PRODUCT_COUNT_DECREASE, LINE_LEVEL_INTERNAL_ERROR);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionErrors {\n");
    sb.append("    ACCOUNT_FLAGGED: ").append(toIndentedString(ACCOUNT_FLAGGED)).append("\n");
    sb.append("    FETCH_GOOGLE_SHEET_NOT_SHARED: ").append(toIndentedString(FETCH_GOOGLE_SHEET_NOT_SHARED)).append("\n");
    sb.append("    IMAGE_FILE_NOT_ACCESSIBLE: ").append(toIndentedString(IMAGE_FILE_NOT_ACCESSIBLE)).append("\n");
    sb.append("    IMAGE_FILE_NOT_FOUND: ").append(toIndentedString(IMAGE_FILE_NOT_FOUND)).append("\n");
    sb.append("    IMAGE_INVALID_FILE: ").append(toIndentedString(IMAGE_INVALID_FILE)).append("\n");
    sb.append("    IMAGE_LEVEL_INTERNAL_ERROR: ").append(toIndentedString(IMAGE_LEVEL_INTERNAL_ERROR)).append("\n");
    sb.append("    IMAGE_MALFORMED_URL: ").append(toIndentedString(IMAGE_MALFORMED_URL)).append("\n");
    sb.append("    LARGE_PRODUCT_COUNT_DECREASE: ").append(toIndentedString(LARGE_PRODUCT_COUNT_DECREASE)).append("\n");
    sb.append("    LINE_LEVEL_INTERNAL_ERROR: ").append(toIndentedString(LINE_LEVEL_INTERNAL_ERROR)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

