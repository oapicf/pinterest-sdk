package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CarouselSlot  {
  
 /**
  * Carousel Pin slot description.
  */
  @ApiModelProperty(value = "Carousel Pin slot description.")

  private String description;

 /**
  * Carousel Pin slot link.
  */
  @ApiModelProperty(value = "Carousel Pin slot link.")

  private String link;

 /**
  * Carousel Pin slot title.
  */
  @ApiModelProperty(value = "Carousel Pin slot title.")

  private String title;
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

  public CarouselSlot description(String description) {
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

  public CarouselSlot link(String link) {
    this.link = link;
    return this;
  }

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

  public CarouselSlot title(String title) {
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
    CarouselSlot carouselSlot = (CarouselSlot) o;
    return Objects.equals(this.description, carouselSlot.description) &&
        Objects.equals(this.link, carouselSlot.link) &&
        Objects.equals(this.title, carouselSlot.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, link, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarouselSlot {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

