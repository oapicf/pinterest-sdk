package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordInfo;



/**
 * Information of the published editorial article.
 **/

@ApiModel(description = "Information of the published editorial article.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendsEditorial   {
  @JsonProperty("board_url")
  private String boardUrl;

  @JsonProperty("description")
  private String description;

  @JsonProperty("interests")
  private List<String> interests = new ArrayList<>();

  @JsonProperty("pins_url")
  private List<String> pinsUrl = new ArrayList<>();

  @JsonProperty("related_keywords")
  private List<KeywordInfo> relatedKeywords = new ArrayList<>();

  @JsonProperty("title")
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
  public List<String> getInterests() {
    return interests;
  }
  public void setInterests(List<String> interests) {
    this.interests = interests;
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
  public List<String> getPinsUrl() {
    return pinsUrl;
  }
  public void setPinsUrl(List<String> pinsUrl) {
    this.pinsUrl = pinsUrl;
  }

  /**
   * List of keywords related to the editorial article
   **/
  public TrendsEditorial relatedKeywords(List<KeywordInfo> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of keywords related to the editorial article")
  @JsonProperty("related_keywords")
  public List<KeywordInfo> getRelatedKeywords() {
    return relatedKeywords;
  }
  public void setRelatedKeywords(List<KeywordInfo> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
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
    return Objects.equals(boardUrl, trendsEditorial.boardUrl) &&
        Objects.equals(description, trendsEditorial.description) &&
        Objects.equals(interests, trendsEditorial.interests) &&
        Objects.equals(pinsUrl, trendsEditorial.pinsUrl) &&
        Objects.equals(relatedKeywords, trendsEditorial.relatedKeywords) &&
        Objects.equals(title, trendsEditorial.title);
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

