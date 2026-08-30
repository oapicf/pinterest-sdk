package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosures;
import org.openapitools.model.PinMediaSource;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("PinCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinCreate   {
  private AiDisclosures aiDisclosures;
  private String altText;
  private String boardId;
  private String boardSectionId;
  private String description;
  private String dominantColor;
  private String link;
  private PinMediaSource mediaSource;
  private String parentPinId;
  private String sponsorId;
  private String title;

  public PinCreate() {
  }

  /**
   * AI disclosure declarations the creator has made about this Pin.
   **/
  public PinCreate aiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

  
  @ApiModelProperty(value = "AI disclosure declarations the creator has made about this Pin.")
  @JsonProperty("ai_disclosures")
  @Valid public AiDisclosures getAiDisclosures() {
    return aiDisclosures;
  }

  @JsonProperty("ai_disclosures")
  public void setAiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  /**
   **/
  public PinCreate altText(String altText) {
    this.altText = altText;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("alt_text")
   @Size(max=500)public String getAltText() {
    return altText;
  }

  @JsonProperty("alt_text")
  public void setAltText(String altText) {
    this.altText = altText;
  }

  /**
   * The board to which this Pin belongs.
   **/
  public PinCreate boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

  
  @ApiModelProperty(value = "The board to which this Pin belongs.")
  @JsonProperty("board_id")
   @Pattern(regexp="^\\d+$")public String getBoardId() {
    return boardId;
  }

  @JsonProperty("board_id")
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * The board section to which this Pin belongs.
   **/
  public PinCreate boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

  
  @ApiModelProperty(value = "The board section to which this Pin belongs.")
  @JsonProperty("board_section_id")
   @Pattern(regexp="^\\d+$")public String getBoardSectionId() {
    return boardSectionId;
  }

  @JsonProperty("board_section_id")
  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  /**
   **/
  public PinCreate description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
   @Size(max=800)public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.
   **/
  public PinCreate dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

  
  @ApiModelProperty(value = "Dominant pin color. Hex number, e.g. `#6E7874`.")
  @JsonProperty("dominant_color")
  public String getDominantColor() {
    return dominantColor;
  }

  @JsonProperty("dominant_color")
  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

  /**
   **/
  public PinCreate link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("link")
   @Size(max=2048)public String getLink() {
    return link;
  }

  @JsonProperty("link")
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  public PinCreate mediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media_source")
  @Valid public PinMediaSource getMediaSource() {
    return mediaSource;
  }

  @JsonProperty("media_source")
  public void setMediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
  }

  /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   **/
  public PinCreate parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

  
  @ApiModelProperty(value = "The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).")
  @JsonProperty("parent_pin_id")
   @Pattern(regexp="^\\d+$")public String getParentPinId() {
    return parentPinId;
  }

  @JsonProperty("parent_pin_id")
  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

  /**
   * The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
   **/
  public PinCreate sponsorId(String sponsorId) {
    this.sponsorId = sponsorId;
    return this;
  }

  
  @ApiModelProperty(value = "The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.")
  @JsonProperty("sponsor_id")
   @Pattern(regexp="^\\d+$")public String getSponsorId() {
    return sponsorId;
  }

  @JsonProperty("sponsor_id")
  public void setSponsorId(String sponsorId) {
    this.sponsorId = sponsorId;
  }

  /**
   **/
  public PinCreate title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
   @Size(max=100)public String getTitle() {
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
    PinCreate pinCreate = (PinCreate) o;
    return Objects.equals(this.aiDisclosures, pinCreate.aiDisclosures) &&
        Objects.equals(this.altText, pinCreate.altText) &&
        Objects.equals(this.boardId, pinCreate.boardId) &&
        Objects.equals(this.boardSectionId, pinCreate.boardSectionId) &&
        Objects.equals(this.description, pinCreate.description) &&
        Objects.equals(this.dominantColor, pinCreate.dominantColor) &&
        Objects.equals(this.link, pinCreate.link) &&
        Objects.equals(this.mediaSource, pinCreate.mediaSource) &&
        Objects.equals(this.parentPinId, pinCreate.parentPinId) &&
        Objects.equals(this.sponsorId, pinCreate.sponsorId) &&
        Objects.equals(this.title, pinCreate.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiDisclosures, altText, boardId, boardSectionId, description, dominantColor, link, mediaSource, parentPinId, sponsorId, title);
  }

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
