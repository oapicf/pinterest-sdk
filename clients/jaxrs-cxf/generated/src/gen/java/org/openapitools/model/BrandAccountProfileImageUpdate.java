package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base64-encoded image media source
 */
@ApiModel(description="Base64-encoded image media source")

public class BrandAccountProfileImageUpdate  {
  
public enum ContentTypeEnum {

IMAGE_JPEG(String.valueOf("image/jpeg")), IMAGE_PNG(String.valueOf("image/png"));


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

  @ApiModelProperty(value = "")

  private ContentTypeEnum contentType;

  @ApiModelProperty(value = "")

  private String data;
 /**
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("content_type")
  public String getContentType() {
    if (contentType == null) {
      return null;
    }
    return contentType.value();
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public BrandAccountProfileImageUpdate contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
 @Pattern(regexp="[a-zA-Z0-9+/=]+")  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public BrandAccountProfileImageUpdate data(String data) {
    this.data = data;
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
    BrandAccountProfileImageUpdate brandAccountProfileImageUpdate = (BrandAccountProfileImageUpdate) o;
    return Objects.equals(this.contentType, brandAccountProfileImageUpdate.contentType) &&
        Objects.equals(this.data, brandAccountProfileImageUpdate.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAccountProfileImageUpdate {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

