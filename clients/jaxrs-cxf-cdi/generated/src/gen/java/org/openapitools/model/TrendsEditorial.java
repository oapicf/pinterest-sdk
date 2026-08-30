package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordInfo;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Information of the published editorial article.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Information of the published editorial article.")
public class TrendsEditorial   {
  
  private String boardUrl;

  private String description;

  private List<String> interests = new ArrayList<>();

  private List<String> pinsUrl = new ArrayList<>();

  private List<@Valid KeywordInfo> relatedKeywords = new ArrayList<>();

  private String title;

  /**
   * URL of the editorial board
   **/
  public TrendsEditorial boardUrl(String boardUrl) {
    this.boardUrl = boardUrl;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "URL of the editorial board")
  @JsonProperty("board_url")
  @NotNull
  public String getBoardUrl() {
    return boardUrl;
  }
  public void setBoardUrl(String boardUrl) {
    this.boardUrl = boardUrl;
  }


  /**
   * Description of the editorial article
   **/
  public TrendsEditorial description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Description of the editorial article")
  @JsonProperty("description")
  @NotNull
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * List of interests related to the editorial article
   **/
  public TrendsEditorial interests(List<String> interests) {
    this.interests = interests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of interests related to the editorial article")
  @JsonProperty("interests")
  @NotNull
  public List<String> getInterests() {
    return interests;
  }
  public void setInterests(List<String> interests) {
    this.interests = interests;
  }

  public TrendsEditorial addInterestsItem(String interestsItem) {
    if (this.interests == null) {
      this.interests = new ArrayList<>();
    }
    this.interests.add(interestsItem);
    return this;
  }


  /**
   * URL of the pins related to the editorial article
   **/
  public TrendsEditorial pinsUrl(List<String> pinsUrl) {
    this.pinsUrl = pinsUrl;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "URL of the pins related to the editorial article")
  @JsonProperty("pins_url")
  @NotNull
  public List<String> getPinsUrl() {
    return pinsUrl;
  }
  public void setPinsUrl(List<String> pinsUrl) {
    this.pinsUrl = pinsUrl;
  }

  public TrendsEditorial addPinsUrlItem(String pinsUrlItem) {
    if (this.pinsUrl == null) {
      this.pinsUrl = new ArrayList<>();
    }
    this.pinsUrl.add(pinsUrlItem);
    return this;
  }


  /**
   * List of keywords related to the editorial article
   **/
  public TrendsEditorial relatedKeywords(List<@Valid KeywordInfo> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of keywords related to the editorial article")
  @JsonProperty("related_keywords")
  @NotNull
  public List<@Valid KeywordInfo> getRelatedKeywords() {
    return relatedKeywords;
  }
  public void setRelatedKeywords(List<@Valid KeywordInfo> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }

  public TrendsEditorial addRelatedKeywordsItem(KeywordInfo relatedKeywordsItem) {
    if (this.relatedKeywords == null) {
      this.relatedKeywords = new ArrayList<>();
    }
    this.relatedKeywords.add(relatedKeywordsItem);
    return this;
  }


  /**
   * Title of the editorial article
   **/
  public TrendsEditorial title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Title of the editorial article")
  @JsonProperty("title")
  @NotNull
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

