package apimodels;

import apimodels.KeywordInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Information of the published editorial article.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrendsEditorial   {
  @JsonProperty("board_url")
  @NotNull

  private String boardUrl;

  @JsonProperty("description")
  @NotNull

  private String description;

  @JsonProperty("interests")
  @NotNull

  private List<String> interests = new ArrayList<>();

  @JsonProperty("pins_url")
  @NotNull

  private List<String> pinsUrl = new ArrayList<>();

  @JsonProperty("related_keywords")
  @NotNull
@Valid

  private List<@Valid KeywordInfo> relatedKeywords = new ArrayList<>();

  @JsonProperty("title")
  @NotNull

  private String title;

  public TrendsEditorial boardUrl(String boardUrl) {
    this.boardUrl = boardUrl;
    return this;
  }

   /**
   * URL of the editorial board
   * @return boardUrl
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

