package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordInfo;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Information of the published editorial article.
 */
@ApiModel(description="Information of the published editorial article.")

public class TrendsEditorial  {
  
 /**
  * URL of the editorial board
  */
  @ApiModelProperty(required = true, value = "URL of the editorial board")
  private String boardUrl;

 /**
  * Description of the editorial article
  */
  @ApiModelProperty(required = true, value = "Description of the editorial article")
  private String description;

 /**
  * List of interests related to the editorial article
  */
  @ApiModelProperty(required = true, value = "List of interests related to the editorial article")
  private List<String> interests = new ArrayList<>();

 /**
  * URL of the pins related to the editorial article
  */
  @ApiModelProperty(required = true, value = "URL of the pins related to the editorial article")
  private List<String> pinsUrl = new ArrayList<>();

 /**
  * List of keywords related to the editorial article
  */
  @ApiModelProperty(required = true, value = "List of keywords related to the editorial article")
  @Valid
  private List<@Valid KeywordInfo> relatedKeywords = new ArrayList<>();

 /**
  * Title of the editorial article
  */
  @ApiModelProperty(required = true, value = "Title of the editorial article")
  private String title;
 /**
  * URL of the editorial board
  * @return boardUrl
  */
  @JsonProperty("board_url")
  @NotNull
  public String getBoardUrl() {
    return boardUrl;
  }

  /**
   * Sets the <code>boardUrl</code> property.
   */
 public void setBoardUrl(String boardUrl) {
    this.boardUrl = boardUrl;
  }

  /**
   * Sets the <code>boardUrl</code> property.
   */
  public TrendsEditorial boardUrl(String boardUrl) {
    this.boardUrl = boardUrl;
    return this;
  }

 /**
  * Description of the editorial article
  * @return description
  */
  @JsonProperty("description")
  @NotNull
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
  public TrendsEditorial description(String description) {
    this.description = description;
    return this;
  }

 /**
  * List of interests related to the editorial article
  * @return interests
  */
  @JsonProperty("interests")
  @NotNull
  public List<String> getInterests() {
    return interests;
  }

  /**
   * Sets the <code>interests</code> property.
   */
 public void setInterests(List<String> interests) {
    this.interests = interests;
  }

  /**
   * Sets the <code>interests</code> property.
   */
  public TrendsEditorial interests(List<String> interests) {
    this.interests = interests;
    return this;
  }

  /**
   * Adds a new item to the <code>interests</code> list.
   */
  public TrendsEditorial addInterestsItem(String interestsItem) {
    this.interests.add(interestsItem);
    return this;
  }

 /**
  * URL of the pins related to the editorial article
  * @return pinsUrl
  */
  @JsonProperty("pins_url")
  @NotNull
  public List<String> getPinsUrl() {
    return pinsUrl;
  }

  /**
   * Sets the <code>pinsUrl</code> property.
   */
 public void setPinsUrl(List<String> pinsUrl) {
    this.pinsUrl = pinsUrl;
  }

  /**
   * Sets the <code>pinsUrl</code> property.
   */
  public TrendsEditorial pinsUrl(List<String> pinsUrl) {
    this.pinsUrl = pinsUrl;
    return this;
  }

  /**
   * Adds a new item to the <code>pinsUrl</code> list.
   */
  public TrendsEditorial addPinsUrlItem(String pinsUrlItem) {
    this.pinsUrl.add(pinsUrlItem);
    return this;
  }

 /**
  * List of keywords related to the editorial article
  * @return relatedKeywords
  */
  @JsonProperty("related_keywords")
  @NotNull
  public List<@Valid KeywordInfo> getRelatedKeywords() {
    return relatedKeywords;
  }

  /**
   * Sets the <code>relatedKeywords</code> property.
   */
 public void setRelatedKeywords(List<@Valid KeywordInfo> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }

  /**
   * Sets the <code>relatedKeywords</code> property.
   */
  public TrendsEditorial relatedKeywords(List<@Valid KeywordInfo> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
    return this;
  }

  /**
   * Adds a new item to the <code>relatedKeywords</code> list.
   */
  public TrendsEditorial addRelatedKeywordsItem(KeywordInfo relatedKeywordsItem) {
    this.relatedKeywords.add(relatedKeywordsItem);
    return this;
  }

 /**
  * Title of the editorial article
  * @return title
  */
  @JsonProperty("title")
  @NotNull
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
  public TrendsEditorial title(String title) {
    this.title = title;
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
    TrendsEditorial trendsEditorial = (TrendsEditorial) o;
    return Objects.equals(this.boardUrl, trendsEditorial.boardUrl) &&
        Objects.equals(this.description, trendsEditorial.description) &&
        Objects.equals(this.interests, trendsEditorial.interests) &&
        Objects.equals(this.pinsUrl, trendsEditorial.pinsUrl) &&
        Objects.equals(this.relatedKeywords, trendsEditorial.relatedKeywords) &&
        Objects.equals(this.title, trendsEditorial.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardUrl, description, interests, pinsUrl, relatedKeywords, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendsEditorial {\n");
    
    sb.append("    boardUrl: ").append(toIndentedString(boardUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    pinsUrl: ").append(toIndentedString(pinsUrl)).append("\n");
    sb.append("    relatedKeywords: ").append(toIndentedString(relatedKeywords)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

