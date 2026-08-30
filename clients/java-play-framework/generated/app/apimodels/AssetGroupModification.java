package apimodels;

import apimodels.AssetGroupBinding;
import apimodels.AssetGroupUpdateError;
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
 * AssetGroupModification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssetGroupModification   {
  @JsonProperty("exceptions")
  @Valid

  private List<@Valid AssetGroupUpdateError> exceptions = null;

  @JsonProperty("updated_asset_groups")
  @Valid

  private List<@Valid AssetGroupBinding> updatedAssetGroups = null;

  public AssetGroupModification exceptions(List<@Valid AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public AssetGroupModification addExceptionsItem(AssetGroupUpdateError exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

   /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
  **/
  public List<@Valid AssetGroupUpdateError> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<@Valid AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
  }

  public AssetGroupModification updatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
    return this;
  }

  public AssetGroupModification addUpdatedAssetGroupsItem(AssetGroupBinding updatedAssetGroupsItem) {
    if (this.updatedAssetGroups == null) {
      this.updatedAssetGroups = new ArrayList<>();
    }
    this.updatedAssetGroups.add(updatedAssetGroupsItem);
    return this;
  }

   /**
   * A list of successfully edited asset groups.
   * @return updatedAssetGroups
  **/
  public List<@Valid AssetGroupBinding> getUpdatedAssetGroups() {
    return updatedAssetGroups;
  }

  public void setUpdatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetGroupModification assetGroupModification = (AssetGroupModification) o;
    return Objects.equals(exceptions, assetGroupModification.exceptions) &&
        Objects.equals(updatedAssetGroups, assetGroupModification.updatedAssetGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions, updatedAssetGroups);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupModification {\n");
    
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    updatedAssetGroups: ").append(toIndentedString(updatedAssetGroups)).append("\n");
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

