package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CatalogsFeedIngestionErrors")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsFeedIngestionErrors   {
  private @Valid Integer LINE_LEVEL_INTERNAL_ERROR;
  public enum LARGEPRODUCTCOUNTDECREASEEnum {

    NUMBER_1(Integer.valueOf(1));


    private Integer value;

    LARGEPRODUCTCOUNTDECREASEEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into Integer, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static LARGEPRODUCTCOUNTDECREASEEnum fromString(String s) {
        for (LARGEPRODUCTCOUNTDECREASEEnum b : LARGEPRODUCTCOUNTDECREASEEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static LARGEPRODUCTCOUNTDECREASEEnum fromValue(Integer value) {
        for (LARGEPRODUCTCOUNTDECREASEEnum b : LARGEPRODUCTCOUNTDECREASEEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid LARGEPRODUCTCOUNTDECREASEEnum LARGE_PRODUCT_COUNT_DECREASE;
  private @Valid Integer ACCOUNT_FLAGGED;
  private @Valid Integer IMAGE_LEVEL_INTERNAL_ERROR;
  private @Valid Integer IMAGE_FILE_NOT_ACCESSIBLE;
  private @Valid Integer IMAGE_MALFORMED_URL;
  private @Valid Integer IMAGE_FILE_NOT_FOUND;
  private @Valid Integer IMAGE_INVALID_FILE;

  /**
   * We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
   **/
  public CatalogsFeedIngestionErrors LINE_LEVEL_INTERNAL_ERROR(Integer LINE_LEVEL_INTERNAL_ERROR) {
    this.LINE_LEVEL_INTERNAL_ERROR = LINE_LEVEL_INTERNAL_ERROR;
    return this;
  }

  
  @ApiModelProperty(value = "We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.")
  @JsonProperty("LINE_LEVEL_INTERNAL_ERROR")
  public Integer getLINELEVELINTERNALERROR() {
    return LINE_LEVEL_INTERNAL_ERROR;
  }

  @JsonProperty("LINE_LEVEL_INTERNAL_ERROR")
  public void setLINELEVELINTERNALERROR(Integer LINE_LEVEL_INTERNAL_ERROR) {
    this.LINE_LEVEL_INTERNAL_ERROR = LINE_LEVEL_INTERNAL_ERROR;
  }

  /**
   * The product count has decreased by more than 99% compared to the last successful ingestion.
   **/
  public CatalogsFeedIngestionErrors LARGE_PRODUCT_COUNT_DECREASE(LARGEPRODUCTCOUNTDECREASEEnum LARGE_PRODUCT_COUNT_DECREASE) {
    this.LARGE_PRODUCT_COUNT_DECREASE = LARGE_PRODUCT_COUNT_DECREASE;
    return this;
  }

  
  @ApiModelProperty(value = "The product count has decreased by more than 99% compared to the last successful ingestion.")
  @JsonProperty("LARGE_PRODUCT_COUNT_DECREASE")
  public LARGEPRODUCTCOUNTDECREASEEnum getLARGEPRODUCTCOUNTDECREASE() {
    return LARGE_PRODUCT_COUNT_DECREASE;
  }

  @JsonProperty("LARGE_PRODUCT_COUNT_DECREASE")
  public void setLARGEPRODUCTCOUNTDECREASE(LARGEPRODUCTCOUNTDECREASEEnum LARGE_PRODUCT_COUNT_DECREASE) {
    this.LARGE_PRODUCT_COUNT_DECREASE = LARGE_PRODUCT_COUNT_DECREASE;
  }

  /**
   * We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
   **/
  public CatalogsFeedIngestionErrors ACCOUNT_FLAGGED(Integer ACCOUNT_FLAGGED) {
    this.ACCOUNT_FLAGGED = ACCOUNT_FLAGGED;
    return this;
  }

  
  @ApiModelProperty(value = "We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.")
  @JsonProperty("ACCOUNT_FLAGGED")
  public Integer getACCOUNTFLAGGED() {
    return ACCOUNT_FLAGGED;
  }

  @JsonProperty("ACCOUNT_FLAGGED")
  public void setACCOUNTFLAGGED(Integer ACCOUNT_FLAGGED) {
    this.ACCOUNT_FLAGGED = ACCOUNT_FLAGGED;
  }

  /**
   * We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
   **/
  public CatalogsFeedIngestionErrors IMAGE_LEVEL_INTERNAL_ERROR(Integer IMAGE_LEVEL_INTERNAL_ERROR) {
    this.IMAGE_LEVEL_INTERNAL_ERROR = IMAGE_LEVEL_INTERNAL_ERROR;
    return this;
  }

  
  @ApiModelProperty(value = "We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.")
  @JsonProperty("IMAGE_LEVEL_INTERNAL_ERROR")
  public Integer getIMAGELEVELINTERNALERROR() {
    return IMAGE_LEVEL_INTERNAL_ERROR;
  }

  @JsonProperty("IMAGE_LEVEL_INTERNAL_ERROR")
  public void setIMAGELEVELINTERNALERROR(Integer IMAGE_LEVEL_INTERNAL_ERROR) {
    this.IMAGE_LEVEL_INTERNAL_ERROR = IMAGE_LEVEL_INTERNAL_ERROR;
  }

  /**
   * Image files are unreadable. Please upload new files to continue.
   **/
  public CatalogsFeedIngestionErrors IMAGE_FILE_NOT_ACCESSIBLE(Integer IMAGE_FILE_NOT_ACCESSIBLE) {
    this.IMAGE_FILE_NOT_ACCESSIBLE = IMAGE_FILE_NOT_ACCESSIBLE;
    return this;
  }

  
  @ApiModelProperty(value = "Image files are unreadable. Please upload new files to continue.")
  @JsonProperty("IMAGE_FILE_NOT_ACCESSIBLE")
  public Integer getIMAGEFILENOTACCESSIBLE() {
    return IMAGE_FILE_NOT_ACCESSIBLE;
  }

  @JsonProperty("IMAGE_FILE_NOT_ACCESSIBLE")
  public void setIMAGEFILENOTACCESSIBLE(Integer IMAGE_FILE_NOT_ACCESSIBLE) {
    this.IMAGE_FILE_NOT_ACCESSIBLE = IMAGE_FILE_NOT_ACCESSIBLE;
  }

  /**
   * Image files are unreadable. Please check your link and upload new files to continue.
   **/
  public CatalogsFeedIngestionErrors IMAGE_MALFORMED_URL(Integer IMAGE_MALFORMED_URL) {
    this.IMAGE_MALFORMED_URL = IMAGE_MALFORMED_URL;
    return this;
  }

  
  @ApiModelProperty(value = "Image files are unreadable. Please check your link and upload new files to continue.")
  @JsonProperty("IMAGE_MALFORMED_URL")
  public Integer getIMAGEMALFORMEDURL() {
    return IMAGE_MALFORMED_URL;
  }

  @JsonProperty("IMAGE_MALFORMED_URL")
  public void setIMAGEMALFORMEDURL(Integer IMAGE_MALFORMED_URL) {
    this.IMAGE_MALFORMED_URL = IMAGE_MALFORMED_URL;
  }

  /**
   * Image files are unreadable. Please upload new files to continue.
   **/
  public CatalogsFeedIngestionErrors IMAGE_FILE_NOT_FOUND(Integer IMAGE_FILE_NOT_FOUND) {
    this.IMAGE_FILE_NOT_FOUND = IMAGE_FILE_NOT_FOUND;
    return this;
  }

  
  @ApiModelProperty(value = "Image files are unreadable. Please upload new files to continue.")
  @JsonProperty("IMAGE_FILE_NOT_FOUND")
  public Integer getIMAGEFILENOTFOUND() {
    return IMAGE_FILE_NOT_FOUND;
  }

  @JsonProperty("IMAGE_FILE_NOT_FOUND")
  public void setIMAGEFILENOTFOUND(Integer IMAGE_FILE_NOT_FOUND) {
    this.IMAGE_FILE_NOT_FOUND = IMAGE_FILE_NOT_FOUND;
  }

  /**
   * Image files are unreadable. Please upload new files to continue.
   **/
  public CatalogsFeedIngestionErrors IMAGE_INVALID_FILE(Integer IMAGE_INVALID_FILE) {
    this.IMAGE_INVALID_FILE = IMAGE_INVALID_FILE;
    return this;
  }

  
  @ApiModelProperty(value = "Image files are unreadable. Please upload new files to continue.")
  @JsonProperty("IMAGE_INVALID_FILE")
  public Integer getIMAGEINVALIDFILE() {
    return IMAGE_INVALID_FILE;
  }

  @JsonProperty("IMAGE_INVALID_FILE")
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
    return Objects.equals(this.LINE_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionErrors.LINE_LEVEL_INTERNAL_ERROR) &&
        Objects.equals(this.LARGE_PRODUCT_COUNT_DECREASE, catalogsFeedIngestionErrors.LARGE_PRODUCT_COUNT_DECREASE) &&
        Objects.equals(this.ACCOUNT_FLAGGED, catalogsFeedIngestionErrors.ACCOUNT_FLAGGED) &&
        Objects.equals(this.IMAGE_LEVEL_INTERNAL_ERROR, catalogsFeedIngestionErrors.IMAGE_LEVEL_INTERNAL_ERROR) &&
        Objects.equals(this.IMAGE_FILE_NOT_ACCESSIBLE, catalogsFeedIngestionErrors.IMAGE_FILE_NOT_ACCESSIBLE) &&
        Objects.equals(this.IMAGE_MALFORMED_URL, catalogsFeedIngestionErrors.IMAGE_MALFORMED_URL) &&
        Objects.equals(this.IMAGE_FILE_NOT_FOUND, catalogsFeedIngestionErrors.IMAGE_FILE_NOT_FOUND) &&
        Objects.equals(this.IMAGE_INVALID_FILE, catalogsFeedIngestionErrors.IMAGE_INVALID_FILE);
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

