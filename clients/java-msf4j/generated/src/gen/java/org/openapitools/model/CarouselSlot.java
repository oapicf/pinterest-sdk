package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CarouselSlot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CarouselSlot   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("link")
  private String link;

  @JsonProperty("title")
  private String title;

  public CarouselSlot description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Carousel Pin slot description.
   * @return description
  **/
  @ApiModelProperty(value = "Carousel Pin slot description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CarouselSlot link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Carousel Pin slot link.
   * @return link
  **/
  @ApiModelProperty(value = "Carousel Pin slot link.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public CarouselSlot title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Carousel Pin slot title.
   * @return title
  **/
  @ApiModelProperty(value = "Carousel Pin slot title.")
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

