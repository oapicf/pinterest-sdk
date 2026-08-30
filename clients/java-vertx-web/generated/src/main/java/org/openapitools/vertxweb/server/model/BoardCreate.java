package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.BoardPrivacy;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BoardCreate   {
  
  private String description;
  private Boolean isAdsOnly = false;
  private String name;
  private BoardPrivacy privacy;

  public BoardCreate () {

  }

  public BoardCreate (String description, Boolean isAdsOnly, String name, BoardPrivacy privacy) {
    this.description = description;
    this.isAdsOnly = isAdsOnly;
    this.name = name;
    this.privacy = privacy;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("is_ads_only")
  public Boolean getIsAdsOnly() {
    return isAdsOnly;
  }
  public void setIsAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("privacy")
  public BoardPrivacy getPrivacy() {
    return privacy;
  }
  public void setPrivacy(BoardPrivacy privacy) {
    this.privacy = privacy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardCreate boardCreate = (BoardCreate) o;
    return Objects.equals(description, boardCreate.description) &&
        Objects.equals(isAdsOnly, boardCreate.isAdsOnly) &&
        Objects.equals(name, boardCreate.name) &&
        Objects.equals(privacy, boardCreate.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isAdsOnly, name, privacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardCreate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isAdsOnly: ").append(toIndentedString(isAdsOnly)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
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
