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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class CatalogsFeedIngestionErrors   {
  
  private @Valid Integer imageDownloadError;
  private @Valid Integer imageDownloadConnectionTimeout;
  private @Valid Integer imageFormatUnrecognize;
  private @Valid Integer lineLevelInternalError;

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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static LargeProductCountDecreaseEnum fromValue(Integer value) {
        for (LargeProductCountDecreaseEnum b : LargeProductCountDecreaseEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid LargeProductCountDecreaseEnum largeProductCountDecrease;

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

  @JsonProperty("image_download_error")
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

  @JsonProperty("image_download_connection_timeout")
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

  @JsonProperty("image_format_unrecognize")
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

  @JsonProperty("line_level_internal_error")
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

  @JsonProperty("large_product_count_decrease")
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
    return Objects.equals(this.imageDownloadError, catalogsFeedIngestionErrors.imageDownloadError) &&
        Objects.equals(this.imageDownloadConnectionTimeout, catalogsFeedIngestionErrors.imageDownloadConnectionTimeout) &&
        Objects.equals(this.imageFormatUnrecognize, catalogsFeedIngestionErrors.imageFormatUnrecognize) &&
        Objects.equals(this.lineLevelInternalError, catalogsFeedIngestionErrors.lineLevelInternalError) &&
        Objects.equals(this.largeProductCountDecrease, catalogsFeedIngestionErrors.largeProductCountDecrease);
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

