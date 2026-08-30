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
 * KeywordUpdateGenerated
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordUpdateGenerated   {
  @JsonProperty("archived")
  private Boolean archived;

  @JsonProperty("bid")
  private Integer bid;

  @JsonProperty("id")
  private String id;

  public KeywordUpdateGenerated archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Is keyword archived?
   * @return archived
   */
  @ApiModelProperty(value = "Is keyword archived?")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public KeywordUpdateGenerated bid(Integer bid) {
    this.bid = bid;
    return this;
  }

  /**
   * </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * @return bid
   */
  @ApiModelProperty(value = "</p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }

  public KeywordUpdateGenerated id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Keyword ID.
   * @return id
   */
  @ApiModelProperty(required = true, value = "Keyword ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

