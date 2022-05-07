package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Base64-encoded image media source
 **/
@ApiModel(description="Base64-encoded image media source")
public class PinMediaSourceImageBase64  {
  
public enum SourceTypeEnum {

IMAGE_BASE64(String.valueOf("image_base64"));


    private String value;

    SourceTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static SourceTypeEnum fromValue(String value) {
        for (SourceTypeEnum b : SourceTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private SourceTypeEnum sourceType;

public enum ContentTypeEnum {

JPEG(String.valueOf("image/jpeg")), PNG(String.valueOf("image/png"));


    private String value;

    ContentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ContentTypeEnum fromValue(String value) {
        for (ContentTypeEnum b : ContentTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private ContentTypeEnum contentType;

  @ApiModelProperty(required = true, value = "")
  private String data;
 /**
   * Get sourceType
   * @return sourceType
  **/
  @JsonProperty("source_type")
  @NotNull
  public String getSourceType() {
    if (sourceType == null) {
      return null;
    }
    return sourceType.value();
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public PinMediaSourceImageBase64 sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("content_type")
  @NotNull
  public String getContentType() {
    if (contentType == null) {
      return null;
    }
    return contentType.value();
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public PinMediaSourceImageBase64 contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  @NotNull
 @Pattern(regexp="[a-zA-Z0-9+/=]+")  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public PinMediaSourceImageBase64 data(String data) {
    this.data = data;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImageBase64 {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

