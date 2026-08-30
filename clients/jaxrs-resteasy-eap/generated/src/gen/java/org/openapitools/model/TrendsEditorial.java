package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import io.swagger.annotations.*;

@ApiModel(description="Information of the published editorial article.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
  
  @ApiModelProperty(required = true, value = "List of interests related to the editorial article")
  @JsonProperty("interests")
  @NotNull
  public List<String> getInterests() {
    return interests;
  }
  public void setInterests(List<String> interests) {
    this.interests = interests;
  }

  /**
   * URL of the pins related to the editorial article
   **/
  
  @ApiModelProperty(required = true, value = "URL of the pins related to the editorial article")
  @JsonProperty("pins_url")
  @NotNull
  public List<String> getPinsUrl() {
    return pinsUrl;
  }
  public void setPinsUrl(List<String> pinsUrl) {
    this.pinsUrl = pinsUrl;
  }

  /**
   * List of keywords related to the editorial article
   **/
  
  @ApiModelProperty(required = true, value = "List of keywords related to the editorial article")
  @JsonProperty("related_keywords")
  @NotNull
  public List<@Valid KeywordInfo> getRelatedKeywords() {
    return relatedKeywords;
  }
  public void setRelatedKeywords(List<@Valid KeywordInfo> relatedKeywords) {
    this.relatedKeywords = relatedKeywords;
  }

  /**
   * Title of the editorial article
   **/
  
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

