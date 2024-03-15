package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedIngestionErrors   {
  
  private Integer LINE_LEVEL_INTERNAL_ERROR;


  public enum LARGEPRODUCTCOUNTDECREASEEnum {
    NUMBER_1(1);

    private String value;

    LARGEPRODUCTCOUNTDECREASEEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private LARGEPRODUCTCOUNTDECREASEEnum LARGE_PRODUCT_COUNT_DECREASE;
  private Integer ACCOUNT_FLAGGED;
  private Integer IMAGE_LEVEL_INTERNAL_ERROR;
  private Integer IMAGE_FILE_NOT_ACCESSIBLE;
  private Integer IMAGE_MALFORMED_URL;
  private Integer IMAGE_FILE_NOT_FOUND;
  private Integer IMAGE_INVALID_FILE;

  public CatalogsFeedIngestionErrors () {

  }

  public CatalogsFeedIngestionErrors (Integer LINE_LEVEL_INTERNAL_ERROR, LARGEPRODUCTCOUNTDECREASEEnum LARGE_PRODUCT_COUNT_DECREASE, Integer ACCOUNT_FLAGGED, Integer IMAGE_LEVEL_INTERNAL_ERROR, Integer IMAGE_FILE_NOT_ACCESSIBLE, Integer IMAGE_MALFORMED_URL, Integer IMAGE_FILE_NOT_FOUND, Integer IMAGE_INVALID_FILE) {
    this.LINE_LEVEL_INTERNAL_ERROR = LINE_LEVEL_INTERNAL_ERROR;
    this.LARGE_PRODUCT_COUNT_DECREASE = LARGE_PRODUCT_COUNT_DECREASE;
    this.ACCOUNT_FLAGGED = ACCOUNT_FLAGGED;
    this.IMAGE_LEVEL_INTERNAL_ERROR = IMAGE_LEVEL_INTERNAL_ERROR;
    this.IMAGE_FILE_NOT_ACCESSIBLE = IMAGE_FILE_NOT_ACCESSIBLE;
    this.IMAGE_MALFORMED_URL = IMAGE_MALFORMED_URL;
    this.IMAGE_FILE_NOT_FOUND = IMAGE_FILE_NOT_FOUND;
    this.IMAGE_INVALID_FILE = IMAGE_INVALID_FILE;
  }

    
  @JsonProperty("LINE_LEVEL_INTERNAL_ERROR")
  public Integer getLINELEVELINTERNALERROR() {
    return LINE_LEVEL_INTERNAL_ERROR;
  }
  public void setLINELEVELINTERNALERROR(Integer LINE_LEVEL_INTERNAL_ERROR) {
    this.LINE_LEVEL_INTERNAL_ERROR = LINE_LEVEL_INTERNAL_ERROR;
  }

    
  @JsonProperty("LARGE_PRODUCT_COUNT_DECREASE")
  public LARGEPRODUCTCOUNTDECREASEEnum getLARGEPRODUCTCOUNTDECREASE() {
    return LARGE_PRODUCT_COUNT_DECREASE;
  }
  public void setLARGEPRODUCTCOUNTDECREASE(LARGEPRODUCTCOUNTDECREASEEnum LARGE_PRODUCT_COUNT_DECREASE) {
    this.LARGE_PRODUCT_COUNT_DECREASE = LARGE_PRODUCT_COUNT_DECREASE;
  }

    
  @JsonProperty("ACCOUNT_FLAGGED")
  public Integer getACCOUNTFLAGGED() {
    return ACCOUNT_FLAGGED;
  }
  public void setACCOUNTFLAGGED(Integer ACCOUNT_FLAGGED) {
    this.ACCOUNT_FLAGGED = ACCOUNT_FLAGGED;
  }

    
  @JsonProperty("IMAGE_LEVEL_INTERNAL_ERROR")
  public Integer getIMAGELEVELINTERNALERROR() {
    return IMAGE_LEVEL_INTERNAL_ERROR;
  }
  public void setIMAGELEVELINTERNALERROR(Integer IMAGE_LEVEL_INTERNAL_ERROR) {
    this.IMAGE_LEVEL_INTERNAL_ERROR = IMAGE_LEVEL_INTERNAL_ERROR;
  }

    
  @JsonProperty("IMAGE_FILE_NOT_ACCESSIBLE")
  public Integer getIMAGEFILENOTACCESSIBLE() {
    return IMAGE_FILE_NOT_ACCESSIBLE;
  }
  public void setIMAGEFILENOTACCESSIBLE(Integer IMAGE_FILE_NOT_ACCESSIBLE) {
    this.IMAGE_FILE_NOT_ACCESSIBLE = IMAGE_FILE_NOT_ACCESSIBLE;
  }

    
  @JsonProperty("IMAGE_MALFORMED_URL")
  public Integer getIMAGEMALFORMEDURL() {
    return IMAGE_MALFORMED_URL;
  }
  public void setIMAGEMALFORMEDURL(Integer IMAGE_MALFORMED_URL) {
    this.IMAGE_MALFORMED_URL = IMAGE_MALFORMED_URL;
  }

    
  @JsonProperty("IMAGE_FILE_NOT_FOUND")
  public Integer getIMAGEFILENOTFOUND() {
    return IMAGE_FILE_NOT_FOUND;
  }
  public void setIMAGEFILENOTFOUND(Integer IMAGE_FILE_NOT_FOUND) {
    this.IMAGE_FILE_NOT_FOUND = IMAGE_FILE_NOT_FOUND;
  }

    
  @JsonProperty("IMAGE_INVALID_FILE")
  public Integer getIMAGEINVALIDFILE() {
    return IMAGE_INVALID_FILE;
  }
  public void setIMAGEINVALIDFILE(Integer IMAGE_INVALID_FILE) {
    this.IMAGE_INVALID_FILE = IMAGE_INVALID_FILE;
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
    return Objects.equals(LINE_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionErrors.LINE_LEVEL_INTERNAL_ERROR) &&
        Objects.equals(LARGE_PRODUCT_COUNT_DECREASE, catalogsFeedIngestionErrors.LARGE_PRODUCT_COUNT_DECREASE) &&
        Objects.equals(ACCOUNT_FLAGGED, catalogsFeedIngestionErrors.ACCOUNT_FLAGGED) &&
        Objects.equals(IMAGE_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionErrors.IMAGE_LEVEL_INTERNAL_ERROR) &&
        Objects.equals(IMAGE_FILE_NOT_ACCESSIBLE, catalogsFeedIngestionErrors.IMAGE_FILE_NOT_ACCESSIBLE) &&
        Objects.equals(IMAGE_MALFORMED_URL, catalogsFeedIngestionErrors.IMAGE_MALFORMED_URL) &&
        Objects.equals(IMAGE_FILE_NOT_FOUND, catalogsFeedIngestionErrors.IMAGE_FILE_NOT_FOUND) &&
        Objects.equals(IMAGE_INVALID_FILE, catalogsFeedIngestionErrors.IMAGE_INVALID_FILE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LINE_LEVEL_INTERNAL_ERROR, LARGE_PRODUCT_COUNT_DECREASE, ACCOUNT_FLAGGED, IMAGE_LEVEL_INTERNAL_ERROR, IMAGE_FILE_NOT_ACCESSIBLE, IMAGE_MALFORMED_URL, IMAGE_FILE_NOT_FOUND, IMAGE_INVALID_FILE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionErrors {\n");
    
    sb.append("    LINE_LEVEL_INTERNAL_ERROR: ").append(toIndentedString(LINE_LEVEL_INTERNAL_ERROR)).append("\n");
    sb.append("    LARGE_PRODUCT_COUNT_DECREASE: ").append(toIndentedString(LARGE_PRODUCT_COUNT_DECREASE)).append("\n");
    sb.append("    ACCOUNT_FLAGGED: ").append(toIndentedString(ACCOUNT_FLAGGED)).append("\n");
    sb.append("    IMAGE_LEVEL_INTERNAL_ERROR: ").append(toIndentedString(IMAGE_LEVEL_INTERNAL_ERROR)).append("\n");
    sb.append("    IMAGE_FILE_NOT_ACCESSIBLE: ").append(toIndentedString(IMAGE_FILE_NOT_ACCESSIBLE)).append("\n");
    sb.append("    IMAGE_MALFORMED_URL: ").append(toIndentedString(IMAGE_MALFORMED_URL)).append("\n");
    sb.append("    IMAGE_FILE_NOT_FOUND: ").append(toIndentedString(IMAGE_FILE_NOT_FOUND)).append("\n");
    sb.append("    IMAGE_INVALID_FILE: ").append(toIndentedString(IMAGE_INVALID_FILE)).append("\n");
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
