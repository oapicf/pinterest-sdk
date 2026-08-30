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
 * CatalogsFeedIngestionWarnings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedIngestionWarnings {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_400;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_403;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_404;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_405;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_410;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_429;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_500;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_502;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_503;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_504;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_507;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_508;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_520;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_521;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_522;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_525;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_INVALID_FILE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_SITE_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_SITE_TIMEOUT;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_SSL_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_PROCESSING_EMPTY_FILE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_PROCESSING_TOO_MANY_PIXELS;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_PROCESSING_TYPE_MISMATCH;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_400;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_403;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_404;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_405;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_410;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_429;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_500;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_502;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_503;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_504;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_507;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_508;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_520;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_521;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_522;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_525;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_INVALID_FILE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_SITE_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_SITE_TIMEOUT;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_SSL_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_LENGTH_TOO_SHORT;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_PROCESSING_EMPTY_FILE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_PROCESSING_TOO_MANY_PIXELS;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_PROCESSING_TYPE_MISMATCH;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer ADDITIONAL_IMAGE_INVALID_FILE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer ADDITIONAL_IMAGE_MALFORMED_URL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer HOTEL_PRICE_HEADER_IS_PRESENT;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer VIDEO_DOWNLOAD_VIDEO_TOO_SHORT;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer VIDEO_FILE_NOT_ACCESSIBLE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer VIDEO_FILE_NOT_FOUND;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer VIDEO_INVALID_FILE;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer VIDEO_LEVEL_INTERNAL_ERROR;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer VIDEO_MALFORMED_URL;

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR) {
    this.AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR = AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR")
  public @Nullable Integer getADIMAGEDOWNLOADCONTENTREADERROR() {
    return AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR")
  public void setADIMAGEDOWNLOADCONTENTREADERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR) {
    this.AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR = AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR) {
    this.AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR = AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR")
  public @Nullable Integer getADIMAGEDOWNLOADDNSLOOKUPERROR() {
    return AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR")
  public void setADIMAGEDOWNLOADDNSLOOKUPERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR) {
    this.AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR = AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE(@Nullable Integer AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE) {
    this.AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE = AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE")
  public @Nullable Integer getADIMAGEDOWNLOADFILENOTACCESSIBLE() {
    return AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE")
  public void setADIMAGEDOWNLOADFILENOTACCESSIBLE(@Nullable Integer AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE) {
    this.AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE = AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND(@Nullable Integer AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND) {
    this.AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND = AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND")
  public @Nullable Integer getADIMAGEDOWNLOADFILENOTFOUND() {
    return AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND")
  public void setADIMAGEDOWNLOADFILENOTFOUND(@Nullable Integer AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND) {
    this.AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND = AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_400(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_400) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_400 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_400;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_400
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_400", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_400")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS400() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_400;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_400")
  public void setADIMAGEDOWNLOADHTTPSTATUS400(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_400) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_400 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_400;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_403(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_403) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_403 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_403;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_403
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_403", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_403")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS403() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_403;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_403")
  public void setADIMAGEDOWNLOADHTTPSTATUS403(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_403) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_403 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_403;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_404(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_404) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_404 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_404;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_404
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_404", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_404")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS404() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_404;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_404")
  public void setADIMAGEDOWNLOADHTTPSTATUS404(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_404) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_404 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_404;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_405(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_405) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_405 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_405;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_405
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_405", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_405")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS405() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_405;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_405")
  public void setADIMAGEDOWNLOADHTTPSTATUS405(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_405) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_405 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_405;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_410(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_410) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_410 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_410;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_410
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_410", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_410")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS410() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_410;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_410")
  public void setADIMAGEDOWNLOADHTTPSTATUS410(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_410) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_410 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_410;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_429(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_429) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_429 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_429;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_429
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_429", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_429")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS429() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_429;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_429")
  public void setADIMAGEDOWNLOADHTTPSTATUS429(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_429) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_429 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_429;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_500(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_500) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_500 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_500;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_500
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_500", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_500")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS500() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_500;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_500")
  public void setADIMAGEDOWNLOADHTTPSTATUS500(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_500) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_500 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_500;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_502(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_502) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_502 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_502;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_502
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_502", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_502")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS502() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_502;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_502")
  public void setADIMAGEDOWNLOADHTTPSTATUS502(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_502) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_502 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_502;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_503(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_503) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_503 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_503;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_503
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_503", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_503")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS503() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_503;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_503")
  public void setADIMAGEDOWNLOADHTTPSTATUS503(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_503) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_503 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_503;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_504(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_504) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_504 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_504;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_504
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_504", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_504")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS504() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_504;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_504")
  public void setADIMAGEDOWNLOADHTTPSTATUS504(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_504) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_504 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_504;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_507(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_507) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_507 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_507;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_507
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_507", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_507")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS507() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_507;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_507")
  public void setADIMAGEDOWNLOADHTTPSTATUS507(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_507) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_507 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_507;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_508(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_508) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_508 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_508;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_508
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_508", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_508")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS508() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_508;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_508")
  public void setADIMAGEDOWNLOADHTTPSTATUS508(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_508) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_508 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_508;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_520(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_520) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_520 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_520;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_520
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_520", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_520")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS520() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_520;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_520")
  public void setADIMAGEDOWNLOADHTTPSTATUS520(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_520) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_520 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_520;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_521(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_521) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_521 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_521;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_521
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_521", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_521")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS521() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_521;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_521")
  public void setADIMAGEDOWNLOADHTTPSTATUS521(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_521) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_521 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_521;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_522(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_522) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_522 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_522;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_522
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_522", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_522")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS522() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_522;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_522")
  public void setADIMAGEDOWNLOADHTTPSTATUS522(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_522) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_522 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_522;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_HTTP_STATUS_525(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_525) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_525 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_525;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_HTTP_STATUS_525
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_525", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_525")
  public @Nullable Integer getADIMAGEDOWNLOADHTTPSTATUS525() {
    return AD_IMAGE_DOWNLOAD_HTTP_STATUS_525;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_HTTP_STATUS_525")
  public void setADIMAGEDOWNLOADHTTPSTATUS525(@Nullable Integer AD_IMAGE_DOWNLOAD_HTTP_STATUS_525) {
    this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_525 = AD_IMAGE_DOWNLOAD_HTTP_STATUS_525;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
   * @return AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR")
  public @Nullable Integer getADIMAGEDOWNLOADINTERNALCONFIGURATIONERROR() {
    return AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR")
  public void setADIMAGEDOWNLOADINTERNALCONFIGURATIONERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_INTERNAL_ERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_ERROR) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_ERROR = AD_IMAGE_DOWNLOAD_INTERNAL_ERROR;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
   * @return AD_IMAGE_DOWNLOAD_INTERNAL_ERROR
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_INTERNAL_ERROR", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_ERROR")
  public @Nullable Integer getADIMAGEDOWNLOADINTERNALERROR() {
    return AD_IMAGE_DOWNLOAD_INTERNAL_ERROR;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_ERROR")
  public void setADIMAGEDOWNLOADINTERNALERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_ERROR) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_ERROR = AD_IMAGE_DOWNLOAD_INTERNAL_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
   * @return AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD")
  public @Nullable Integer getADIMAGEDOWNLOADINTERNALFAILEDTODOWNLOAD() {
    return AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD")
  public void setADIMAGEDOWNLOADINTERNALFAILEDTODOWNLOAD(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL = AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL")
  public @Nullable Integer getADIMAGEDOWNLOADINTERNALMALFORMEDURL() {
    return AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL")
  public void setADIMAGEDOWNLOADINTERNALMALFORMEDURL(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL = AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED = AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
   * @return AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED")
  public @Nullable Integer getADIMAGEDOWNLOADINTERNALRATELIMITED() {
    return AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED")
  public void setADIMAGEDOWNLOADINTERNALRATELIMITED(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED = AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
   * @return AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED")
  public @Nullable Integer getADIMAGEDOWNLOADINTERNALREQUESTEXPIRED() {
    return AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED")
  public void setADIMAGEDOWNLOADINTERNALREQUESTEXPIRED(@Nullable Integer AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED) {
    this.AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_INVALID_FILE(@Nullable Integer AD_IMAGE_DOWNLOAD_INVALID_FILE) {
    this.AD_IMAGE_DOWNLOAD_INVALID_FILE = AD_IMAGE_DOWNLOAD_INVALID_FILE;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_INVALID_FILE
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_INVALID_FILE", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_INVALID_FILE")
  public @Nullable Integer getADIMAGEDOWNLOADINVALIDFILE() {
    return AD_IMAGE_DOWNLOAD_INVALID_FILE;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_INVALID_FILE")
  public void setADIMAGEDOWNLOADINVALIDFILE(@Nullable Integer AD_IMAGE_DOWNLOAD_INVALID_FILE) {
    this.AD_IMAGE_DOWNLOAD_INVALID_FILE = AD_IMAGE_DOWNLOAD_INVALID_FILE;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_SITE_ERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_SITE_ERROR) {
    this.AD_IMAGE_DOWNLOAD_SITE_ERROR = AD_IMAGE_DOWNLOAD_SITE_ERROR;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_SITE_ERROR
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_SITE_ERROR", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_SITE_ERROR")
  public @Nullable Integer getADIMAGEDOWNLOADSITEERROR() {
    return AD_IMAGE_DOWNLOAD_SITE_ERROR;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_SITE_ERROR")
  public void setADIMAGEDOWNLOADSITEERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_SITE_ERROR) {
    this.AD_IMAGE_DOWNLOAD_SITE_ERROR = AD_IMAGE_DOWNLOAD_SITE_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_SITE_TIMEOUT(@Nullable Integer AD_IMAGE_DOWNLOAD_SITE_TIMEOUT) {
    this.AD_IMAGE_DOWNLOAD_SITE_TIMEOUT = AD_IMAGE_DOWNLOAD_SITE_TIMEOUT;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_SITE_TIMEOUT
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_SITE_TIMEOUT", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_SITE_TIMEOUT")
  public @Nullable Integer getADIMAGEDOWNLOADSITETIMEOUT() {
    return AD_IMAGE_DOWNLOAD_SITE_TIMEOUT;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_SITE_TIMEOUT")
  public void setADIMAGEDOWNLOADSITETIMEOUT(@Nullable Integer AD_IMAGE_DOWNLOAD_SITE_TIMEOUT) {
    this.AD_IMAGE_DOWNLOAD_SITE_TIMEOUT = AD_IMAGE_DOWNLOAD_SITE_TIMEOUT;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_SSL_ERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_SSL_ERROR) {
    this.AD_IMAGE_DOWNLOAD_SSL_ERROR = AD_IMAGE_DOWNLOAD_SSL_ERROR;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_SSL_ERROR
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_SSL_ERROR", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_SSL_ERROR")
  public @Nullable Integer getADIMAGEDOWNLOADSSLERROR() {
    return AD_IMAGE_DOWNLOAD_SSL_ERROR;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_SSL_ERROR")
  public void setADIMAGEDOWNLOADSSLERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_SSL_ERROR) {
    this.AD_IMAGE_DOWNLOAD_SSL_ERROR = AD_IMAGE_DOWNLOAD_SSL_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR) {
    this.AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR = AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR
   */
  
  @Schema(name = "AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR")
  public @Nullable Integer getADIMAGEDOWNLOADSSLHANDSHAKEERROR() {
    return AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR;
  }

  @JsonProperty("AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR")
  public void setADIMAGEDOWNLOADSSLHANDSHAKEERROR(@Nullable Integer AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR) {
    this.AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR = AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_PROCESSING_EMPTY_FILE(@Nullable Integer AD_IMAGE_PROCESSING_EMPTY_FILE) {
    this.AD_IMAGE_PROCESSING_EMPTY_FILE = AD_IMAGE_PROCESSING_EMPTY_FILE;
    return this;
  }

  /**
   * Ad image files are unreadable. Please check your link and upload new files to continue.
   * @return AD_IMAGE_PROCESSING_EMPTY_FILE
   */
  
  @Schema(name = "AD_IMAGE_PROCESSING_EMPTY_FILE", description = "Ad image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_PROCESSING_EMPTY_FILE")
  public @Nullable Integer getADIMAGEPROCESSINGEMPTYFILE() {
    return AD_IMAGE_PROCESSING_EMPTY_FILE;
  }

  @JsonProperty("AD_IMAGE_PROCESSING_EMPTY_FILE")
  public void setADIMAGEPROCESSINGEMPTYFILE(@Nullable Integer AD_IMAGE_PROCESSING_EMPTY_FILE) {
    this.AD_IMAGE_PROCESSING_EMPTY_FILE = AD_IMAGE_PROCESSING_EMPTY_FILE;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL(@Nullable Integer AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL) {
    this.AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL = AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL;
    return this;
  }

  /**
   * Ad images must have a height larger than 75 pixels
   * @return AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL
   */
  
  @Schema(name = "AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL", description = "Ad images must have a height larger than 75 pixels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL")
  public @Nullable Integer getADIMAGEPROCESSINGHEIGHTTOOSMALL() {
    return AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL;
  }

  @JsonProperty("AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL")
  public void setADIMAGEPROCESSINGHEIGHTTOOSMALL(@Nullable Integer AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL) {
    this.AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL = AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_PROCESSING_TOO_MANY_PIXELS(@Nullable Integer AD_IMAGE_PROCESSING_TOO_MANY_PIXELS) {
    this.AD_IMAGE_PROCESSING_TOO_MANY_PIXELS = AD_IMAGE_PROCESSING_TOO_MANY_PIXELS;
    return this;
  }

  /**
   * Ad images must have a maximum area (width x height) of less than 89478485 pixels
   * @return AD_IMAGE_PROCESSING_TOO_MANY_PIXELS
   */
  
  @Schema(name = "AD_IMAGE_PROCESSING_TOO_MANY_PIXELS", description = "Ad images must have a maximum area (width x height) of less than 89478485 pixels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_PROCESSING_TOO_MANY_PIXELS")
  public @Nullable Integer getADIMAGEPROCESSINGTOOMANYPIXELS() {
    return AD_IMAGE_PROCESSING_TOO_MANY_PIXELS;
  }

  @JsonProperty("AD_IMAGE_PROCESSING_TOO_MANY_PIXELS")
  public void setADIMAGEPROCESSINGTOOMANYPIXELS(@Nullable Integer AD_IMAGE_PROCESSING_TOO_MANY_PIXELS) {
    this.AD_IMAGE_PROCESSING_TOO_MANY_PIXELS = AD_IMAGE_PROCESSING_TOO_MANY_PIXELS;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_PROCESSING_TYPE_MISMATCH(@Nullable Integer AD_IMAGE_PROCESSING_TYPE_MISMATCH) {
    this.AD_IMAGE_PROCESSING_TYPE_MISMATCH = AD_IMAGE_PROCESSING_TYPE_MISMATCH;
    return this;
  }

  /**
   * Some ad images could not be processed due to a file type mismatch.
   * @return AD_IMAGE_PROCESSING_TYPE_MISMATCH
   */
  
  @Schema(name = "AD_IMAGE_PROCESSING_TYPE_MISMATCH", description = "Some ad images could not be processed due to a file type mismatch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_PROCESSING_TYPE_MISMATCH")
  public @Nullable Integer getADIMAGEPROCESSINGTYPEMISMATCH() {
    return AD_IMAGE_PROCESSING_TYPE_MISMATCH;
  }

  @JsonProperty("AD_IMAGE_PROCESSING_TYPE_MISMATCH")
  public void setADIMAGEPROCESSINGTYPEMISMATCH(@Nullable Integer AD_IMAGE_PROCESSING_TYPE_MISMATCH) {
    this.AD_IMAGE_PROCESSING_TYPE_MISMATCH = AD_IMAGE_PROCESSING_TYPE_MISMATCH;
  }

  public CatalogsFeedIngestionWarnings AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL(@Nullable Integer AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL) {
    this.AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL = AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL;
    return this;
  }

  /**
   * Ad images must have a width larger than 75 pixels
   * @return AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL
   */
  
  @Schema(name = "AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL", description = "Ad images must have a width larger than 75 pixels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL")
  public @Nullable Integer getADIMAGEPROCESSINGWIDTHTOOSMALL() {
    return AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL;
  }

  @JsonProperty("AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL")
  public void setADIMAGEPROCESSINGWIDTHTOOSMALL(@Nullable Integer AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL) {
    this.AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL = AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR) {
    this.AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR = AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR")
  public @Nullable Integer getADVIDEODOWNLOADCONTENTREADERROR() {
    return AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR")
  public void setADVIDEODOWNLOADCONTENTREADERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR) {
    this.AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR = AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR) {
    this.AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR = AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR")
  public @Nullable Integer getADVIDEODOWNLOADDNSLOOKUPERROR() {
    return AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR")
  public void setADVIDEODOWNLOADDNSLOOKUPERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR) {
    this.AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR = AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE(@Nullable Integer AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE) {
    this.AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE = AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE")
  public @Nullable Integer getADVIDEODOWNLOADFILENOTACCESSIBLE() {
    return AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE")
  public void setADVIDEODOWNLOADFILENOTACCESSIBLE(@Nullable Integer AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE) {
    this.AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE = AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND(@Nullable Integer AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND) {
    this.AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND = AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND")
  public @Nullable Integer getADVIDEODOWNLOADFILENOTFOUND() {
    return AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND")
  public void setADVIDEODOWNLOADFILENOTFOUND(@Nullable Integer AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND) {
    this.AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND = AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_400(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_400) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_400 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_400;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_400
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_400", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_400")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS400() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_400;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_400")
  public void setADVIDEODOWNLOADHTTPSTATUS400(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_400) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_400 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_400;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_403(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_403) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_403 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_403;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_403
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_403", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_403")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS403() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_403;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_403")
  public void setADVIDEODOWNLOADHTTPSTATUS403(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_403) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_403 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_403;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_404(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_404) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_404 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_404;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_404
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_404", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_404")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS404() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_404;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_404")
  public void setADVIDEODOWNLOADHTTPSTATUS404(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_404) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_404 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_404;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_405(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_405) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_405 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_405;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_405
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_405", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_405")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS405() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_405;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_405")
  public void setADVIDEODOWNLOADHTTPSTATUS405(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_405) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_405 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_405;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_410(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_410) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_410 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_410;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_410
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_410", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_410")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS410() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_410;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_410")
  public void setADVIDEODOWNLOADHTTPSTATUS410(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_410) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_410 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_410;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_429(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_429) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_429 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_429;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_429
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_429", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_429")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS429() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_429;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_429")
  public void setADVIDEODOWNLOADHTTPSTATUS429(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_429) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_429 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_429;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_500(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_500) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_500 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_500;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_500
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_500", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_500")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS500() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_500;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_500")
  public void setADVIDEODOWNLOADHTTPSTATUS500(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_500) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_500 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_500;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_502(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_502) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_502 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_502;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_502
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_502", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_502")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS502() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_502;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_502")
  public void setADVIDEODOWNLOADHTTPSTATUS502(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_502) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_502 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_502;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_503(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_503) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_503 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_503;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_503
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_503", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_503")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS503() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_503;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_503")
  public void setADVIDEODOWNLOADHTTPSTATUS503(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_503) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_503 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_503;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_504(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_504) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_504 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_504;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_504
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_504", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_504")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS504() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_504;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_504")
  public void setADVIDEODOWNLOADHTTPSTATUS504(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_504) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_504 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_504;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_507(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_507) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_507 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_507;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_507
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_507", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_507")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS507() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_507;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_507")
  public void setADVIDEODOWNLOADHTTPSTATUS507(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_507) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_507 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_507;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_508(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_508) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_508 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_508;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_508
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_508", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_508")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS508() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_508;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_508")
  public void setADVIDEODOWNLOADHTTPSTATUS508(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_508) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_508 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_508;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_520(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_520) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_520 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_520;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_520
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_520", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_520")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS520() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_520;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_520")
  public void setADVIDEODOWNLOADHTTPSTATUS520(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_520) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_520 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_520;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_521(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_521) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_521 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_521;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_521
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_521", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_521")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS521() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_521;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_521")
  public void setADVIDEODOWNLOADHTTPSTATUS521(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_521) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_521 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_521;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_522(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_522) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_522 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_522;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_522
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_522", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_522")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS522() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_522;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_522")
  public void setADVIDEODOWNLOADHTTPSTATUS522(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_522) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_522 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_522;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_HTTP_STATUS_525(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_525) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_525 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_525;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_HTTP_STATUS_525
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_525", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_525")
  public @Nullable Integer getADVIDEODOWNLOADHTTPSTATUS525() {
    return AD_VIDEO_DOWNLOAD_HTTP_STATUS_525;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_HTTP_STATUS_525")
  public void setADVIDEODOWNLOADHTTPSTATUS525(@Nullable Integer AD_VIDEO_DOWNLOAD_HTTP_STATUS_525) {
    this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_525 = AD_VIDEO_DOWNLOAD_HTTP_STATUS_525;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
   * @return AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR")
  public @Nullable Integer getADVIDEODOWNLOADINTERNALCONFIGURATIONERROR() {
    return AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR")
  public void setADVIDEODOWNLOADINTERNALCONFIGURATIONERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_INTERNAL_ERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_ERROR) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_ERROR = AD_VIDEO_DOWNLOAD_INTERNAL_ERROR;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
   * @return AD_VIDEO_DOWNLOAD_INTERNAL_ERROR
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_INTERNAL_ERROR", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_ERROR")
  public @Nullable Integer getADVIDEODOWNLOADINTERNALERROR() {
    return AD_VIDEO_DOWNLOAD_INTERNAL_ERROR;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_ERROR")
  public void setADVIDEODOWNLOADINTERNALERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_ERROR) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_ERROR = AD_VIDEO_DOWNLOAD_INTERNAL_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
   * @return AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD")
  public @Nullable Integer getADVIDEODOWNLOADINTERNALFAILEDTODOWNLOAD() {
    return AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD")
  public void setADVIDEODOWNLOADINTERNALFAILEDTODOWNLOAD(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL = AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL")
  public @Nullable Integer getADVIDEODOWNLOADINTERNALMALFORMEDURL() {
    return AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL")
  public void setADVIDEODOWNLOADINTERNALMALFORMEDURL(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL = AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED = AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
   * @return AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED")
  public @Nullable Integer getADVIDEODOWNLOADINTERNALRATELIMITED() {
    return AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED")
  public void setADVIDEODOWNLOADINTERNALRATELIMITED(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED = AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
   * @return AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED")
  public @Nullable Integer getADVIDEODOWNLOADINTERNALREQUESTEXPIRED() {
    return AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED")
  public void setADVIDEODOWNLOADINTERNALREQUESTEXPIRED(@Nullable Integer AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED) {
    this.AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_INVALID_FILE(@Nullable Integer AD_VIDEO_DOWNLOAD_INVALID_FILE) {
    this.AD_VIDEO_DOWNLOAD_INVALID_FILE = AD_VIDEO_DOWNLOAD_INVALID_FILE;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_INVALID_FILE
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_INVALID_FILE", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_INVALID_FILE")
  public @Nullable Integer getADVIDEODOWNLOADINVALIDFILE() {
    return AD_VIDEO_DOWNLOAD_INVALID_FILE;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_INVALID_FILE")
  public void setADVIDEODOWNLOADINVALIDFILE(@Nullable Integer AD_VIDEO_DOWNLOAD_INVALID_FILE) {
    this.AD_VIDEO_DOWNLOAD_INVALID_FILE = AD_VIDEO_DOWNLOAD_INVALID_FILE;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_SITE_ERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_SITE_ERROR) {
    this.AD_VIDEO_DOWNLOAD_SITE_ERROR = AD_VIDEO_DOWNLOAD_SITE_ERROR;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_SITE_ERROR
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_SITE_ERROR", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_SITE_ERROR")
  public @Nullable Integer getADVIDEODOWNLOADSITEERROR() {
    return AD_VIDEO_DOWNLOAD_SITE_ERROR;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_SITE_ERROR")
  public void setADVIDEODOWNLOADSITEERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_SITE_ERROR) {
    this.AD_VIDEO_DOWNLOAD_SITE_ERROR = AD_VIDEO_DOWNLOAD_SITE_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_SITE_TIMEOUT(@Nullable Integer AD_VIDEO_DOWNLOAD_SITE_TIMEOUT) {
    this.AD_VIDEO_DOWNLOAD_SITE_TIMEOUT = AD_VIDEO_DOWNLOAD_SITE_TIMEOUT;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_SITE_TIMEOUT
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_SITE_TIMEOUT", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_SITE_TIMEOUT")
  public @Nullable Integer getADVIDEODOWNLOADSITETIMEOUT() {
    return AD_VIDEO_DOWNLOAD_SITE_TIMEOUT;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_SITE_TIMEOUT")
  public void setADVIDEODOWNLOADSITETIMEOUT(@Nullable Integer AD_VIDEO_DOWNLOAD_SITE_TIMEOUT) {
    this.AD_VIDEO_DOWNLOAD_SITE_TIMEOUT = AD_VIDEO_DOWNLOAD_SITE_TIMEOUT;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_SSL_ERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_SSL_ERROR) {
    this.AD_VIDEO_DOWNLOAD_SSL_ERROR = AD_VIDEO_DOWNLOAD_SSL_ERROR;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_SSL_ERROR
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_SSL_ERROR", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_SSL_ERROR")
  public @Nullable Integer getADVIDEODOWNLOADSSLERROR() {
    return AD_VIDEO_DOWNLOAD_SSL_ERROR;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_SSL_ERROR")
  public void setADVIDEODOWNLOADSSLERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_SSL_ERROR) {
    this.AD_VIDEO_DOWNLOAD_SSL_ERROR = AD_VIDEO_DOWNLOAD_SSL_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR) {
    this.AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR = AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR
   */
  
  @Schema(name = "AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR")
  public @Nullable Integer getADVIDEODOWNLOADSSLHANDSHAKEERROR() {
    return AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR;
  }

  @JsonProperty("AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR")
  public void setADVIDEODOWNLOADSSLHANDSHAKEERROR(@Nullable Integer AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR) {
    this.AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR = AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_LENGTH_TOO_SHORT(@Nullable Integer AD_VIDEO_LENGTH_TOO_SHORT) {
    this.AD_VIDEO_LENGTH_TOO_SHORT = AD_VIDEO_LENGTH_TOO_SHORT;
    return this;
  }

  /**
   * Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long.
   * @return AD_VIDEO_LENGTH_TOO_SHORT
   */
  
  @Schema(name = "AD_VIDEO_LENGTH_TOO_SHORT", description = "Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_LENGTH_TOO_SHORT")
  public @Nullable Integer getADVIDEOLENGTHTOOSHORT() {
    return AD_VIDEO_LENGTH_TOO_SHORT;
  }

  @JsonProperty("AD_VIDEO_LENGTH_TOO_SHORT")
  public void setADVIDEOLENGTHTOOSHORT(@Nullable Integer AD_VIDEO_LENGTH_TOO_SHORT) {
    this.AD_VIDEO_LENGTH_TOO_SHORT = AD_VIDEO_LENGTH_TOO_SHORT;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_PROCESSING_EMPTY_FILE(@Nullable Integer AD_VIDEO_PROCESSING_EMPTY_FILE) {
    this.AD_VIDEO_PROCESSING_EMPTY_FILE = AD_VIDEO_PROCESSING_EMPTY_FILE;
    return this;
  }

  /**
   * Ad video files are unreadable. Please check your link and upload new files to continue.
   * @return AD_VIDEO_PROCESSING_EMPTY_FILE
   */
  
  @Schema(name = "AD_VIDEO_PROCESSING_EMPTY_FILE", description = "Ad video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_PROCESSING_EMPTY_FILE")
  public @Nullable Integer getADVIDEOPROCESSINGEMPTYFILE() {
    return AD_VIDEO_PROCESSING_EMPTY_FILE;
  }

  @JsonProperty("AD_VIDEO_PROCESSING_EMPTY_FILE")
  public void setADVIDEOPROCESSINGEMPTYFILE(@Nullable Integer AD_VIDEO_PROCESSING_EMPTY_FILE) {
    this.AD_VIDEO_PROCESSING_EMPTY_FILE = AD_VIDEO_PROCESSING_EMPTY_FILE;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL(@Nullable Integer AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL) {
    this.AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL = AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL;
    return this;
  }

  /**
   * Ad videos must have a height larger than 75 pixels
   * @return AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL
   */
  
  @Schema(name = "AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL", description = "Ad videos must have a height larger than 75 pixels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL")
  public @Nullable Integer getADVIDEOPROCESSINGHEIGHTTOOSMALL() {
    return AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL;
  }

  @JsonProperty("AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL")
  public void setADVIDEOPROCESSINGHEIGHTTOOSMALL(@Nullable Integer AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL) {
    this.AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL = AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_PROCESSING_TOO_MANY_PIXELS(@Nullable Integer AD_VIDEO_PROCESSING_TOO_MANY_PIXELS) {
    this.AD_VIDEO_PROCESSING_TOO_MANY_PIXELS = AD_VIDEO_PROCESSING_TOO_MANY_PIXELS;
    return this;
  }

  /**
   * Ad videos must have a maximum area (width x height) of less than 89478485 pixels
   * @return AD_VIDEO_PROCESSING_TOO_MANY_PIXELS
   */
  
  @Schema(name = "AD_VIDEO_PROCESSING_TOO_MANY_PIXELS", description = "Ad videos must have a maximum area (width x height) of less than 89478485 pixels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_PROCESSING_TOO_MANY_PIXELS")
  public @Nullable Integer getADVIDEOPROCESSINGTOOMANYPIXELS() {
    return AD_VIDEO_PROCESSING_TOO_MANY_PIXELS;
  }

  @JsonProperty("AD_VIDEO_PROCESSING_TOO_MANY_PIXELS")
  public void setADVIDEOPROCESSINGTOOMANYPIXELS(@Nullable Integer AD_VIDEO_PROCESSING_TOO_MANY_PIXELS) {
    this.AD_VIDEO_PROCESSING_TOO_MANY_PIXELS = AD_VIDEO_PROCESSING_TOO_MANY_PIXELS;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_PROCESSING_TYPE_MISMATCH(@Nullable Integer AD_VIDEO_PROCESSING_TYPE_MISMATCH) {
    this.AD_VIDEO_PROCESSING_TYPE_MISMATCH = AD_VIDEO_PROCESSING_TYPE_MISMATCH;
    return this;
  }

  /**
   * Some ad videos could not be processed due to a file type mismatch.
   * @return AD_VIDEO_PROCESSING_TYPE_MISMATCH
   */
  
  @Schema(name = "AD_VIDEO_PROCESSING_TYPE_MISMATCH", description = "Some ad videos could not be processed due to a file type mismatch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_PROCESSING_TYPE_MISMATCH")
  public @Nullable Integer getADVIDEOPROCESSINGTYPEMISMATCH() {
    return AD_VIDEO_PROCESSING_TYPE_MISMATCH;
  }

  @JsonProperty("AD_VIDEO_PROCESSING_TYPE_MISMATCH")
  public void setADVIDEOPROCESSINGTYPEMISMATCH(@Nullable Integer AD_VIDEO_PROCESSING_TYPE_MISMATCH) {
    this.AD_VIDEO_PROCESSING_TYPE_MISMATCH = AD_VIDEO_PROCESSING_TYPE_MISMATCH;
  }

  public CatalogsFeedIngestionWarnings AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL(@Nullable Integer AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL) {
    this.AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL = AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL;
    return this;
  }

  /**
   * Ad videos must have a width larger than 75 pixels
   * @return AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL
   */
  
  @Schema(name = "AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL", description = "Ad videos must have a width larger than 75 pixels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL")
  public @Nullable Integer getADVIDEOPROCESSINGWIDTHTOOSMALL() {
    return AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL;
  }

  @JsonProperty("AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL")
  public void setADVIDEOPROCESSINGWIDTHTOOSMALL(@Nullable Integer AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL) {
    this.AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL = AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL;
  }

  public CatalogsFeedIngestionWarnings ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE(@Nullable Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) {
    this.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
    return this;
  }

  /**
   * Additional image files are unreadable. Please upload new files to continue.
   * @return ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE
   */
  
  @Schema(name = "ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE", description = "Additional image files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE")
  public @Nullable Integer getADDITIONALIMAGEFILENOTACCESSIBLE() {
    return ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
  }

  @JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE")
  public void setADDITIONALIMAGEFILENOTACCESSIBLE(@Nullable Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) {
    this.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
  }

  public CatalogsFeedIngestionWarnings ADDITIONAL_IMAGE_FILE_NOT_FOUND(@Nullable Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND) {
    this.ADDITIONAL_IMAGE_FILE_NOT_FOUND = ADDITIONAL_IMAGE_FILE_NOT_FOUND;
    return this;
  }

  /**
   * Additional image files are unreadable. Please upload new files to continue.
   * @return ADDITIONAL_IMAGE_FILE_NOT_FOUND
   */
  
  @Schema(name = "ADDITIONAL_IMAGE_FILE_NOT_FOUND", description = "Additional image files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_FOUND")
  public @Nullable Integer getADDITIONALIMAGEFILENOTFOUND() {
    return ADDITIONAL_IMAGE_FILE_NOT_FOUND;
  }

  @JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_FOUND")
  public void setADDITIONALIMAGEFILENOTFOUND(@Nullable Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND) {
    this.ADDITIONAL_IMAGE_FILE_NOT_FOUND = ADDITIONAL_IMAGE_FILE_NOT_FOUND;
  }

  public CatalogsFeedIngestionWarnings ADDITIONAL_IMAGE_INVALID_FILE(@Nullable Integer ADDITIONAL_IMAGE_INVALID_FILE) {
    this.ADDITIONAL_IMAGE_INVALID_FILE = ADDITIONAL_IMAGE_INVALID_FILE;
    return this;
  }

  /**
   * Additional image files are unreadable. Please upload new files to continue.
   * @return ADDITIONAL_IMAGE_INVALID_FILE
   */
  
  @Schema(name = "ADDITIONAL_IMAGE_INVALID_FILE", description = "Additional image files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADDITIONAL_IMAGE_INVALID_FILE")
  public @Nullable Integer getADDITIONALIMAGEINVALIDFILE() {
    return ADDITIONAL_IMAGE_INVALID_FILE;
  }

  @JsonProperty("ADDITIONAL_IMAGE_INVALID_FILE")
  public void setADDITIONALIMAGEINVALIDFILE(@Nullable Integer ADDITIONAL_IMAGE_INVALID_FILE) {
    this.ADDITIONAL_IMAGE_INVALID_FILE = ADDITIONAL_IMAGE_INVALID_FILE;
  }

  public CatalogsFeedIngestionWarnings ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR(@Nullable Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) {
    this.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
   * @return ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR
   */
  
  @Schema(name = "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR", description = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR")
  public @Nullable Integer getADDITIONALIMAGELEVELINTERNALERROR() {
    return ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
  }

  @JsonProperty("ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR")
  public void setADDITIONALIMAGELEVELINTERNALERROR(@Nullable Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) {
    this.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
  }

  public CatalogsFeedIngestionWarnings ADDITIONAL_IMAGE_MALFORMED_URL(@Nullable Integer ADDITIONAL_IMAGE_MALFORMED_URL) {
    this.ADDITIONAL_IMAGE_MALFORMED_URL = ADDITIONAL_IMAGE_MALFORMED_URL;
    return this;
  }

  /**
   * Additional image files are unreadable. Please check your link and upload new files to continue.
   * @return ADDITIONAL_IMAGE_MALFORMED_URL
   */
  
  @Schema(name = "ADDITIONAL_IMAGE_MALFORMED_URL", description = "Additional image files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADDITIONAL_IMAGE_MALFORMED_URL")
  public @Nullable Integer getADDITIONALIMAGEMALFORMEDURL() {
    return ADDITIONAL_IMAGE_MALFORMED_URL;
  }

  @JsonProperty("ADDITIONAL_IMAGE_MALFORMED_URL")
  public void setADDITIONALIMAGEMALFORMEDURL(@Nullable Integer ADDITIONAL_IMAGE_MALFORMED_URL) {
    this.ADDITIONAL_IMAGE_MALFORMED_URL = ADDITIONAL_IMAGE_MALFORMED_URL;
  }

  public CatalogsFeedIngestionWarnings FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT(@Nullable Integer FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT) {
    this.FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT = FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT;
    return this;
  }

  /**
   * Update your Google Sheets sharing settings from 'Editor' to 'Viewer'.
   * @return FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT
   */
  
  @Schema(name = "FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT", description = "Update your Google Sheets sharing settings from 'Editor' to 'Viewer'.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT")
  public @Nullable Integer getFETCHGOOGLESHEETPUBLICCANEDIT() {
    return FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT;
  }

  @JsonProperty("FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT")
  public void setFETCHGOOGLESHEETPUBLICCANEDIT(@Nullable Integer FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT) {
    this.FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT = FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT;
  }

  public CatalogsFeedIngestionWarnings HOTEL_PRICE_HEADER_IS_PRESENT(@Nullable Integer HOTEL_PRICE_HEADER_IS_PRESENT) {
    this.HOTEL_PRICE_HEADER_IS_PRESENT = HOTEL_PRICE_HEADER_IS_PRESENT;
    return this;
  }

  /**
   * Price is not a supported column. Use base_price and sale_price instead.
   * @return HOTEL_PRICE_HEADER_IS_PRESENT
   */
  
  @Schema(name = "HOTEL_PRICE_HEADER_IS_PRESENT", description = "Price is not a supported column. Use base_price and sale_price instead.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HOTEL_PRICE_HEADER_IS_PRESENT")
  public @Nullable Integer getHOTELPRICEHEADERISPRESENT() {
    return HOTEL_PRICE_HEADER_IS_PRESENT;
  }

  @JsonProperty("HOTEL_PRICE_HEADER_IS_PRESENT")
  public void setHOTELPRICEHEADERISPRESENT(@Nullable Integer HOTEL_PRICE_HEADER_IS_PRESENT) {
    this.HOTEL_PRICE_HEADER_IS_PRESENT = HOTEL_PRICE_HEADER_IS_PRESENT;
  }

  public CatalogsFeedIngestionWarnings VIDEO_DOWNLOAD_VIDEO_TOO_SHORT(@Nullable Integer VIDEO_DOWNLOAD_VIDEO_TOO_SHORT) {
    this.VIDEO_DOWNLOAD_VIDEO_TOO_SHORT = VIDEO_DOWNLOAD_VIDEO_TOO_SHORT;
    return this;
  }

  /**
   * Video length is too short. Please ensure that the main video is at least 4 seconds long.
   * @return VIDEO_DOWNLOAD_VIDEO_TOO_SHORT
   */
  
  @Schema(name = "VIDEO_DOWNLOAD_VIDEO_TOO_SHORT", description = "Video length is too short. Please ensure that the main video is at least 4 seconds long.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VIDEO_DOWNLOAD_VIDEO_TOO_SHORT")
  public @Nullable Integer getVIDEODOWNLOADVIDEOTOOSHORT() {
    return VIDEO_DOWNLOAD_VIDEO_TOO_SHORT;
  }

  @JsonProperty("VIDEO_DOWNLOAD_VIDEO_TOO_SHORT")
  public void setVIDEODOWNLOADVIDEOTOOSHORT(@Nullable Integer VIDEO_DOWNLOAD_VIDEO_TOO_SHORT) {
    this.VIDEO_DOWNLOAD_VIDEO_TOO_SHORT = VIDEO_DOWNLOAD_VIDEO_TOO_SHORT;
  }

  public CatalogsFeedIngestionWarnings VIDEO_FILE_NOT_ACCESSIBLE(@Nullable Integer VIDEO_FILE_NOT_ACCESSIBLE) {
    this.VIDEO_FILE_NOT_ACCESSIBLE = VIDEO_FILE_NOT_ACCESSIBLE;
    return this;
  }

  /**
   * Video files are unreadable. Please upload new files to continue.
   * @return VIDEO_FILE_NOT_ACCESSIBLE
   */
  
  @Schema(name = "VIDEO_FILE_NOT_ACCESSIBLE", description = "Video files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VIDEO_FILE_NOT_ACCESSIBLE")
  public @Nullable Integer getVIDEOFILENOTACCESSIBLE() {
    return VIDEO_FILE_NOT_ACCESSIBLE;
  }

  @JsonProperty("VIDEO_FILE_NOT_ACCESSIBLE")
  public void setVIDEOFILENOTACCESSIBLE(@Nullable Integer VIDEO_FILE_NOT_ACCESSIBLE) {
    this.VIDEO_FILE_NOT_ACCESSIBLE = VIDEO_FILE_NOT_ACCESSIBLE;
  }

  public CatalogsFeedIngestionWarnings VIDEO_FILE_NOT_FOUND(@Nullable Integer VIDEO_FILE_NOT_FOUND) {
    this.VIDEO_FILE_NOT_FOUND = VIDEO_FILE_NOT_FOUND;
    return this;
  }

  /**
   * Video files are unreadable. Please upload new files to continue.
   * @return VIDEO_FILE_NOT_FOUND
   */
  
  @Schema(name = "VIDEO_FILE_NOT_FOUND", description = "Video files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VIDEO_FILE_NOT_FOUND")
  public @Nullable Integer getVIDEOFILENOTFOUND() {
    return VIDEO_FILE_NOT_FOUND;
  }

  @JsonProperty("VIDEO_FILE_NOT_FOUND")
  public void setVIDEOFILENOTFOUND(@Nullable Integer VIDEO_FILE_NOT_FOUND) {
    this.VIDEO_FILE_NOT_FOUND = VIDEO_FILE_NOT_FOUND;
  }

  public CatalogsFeedIngestionWarnings VIDEO_INVALID_FILE(@Nullable Integer VIDEO_INVALID_FILE) {
    this.VIDEO_INVALID_FILE = VIDEO_INVALID_FILE;
    return this;
  }

  /**
   * Video files are unreadable. Please upload new files to continue.
   * @return VIDEO_INVALID_FILE
   */
  
  @Schema(name = "VIDEO_INVALID_FILE", description = "Video files are unreadable. Please upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VIDEO_INVALID_FILE")
  public @Nullable Integer getVIDEOINVALIDFILE() {
    return VIDEO_INVALID_FILE;
  }

  @JsonProperty("VIDEO_INVALID_FILE")
  public void setVIDEOINVALIDFILE(@Nullable Integer VIDEO_INVALID_FILE) {
    this.VIDEO_INVALID_FILE = VIDEO_INVALID_FILE;
  }

  public CatalogsFeedIngestionWarnings VIDEO_LEVEL_INTERNAL_ERROR(@Nullable Integer VIDEO_LEVEL_INTERNAL_ERROR) {
    this.VIDEO_LEVEL_INTERNAL_ERROR = VIDEO_LEVEL_INTERNAL_ERROR;
    return this;
  }

  /**
   * We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours.
   * @return VIDEO_LEVEL_INTERNAL_ERROR
   */
  
  @Schema(name = "VIDEO_LEVEL_INTERNAL_ERROR", description = "We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VIDEO_LEVEL_INTERNAL_ERROR")
  public @Nullable Integer getVIDEOLEVELINTERNALERROR() {
    return VIDEO_LEVEL_INTERNAL_ERROR;
  }

  @JsonProperty("VIDEO_LEVEL_INTERNAL_ERROR")
  public void setVIDEOLEVELINTERNALERROR(@Nullable Integer VIDEO_LEVEL_INTERNAL_ERROR) {
    this.VIDEO_LEVEL_INTERNAL_ERROR = VIDEO_LEVEL_INTERNAL_ERROR;
  }

  public CatalogsFeedIngestionWarnings VIDEO_MALFORMED_URL(@Nullable Integer VIDEO_MALFORMED_URL) {
    this.VIDEO_MALFORMED_URL = VIDEO_MALFORMED_URL;
    return this;
  }

  /**
   * Video files are unreadable. Please check your link and upload new files to continue.
   * @return VIDEO_MALFORMED_URL
   */
  
  @Schema(name = "VIDEO_MALFORMED_URL", description = "Video files are unreadable. Please check your link and upload new files to continue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VIDEO_MALFORMED_URL")
  public @Nullable Integer getVIDEOMALFORMEDURL() {
    return VIDEO_MALFORMED_URL;
  }

  @JsonProperty("VIDEO_MALFORMED_URL")
  public void setVIDEOMALFORMEDURL(@Nullable Integer VIDEO_MALFORMED_URL) {
    this.VIDEO_MALFORMED_URL = VIDEO_MALFORMED_URL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings = (CatalogsFeedIngestionWarnings) o;
    return Objects.equals(this.AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_400, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_400) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_403, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_403) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_404, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_404) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_405, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_405) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_410, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_410) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_429, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_429) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_500, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_500) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_502, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_502) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_503, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_503) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_504, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_504) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_507, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_507) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_508, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_508) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_520, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_520) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_521, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_521) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_522, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_522) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_HTTP_STATUS_525, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_HTTP_STATUS_525) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_INTERNAL_ERROR, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_INTERNAL_ERROR) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_INVALID_FILE, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_INVALID_FILE) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_SITE_ERROR, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_SITE_ERROR) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_SITE_TIMEOUT, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_SITE_TIMEOUT) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_SSL_ERROR, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_SSL_ERROR) &&
        Objects.equals(this.AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR, catalogsFeedIngestionWarnings.AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR) &&
        Objects.equals(this.AD_IMAGE_PROCESSING_EMPTY_FILE, catalogsFeedIngestionWarnings.AD_IMAGE_PROCESSING_EMPTY_FILE) &&
        Objects.equals(this.AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL, catalogsFeedIngestionWarnings.AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL) &&
        Objects.equals(this.AD_IMAGE_PROCESSING_TOO_MANY_PIXELS, catalogsFeedIngestionWarnings.AD_IMAGE_PROCESSING_TOO_MANY_PIXELS) &&
        Objects.equals(this.AD_IMAGE_PROCESSING_TYPE_MISMATCH, catalogsFeedIngestionWarnings.AD_IMAGE_PROCESSING_TYPE_MISMATCH) &&
        Objects.equals(this.AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL, catalogsFeedIngestionWarnings.AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_400, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_400) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_403, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_403) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_404, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_404) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_405, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_405) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_410, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_410) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_429, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_429) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_500, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_500) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_502, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_502) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_503, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_503) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_504, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_504) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_507, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_507) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_508, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_508) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_520, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_520) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_521, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_521) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_522, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_522) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_HTTP_STATUS_525, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_HTTP_STATUS_525) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_INTERNAL_ERROR, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_INTERNAL_ERROR) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_INVALID_FILE, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_INVALID_FILE) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_SITE_ERROR, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_SITE_ERROR) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_SITE_TIMEOUT, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_SITE_TIMEOUT) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_SSL_ERROR, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_SSL_ERROR) &&
        Objects.equals(this.AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR, catalogsFeedIngestionWarnings.AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR) &&
        Objects.equals(this.AD_VIDEO_LENGTH_TOO_SHORT, catalogsFeedIngestionWarnings.AD_VIDEO_LENGTH_TOO_SHORT) &&
        Objects.equals(this.AD_VIDEO_PROCESSING_EMPTY_FILE, catalogsFeedIngestionWarnings.AD_VIDEO_PROCESSING_EMPTY_FILE) &&
        Objects.equals(this.AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL, catalogsFeedIngestionWarnings.AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL) &&
        Objects.equals(this.AD_VIDEO_PROCESSING_TOO_MANY_PIXELS, catalogsFeedIngestionWarnings.AD_VIDEO_PROCESSING_TOO_MANY_PIXELS) &&
        Objects.equals(this.AD_VIDEO_PROCESSING_TYPE_MISMATCH, catalogsFeedIngestionWarnings.AD_VIDEO_PROCESSING_TYPE_MISMATCH) &&
        Objects.equals(this.AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL, catalogsFeedIngestionWarnings.AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL) &&
        Objects.equals(this.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) &&
        Objects.equals(this.ADDITIONAL_IMAGE_FILE_NOT_FOUND, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_FILE_NOT_FOUND) &&
        Objects.equals(this.ADDITIONAL_IMAGE_INVALID_FILE, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_INVALID_FILE) &&
        Objects.equals(this.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) &&
        Objects.equals(this.ADDITIONAL_IMAGE_MALFORMED_URL, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_MALFORMED_URL) &&
        Objects.equals(this.FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT, catalogsFeedIngestionWarnings.FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT) &&
        Objects.equals(this.HOTEL_PRICE_HEADER_IS_PRESENT, catalogsFeedIngestionWarnings.HOTEL_PRICE_HEADER_IS_PRESENT) &&
        Objects.equals(this.VIDEO_DOWNLOAD_VIDEO_TOO_SHORT, catalogsFeedIngestionWarnings.VIDEO_DOWNLOAD_VIDEO_TOO_SHORT) &&
        Objects.equals(this.VIDEO_FILE_NOT_ACCESSIBLE, catalogsFeedIngestionWarnings.VIDEO_FILE_NOT_ACCESSIBLE) &&
        Objects.equals(this.VIDEO_FILE_NOT_FOUND, catalogsFeedIngestionWarnings.VIDEO_FILE_NOT_FOUND) &&
        Objects.equals(this.VIDEO_INVALID_FILE, catalogsFeedIngestionWarnings.VIDEO_INVALID_FILE) &&
        Objects.equals(this.VIDEO_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionWarnings.VIDEO_LEVEL_INTERNAL_ERROR) &&
        Objects.equals(this.VIDEO_MALFORMED_URL, catalogsFeedIngestionWarnings.VIDEO_MALFORMED_URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR, AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR, AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE, AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND, AD_IMAGE_DOWNLOAD_HTTP_STATUS_400, AD_IMAGE_DOWNLOAD_HTTP_STATUS_403, AD_IMAGE_DOWNLOAD_HTTP_STATUS_404, AD_IMAGE_DOWNLOAD_HTTP_STATUS_405, AD_IMAGE_DOWNLOAD_HTTP_STATUS_410, AD_IMAGE_DOWNLOAD_HTTP_STATUS_429, AD_IMAGE_DOWNLOAD_HTTP_STATUS_500, AD_IMAGE_DOWNLOAD_HTTP_STATUS_502, AD_IMAGE_DOWNLOAD_HTTP_STATUS_503, AD_IMAGE_DOWNLOAD_HTTP_STATUS_504, AD_IMAGE_DOWNLOAD_HTTP_STATUS_507, AD_IMAGE_DOWNLOAD_HTTP_STATUS_508, AD_IMAGE_DOWNLOAD_HTTP_STATUS_520, AD_IMAGE_DOWNLOAD_HTTP_STATUS_521, AD_IMAGE_DOWNLOAD_HTTP_STATUS_522, AD_IMAGE_DOWNLOAD_HTTP_STATUS_525, AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR, AD_IMAGE_DOWNLOAD_INTERNAL_ERROR, AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD, AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL, AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED, AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED, AD_IMAGE_DOWNLOAD_INVALID_FILE, AD_IMAGE_DOWNLOAD_SITE_ERROR, AD_IMAGE_DOWNLOAD_SITE_TIMEOUT, AD_IMAGE_DOWNLOAD_SSL_ERROR, AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR, AD_IMAGE_PROCESSING_EMPTY_FILE, AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL, AD_IMAGE_PROCESSING_TOO_MANY_PIXELS, AD_IMAGE_PROCESSING_TYPE_MISMATCH, AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL, AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR, AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR, AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE, AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND, AD_VIDEO_DOWNLOAD_HTTP_STATUS_400, AD_VIDEO_DOWNLOAD_HTTP_STATUS_403, AD_VIDEO_DOWNLOAD_HTTP_STATUS_404, AD_VIDEO_DOWNLOAD_HTTP_STATUS_405, AD_VIDEO_DOWNLOAD_HTTP_STATUS_410, AD_VIDEO_DOWNLOAD_HTTP_STATUS_429, AD_VIDEO_DOWNLOAD_HTTP_STATUS_500, AD_VIDEO_DOWNLOAD_HTTP_STATUS_502, AD_VIDEO_DOWNLOAD_HTTP_STATUS_503, AD_VIDEO_DOWNLOAD_HTTP_STATUS_504, AD_VIDEO_DOWNLOAD_HTTP_STATUS_507, AD_VIDEO_DOWNLOAD_HTTP_STATUS_508, AD_VIDEO_DOWNLOAD_HTTP_STATUS_520, AD_VIDEO_DOWNLOAD_HTTP_STATUS_521, AD_VIDEO_DOWNLOAD_HTTP_STATUS_522, AD_VIDEO_DOWNLOAD_HTTP_STATUS_525, AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR, AD_VIDEO_DOWNLOAD_INTERNAL_ERROR, AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD, AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL, AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED, AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED, AD_VIDEO_DOWNLOAD_INVALID_FILE, AD_VIDEO_DOWNLOAD_SITE_ERROR, AD_VIDEO_DOWNLOAD_SITE_TIMEOUT, AD_VIDEO_DOWNLOAD_SSL_ERROR, AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR, AD_VIDEO_LENGTH_TOO_SHORT, AD_VIDEO_PROCESSING_EMPTY_FILE, AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL, AD_VIDEO_PROCESSING_TOO_MANY_PIXELS, AD_VIDEO_PROCESSING_TYPE_MISMATCH, AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL, ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE, ADDITIONAL_IMAGE_FILE_NOT_FOUND, ADDITIONAL_IMAGE_INVALID_FILE, ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR, ADDITIONAL_IMAGE_MALFORMED_URL, FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT, HOTEL_PRICE_HEADER_IS_PRESENT, VIDEO_DOWNLOAD_VIDEO_TOO_SHORT, VIDEO_FILE_NOT_ACCESSIBLE, VIDEO_FILE_NOT_FOUND, VIDEO_INVALID_FILE, VIDEO_LEVEL_INTERNAL_ERROR, VIDEO_MALFORMED_URL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionWarnings {\n");
    sb.append("    AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_400: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_400)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_403: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_403)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_404: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_404)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_405: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_405)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_410: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_410)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_429: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_429)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_500: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_500)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_502: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_502)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_503: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_503)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_504: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_504)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_507: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_507)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_508: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_508)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_520: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_520)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_521: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_521)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_522: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_522)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_HTTP_STATUS_525: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_HTTP_STATUS_525)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_INTERNAL_ERROR: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_INTERNAL_ERROR)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_INVALID_FILE: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_INVALID_FILE)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_SITE_ERROR: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_SITE_ERROR)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_SITE_TIMEOUT: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_SITE_TIMEOUT)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_SSL_ERROR: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_SSL_ERROR)).append("\n");
    sb.append("    AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR: ").append(toIndentedString(AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR)).append("\n");
    sb.append("    AD_IMAGE_PROCESSING_EMPTY_FILE: ").append(toIndentedString(AD_IMAGE_PROCESSING_EMPTY_FILE)).append("\n");
    sb.append("    AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL: ").append(toIndentedString(AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL)).append("\n");
    sb.append("    AD_IMAGE_PROCESSING_TOO_MANY_PIXELS: ").append(toIndentedString(AD_IMAGE_PROCESSING_TOO_MANY_PIXELS)).append("\n");
    sb.append("    AD_IMAGE_PROCESSING_TYPE_MISMATCH: ").append(toIndentedString(AD_IMAGE_PROCESSING_TYPE_MISMATCH)).append("\n");
    sb.append("    AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL: ").append(toIndentedString(AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_400: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_400)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_403: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_403)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_404: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_404)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_405: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_405)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_410: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_410)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_429: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_429)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_500: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_500)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_502: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_502)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_503: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_503)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_504: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_504)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_507: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_507)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_508: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_508)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_520: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_520)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_521: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_521)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_522: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_522)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_HTTP_STATUS_525: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_HTTP_STATUS_525)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_INTERNAL_ERROR: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_INTERNAL_ERROR)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_INVALID_FILE: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_INVALID_FILE)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_SITE_ERROR: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_SITE_ERROR)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_SITE_TIMEOUT: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_SITE_TIMEOUT)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_SSL_ERROR: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_SSL_ERROR)).append("\n");
    sb.append("    AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR: ").append(toIndentedString(AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR)).append("\n");
    sb.append("    AD_VIDEO_LENGTH_TOO_SHORT: ").append(toIndentedString(AD_VIDEO_LENGTH_TOO_SHORT)).append("\n");
    sb.append("    AD_VIDEO_PROCESSING_EMPTY_FILE: ").append(toIndentedString(AD_VIDEO_PROCESSING_EMPTY_FILE)).append("\n");
    sb.append("    AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL: ").append(toIndentedString(AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL)).append("\n");
    sb.append("    AD_VIDEO_PROCESSING_TOO_MANY_PIXELS: ").append(toIndentedString(AD_VIDEO_PROCESSING_TOO_MANY_PIXELS)).append("\n");
    sb.append("    AD_VIDEO_PROCESSING_TYPE_MISMATCH: ").append(toIndentedString(AD_VIDEO_PROCESSING_TYPE_MISMATCH)).append("\n");
    sb.append("    AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL: ").append(toIndentedString(AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: ").append(toIndentedString(ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_FILE_NOT_FOUND: ").append(toIndentedString(ADDITIONAL_IMAGE_FILE_NOT_FOUND)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_INVALID_FILE: ").append(toIndentedString(ADDITIONAL_IMAGE_INVALID_FILE)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: ").append(toIndentedString(ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_MALFORMED_URL: ").append(toIndentedString(ADDITIONAL_IMAGE_MALFORMED_URL)).append("\n");
    sb.append("    FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT: ").append(toIndentedString(FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT)).append("\n");
    sb.append("    HOTEL_PRICE_HEADER_IS_PRESENT: ").append(toIndentedString(HOTEL_PRICE_HEADER_IS_PRESENT)).append("\n");
    sb.append("    VIDEO_DOWNLOAD_VIDEO_TOO_SHORT: ").append(toIndentedString(VIDEO_DOWNLOAD_VIDEO_TOO_SHORT)).append("\n");
    sb.append("    VIDEO_FILE_NOT_ACCESSIBLE: ").append(toIndentedString(VIDEO_FILE_NOT_ACCESSIBLE)).append("\n");
    sb.append("    VIDEO_FILE_NOT_FOUND: ").append(toIndentedString(VIDEO_FILE_NOT_FOUND)).append("\n");
    sb.append("    VIDEO_INVALID_FILE: ").append(toIndentedString(VIDEO_INVALID_FILE)).append("\n");
    sb.append("    VIDEO_LEVEL_INTERNAL_ERROR: ").append(toIndentedString(VIDEO_LEVEL_INTERNAL_ERROR)).append("\n");
    sb.append("    VIDEO_MALFORMED_URL: ").append(toIndentedString(VIDEO_MALFORMED_URL)).append("\n");
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

