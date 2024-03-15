package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SummaryPinMedia;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Summarized pin information
 **/
@ApiModel(description="Summarized pin information")

public class SummaryPin  {
  
  @ApiModelProperty(value = "")
  @Valid
  private SummaryPinMedia media;

  @ApiModelProperty(value = "")
  private String altText;

  @ApiModelProperty(example = "https://www.pinterest.com/", value = "")
  private String link;

  @ApiModelProperty(value = "")
  private String title;

  @ApiModelProperty(value = "")
  private String description;
 /**
   * Get media
   * @return media
  **/
  @JsonProperty("media")
  public SummaryPinMedia getMedia() {
    return media;
  }

  public void setMedia(SummaryPinMedia media) {
    this.media = media;
  }

  public SummaryPin media(SummaryPinMedia media) {
    this.media = media;
    return this;
  }

 /**
   * Get altText
   * @return altText
  **/
  @JsonProperty("alt_text")
 @Size(max=500)  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public SummaryPin altText(String altText) {
    this.altText = altText;
    return this;
  }

 /**
   * Get link
   * @return link
  **/
  @JsonProperty("link")
 @Size(max=2048)  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public SummaryPin link(String link) {
    this.link = link;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SummaryPin title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SummaryPin description(String description) {
    this.description = description;
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
    SummaryPin summaryPin = (SummaryPin) o;
    return Objects.equals(this.media, summaryPin.media) &&
        Objects.equals(this.altText, summaryPin.altText) &&
        Objects.equals(this.link, summaryPin.link) &&
        Objects.equals(this.title, summaryPin.title) &&
        Objects.equals(this.description, summaryPin.description);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

