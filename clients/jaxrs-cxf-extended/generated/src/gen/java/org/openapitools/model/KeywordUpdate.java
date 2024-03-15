package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeywordUpdate  {
  
 /**
  * Keyword ID.
  */
  @ApiModelProperty(example = "2886364308355", required = true, value = "Keyword ID.")
  private String id;

 /**
  * Is keyword archived?
  */
  @ApiModelProperty(example = "false", value = "Is keyword archived?")
  private Boolean archived;

 /**
  * Keyword custom bid in microcurrency - null if inherited from parent ad group.
  */
  @ApiModelProperty(example = "200000", value = "Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  private Integer bid;
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
  public KeywordUpdate id(String id) {
    this.id = id;
    return this;
  }

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
  public KeywordUpdate archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

 /**
  * Keyword custom bid in microcurrency - null if inherited from parent ad group.
  * minimum: 1
  * @return bid
  */
  @JsonProperty("bid")
 @Min(1)  public Integer getBid() {
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
  public KeywordUpdate bid(Integer bid) {
    this.bid = bid;
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
    KeywordUpdate keywordUpdate = (KeywordUpdate) o;
    return Objects.equals(this.id, keywordUpdate.id) &&
        Objects.equals(this.archived, keywordUpdate.archived) &&
        Objects.equals(this.bid, keywordUpdate.bid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, archived, bid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
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

