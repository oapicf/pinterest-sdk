package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.BoardUpdatePrivacy;

/**
 * Resource create or update operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BoardWithUpdatePrivacyUpdate   {
  
  private String description;
  private String name;
  private BoardUpdatePrivacy privacy;

  public BoardWithUpdatePrivacyUpdate () {

  }

  public BoardWithUpdatePrivacyUpdate (String description, String name, BoardUpdatePrivacy privacy) {
    this.description = description;
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

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("privacy")
  public BoardUpdatePrivacy getPrivacy() {
    return privacy;
  }
  public void setPrivacy(BoardUpdatePrivacy privacy) {
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
    BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate = (BoardWithUpdatePrivacyUpdate) o;
    return Objects.equals(description, boardWithUpdatePrivacyUpdate.description) &&
        Objects.equals(name, boardWithUpdatePrivacyUpdate.name) &&
        Objects.equals(privacy, boardWithUpdatePrivacyUpdate.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, privacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardWithUpdatePrivacyUpdate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
