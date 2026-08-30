package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.KeywordInfo;

/**
 * Information of the published editorial article.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendsEditorial   {
  
  private String boardUrl;
  private String description;
  private List<String> interests = new ArrayList<>();
  private List<String> pinsUrl = new ArrayList<>();
  private List<KeywordInfo> relatedKeywords = new ArrayList<>();
  private String title;

  public TrendsEditorial () {

  }

  public TrendsEditorial (String boardUrl, String description, List<String> interests, List<String> pinsUrl, List<KeywordInfo> relatedKeywords, String title) {
    this.boardUrl = boardUrl;
    this.description = description;
    this.interests = interests;
    this.pinsUrl = pinsUrl;
    this.relatedKeywords = relatedKeywords;
    this.title = title;
  }

    
  @JsonProperty("board_url")
  public String getBoardUrl() {
    return boardUrl;
  }
  public void setBoardUrl(String boardUrl) {
    this.boardUrl = boardUrl;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("interests")
  public List<String> getInterests() {
    return interests;
  }
  public void setInterests(List<String> interests) {
    this.interests = interests;
  }

    
  @JsonProperty("pins_url")
  public List<String> getPinsUrl() {
    return pinsUrl;
  }
  public void setPinsUrl(List<String> pinsUrl) {
    this.pinsUrl = pinsUrl;
  }

    
  @JsonProperty("related_keywords")
  public List<KeywordInfo> getRelatedKeywords() {
    return relatedKeywords;
  }
  public void setRelatedKeywords(List<KeywordInfo> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }

    
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
