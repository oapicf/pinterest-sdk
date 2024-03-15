package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * KeywordUpdate
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KeywordUpdate   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("archived")
  private Boolean archived;

  @JsonProperty("bid")
  private Integer bid;

  public KeywordUpdate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Keyword ID.
   * @return id
  **/
  @ApiModelProperty(example = "2886364308355", required = true, value = "Keyword ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public KeywordUpdate archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Is keyword archived?
   * @return archived
  **/
  @ApiModelProperty(example = "false", value = "Is keyword archived?")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public KeywordUpdate bid(Integer bid) {
    this.bid = bid;
    return this;
  }

   /**
   * Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * minimum: 1
   * @return bid
  **/
  @ApiModelProperty(example = "200000", value = "Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

