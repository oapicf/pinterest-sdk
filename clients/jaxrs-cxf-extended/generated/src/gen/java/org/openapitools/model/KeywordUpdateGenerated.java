package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeywordUpdateGenerated  {
  
 /**
  * Is keyword archived?
  */
  @ApiModelProperty(value = "Is keyword archived?")
  private Boolean archived;

 /**
  * </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  */
  @ApiModelProperty(value = "</p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  private Integer bid;

 /**
  * Keyword ID.
  */
  @ApiModelProperty(required = true, value = "Keyword ID.")
  private String id;
 /**
  * Is keyword archived?
  * @return archived
  */
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  /**
   * Sets the <code>archived</code> property.
   */
 public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  /**
   * Sets the <code>archived</code> property.
   */
  public KeywordUpdateGenerated archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

 /**
  * &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  * @return bid
  */
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }

  /**
   * Sets the <code>bid</code> property.
   */
 public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   * Sets the <code>bid</code> property.
   */
  public KeywordUpdateGenerated bid(Integer bid) {
    this.bid = bid;
    return this;
  }

 /**
  * Keyword ID.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public KeywordUpdateGenerated id(String id) {
    this.id = id;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordUpdateGenerated keywordUpdateGenerated = (KeywordUpdateGenerated) o;
    return Objects.equals(this.archived, keywordUpdateGenerated.archived) &&
        Objects.equals(this.bid, keywordUpdateGenerated.bid) &&
        Objects.equals(this.id, keywordUpdateGenerated.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, bid, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordUpdateGenerated {\n");
    
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

