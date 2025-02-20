/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PinUpdateCarouselSlotsInner {
  
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("link")
  private String link = null;

  /**
   * Carousel Pin slot title.
   **/
  @ApiModelProperty(value = "Carousel Pin slot title.")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Carousel Pin slot description.
   **/
  @ApiModelProperty(value = "Carousel Pin slot description.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Carousel Pin slot link.
   **/
  @ApiModelProperty(value = "Carousel Pin slot link.")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner = (PinUpdateCarouselSlotsInner) o;
    return (this.title == null ? pinUpdateCarouselSlotsInner.title == null : this.title.equals(pinUpdateCarouselSlotsInner.title)) &&
        (this.description == null ? pinUpdateCarouselSlotsInner.description == null : this.description.equals(pinUpdateCarouselSlotsInner.description)) &&
        (this.link == null ? pinUpdateCarouselSlotsInner.link == null : this.link.equals(pinUpdateCarouselSlotsInner.link));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.link == null ? 0: this.link.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinUpdateCarouselSlotsInner {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
