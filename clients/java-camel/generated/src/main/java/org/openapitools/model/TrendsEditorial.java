package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Information of the published editorial article.
 */

@Schema(name = "TrendsEditorial", description = "Information of the published editorial article.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendsEditorial {

  private String boardUrl;

  private String description;

  @Valid
  private List<String> interests = new ArrayList<>();

  @Valid
  private List<String> pinsUrl = new ArrayList<>();

  @Valid
  private List<@Valid KeywordInfo> relatedKeywords = new ArrayList<>();

  private String title;

  public TrendsEditorial() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrendsEditorial(String boardUrl, String description, List<String> interests, List<String> pinsUrl, List<@Valid KeywordInfo> relatedKeywords, String title) {
    this.boardUrl = boardUrl;
    this.description = description;
    this.interests = interests;
    this.pinsUrl = pinsUrl;
    this.relatedKeywords = relatedKeywords;
    this.title = title;
  }

  public TrendsEditorial boardUrl(String boardUrl) {
    this.boardUrl = boardUrl;
    return this;
  }

  /**
   * URL of the editorial board
   * @return boardUrl
   */
  @NotNull 
  @Schema(name = "board_url", description = "URL of the editorial board", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("board_url")
  public String getBoardUrl() {
    return boardUrl;
  }

  public void setBoardUrl(String boardUrl) {
    this.boardUrl = boardUrl;
  }

  public TrendsEditorial description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the editorial article
   * @return description
   */
  @NotNull 
  @Schema(name = "description", description = "Description of the editorial article", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TrendsEditorial interests(List<String> interests) {
    this.interests = interests;
    return this;
  }

  public TrendsEditorial addInterestsItem(String interestsItem) {
    if (this.interests == null) {
      this.interests = new ArrayList<>();
    }
    this.interests.add(interestsItem);
    return this;
  }

  /**
   * List of interests related to the editorial article
   * @return interests
   */
  @NotNull 
  @Schema(name = "interests", description = "List of interests related to the editorial article", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("interests")
  public List<String> getInterests() {
    return interests;
  }

  public void setInterests(List<String> interests) {
    this.interests = interests;
  }

  public TrendsEditorial pinsUrl(List<String> pinsUrl) {
    this.pinsUrl = pinsUrl;
    return this;
  }

  public TrendsEditorial addPinsUrlItem(String pinsUrlItem) {
    if (this.pinsUrl == null) {
      this.pinsUrl = new ArrayList<>();
    }
    this.pinsUrl.add(pinsUrlItem);
    return this;
  }

  /**
   * URL of the pins related to the editorial article
   * @return pinsUrl
   */
  @NotNull 
  @Schema(name = "pins_url", description = "URL of the pins related to the editorial article", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pins_url")
  public List<String> getPinsUrl() {
    return pinsUrl;
  }

  public void setPinsUrl(List<String> pinsUrl) {
    this.pinsUrl = pinsUrl;
  }

  public TrendsEditorial relatedKeywords(List<@Valid KeywordInfo> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
    return this;
  }

  public TrendsEditorial addRelatedKeywordsItem(KeywordInfo relatedKeywordsItem) {
    if (this.relatedKeywords == null) {
      this.relatedKeywords = new ArrayList<>();
    }
    this.relatedKeywords.add(relatedKeywordsItem);
    return this;
  }

  /**
   * List of keywords related to the editorial article
   * @return relatedKeywords
   */
  @NotNull @Valid 
  @Schema(name = "related_keywords", description = "List of keywords related to the editorial article", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("related_keywords")
  public List<@Valid KeywordInfo> getRelatedKeywords() {
    return relatedKeywords;
  }

  public void setRelatedKeywords(List<@Valid KeywordInfo> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }

  public TrendsEditorial title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the editorial article
   * @return title
   */
  @NotNull 
  @Schema(name = "title", description = "Title of the editorial article", requiredMode = Schema.RequiredMode.REQUIRED)
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

