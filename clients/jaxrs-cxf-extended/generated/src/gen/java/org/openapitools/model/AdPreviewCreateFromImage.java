package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdPreviewCreateFromImage  {
  
 /**
  * Image URL.
  */
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", required = true, value = "Image URL.")
  private String imageUrl;

 /**
  * Title displayed below ad.
  */
  @ApiModelProperty(example = "My Preview Image", required = true, value = "Title displayed below ad.")
  private String title;
 /**
  * Image URL.
  * @return imageUrl
  */
  @JsonProperty("image_url")
  @NotNull
  public String getImageUrl() {
    return imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
 public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
  public AdPreviewCreateFromImage imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

 /**
  * Title displayed below ad.
  * @return title
  */
  @JsonProperty("title")
  @NotNull
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public AdPreviewCreateFromImage title(String title) {
    this.title = title;
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
    AdPreviewCreateFromImage adPreviewCreateFromImage = (AdPreviewCreateFromImage) o;
    return Objects.equals(this.imageUrl, adPreviewCreateFromImage.imageUrl) &&
        Objects.equals(this.title, adPreviewCreateFromImage.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPreviewCreateFromImage {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

