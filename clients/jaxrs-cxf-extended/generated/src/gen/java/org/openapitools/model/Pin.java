package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinMediaSource;
import org.openapitools.model.SummaryPinMedia;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Pin
 */
@ApiModel(description="Pin")

public class Pin  {
  
  @ApiModelProperty(example = "813744226420795884", value = "")
  private String id;

  @ApiModelProperty(example = "2020-01-01T20:10:40Z", value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdAt;

  @ApiModelProperty(example = "https://www.pinterest.com/", value = "")
  private String link;

  @ApiModelProperty(value = "")
  private String title;

  @ApiModelProperty(value = "")
  private String description;

 /**
  * Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
  */
  @ApiModelProperty(example = "#6E7874", value = "Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".")
  private String dominantColor;

  @ApiModelProperty(value = "")
  private String altText;

  @ApiModelProperty(value = "")
  @Valid
  private CreativeType creativeType;

 /**
  * The board to which this Pin belongs.
  */
  @ApiModelProperty(value = "The board to which this Pin belongs.")
  private String boardId;

 /**
  * The board section to which this Pin belongs.
  */
  @ApiModelProperty(value = "The board section to which this Pin belongs.")
  private String boardSectionId;

  @ApiModelProperty(value = "")
  @Valid
  private BoardOwner boardOwner;

 /**
  * Whether the \"operation user_account\" is the Pin owner.
  */
  @ApiModelProperty(value = "Whether the \"operation user_account\" is the Pin owner.")
  private Boolean isOwner;

  @ApiModelProperty(value = "")
  @Valid
  private SummaryPinMedia media;

  @ApiModelProperty(value = "")
  @Valid
  private PinMediaSource mediaSource;

 /**
  * The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
  */
  @ApiModelProperty(value = "The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.")
  private String parentPinId;

 /**
  * Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information.
  */
  @ApiModelProperty(value = "Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information.")
  private Boolean isStandard;

 /**
  * Whether the Pin has been promoted or not.
  */
  @ApiModelProperty(value = "Whether the Pin has been promoted or not.")
  private Boolean hasBeenPromoted;

 /**
  * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
  */
  @ApiModelProperty(value = "Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.")
  private String note;

 /**
  * Pin metrics with associated time intervals if any.
  */
  @ApiModelProperty(example = "{\"pin_metrics\":[{\"90d\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3},\"all_time\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3,\"reaction\":10,\"comment\":2}},null]}", value = "Pin metrics with associated time intervals if any.")
  private Object pinMetrics;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Pin id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get createdAt
  * @return createdAt
  */
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Pin createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Get link
  * @return link
  */
  @JsonProperty("link")
 @Size(max=2048)  public String getLink() {
    return link;
  }

  /**
   * Sets the <code>link</code> property.
   */
 public void setLink(String link) {
    this.link = link;
  }

  /**
   * Sets the <code>link</code> property.
   */
  public Pin link(String link) {
    this.link = link;
    return this;
  }

 /**
  * Get title
  * @return title
  */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public Pin title(String title) {
    this.title = title;
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public Pin description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;.
  * @return dominantColor
  */
  @JsonProperty("dominant_color")
  public String getDominantColor() {
    return dominantColor;
  }

  /**
   * Sets the <code>dominantColor</code> property.
   */
 public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

  /**
   * Sets the <code>dominantColor</code> property.
   */
  public Pin dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

 /**
  * Get altText
  * @return altText
  */
  @JsonProperty("alt_text")
 @Size(max=500)  public String getAltText() {
    return altText;
  }

  /**
   * Sets the <code>altText</code> property.
   */
 public void setAltText(String altText) {
    this.altText = altText;
  }

  /**
   * Sets the <code>altText</code> property.
   */
  public Pin altText(String altText) {
    this.altText = altText;
    return this;
  }

 /**
  * Get creativeType
  * @return creativeType
  */
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  /**
   * Sets the <code>creativeType</code> property.
   * <br><em>N.B. <code>creativeType</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Sets the <code>creativeType</code> property.
   * <br><em>N.B. <code>creativeType</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Pin creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

 /**
  * The board to which this Pin belongs.
  * @return boardId
  */
  @JsonProperty("board_id")
 @Pattern(regexp="^\\d+$")  public String getBoardId() {
    return boardId;
  }

  /**
   * Sets the <code>boardId</code> property.
   */
 public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * Sets the <code>boardId</code> property.
   */
  public Pin boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

 /**
  * The board section to which this Pin belongs.
  * @return boardSectionId
  */
  @JsonProperty("board_section_id")
 @Pattern(regexp="^\\d+$")  public String getBoardSectionId() {
    return boardSectionId;
  }

  /**
   * Sets the <code>boardSectionId</code> property.
   */
 public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  /**
   * Sets the <code>boardSectionId</code> property.
   */
  public Pin boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

 /**
  * Get boardOwner
  * @return boardOwner
  */
  @JsonProperty("board_owner")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }

  /**
   * Sets the <code>boardOwner</code> property.
   */
 public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }

  /**
   * Sets the <code>boardOwner</code> property.
   */
  public Pin boardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
    return this;
  }

