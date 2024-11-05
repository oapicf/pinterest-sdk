package apimodels;

import apimodels.UpdateAssetGroupBodyAssetGroupsToUpdateInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateAssetGroupBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateAssetGroupBody   {
  @JsonProperty("asset_groups_to_update")
  @Valid

  private List<@Valid UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate = null;

  public UpdateAssetGroupBody assetGroupsToUpdate(List<@Valid UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
    return this;
  }

  public UpdateAssetGroupBody addAssetGroupsToUpdateItem(UpdateAssetGroupBodyAssetGroupsToUpdateInner assetGroupsToUpdateItem) {
    if (this.assetGroupsToUpdate == null) {
      this.assetGroupsToUpdate = new ArrayList<>();
    }
    this.assetGroupsToUpdate.add(assetGroupsToUpdateItem);
    return this;
  }

   /**
   * A list of asset groups and the data that will be used to update them.
   * @return assetGroupsToUpdate
  **/
  public List<@Valid UpdateAssetGroupBodyAssetGroupsToUpdateInner> getAssetGroupsToUpdate() {
    return assetGroupsToUpdate;
  }

  public void setAssetGroupsToUpdate(List<@Valid UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAssetGroupBody updateAssetGroupBody = (UpdateAssetGroupBody) o;
    return Objects.equals(assetGroupsToUpdate, updateAssetGroupBody.assetGroupsToUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupsToUpdate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetGroupBody {\n");
    
    sb.append("    assetGroupsToUpdate: ").append(toIndentedString(assetGroupsToUpdate)).append("\n");
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

