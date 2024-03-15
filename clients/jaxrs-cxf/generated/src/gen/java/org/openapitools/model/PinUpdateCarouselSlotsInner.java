package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinUpdateCarouselSlotsInner  {
  
  @ApiModelProperty(value = "Carousel Pin slot title.")
 /**
   * Carousel Pin slot title.
  **/
  private String title;

  @ApiModelProperty(value = "Carousel Pin slot description.")
 /**
   * Carousel Pin slot description.
  **/
  private String description;

  @ApiModelProperty(value = "Carousel Pin slot link.")
 /**
   * Carousel Pin slot link.
  **/
  private String link;
 /**
   * Carousel Pin slot title.
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PinUpdateCarouselSlotsInner title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Carousel Pin slot description.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PinUpdateCarouselSlotsInner description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Carousel Pin slot link.
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PinUpdateCarouselSlotsInner link(String link) {
    this.link = link;
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
    PinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner = (PinUpdateCarouselSlotsInner) o;
    return Objects.equals(this.title, pinUpdateCarouselSlotsInner.title) &&
        Objects.equals(this.description, pinUpdateCarouselSlotsInner.description) &&
        Objects.equals(this.link, pinUpdateCarouselSlotsInner.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinUpdateCarouselSlotsInner {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

