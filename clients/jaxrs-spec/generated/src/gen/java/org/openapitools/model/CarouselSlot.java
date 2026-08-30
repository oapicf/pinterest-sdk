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
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CarouselSlot")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CarouselSlot   {
  private String description;
  private String link;
  private String title;

  public CarouselSlot() {
  }

  /**
   * Carousel Pin slot description.
   **/
  public CarouselSlot description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Carousel Pin slot description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Carousel Pin slot link.
   **/
  public CarouselSlot link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(value = "Carousel Pin slot link.")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  @JsonProperty("link")
  public void setLink(String link) {
    this.link = link;
  }

  /**
   * Carousel Pin slot title.
   **/
  public CarouselSlot title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "Carousel Pin slot title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
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
