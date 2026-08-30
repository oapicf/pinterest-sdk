package org.openapitools.model;

import org.openapitools.model.DeletePartnerAssetAccessItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * An object with a list of partner asset accesses to delete.
 */
public class DeletePartnerAssetAccessBody implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of partner asset accesses to delete.
   */
  @JsonProperty("accesses")
  private List<DeletePartnerAssetAccessItem> accesses = new ArrayList<>();

  /**
   * List of partner asset accesses to delete.
   * @return accesses
   */
  public List<DeletePartnerAssetAccessItem> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<DeletePartnerAssetAccessItem> accesses) {
    this.accesses = accesses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePartnerAssetAccessBody deletePartnerAssetAccessBody = (DeletePartnerAssetAccessBody) o;
    return Objects.equals(this.accesses, deletePartnerAssetAccessBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessBody {\n");
    
    sb.append("    accesses: ").append(toIndentedString(accesses)).append("\n");
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
