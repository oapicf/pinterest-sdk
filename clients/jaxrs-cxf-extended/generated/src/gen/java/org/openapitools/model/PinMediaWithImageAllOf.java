package org.openapitools.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.ImageDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinMediaWithImageAllOf  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Map<String, ImageDetails> images = null;
 /**
  * Get images
  * @return images
  */
  @JsonProperty("images")
  public Map<String, ImageDetails> getImages() {
    return images;
  }

  /**
   * Sets the <code>images</code> property.
   */
 public void setImages(Map<String, ImageDetails> images) {
    this.images = images;
  }

  /**
   * Sets the <code>images</code> property.
   */
  public PinMediaWithImageAllOf images(Map<String, ImageDetails> images) {
    this.images = images;
    return this;
  }

  /**
   * Puts a new item into the <code>images</code> map.
   */
  public PinMediaWithImageAllOf putImagesItem(String key, ImageDetails imagesItem) {
    this.images.put(key, imagesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImageAllOf {\n");
    
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

