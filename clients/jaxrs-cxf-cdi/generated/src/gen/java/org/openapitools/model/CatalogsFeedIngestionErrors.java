package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;



public class CatalogsFeedIngestionErrors   {
  
  private Integer imageDownloadError;

  private Integer imageDownloadConnectionTimeout;

  private Integer imageFormatUnrecognize;

  private Integer lineLevelInternalError;


public enum LargeProductCountDecreaseEnum {

    NUMBER_1(Integer.valueOf(1));


    private Integer value;

    LargeProductCountDecreaseEnum(Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LargeProductCountDecreaseEnum fromValue(Integer value) {
        for (LargeProductCountDecreaseEnum b : LargeProductCountDecreaseEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private LargeProductCountDecreaseEnum largeProductCountDecrease;


  /**
   **/
  public CatalogsFeedIngestionErrors imageDownloadError(Integer imageDownloadError) {
    this.imageDownloadError = imageDownloadError;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("image_download_error")
  public Integer getImageDownloadError() {
    return imageDownloadError;
  }
  public void setImageDownloadError(Integer imageDownloadError) {
    this.imageDownloadError = imageDownloadError;
  }


  /**
   **/
  public CatalogsFeedIngestionErrors imageDownloadConnectionTimeout(Integer imageDownloadConnectionTimeout) {
    this.imageDownloadConnectionTimeout = imageDownloadConnectionTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("image_download_connection_timeout")
  public Integer getImageDownloadConnectionTimeout() {
    return imageDownloadConnectionTimeout;
  }
  public void setImageDownloadConnectionTimeout(Integer imageDownloadConnectionTimeout) {
    this.imageDownloadConnectionTimeout = imageDownloadConnectionTimeout;
  }


  /**
   **/
  public CatalogsFeedIngestionErrors imageFormatUnrecognize(Integer imageFormatUnrecognize) {
    this.imageFormatUnrecognize = imageFormatUnrecognize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("image_format_unrecognize")
  public Integer getImageFormatUnrecognize() {
    return imageFormatUnrecognize;
  }
  public void setImageFormatUnrecognize(Integer imageFormatUnrecognize) {
    this.imageFormatUnrecognize = imageFormatUnrecognize;
  }


  /**
   **/
  public CatalogsFeedIngestionErrors lineLevelInternalError(Integer lineLevelInternalError) {
    this.lineLevelInternalError = lineLevelInternalError;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("line_level_internal_error")
  public Integer getLineLevelInternalError() {
    return lineLevelInternalError;
  }
  public void setLineLevelInternalError(Integer lineLevelInternalError) {
    this.lineLevelInternalError = lineLevelInternalError;
  }


  /**
   **/
  public CatalogsFeedIngestionErrors largeProductCountDecrease(LargeProductCountDecreaseEnum largeProductCountDecrease) {
    this.largeProductCountDecrease = largeProductCountDecrease;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("large_product_count_decrease")
  public LargeProductCountDecreaseEnum getLargeProductCountDecrease() {
    return largeProductCountDecrease;
  }
  public void setLargeProductCountDecrease(LargeProductCountDecreaseEnum largeProductCountDecrease) {
    this.largeProductCountDecrease = largeProductCountDecrease;
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
    return Objects.equals(imageDownloadError, catalogsFeedIngestionErrors.imageDownloadError) &&
        Objects.equals(imageDownloadConnectionTimeout, catalogsFeedIngestionErrors.imageDownloadConnectionTimeout) &&
        Objects.equals(imageFormatUnrecognize, catalogsFeedIngestionErrors.imageFormatUnrecognize) &&
        Objects.equals(lineLevelInternalError, catalogsFeedIngestionErrors.lineLevelInternalError) &&
        Objects.equals(largeProductCountDecrease, catalogsFeedIngestionErrors.largeProductCountDecrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageDownloadError, imageDownloadConnectionTimeout, imageFormatUnrecognize, lineLevelInternalError, largeProductCountDecrease);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionErrors {\n");
    
    sb.append("    imageDownloadError: ").append(toIndentedString(imageDownloadError)).append("\n");
    sb.append("    imageDownloadConnectionTimeout: ").append(toIndentedString(imageDownloadConnectionTimeout)).append("\n");
    sb.append("    imageFormatUnrecognize: ").append(toIndentedString(imageFormatUnrecognize)).append("\n");
    sb.append("    lineLevelInternalError: ").append(toIndentedString(lineLevelInternalError)).append("\n");
    sb.append("    largeProductCountDecrease: ").append(toIndentedString(largeProductCountDecrease)).append("\n");
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

