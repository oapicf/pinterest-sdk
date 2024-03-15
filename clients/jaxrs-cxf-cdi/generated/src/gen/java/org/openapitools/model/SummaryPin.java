package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SummaryPinMedia;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Summarized pin information
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Summarized pin information")
public class SummaryPin   {
  
  private SummaryPinMedia media;

  private String altText;

  private String link;

  private String title;

  private String description;

  /**
   **/
  public SummaryPin media(SummaryPinMedia media) {
    this.media = media;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media")
  public SummaryPinMedia getMedia() {
    return media;
  }
  public void setMedia(SummaryPinMedia media) {
    this.media = media;
  }


  /**
   **/
  public SummaryPin altText(String altText) {
    this.altText = altText;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("alt_text")
 @Size(max=500)  public String getAltText() {
    return altText;
  }
  public void setAltText(String altText) {
    this.altText = altText;
  }


  /**
   **/
  public SummaryPin link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.pinterest.com/", value = "")
  @JsonProperty("link")
 @Size(max=2048)  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }


  /**
   **/
  public SummaryPin title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   **/
  public SummaryPin description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

