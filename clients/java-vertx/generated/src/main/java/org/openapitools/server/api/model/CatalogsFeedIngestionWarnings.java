package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedIngestionWarnings   {
  
  private Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
  private Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
  private Integer ADDITIONAL_IMAGE_MALFORMED_URL;
  private Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND;
  private Integer ADDITIONAL_IMAGE_INVALID_FILE;
  private Integer HOTEL_PRICE_HEADER_IS_PRESENT;

  public CatalogsFeedIngestionWarnings () {

  }

  public CatalogsFeedIngestionWarnings (Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR, Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE, Integer ADDITIONAL_IMAGE_MALFORMED_URL, Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND, Integer ADDITIONAL_IMAGE_INVALID_FILE, Integer HOTEL_PRICE_HEADER_IS_PRESENT) {
    this.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
    this.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
    this.ADDITIONAL_IMAGE_MALFORMED_URL = ADDITIONAL_IMAGE_MALFORMED_URL;
    this.ADDITIONAL_IMAGE_FILE_NOT_FOUND = ADDITIONAL_IMAGE_FILE_NOT_FOUND;
    this.ADDITIONAL_IMAGE_INVALID_FILE = ADDITIONAL_IMAGE_INVALID_FILE;
    this.HOTEL_PRICE_HEADER_IS_PRESENT = HOTEL_PRICE_HEADER_IS_PRESENT;
  }

    
  @JsonProperty("ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR")
  public Integer getADDITIONALIMAGELEVELINTERNALERROR() {
    return ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
  }
  public void setADDITIONALIMAGELEVELINTERNALERROR(Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) {
    this.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
  }

    
  @JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE")
  public Integer getADDITIONALIMAGEFILENOTACCESSIBLE() {
    return ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
  }
  public void setADDITIONALIMAGEFILENOTACCESSIBLE(Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) {
    this.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
  }

    
  @JsonProperty("ADDITIONAL_IMAGE_MALFORMED_URL")
  public Integer getADDITIONALIMAGEMALFORMEDURL() {
    return ADDITIONAL_IMAGE_MALFORMED_URL;
  }
  public void setADDITIONALIMAGEMALFORMEDURL(Integer ADDITIONAL_IMAGE_MALFORMED_URL) {
    this.ADDITIONAL_IMAGE_MALFORMED_URL = ADDITIONAL_IMAGE_MALFORMED_URL;
  }

    
  @JsonProperty("ADDITIONAL_IMAGE_FILE_NOT_FOUND")
  public Integer getADDITIONALIMAGEFILENOTFOUND() {
    return ADDITIONAL_IMAGE_FILE_NOT_FOUND;
  }
  public void setADDITIONALIMAGEFILENOTFOUND(Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND) {
    this.ADDITIONAL_IMAGE_FILE_NOT_FOUND = ADDITIONAL_IMAGE_FILE_NOT_FOUND;
  }

    
  @JsonProperty("ADDITIONAL_IMAGE_INVALID_FILE")
  public Integer getADDITIONALIMAGEINVALIDFILE() {
    return ADDITIONAL_IMAGE_INVALID_FILE;
  }
  public void setADDITIONALIMAGEINVALIDFILE(Integer ADDITIONAL_IMAGE_INVALID_FILE) {
    this.ADDITIONAL_IMAGE_INVALID_FILE = ADDITIONAL_IMAGE_INVALID_FILE;
  }

    
  @JsonProperty("HOTEL_PRICE_HEADER_IS_PRESENT")
  public Integer getHOTELPRICEHEADERISPRESENT() {
    return HOTEL_PRICE_HEADER_IS_PRESENT;
  }
  public void setHOTELPRICEHEADERISPRESENT(Integer HOTEL_PRICE_HEADER_IS_PRESENT) {
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
    return Objects.equals(ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) &&
        Objects.equals(ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) &&
        Objects.equals(ADDITIONAL_IMAGE_MALFORMED_URL, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_MALFORMED_URL) &&
        Objects.equals(ADDITIONAL_IMAGE_FILE_NOT_FOUND, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_FILE_NOT_FOUND) &&
        Objects.equals(ADDITIONAL_IMAGE_INVALID_FILE, catalogsFeedIngestionWarnings.ADDITIONAL_IMAGE_INVALID_FILE) &&
        Objects.equals(HOTEL_PRICE_HEADER_IS_PRESENT, catalogsFeedIngestionWarnings.HOTEL_PRICE_HEADER_IS_PRESENT);
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
