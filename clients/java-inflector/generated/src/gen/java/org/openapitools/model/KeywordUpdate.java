package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KeywordUpdate   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("archived")
  private Boolean archived;

  @JsonProperty("bid")
  private Integer bid;

  /**
   * Keyword ID.
   **/
  public KeywordUpdate id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2886364308355", required = true, value = "Keyword ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Is keyword archived?
   **/
  public KeywordUpdate archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Is keyword archived?")
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }
  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  /**
   * Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * minimum: 1
   **/
  public KeywordUpdate bid(Integer bid) {
    this.bid = bid;
    return this;
  }

  
  @ApiModelProperty(example = "200000", value = "Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  @JsonProperty("bid")
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
    return Objects.equals(id, keywordUpdate.id) &&
        Objects.equals(archived, keywordUpdate.archived) &&
        Objects.equals(bid, keywordUpdate.bid);
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

