package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class KeywordUpdateGenerated implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Is keyword archived?
   */
  @JsonProperty("archived")
  private Boolean archived;

  /**
   * &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   */
  @JsonProperty("bid")
  private Integer bid;

  /**
   * Keyword ID.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Is keyword archived?
   * @return archived
   */
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  /**
   * &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * @return bid
   */
  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   * Keyword ID.
   * @return id
   */
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