 /**
  * Whether the \&quot;operation user_account\&quot; is the Pin owner.
  * @return isOwner
  */
  @JsonProperty("is_owner")
  public Boolean getIsOwner() {
    return isOwner;
  }

  /**
   * Sets the <code>isOwner</code> property.
   * <br><em>N.B. <code>isOwner</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

  /**
   * Sets the <code>isOwner</code> property.
   * <br><em>N.B. <code>isOwner</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Pin isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

 /**
  * Get media
  * @return media
  */
  @JsonProperty("media")
  public SummaryPinMedia getMedia() {
    return media;
  }

  /**
   * Sets the <code>media</code> property.
   */
 public void setMedia(SummaryPinMedia media) {
    this.media = media;
  }

  /**
   * Sets the <code>media</code> property.
   */
  public Pin media(SummaryPinMedia media) {
    this.media = media;
    return this;
  }

 /**
  * Get mediaSource
  * @return mediaSource
  */
  @JsonProperty("media_source")
  public PinMediaSource getMediaSource() {
    return mediaSource;
  }

  /**
   * Sets the <code>mediaSource</code> property.
   */
 public void setMediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
  }

  /**
   * Sets the <code>mediaSource</code> property.
   */
  public Pin mediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

 /**
  * The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;.
  * @return parentPinId
  */
  @JsonProperty("parent_pin_id")
 @Pattern(regexp="^\\d+$")  public String getParentPinId() {
    return parentPinId;
  }

  /**
   * Sets the <code>parentPinId</code> property.
   */
 public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

  /**
   * Sets the <code>parentPinId</code> property.
   */
  public Pin parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

 /**
  * Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/content/update/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information.
  * @return isStandard
  */
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }

  /**
   * Sets the <code>isStandard</code> property.
   */
 public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  /**
   * Sets the <code>isStandard</code> property.
   */
  public Pin isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

 /**
  * Whether the Pin has been promoted or not.
  * @return hasBeenPromoted
  */
  @JsonProperty("has_been_promoted")
  public Boolean getHasBeenPromoted() {
    return hasBeenPromoted;
  }

  /**
   * Sets the <code>hasBeenPromoted</code> property.
   * <br><em>N.B. <code>hasBeenPromoted</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setHasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
  }

  /**
   * Sets the <code>hasBeenPromoted</code> property.
   * <br><em>N.B. <code>hasBeenPromoted</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Pin hasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
    return this;
  }

 /**
  * Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.
  * @return note
  */
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  /**
   * Sets the <code>note</code> property.
   */
 public void setNote(String note) {
    this.note = note;
  }

  /**
   * Sets the <code>note</code> property.
   */
  public Pin note(String note) {
    this.note = note;
    return this;
  }

 /**
  * Pin metrics with associated time intervals if any.
  * @return pinMetrics
  */
  @JsonProperty("pin_metrics")
  public Object getPinMetrics() {
    return pinMetrics;
  }

  /**
   * Sets the <code>pinMetrics</code> property.
   */
 public void setPinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
  }

  /**
   * Sets the <code>pinMetrics</code> property.
   */
  public Pin pinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
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
    Pin pin = (Pin) o;
    return Objects.equals(this.id, pin.id) &&
        Objects.equals(this.createdAt, pin.createdAt) &&
        Objects.equals(this.link, pin.link) &&
        Objects.equals(this.title, pin.title) &&
        Objects.equals(this.description, pin.description) &&
        Objects.equals(this.dominantColor, pin.dominantColor) &&
        Objects.equals(this.altText, pin.altText) &&
        Objects.equals(this.creativeType, pin.creativeType) &&
        Objects.equals(this.boardId, pin.boardId) &&
        Objects.equals(this.boardSectionId, pin.boardSectionId) &&
        Objects.equals(this.boardOwner, pin.boardOwner) &&
        Objects.equals(this.isOwner, pin.isOwner) &&
        Objects.equals(this.media, pin.media) &&
        Objects.equals(this.mediaSource, pin.mediaSource) &&
        Objects.equals(this.parentPinId, pin.parentPinId) &&
        Objects.equals(this.isStandard, pin.isStandard) &&
        Objects.equals(this.hasBeenPromoted, pin.hasBeenPromoted) &&
        Objects.equals(this.note, pin.note) &&
        Objects.equals(this.pinMetrics, pin.pinMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, link, title, description, dominantColor, altText, creativeType, boardId, boardSectionId, boardOwner, isOwner, media, mediaSource, parentPinId, isStandard, hasBeenPromoted, note, pinMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pin {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dominantColor: ").append(toIndentedString(dominantColor)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
    sb.append("    boardOwner: ").append(toIndentedString(boardOwner)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
    sb.append("    parentPinId: ").append(toIndentedString(parentPinId)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    hasBeenPromoted: ").append(toIndentedString(hasBeenPromoted)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    pinMetrics: ").append(toIndentedString(pinMetrics)).append("\n");
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

