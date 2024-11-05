/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ImageDetails;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ImageMetadataImages   {
  
  private ImageDetails _150x150;
  private ImageDetails _400x300;
  private ImageDetails _600x;
  private ImageDetails _1200x;

  /**
   */
  public ImageMetadataImages _150x150(ImageDetails _150x150) {
    this._150x150 = _150x150;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("150x150")
  public ImageDetails get150x150() {
    return _150x150;
  }
  public void set150x150(ImageDetails _150x150) {
    this._150x150 = _150x150;
  }

  /**
   */
  public ImageMetadataImages _400x300(ImageDetails _400x300) {
    this._400x300 = _400x300;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("400x300")
  public ImageDetails get400x300() {
    return _400x300;
  }
  public void set400x300(ImageDetails _400x300) {
    this._400x300 = _400x300;
  }

  /**
   */
  public ImageMetadataImages _600x(ImageDetails _600x) {
    this._600x = _600x;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("600x")
  public ImageDetails get600x() {
    return _600x;
  }
  public void set600x(ImageDetails _600x) {
    this._600x = _600x;
  }

  /**
   */
  public ImageMetadataImages _1200x(ImageDetails _1200x) {
    this._1200x = _1200x;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("1200x")
  public ImageDetails get1200x() {
    return _1200x;
  }
  public void set1200x(ImageDetails _1200x) {
    this._1200x = _1200x;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageMetadataImages imageMetadataImages = (ImageMetadataImages) o;
    return Objects.equals(_150x150, imageMetadataImages._150x150) &&
        Objects.equals(_400x300, imageMetadataImages._400x300) &&
        Objects.equals(_600x, imageMetadataImages._600x) &&
        Objects.equals(_1200x, imageMetadataImages._1200x);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_150x150, _400x300, _600x, _1200x);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageMetadataImages {\n");
    
    sb.append("    _150x150: ").append(toIndentedString(_150x150)).append("\n");
    sb.append("    _400x300: ").append(toIndentedString(_400x300)).append("\n");
    sb.append("    _600x: ").append(toIndentedString(_600x)).append("\n");
    sb.append("    _1200x: ").append(toIndentedString(_1200x)).append("\n");
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

