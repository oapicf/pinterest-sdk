package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Image URL-based media source
 **/
@ApiModel(description="Image URL-based media source")
public class PinMediaSourceImageURL  {
  
public enum SourceTypeEnum {

IMAGE_URL(String.valueOf("image_url"));


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

  @ApiModelProperty(required = true, value = "")
  private String url;
 /**
   * Get sourceType
   * @return sourceType
  **/
  @JsonProperty("source_type")
  public String getSourceType() {
    if (sourceType == null) {
      return null;
    }
    return sourceType.value();
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public PinMediaSourceImageURL sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PinMediaSourceImageURL url(String url) {
    this.url = url;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImageURL {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

