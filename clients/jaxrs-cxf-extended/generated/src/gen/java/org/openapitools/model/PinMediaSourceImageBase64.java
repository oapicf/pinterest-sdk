package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Base64-encoded image media source
 */
@ApiModel(description="Base64-encoded image media source")

public class PinMediaSourceImageBase64  {
  
public enum SourceTypeEnum {

    @JsonProperty("image_base64") IMAGE_BASE64(String.valueOf("image_base64"));

    private String value;

    SourceTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

    @JsonProperty("image/jpeg") JPEG(String.valueOf("image/jpeg")),
    @JsonProperty("image/png") PNG(String.valueOf("image/png"));

    private String value;

    ContentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  */
  @JsonProperty("source_type")
  @NotNull
  public String getSourceType() {
    return sourceType == null ? null : sourceType.value();
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
 public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
  public PinMediaSourceImageBase64 sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
  * Get contentType
  * @return contentType
  */
  @JsonProperty("content_type")
  @NotNull
  public String getContentType() {
    return contentType == null ? null : contentType.value();
  }

  /**
   * Sets the <code>contentType</code> property.
   */
 public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   * Sets the <code>contentType</code> property.
   */
  public PinMediaSourceImageBase64 contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  @NotNull
 @Pattern(regexp="[a-zA-Z0-9+/=]+")  public String getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(String data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
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

