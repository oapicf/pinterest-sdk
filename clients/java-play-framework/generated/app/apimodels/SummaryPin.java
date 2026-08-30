package apimodels;

import apimodels.PinMedia;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Summarized pin information
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SummaryPin   {
  @JsonProperty("alt_text")
  @Size(max=500)

  private String altText;

  @JsonProperty("description")
  @Size(max=800)

  private String description;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("link")
  @Size(max=2048)

  private String link;

  @JsonProperty("media")
  @Valid

  private PinMedia media;

  @JsonProperty("title")
  @Size(max=100)

  private String title;

  public SummaryPin altText(String altText) {
    this.altText = altText;
    return this;
  }

   /**
   * Get altText
   * @return altText
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(altText, summaryPin.altText) &&
        Objects.equals(description, summaryPin.description) &&
        Objects.equals(id, summaryPin.id) &&
        Objects.equals(link, summaryPin.link) &&
        Objects.equals(media, summaryPin.media) &&
        Objects.equals(title, summaryPin.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altText, description, id, link, media, title);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

