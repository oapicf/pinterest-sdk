package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Board
 **/
@ApiModel(description="Board")
public class Board  {
  
  @ApiModelProperty(example = "549755885175", value = "")
  private String id;

  @ApiModelProperty(example = "Summer Recipes", required = true, value = "")
  private String name;

  @ApiModelProperty(example = "My favorite summer recipes", value = "")
  private String description;

  @ApiModelProperty(value = "")
  private BoardOwner owner;

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
    public String toString() {
        return String.valueOf(value);
    }

    public static PrivacyEnum fromValue(String value) {
        for (PrivacyEnum b : PrivacyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>")
 /**
   * Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
  **/
  private PrivacyEnum privacy = PrivacyEnum.PUBLIC;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Board name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Board description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public BoardOwner getOwner() {
    return owner;
  }


 /**
   * Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;
   * @return privacy
  **/
  @JsonProperty("privacy")
  public String getPrivacy() {
    if (privacy == null) {
      return null;
    }
    return privacy.value();
  }

  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }

  public Board privacy(PrivacyEnum privacy) {
    this.privacy = privacy;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

