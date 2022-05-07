package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedIngestionErrors   {
  
  private Integer imageDownloadError;
  private Integer imageDownloadConnectionTimeout;
  private Integer imageFormatUnrecognize;
  private Integer lineLevelInternalError;


  public enum LargeProductCountDecreaseEnum {
    NUMBER_1(1);

    private String value;

    LargeProductCountDecreaseEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private LargeProductCountDecreaseEnum largeProductCountDecrease;

  public CatalogsFeedIngestionErrors () {

  }

  public CatalogsFeedIngestionErrors (Integer imageDownloadError, Integer imageDownloadConnectionTimeout, Integer imageFormatUnrecognize, Integer lineLevelInternalError, LargeProductCountDecreaseEnum largeProductCountDecrease) {
    this.imageDownloadError = imageDownloadError;
    this.imageDownloadConnectionTimeout = imageDownloadConnectionTimeout;
    this.imageFormatUnrecognize = imageFormatUnrecognize;
    this.lineLevelInternalError = lineLevelInternalError;
    this.largeProductCountDecrease = largeProductCountDecrease;
  }

    
  @JsonProperty("image_download_error")
  public Integer getImageDownloadError() {
    return imageDownloadError;
  }
  public void setImageDownloadError(Integer imageDownloadError) {
    this.imageDownloadError = imageDownloadError;
  }

    
  @JsonProperty("image_download_connection_timeout")
  public Integer getImageDownloadConnectionTimeout() {
    return imageDownloadConnectionTimeout;
  }
  public void setImageDownloadConnectionTimeout(Integer imageDownloadConnectionTimeout) {
    this.imageDownloadConnectionTimeout = imageDownloadConnectionTimeout;
  }

    
  @JsonProperty("image_format_unrecognize")
  public Integer getImageFormatUnrecognize() {
    return imageFormatUnrecognize;
  }
  public void setImageFormatUnrecognize(Integer imageFormatUnrecognize) {
    this.imageFormatUnrecognize = imageFormatUnrecognize;
  }

    
  @JsonProperty("line_level_internal_error")
  public Integer getLineLevelInternalError() {
    return lineLevelInternalError;
  }
  public void setLineLevelInternalError(Integer lineLevelInternalError) {
    this.lineLevelInternalError = lineLevelInternalError;
  }

    
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
