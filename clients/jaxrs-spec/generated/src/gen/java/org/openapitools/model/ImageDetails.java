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



@JsonTypeName("ImageDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ImageDetails   {
  private Integer width;
  private Integer height;
  private String url;

  /**
   * minimum: 100
   **/
  public ImageDetails width(Integer width) {
    this.width = width;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("width")
  @NotNull  @Min(100)public Integer getWidth() {
    return width;
  }

  @JsonProperty("width")
  public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   * minimum: 100
   **/
  public ImageDetails height(Integer height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("height")
  @NotNull  @Min(100)public Integer getHeight() {
    return height;
  }

  @JsonProperty("height")
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   **/
  public ImageDetails url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("url")
  @NotNull public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageDetails imageDetails = (ImageDetails) o;
    return Objects.equals(this.width, imageDetails.width) &&
        Objects.equals(this.height, imageDetails.height) &&
        Objects.equals(this.url, imageDetails.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDetails {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

