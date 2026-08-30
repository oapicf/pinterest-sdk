package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CarouselSlot implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Carousel Pin slot description.
   */
  @JsonProperty("description")
  private String description;

  /**
   * Carousel Pin slot link.
   */
  @JsonProperty("link")
  private String link;

  /**
   * Carousel Pin slot title.
   */
  @JsonProperty("title")
  private String title;

  /**
   * Carousel Pin slot description.
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Carousel Pin slot link.
   * @return link
   */
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  /**
   * Carousel Pin slot title.
   * @return title
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
