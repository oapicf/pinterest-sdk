package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupUpdateError;
import org.openapitools.model.AssetGroupUpdateItemReadOrUpdateItem;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssetGroupModificationReadOrUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupModificationReadOrUpdate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid AssetGroupUpdateError> exceptions = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid AssetGroupBinding> updatedAssetGroups = new ArrayList<>();

  public AssetGroupModificationReadOrUpdate assetGroupsToUpdate(List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
    return this;
  }

  public AssetGroupModificationReadOrUpdate addAssetGroupsToUpdateItem(AssetGroupUpdateItemReadOrUpdateItem assetGroupsToUpdateItem) {
    if (this.assetGroupsToUpdate == null) {
      this.assetGroupsToUpdate = new ArrayList<>();
    }
    this.assetGroupsToUpdate.add(assetGroupsToUpdateItem);
    return this;
  }

  /**
   * A list of asset groups and the data that will be used to update them.
   * @return assetGroupsToUpdate
   */
  @Valid 
  @Schema(name = "asset_groups_to_update", description = "A list of asset groups and the data that will be used to update them.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_groups_to_update")
  public List<@Valid AssetGroupUpdateItemReadOrUpdateItem> getAssetGroupsToUpdate() {
    return assetGroupsToUpdate;
  }

  @JsonProperty("asset_groups_to_update")
  public void setAssetGroupsToUpdate(List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
  }

  public AssetGroupModificationReadOrUpdate exceptions(List<@Valid AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public AssetGroupModificationReadOrUpdate addExceptionsItem(AssetGroupUpdateError exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
   */
  @Valid 
  @Schema(name = "exceptions", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of errors associated with the asset groups. Will be returned if there is an error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptions")
  public List<@Valid AssetGroupUpdateError> getExceptions() {
    return exceptions;
  }

  @JsonProperty("exceptions")
  public void setExceptions(List<@Valid AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
  }

  public AssetGroupModificationReadOrUpdate updatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
    return this;
  }

  public AssetGroupModificationReadOrUpdate addUpdatedAssetGroupsItem(AssetGroupBinding updatedAssetGroupsItem) {
    if (this.updatedAssetGroups == null) {
      this.updatedAssetGroups = new ArrayList<>();
    }
    this.updatedAssetGroups.add(updatedAssetGroupsItem);
    return this;
  }

  /**
   * A list of successfully edited asset groups.
   * @return updatedAssetGroups
   */
  @Valid 
  @Schema(name = "updated_asset_groups", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of successfully edited asset groups.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_asset_groups")
  public List<@Valid AssetGroupBinding> getUpdatedAssetGroups() {
    return updatedAssetGroups;
  }

  @JsonProperty("updated_asset_groups")
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
    AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate = (AssetGroupModificationReadOrUpdate) o;
    return Objects.equals(this.assetGroupsToUpdate, assetGroupModificationReadOrUpdate.assetGroupsToUpdate) &&
        Objects.equals(this.exceptions, assetGroupModificationReadOrUpdate.exceptions) &&
        Objects.equals(this.updatedAssetGroups, assetGroupModificationReadOrUpdate.updatedAssetGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupsToUpdate, exceptions, updatedAssetGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupModificationReadOrUpdate {\n");
    sb.append("    assetGroupsToUpdate: ").append(toIndentedString(assetGroupsToUpdate)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    updatedAssetGroups: ").append(toIndentedString(updatedAssetGroups)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

