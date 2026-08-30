package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssetGroupDeletionDelete
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupDeletionDelete {

  private List<@Pattern(regexp = "^\\d+$")String> assetGroupsToDelete = new ArrayList<>();

  public AssetGroupDeletionDelete() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AssetGroupDeletionDelete(List<@Pattern(regexp = "^\\d+$")String> assetGroupsToDelete) {
    this.assetGroupsToDelete = assetGroupsToDelete;
  }

  public AssetGroupDeletionDelete assetGroupsToDelete(List<@Pattern(regexp = "^\\d+$")String> assetGroupsToDelete) {
    this.assetGroupsToDelete = assetGroupsToDelete;
    return this;
  }

  public AssetGroupDeletionDelete addAssetGroupsToDeleteItem(String assetGroupsToDeleteItem) {
    if (this.assetGroupsToDelete == null) {
      this.assetGroupsToDelete = new ArrayList<>();
    }
    this.assetGroupsToDelete.add(assetGroupsToDeleteItem);
    return this;
  }

  /**
   * Get assetGroupsToDelete
   * @return assetGroupsToDelete
   */
  @NotNull @Size(min = 1, max = 50) 
  @Schema(name = "asset_groups_to_delete", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_groups_to_delete")
  public List<@Pattern(regexp = "^\\d+$")String> getAssetGroupsToDelete() {
    return assetGroupsToDelete;
  }

  @JsonProperty("asset_groups_to_delete")
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
    AssetGroupDeletionDelete assetGroupDeletionDelete = (AssetGroupDeletionDelete) o;
    return Objects.equals(this.assetGroupsToDelete, assetGroupDeletionDelete.assetGroupsToDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupsToDelete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupDeletionDelete {\n");
    sb.append("    assetGroupsToDelete: ").append(toIndentedString(assetGroupsToDelete)).append("\n");
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

