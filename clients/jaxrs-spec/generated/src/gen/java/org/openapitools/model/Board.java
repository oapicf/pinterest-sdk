package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Board
 **/
@ApiModel(description = "Board")
@JsonTypeName("Board")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class Board   {
  
  private @Valid String id;
  private @Valid String name;
  private @Valid String description;
  private @Valid BoardOwner owner;

public enum PrivacyEnum {

    PUBLIC(String.valueOf("PUBLIC")), PROTECTED(String.valueOf("PROTECTED")), SECRET(String.valueOf("SECRET"));


    private String value;

    PrivacyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PrivacyEnum fromValue(String value) {
        for (PrivacyEnum b : PrivacyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid PrivacyEnum privacy = PrivacyEnum.PUBLIC;

  /**
   **/
  public Board id(String id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(example = "549755885175", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

/**
   **/
  public Board name(String name) {
    this.name = name;
    return this;
  }

  

  
  @ApiModelProperty(example = "Summer Recipes", required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

/**
   **/
  public Board description(String description) {
    this.description = description;
    return this;
  }

  

  
  @ApiModelProperty(example = "My favorite summer recipes", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

/**
   **/
  public Board owner(BoardOwner owner) {
    this.owner = owner;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  public BoardOwner getOwner() {
    return owner;
  }

  @JsonProperty("owner")
  public void setOwner(BoardOwner owner) {
    this.owner = owner;
  }

  public Board putOwnerItem(String key,  ownerItem) {
    if (this.owner == null) {
      this.owner = ;
    }

    this.owner.put(key, ownerItem);
    return this;
  }

  public Board removeOwnerItem( ownerItem) {
    if (ownerItem != null && this.owner != null) {
      this.owner.remove(ownerItem);
    }

    return this;
  }
/**
   * Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;
   **/
  public Board privacy(PrivacyEnum privacy) {
    this.privacy = privacy;
    return this;
  }

  

  
  @ApiModelProperty(value = "Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>")
  @JsonProperty("privacy")
  public PrivacyEnum getPrivacy() {
    return privacy;
  }

  @JsonProperty("privacy")
  public void setPrivacy(PrivacyEnum privacy) {
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
    Board board = (Board) o;
    return Objects.equals(this.id, board.id) &&
        Objects.equals(this.name, board.name) &&
        Objects.equals(this.description, board.description) &&
        Objects.equals(this.owner, board.owner) &&
        Objects.equals(this.privacy, board.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, owner, privacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Board {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

