package apimodels;

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
 * Request body used to delete asset groups
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeleteAssetGroupBody   {
  @JsonProperty("asset_groups_to_delete")
  @NotNull
@Size(min=1,max=50)

  private List<@Pattern(regexp = "^\\d+$")String> assetGroupsToDelete = new ArrayList<>();

  public DeleteAssetGroupBody assetGroupsToDelete(List<@Pattern(regexp = "^\\d+$")String> assetGroupsToDelete) {
    this.assetGroupsToDelete = assetGroupsToDelete;
    return this;
  }

  public DeleteAssetGroupBody addAssetGroupsToDeleteItem(String assetGroupsToDeleteItem) {
    if (this.assetGroupsToDelete == null) {
      this.assetGroupsToDelete = new ArrayList<>();
    }
    this.assetGroupsToDelete.add(assetGroupsToDeleteItem);
    return this;
  }

   /**
   * List of ids of asset groups to be deleted
   * @return assetGroupsToDelete
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getAssetGroupsToDelete() {
    return assetGroupsToDelete;
  }

  public void setAssetGroupsToDelete(List<@Pattern(regexp = "^\\d+$")String> assetGroupsToDelete) {
    this.assetGroupsToDelete = assetGroupsToDelete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAssetGroupBody deleteAssetGroupBody = (DeleteAssetGroupBody) o;
    return Objects.equals(assetGroupsToDelete, deleteAssetGroupBody.assetGroupsToDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupsToDelete);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAssetGroupBody {\n");
    
    sb.append("    assetGroupsToDelete: ").append(toIndentedString(assetGroupsToDelete)).append("\n");
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

