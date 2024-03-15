package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedIngestionWarnings  {
  
 /**
  * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
  */
  @ApiModelProperty(value = "We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.")
  private Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;

 /**
  * Additional image files are unreadable. Please upload new files to continue.
  */
  @ApiModelProperty(value = "Additional image files are unreadable. Please upload new files to continue.")
  private Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;

 /**
  * Additional image files are unreadable. Please check your link and upload new files to continue.
  */
  @ApiModelProperty(value = "Additional image files are unreadable. Please check your link and upload new files to continue.")
  private Integer ADDITIONAL_IMAGE_MALFORMED_URL;

 /**
  * Additional image files are unreadable. Please upload new files to continue.
  */
  @ApiModelProperty(value = "Additional image files are unreadable. Please upload new files to continue.")
  private Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND;

 /**
  * Additional image files are unreadable. Please upload new files to continue.
  */
  @ApiModelProperty(value = "Additional image files are unreadable. Please upload new files to continue.")
  private Integer ADDITIONAL_IMAGE_INVALID_FILE;

 /**
  * price is not a supported column. Use base_price and sale_price instead.
  */
  @ApiModelProperty(value = "price is not a supported column. Use base_price and sale_price instead.")
  private Integer HOTEL_PRICE_HEADER_IS_PRESENT;
 /**
  * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
  * @return ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR
  */
  @JsonProperty("ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR")
  public Integer getADDITIONALIMAGELEVELINTERNALERROR() {
    return ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
  }

  /**
   * Sets the <code>ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR</code> property.
   */
 public void setADDITIONALIMAGELEVELINTERNALERROR(Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) {
    this.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
  }

  /**
   * Sets the <code>ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR</code> property.
   */
  public CatalogsFeedIngestionWarnings ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR(Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) {
    this.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
    return this;
  }

 /**
  * Additional image files are unreadable. Please upload new files to continue.
  * @return ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE
  */
  @JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE")
  public Integer getADDITIONALIMAGEFILENOTACCESSIBLE() {
    return ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
  }

  /**
   * Sets the <code>ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE</code> property.
   */
 public void setADDITIONALIMAGEFILENOTACCESSIBLE(Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) {
    this.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
  }

  /**
   * Sets the <code>ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE</code> property.
   */
  public CatalogsFeedIngestionWarnings ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE(Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) {
    this.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
    return this;
  }

 /**
  * Additional image files are unreadable. Please check your link and upload new files to continue.
  * @return ADDITIONAL_IMAGE_MALFORMED_URL
  */
  @JsonProperty("ADDITIONAL_IMAGE_MALFORMED_URL")
  public Integer getADDITIONALIMAGEMALFORMEDURL() {
    return ADDITIONAL_IMAGE_MALFORMED_URL;
  }

  /**
   * Sets the <code>ADDITIONAL_IMAGE_MALFORMED_URL</code> property.
   */
 public void setADDITIONALIMAGEMALFORMEDURL(Integer ADDITIONAL_IMAGE_MALFORMED_URL) {
    this.ADDITIONAL_IMAGE_MALFORMED_URL = ADDITIONAL_IMAGE_MALFORMED_URL;
  }

  /**
   * Sets the <code>ADDITIONAL_IMAGE_MALFORMED_URL</code> property.
   */
  public CatalogsFeedIngestionWarnings ADDITIONAL_IMAGE_MALFORMED_URL(Integer ADDITIONAL_IMAGE_MALFORMED_URL) {
    this.ADDITIONAL_IMAGE_MALFORMED_URL = ADDITIONAL_IMAGE_MALFORMED_URL;
    return this;
  }

 /**
  * Additional image files are unreadable. Please upload new files to continue.
  * @return ADDITIONAL_IMAGE_FILE_NOT_FOUND
  */
  @JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_FOUND")
  public Integer getADDITIONALIMAGEFILENOTFOUND() {
    return ADDITIONAL_IMAGE_FILE_NOT_FOUND;
  }

  /**
   * Sets the <code>ADDITIONAL_IMAGE_FILE_NOT_FOUND</code> property.
   */
 public void setADDITIONALIMAGEFILENOTFOUND(Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND) {
    this.ADDITIONAL_IMAGE_FILE_NOT_FOUND = ADDITIONAL_IMAGE_FILE_NOT_FOUND;
  }

  /**
   * Sets the <code>ADDITIONAL_IMAGE_FILE_NOT_FOUND</code> property.
   */
  public CatalogsFeedIngestionWarnings ADDITIONAL_IMAGE_FILE_NOT_FOUND(Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND) {
    this.ADDITIONAL_IMAGE_FILE_NOT_FOUND = ADDITIONAL_IMAGE_FILE_NOT_FOUND;
    return this;
  }

 /**
  * Additional image files are unreadable. Please upload new files to continue.
  * @return ADDITIONAL_IMAGE_INVALID_FILE
  */
  @JsonProperty("ADDITIONAL_IMAGE_INVALID_FILE")
  public Integer getADDITIONALIMAGEINVALIDFILE() {
    return ADDITIONAL_IMAGE_INVALID_FILE;
  }

  /**
   * Sets the <code>ADDITIONAL_IMAGE_INVALID_FILE</code> property.
   */
 public void setADDITIONALIMAGEINVALIDFILE(Integer ADDITIONAL_IMAGE_INVALID_FILE) {
    this.ADDITIONAL_IMAGE_INVALID_FILE = ADDITIONAL_IMAGE_INVALID_FILE;
  }

  /**
   * Sets the <code>ADDITIONAL_IMAGE_INVALID_FILE</code> property.
   */
  public CatalogsFeedIngestionWarnings ADDITIONAL_IMAGE_INVALID_FILE(Integer ADDITIONAL_IMAGE_INVALID_FILE) {
    this.ADDITIONAL_IMAGE_INVALID_FILE = ADDITIONAL_IMAGE_INVALID_FILE;
    return this;
  }

 /**
  * price is not a supported column. Use base_price and sale_price instead.
  * @return HOTEL_PRICE_HEADER_IS_PRESENT
  */
  @JsonProperty("HOTEL_PRICE_HEADER_IS_PRESENT")
  public Integer getHOTELPRICEHEADERISPRESENT() {
    return HOTEL_PRICE_HEADER_IS_PRESENT;
  }

  /**
   * Sets the <code>HOTEL_PRICE_HEADER_IS_PRESENT</code> property.
   */
 public void setHOTELPRICEHEADERISPRESENT(Integer HOTEL_PRICE_HEADER_IS_PRESENT) {
    this.HOTEL_PRICE_HEADER_IS_PRESENT = HOTEL_PRICE_HEADER_IS_PRESENT;
  }

  /**
   * Sets the <code>HOTEL_PRICE_HEADER_IS_PRESENT</code> property.
   */
  public CatalogsFeedIngestionWarnings HOTEL_PRICE_HEADER_IS_PRESENT(Integer HOTEL_PRICE_HEADER_IS_PRESENT) {
    this.HOTEL_PRICE_HEADER_IS_PRESENT = HOTEL_PRICE_HEADER_IS_PRESENT;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

