package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinUpdateCarouselSlotsInner   {
  
  private String title;
  private String description;
  private String link;

  public PinUpdateCarouselSlotsInner () {

  }

  public PinUpdateCarouselSlotsInner (String title, String description, String link) {
    this.title = title;
    this.description = description;
    this.link = link;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("link")
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
    return Objects.equals(title, pinUpdateCarouselSlotsInner.title) &&
        Objects.equals(description, pinUpdateCarouselSlotsInner.description) &&
        Objects.equals(link, pinUpdateCarouselSlotsInner.link);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
