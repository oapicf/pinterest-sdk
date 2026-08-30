package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.DeletePartnerAssetAccessItem;

/**
 * An object with a list of partner asset accesses to delete.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePartnerAssetAccessBody   {
  
  private List<DeletePartnerAssetAccessItem> accesses = new ArrayList<>();

  public DeletePartnerAssetAccessBody () {

  }

  public DeletePartnerAssetAccessBody (List<DeletePartnerAssetAccessItem> accesses) {
    this.accesses = accesses;
  }

    
  @JsonProperty("accesses")
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
    return Objects.equals(accesses, deletePartnerAssetAccessBody.accesses);
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
