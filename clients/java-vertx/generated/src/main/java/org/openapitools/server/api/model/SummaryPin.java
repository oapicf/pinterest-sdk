package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.SummaryPinMedia;

/**
 * Summarized pin information
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SummaryPin   {
  
  private SummaryPinMedia media;
  private String altText;
  private String link;
  private String title;
  private String description;

  public SummaryPin () {

  }

  public SummaryPin (SummaryPinMedia media, String altText, String link, String title, String description) {
    this.media = media;
    this.altText = altText;
    this.link = link;
    this.title = title;
    this.description = description;
  }

    
  @JsonProperty("media")
  public SummaryPinMedia getMedia() {
    return media;
  }
  public void setMedia(SummaryPinMedia media) {
    this.media = media;
  }

    
  @JsonProperty("alt_text")
  public String getAltText() {
    return altText;
  }
  public void setAltText(String altText) {
    this.altText = altText;
  }

    
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryPin summaryPin = (SummaryPin) o;
    return Objects.equals(media, summaryPin.media) &&
        Objects.equals(altText, summaryPin.altText) &&
        Objects.equals(link, summaryPin.link) &&
        Objects.equals(title, summaryPin.title) &&
        Objects.equals(description, summaryPin.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(media, altText, link, title, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryPin {\n");
    
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
