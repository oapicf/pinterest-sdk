package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordInfo;
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
 * Information of the published editorial article.
 **/
@ApiModel(description = "Information of the published editorial article.")
@JsonTypeName("TrendsEditorial")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendsEditorial   {
  private String boardUrl;
  private String description;
  private @Valid List<String> interests = new ArrayList<>();
  private @Valid List<String> pinsUrl = new ArrayList<>();
  private @Valid List<@Valid KeywordInfo> relatedKeywords = new ArrayList<>();
  private String title;

  public TrendsEditorial() {
  }

  @JsonCreator
  public TrendsEditorial(
    @JsonProperty(required = true, value = "board_url") String boardUrl,
    @JsonProperty(required = true, value = "description") String description,
    @JsonProperty(required = true, value = "interests") List<String> interests,
    @JsonProperty(required = true, value = "pins_url") List<String> pinsUrl,
    @JsonProperty(required = true, value = "related_keywords") List<@Valid KeywordInfo> relatedKeywords,
    @JsonProperty(required = true, value = "title") String title
  ) {
    this.boardUrl = boardUrl;
    this.description = description;
    this.interests = interests;
    this.pinsUrl = pinsUrl;
    this.relatedKeywords = relatedKeywords;
    this.title = title;
  }

  /**
   * URL of the editorial board
   **/
  public TrendsEditorial boardUrl(String boardUrl) {
    this.boardUrl = boardUrl;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "URL of the editorial board")
  @JsonProperty(required = true, value = "board_url")
  @NotNull public String getBoardUrl() {
    return boardUrl;
  }

  @JsonProperty(required = true, value = "board_url")
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
  @JsonProperty(required = true, value = "description")
  @NotNull public String getDescription() {
    return description;
  }

  @JsonProperty(required = true, value = "description")
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
  @JsonProperty(required = true, value = "interests")
  @NotNull public List<String> getInterests() {
    return interests;
  }

  @JsonProperty(required = true, value = "interests")
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

  public TrendsEditorial removeInterestsItem(String interestsItem) {
    if (interestsItem != null && this.interests != null) {
      this.interests.remove(interestsItem);
    }

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
  @JsonProperty(required = true, value = "pins_url")
  @NotNull public List<String> getPinsUrl() {
    return pinsUrl;
  }

  @JsonProperty(required = true, value = "pins_url")
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

  public TrendsEditorial removePinsUrlItem(String pinsUrlItem) {
    if (pinsUrlItem != null && this.pinsUrl != null) {
      this.pinsUrl.remove(pinsUrlItem);
    }

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
  @JsonProperty(required = true, value = "related_keywords")
  @NotNull @Valid public List<@Valid KeywordInfo> getRelatedKeywords() {
    return relatedKeywords;
  }

  @JsonProperty(required = true, value = "related_keywords")
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

  public TrendsEditorial removeRelatedKeywordsItem(KeywordInfo relatedKeywordsItem) {
    if (relatedKeywordsItem != null && this.relatedKeywords != null) {
      this.relatedKeywords.remove(relatedKeywordsItem);
    }

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
  @JsonProperty(required = true, value = "title")
  @NotNull public String getTitle() {
    return title;
  }

  @JsonProperty(required = true, value = "title")
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
