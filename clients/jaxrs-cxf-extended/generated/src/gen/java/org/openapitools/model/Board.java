package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Board
 */
@ApiModel(description="Board")

public class Board  {
  
  @ApiModelProperty(example = "549755885175", value = "")
  private String id;

  @ApiModelProperty(example = "Summer Recipes", required = true, value = "")
  private String name;

  @ApiModelProperty(example = "My favorite summer recipes", value = "")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private BoardOwner owner;

public enum PrivacyEnum {

    @JsonProperty("PUBLIC") PUBLIC(String.valueOf("PUBLIC")),
    @JsonProperty("PROTECTED") PROTECTED(String.valueOf("PROTECTED")),
    @JsonProperty("SECRET") SECRET(String.valueOf("SECRET"));

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

 /**
  * Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
  */
  @ApiModelProperty(value = "Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>")
  private PrivacyEnum privacy = PrivacyEnum.PUBLIC;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Board id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public Board name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public Board description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get owner
  * @return owner
  */
  @JsonProperty("owner")
  public BoardOwner getOwner() {
    return owner;
  }

  /**
   * Sets the <code>owner</code> property.
   * <br><em>N.B. <code>owner</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setOwner(BoardOwner owner) {
    this.owner = owner;
  }

  /**
   * Sets the <code>owner</code> property.
   * <br><em>N.B. <code>owner</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Board owner(BoardOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Puts a new item into the <code>owner</code> map.
   * <br><em>N.B. <code>owner</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Board putOwnerItem(String key,  ownerItem) {
    this.owner.put(key, ownerItem);
    return this;
  }

 /**
  * Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;
  * @return privacy
  */
  @JsonProperty("privacy")
  public String getPrivacy() {
    return privacy == null ? null : privacy.value();
  }

  /**
   * Sets the <code>privacy</code> property.
   */
 public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }

  /**
   * Sets the <code>privacy</code> property.
   */
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

