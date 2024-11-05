package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.UpdateMemberAssetAccessBodyAccessesInner;

/**
 * An object with a list of all the new accesses.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateMemberAssetAccessBody   {
  
  private List<UpdateMemberAssetAccessBodyAccessesInner> accesses = new ArrayList<>();

  public UpdateMemberAssetAccessBody () {

  }

  public UpdateMemberAssetAccessBody (List<UpdateMemberAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
  }

    
  @JsonProperty("accesses")
  public List<UpdateMemberAssetAccessBodyAccessesInner> getAccesses() {
    return accesses;
  }
  public void setAccesses(List<UpdateMemberAssetAccessBodyAccessesInner> accesses) {
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
    UpdateMemberAssetAccessBody updateMemberAssetAccessBody = (UpdateMemberAssetAccessBody) o;
    return Objects.equals(accesses, updateMemberAssetAccessBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetAccessBody {\n");
    
    sb.append("    accesses: ").append(toIndentedString(accesses)).append("\n");
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
