package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base64-encoded image media source
 */
@ApiModel(description="Base64-encoded image media source")

public class BrandAccountProfileImage  {
  
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

  public BrandAccountProfileImage contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public BrandAccountProfileImage data(String data) {
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
    BrandAccountProfileImage brandAccountProfileImage = (BrandAccountProfileImage) o;
    return Objects.equals(this.contentType, brandAccountProfileImage.contentType) &&
        Objects.equals(this.data, brandAccountProfileImage.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAccountProfileImage {\n");
    
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

