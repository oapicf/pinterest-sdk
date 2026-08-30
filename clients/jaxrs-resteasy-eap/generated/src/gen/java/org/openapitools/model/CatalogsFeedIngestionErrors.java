package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedIngestionErrors   {
  
  private Integer ACCOUNT_FLAGGED;
  private Integer FETCH_GOOGLE_SHEET_NOT_SHARED;
  private Integer IMAGE_FILE_NOT_ACCESSIBLE;
  private Integer IMAGE_FILE_NOT_FOUND;
  private Integer IMAGE_INVALID_FILE;
  private Integer IMAGE_LEVEL_INTERNAL_ERROR;
  private Integer IMAGE_MALFORMED_URL;
  private Integer LARGE_PRODUCT_COUNT_DECREASE;
  private Integer LINE_LEVEL_INTERNAL_ERROR;

  /**
   * We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
   **/
  
  @ApiModelProperty(value = "We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.")
  @JsonProperty("ACCOUNT_FLAGGED")
  public Integer getACCOUNTFLAGGED() {
    return ACCOUNT_FLAGGED;
  }
  public void setACCOUNTFLAGGED(Integer ACCOUNT_FLAGGED) {
    this.ACCOUNT_FLAGGED = ACCOUNT_FLAGGED;
  }

  /**
   * Update your Google Sheets sharing settings to &#39;Anyone with link&#39; as a Viewer so that Pinterest can access your file.
   **/
  
  @ApiModelProperty(value = "Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file.")
  @JsonProperty("FETCH_GOOGLE_SHEET_NOT_SHARED")
  public Integer getFETCHGOOGLESHEETNOTSHARED() {
    return FETCH_GOOGLE_SHEET_NOT_SHARED;
  }
  public void setFETCHGOOGLESHEETNOTSHARED(Integer FETCH_GOOGLE_SHEET_NOT_SHARED) {
    this.FETCH_GOOGLE_SHEET_NOT_SHARED = FETCH_GOOGLE_SHEET_NOT_SHARED;
  }

  /**
   * Image files are unreadable. Please upload new files to continue.
   **/
  
  @ApiModelProperty(value = "Image files are unreadable. Please upload new files to continue.")
  @JsonProperty("IMAGE_FILE_NOT_ACCESSIBLE")
  public Integer getIMAGEFILENOTACCESSIBLE() {
    return IMAGE_FILE_NOT_ACCESSIBLE;
  }
  public void setIMAGEFILENOTACCESSIBLE(Integer IMAGE_FILE_NOT_ACCESSIBLE) {
    this.IMAGE_FILE_NOT_ACCESSIBLE = IMAGE_FILE_NOT_ACCESSIBLE;
  }

  /**
   * Image files are unreadable. Please upload new files to continue.
   **/
  
  @ApiModelProperty(value = "Image files are unreadable. Please upload new files to continue.")
  @JsonProperty("IMAGE_FILE_NOT_FOUND")
  public Integer getIMAGEFILENOTFOUND() {
    return IMAGE_FILE_NOT_FOUND;
  }
  public void setIMAGEFILENOTFOUND(Integer IMAGE_FILE_NOT_FOUND) {
    this.IMAGE_FILE_NOT_FOUND = IMAGE_FILE_NOT_FOUND;
  }

  /**
   * Image files are unreadable. Please upload new files to continue.
   **/
  
  @ApiModelProperty(value = "Image files are unreadable. Please upload new files to continue.")
  @JsonProperty("IMAGE_INVALID_FILE")
  public Integer getIMAGEINVALIDFILE() {
    return IMAGE_INVALID_FILE;
  }
  public void setIMAGEINVALIDFILE(Integer IMAGE_INVALID_FILE) {
    this.IMAGE_INVALID_FILE = IMAGE_INVALID_FILE;
  }

  /**
   * We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
   **/
  
  @ApiModelProperty(value = "We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.")
  @JsonProperty("IMAGE_LEVEL_INTERNAL_ERROR")
  public Integer getIMAGELEVELINTERNALERROR() {
    return IMAGE_LEVEL_INTERNAL_ERROR;
  }
  public void setIMAGELEVELINTERNALERROR(Integer IMAGE_LEVEL_INTERNAL_ERROR) {
    this.IMAGE_LEVEL_INTERNAL_ERROR = IMAGE_LEVEL_INTERNAL_ERROR;
  }

  /**
   * Image files are unreadable. Please check your link and upload new files to continue.
   **/
  
  @ApiModelProperty(value = "Image files are unreadable. Please check your link and upload new files to continue.")
  @JsonProperty("IMAGE_MALFORMED_URL")
  public Integer getIMAGEMALFORMEDURL() {
    return IMAGE_MALFORMED_URL;
  }
  public void setIMAGEMALFORMEDURL(Integer IMAGE_MALFORMED_URL) {
    this.IMAGE_MALFORMED_URL = IMAGE_MALFORMED_URL;
  }

  /**
   * The product count has decreased by more than 99% compared to the last successful ingestion.
   **/
  
  @ApiModelProperty(value = "The product count has decreased by more than 99% compared to the last successful ingestion.")
  @JsonProperty("LARGE_PRODUCT_COUNT_DECREASE")
  public Integer getLARGEPRODUCTCOUNTDECREASE() {
    return LARGE_PRODUCT_COUNT_DECREASE;
  }
  public void setLARGEPRODUCTCOUNTDECREASE(Integer LARGE_PRODUCT_COUNT_DECREASE) {
    this.LARGE_PRODUCT_COUNT_DECREASE = LARGE_PRODUCT_COUNT_DECREASE;
  }

  /**
   * We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
   **/
  
  @ApiModelProperty(value = "We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.")
  @JsonProperty("LINE_LEVEL_INTERNAL_ERROR")
  public Integer getLINELEVELINTERNALERROR() {
    return LINE_LEVEL_INTERNAL_ERROR;
  }
  public void setLINELEVELINTERNALERROR(Integer LINE_LEVEL_INTERNAL_ERROR) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

