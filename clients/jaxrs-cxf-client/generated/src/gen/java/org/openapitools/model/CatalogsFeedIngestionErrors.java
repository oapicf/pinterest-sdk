package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CatalogsFeedIngestionErrors  {
  
  @ApiModelProperty(value = "")
  private Integer imageDownloadError;

  @ApiModelProperty(value = "")
  private Integer imageDownloadConnectionTimeout;

  @ApiModelProperty(value = "")
  private Integer imageFormatUnrecognize;

  @ApiModelProperty(value = "")
  private Integer lineLevelInternalError;

public enum LargeProductCountDecreaseEnum {

NUMBER_1(Integer.valueOf(1));


    private Integer value;

    LargeProductCountDecreaseEnum (Integer v) {
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

  @ApiModelProperty(value = "")
  private LargeProductCountDecreaseEnum largeProductCountDecrease;
 /**
   * Get imageDownloadError
   * @return imageDownloadError
  **/
  @JsonProperty("image_download_error")
  public Integer getImageDownloadError() {
    return imageDownloadError;
  }

  public void setImageDownloadError(Integer imageDownloadError) {
    this.imageDownloadError = imageDownloadError;
  }

  public CatalogsFeedIngestionErrors imageDownloadError(Integer imageDownloadError) {
    this.imageDownloadError = imageDownloadError;
    return this;
  }

 /**
   * Get imageDownloadConnectionTimeout
   * @return imageDownloadConnectionTimeout
  **/
  @JsonProperty("image_download_connection_timeout")
  public Integer getImageDownloadConnectionTimeout() {
    return imageDownloadConnectionTimeout;
  }

  public void setImageDownloadConnectionTimeout(Integer imageDownloadConnectionTimeout) {
    this.imageDownloadConnectionTimeout = imageDownloadConnectionTimeout;
  }

  public CatalogsFeedIngestionErrors imageDownloadConnectionTimeout(Integer imageDownloadConnectionTimeout) {
    this.imageDownloadConnectionTimeout = imageDownloadConnectionTimeout;
    return this;
  }

 /**
   * Get imageFormatUnrecognize
   * @return imageFormatUnrecognize
  **/
  @JsonProperty("image_format_unrecognize")
  public Integer getImageFormatUnrecognize() {
    return imageFormatUnrecognize;
  }

  public void setImageFormatUnrecognize(Integer imageFormatUnrecognize) {
    this.imageFormatUnrecognize = imageFormatUnrecognize;
  }

  public CatalogsFeedIngestionErrors imageFormatUnrecognize(Integer imageFormatUnrecognize) {
    this.imageFormatUnrecognize = imageFormatUnrecognize;
    return this;
  }

 /**
   * Get lineLevelInternalError
   * @return lineLevelInternalError
  **/
  @JsonProperty("line_level_internal_error")
  public Integer getLineLevelInternalError() {
    return lineLevelInternalError;
  }

  public void setLineLevelInternalError(Integer lineLevelInternalError) {
    this.lineLevelInternalError = lineLevelInternalError;
  }

  public CatalogsFeedIngestionErrors lineLevelInternalError(Integer lineLevelInternalError) {
    this.lineLevelInternalError = lineLevelInternalError;
    return this;
  }

 /**
   * Get largeProductCountDecrease
   * @return largeProductCountDecrease
  **/
  @JsonProperty("large_product_count_decrease")
  public Integer getLargeProductCountDecrease() {
    if (largeProductCountDecrease == null) {
      return null;
    }
    return largeProductCountDecrease.value();
  }

  public void setLargeProductCountDecrease(LargeProductCountDecreaseEnum largeProductCountDecrease) {
    this.largeProductCountDecrease = largeProductCountDecrease;
  }

  public CatalogsFeedIngestionErrors largeProductCountDecrease(LargeProductCountDecreaseEnum largeProductCountDecrease) {
    this.largeProductCountDecrease = largeProductCountDecrease;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

