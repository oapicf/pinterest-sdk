package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.UpdatePartnerAssetAccessItem;

/**
 * An object with a list of partner asset accesses to assign or update.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePartnerAssetAccessBody   {
  
  private List<UpdatePartnerAssetAccessItem> accesses = new ArrayList<>();

  public UpdatePartnerAssetAccessBody () {

  }

  public UpdatePartnerAssetAccessBody (List<UpdatePartnerAssetAccessItem> accesses) {
    this.accesses = accesses;
  }

    
  @JsonProperty("accesses")
  public List<UpdatePartnerAssetAccessItem> getAccesses() {
    return accesses;
  }
  public void setAccesses(List<UpdatePartnerAssetAccessItem> accesses) {
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
    UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody = (UpdatePartnerAssetAccessBody) o;
    return Objects.equals(accesses, updatePartnerAssetAccessBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetAccessBody {\n");
    
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
