package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * The counts can be null early in the process.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsFeedProductCounts   {
  @JsonProperty("original")
  
  private Integer original;

  public CatalogsFeedProductCounts original(Integer original) {
    this.original = original;
    return this;
  }

   /**
   * The number of products in the feed file
   * @return original
  **/
  public Integer getOriginal() {
    return original;
  }

  public void setOriginal(Integer original) {
    this.original = original;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedProductCounts catalogsFeedProductCounts = (CatalogsFeedProductCounts) o;
    return Objects.equals(original, catalogsFeedProductCounts.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(original);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedProductCounts {\n");
    
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
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

