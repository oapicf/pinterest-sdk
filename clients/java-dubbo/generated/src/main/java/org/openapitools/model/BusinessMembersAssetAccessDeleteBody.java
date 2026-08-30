package org.openapitools.model;

import org.openapitools.model.DeleteMemberAssetAccessItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * An object with a list of member asset accesses to delete.
 */
public class BusinessMembersAssetAccessDeleteBody implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of members asset access to be deleted
   */
  @JsonProperty("accesses")
  private List<DeleteMemberAssetAccessItem> accesses = new ArrayList<>();

  /**
   * List of members asset access to be deleted
   * @return accesses
   */
  public List<DeleteMemberAssetAccessItem> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<DeleteMemberAssetAccessItem> accesses) {
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
    BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody = (BusinessMembersAssetAccessDeleteBody) o;
    return Objects.equals(this.accesses, businessMembersAssetAccessDeleteBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMembersAssetAccessDeleteBody {\n");
    
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
