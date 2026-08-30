package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PinMedia;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Summarized pin information
 */
@ApiModel(description = "Summarized pin information")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SummaryPin   {
  @JsonProperty("alt_text")
  private String altText;

  @JsonProperty("description")
  private String description;

  @JsonProperty("id")
  private String id;

  @JsonProperty("link")
  private String link;

  @JsonProperty("media")
  private PinMedia media;

  @JsonProperty("title")
  private String title;

  public SummaryPin altText(String altText) {
    this.altText = altText;
    return this;
  }

  /**
   * Get altText
   * @return altText
   */
  @ApiModelProperty(value = "")
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public SummaryPin description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SummaryPin id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SummaryPin link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
   */
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public SummaryPin media(PinMedia media) {
    this.media = media;
    return this;
  }

  /**
   * Get media
   * @return media
   */
  @ApiModelProperty(readOnly = true, value = "")
  public PinMedia getMedia() {
    return media;
  }

  public void setMedia(PinMedia media) {
    this.media = media;
  }

  public SummaryPin title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @ApiModelProperty(value = "")
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
    SummaryPin summaryPin = (SummaryPin) o;
    return Objects.equals(this.altText, summaryPin.altText) &&
        Objects.equals(this.description, summaryPin.description) &&
        Objects.equals(this.id, summaryPin.id) &&
        Objects.equals(this.link, summaryPin.link) &&
        Objects.equals(this.media, summaryPin.media) &&
        Objects.equals(this.title, summaryPin.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altText, description, id, link, media, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryPin {\n");
    
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
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

