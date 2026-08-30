package org.openapitools.model;

import org.openapitools.model.KeywordInfo;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Information of the published editorial article.
 */
public class TrendsEditorial implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * URL of the editorial board
   */
  @JsonProperty("board_url")
  private String boardUrl;

  /**
   * Description of the editorial article
   */
  @JsonProperty("description")
  private String description;

  /**
   * List of interests related to the editorial article
   */
  @JsonProperty("interests")
  private List<String> interests = new ArrayList<>();

  /**
   * URL of the pins related to the editorial article
   */
  @JsonProperty("pins_url")
  private List<String> pinsUrl = new ArrayList<>();

  /**
   * List of keywords related to the editorial article
   */
  @JsonProperty("related_keywords")
  private List<KeywordInfo> relatedKeywords = new ArrayList<>();

  /**
   * Title of the editorial article
   */
  @JsonProperty("title")
  private String title;

  /**
   * URL of the editorial board
   * @return boardUrl
   */
  public String getBoardUrl() {
    return boardUrl;
  }

  public void setBoardUrl(String boardUrl) {
    this.boardUrl = boardUrl;
  }

  /**
   * Description of the editorial article
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * List of interests related to the editorial article
   * @return interests
   */
  public List<String> getInterests() {
    return interests;
  }

  public void setInterests(List<String> interests) {
    this.interests = interests;
  }

  /**
   * URL of the pins related to the editorial article
   * @return pinsUrl
   */
  public List<String> getPinsUrl() {
    return pinsUrl;
  }

  public void setPinsUrl(List<String> pinsUrl) {
    this.pinsUrl = pinsUrl;
  }

  /**
   * List of keywords related to the editorial article
   * @return relatedKeywords
   */
  public List<KeywordInfo> getRelatedKeywords() {
    return relatedKeywords;
  }

  public void setRelatedKeywords(List<KeywordInfo> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }

  /**
   * Title of the editorial article
   * @return title
   */
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
