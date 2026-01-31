package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsFeedIngestionWarnings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsFeedIngestionWarnings {

  private @Nullable Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;

  private @Nullable Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;

  private @Nullable Integer ADDITIONAL_IMAGE_MALFORMED_URL;

  private @Nullable Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND;

  private @Nullable Integer ADDITIONAL_IMAGE_INVALID_FILE;

  private @Nullable Integer HOTEL_PRICE_HEADER_IS_PRESENT;

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

  public void setADDITIONALIMAGELEVELINTERNALERROR(@Nullable Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) {
    this.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
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

  public void setADDITIONALIMAGEFILENOTACCESSIBLE(@Nullable Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) {
    this.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
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

  public void setADDITIONALIMAGEMALFORMEDURL(@Nullable Integer ADDITIONAL_IMAGE_MALFORMED_URL) {
    this.ADDITIONAL_IMAGE_MALFORMED_URL = ADDITIONAL_IMAGE_MALFORMED_URL;
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

  public void setADDITIONALIMAGEINVALIDFILE(@Nullable Integer ADDITIONAL_IMAGE_INVALID_FILE) {
    this.ADDITIONAL_IMAGE_INVALID_FILE = ADDITIONAL_IMAGE_INVALID_FILE;
  }

  public CatalogsFeedIngestionWarnings HOTEL_PRICE_HEADER_IS_PRESENT(@Nullable Integer HOTEL_PRICE_HEADER_IS_PRESENT) {
    this.HOTEL_PRICE_HEADER_IS_PRESENT = HOTEL_PRICE_HEADER_IS_PRESENT;
    return this;
  }

  /**
   * price is not a supported column. Use base_price and sale_price instead.
   * @return HOTEL_PRICE_HEADER_IS_PRESENT
   */
  
  @Schema(name = "HOTEL_PRICE_HEADER_IS_PRESENT", description = "price is not a supported column. Use base_price and sale_price instead.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HOTEL_PRICE_HEADER_IS_PRESENT")
  public @Nullable Integer getHOTELPRICEHEADERISPRESENT() {
    return HOTEL_PRICE_HEADER_IS_PRESENT;
  }

  public void setHOTELPRICEHEADERISPRESENT(@Nullable Integer HOTEL_PRICE_HEADER_IS_PRESENT) {
    this.HOTEL_PRICE_HEADER_IS_PRESENT = HOTEL_PRICE_HEADER_IS_PRESENT;
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
    return Objects.equals(this.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) &&
        Objects.equals(this.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) &&
        Objects.equals(this.ADDITIONAL_IMAGE_MALFORMED_URL, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_MALFORMED_URL) &&
        Objects.equals(this.ADDITIONAL_IMAGE_FILE_NOT_FOUND, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_FILE_NOT_FOUND) &&
        Objects.equals(this.ADDITIONAL_IMAGE_INVALID_FILE, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_INVALID_FILE) &&
        Objects.equals(this.HOTEL_PRICE_HEADER_IS_PRESENT, catalogsFeedIngestionWarnings.HOTEL_PRICE_HEADER_IS_PRESENT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR, ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE, ADDITIONAL_IMAGE_MALFORMED_URL, ADDITIONAL_IMAGE_FILE_NOT_FOUND, ADDITIONAL_IMAGE_INVALID_FILE, HOTEL_PRICE_HEADER_IS_PRESENT);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionWarnings {\n");
    sb.append("    ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: ").append(toIndentedString(ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: ").append(toIndentedString(ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_MALFORMED_URL: ").append(toIndentedString(ADDITIONAL_IMAGE_MALFORMED_URL)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_FILE_NOT_FOUND: ").append(toIndentedString(ADDITIONAL_IMAGE_FILE_NOT_FOUND)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_INVALID_FILE: ").append(toIndentedString(ADDITIONAL_IMAGE_INVALID_FILE)).append("\n");
    sb.append("    HOTEL_PRICE_HEADER_IS_PRESENT: ").append(toIndentedString(HOTEL_PRICE_HEADER_IS_PRESENT)).append("\n");
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

