package apimodels;

import apimodels.AiDisclosures;
import apimodels.PinMediaSource;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinCreate   {
  @JsonProperty("ai_disclosures")
  @Valid

  private AiDisclosures aiDisclosures;

  @JsonProperty("alt_text")
  @Size(max=500)

  private String altText;

  @JsonProperty("board_id")
  @Pattern(regexp="^\\d+$")

  private String boardId;

  @JsonProperty("board_section_id")
  @Pattern(regexp="^\\d+$")

  private String boardSectionId;

  @JsonProperty("description")
  @Size(max=800)

  private String description;

  @JsonProperty("dominant_color")
  
  private String dominantColor;

  @JsonProperty("link")
  @Size(max=2048)

  private String link;

  @JsonProperty("media_source")
  @Valid

  private PinMediaSource mediaSource;

  @JsonProperty("parent_pin_id")
  @Pattern(regexp="^\\d+$")

  private String parentPinId;

  @JsonProperty("sponsor_id")
  @Pattern(regexp="^\\d+$")

  private String sponsorId;

  @JsonProperty("title")
  @Size(max=100)

  private String title;

  public PinCreate aiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

   /**
   * AI disclosure declarations the creator has made about this Pin.
   * @return aiDisclosures
  **/
  public AiDisclosures getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  public PinCreate altText(String altText) {
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

  public PinCreate boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

   /**
   * The board to which this Pin belongs.
   * @return boardId
  **/
  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  public PinCreate boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

   /**
   * The board section to which this Pin belongs.
   * @return boardSectionId
  **/
  public String getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  public PinCreate description(String description) {
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

  public PinCreate dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

   /**
   * Dominant pin color. Hex number, e.g. `#6E7874`.
   * @return dominantColor
  **/
  public String getDominantColor() {
    return dominantColor;
  }

  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

  public PinCreate link(String link) {
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

  public PinCreate mediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

   /**
   * Get mediaSource
   * @return mediaSource
  **/
  public PinMediaSource getMediaSource() {
    return mediaSource;
  }

  public void setMediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
  }

  public PinCreate parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

   /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   * @return parentPinId
  **/
  public String getParentPinId() {
    return parentPinId;
  }

  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

  public PinCreate sponsorId(String sponsorId) {
    this.sponsorId = sponsorId;
    return this;
  }

   /**
   * The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
   * @return sponsorId
  **/
  public String getSponsorId() {
    return sponsorId;
  }

  public void setSponsorId(String sponsorId) {
    this.sponsorId = sponsorId;
  }

  public PinCreate title(String title) {
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
    PinCreate pinCreate = (PinCreate) o;
    return Objects.equals(aiDisclosures, pinCreate.aiDisclosures) &&
        Objects.equals(altText, pinCreate.altText) &&
        Objects.equals(boardId, pinCreate.boardId) &&
        Objects.equals(boardSectionId, pinCreate.boardSectionId) &&
        Objects.equals(description, pinCreate.description) &&
        Objects.equals(dominantColor, pinCreate.dominantColor) &&
        Objects.equals(link, pinCreate.link) &&
        Objects.equals(mediaSource, pinCreate.mediaSource) &&
        Objects.equals(parentPinId, pinCreate.parentPinId) &&
        Objects.equals(sponsorId, pinCreate.sponsorId) &&
        Objects.equals(title, pinCreate.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiDisclosures, altText, boardId, boardSectionId, description, dominantColor, link, mediaSource, parentPinId, sponsorId, title);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinCreate {\n");
    
    sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dominantColor: ").append(toIndentedString(dominantColor)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
    sb.append("    parentPinId: ").append(toIndentedString(parentPinId)).append("\n");
    sb.append("    sponsorId: ").append(toIndentedString(sponsorId)).append("\n");
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

