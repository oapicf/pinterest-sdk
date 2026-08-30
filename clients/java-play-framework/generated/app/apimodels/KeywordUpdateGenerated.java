package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * KeywordUpdateGenerated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class KeywordUpdateGenerated   {
  @JsonProperty("archived")
  
  private Boolean archived;

  @JsonProperty("bid")
  
  private Integer bid;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  public KeywordUpdateGenerated archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Is keyword archived?
   * @return archived
  **/
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
  **/
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
  **/
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
    return Objects.equals(archived, keywordUpdateGenerated.archived) &&
        Objects.equals(bid, keywordUpdateGenerated.bid) &&
        Objects.equals(id, keywordUpdateGenerated.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, bid, id);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

