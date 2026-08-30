package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetGroupDeleteError;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssetGroupDeletion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupDeletion {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> deletedAssetGroups = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<@Valid AssetGroupDeleteError>> exceptions = JsonNullable.<List<@Valid AssetGroupDeleteError>>undefined();

  public AssetGroupDeletion deletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
    return this;
  }

  public AssetGroupDeletion addDeletedAssetGroupsItem(String deletedAssetGroupsItem) {
    if (this.deletedAssetGroups == null) {
      this.deletedAssetGroups = new ArrayList<>();
    }
    this.deletedAssetGroups.add(deletedAssetGroupsItem);
    return this;
  }

  /**
   * Get deletedAssetGroups
   * @return deletedAssetGroups
   */
  
  @Schema(name = "deleted_asset_groups", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted_asset_groups")
  public List<String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }

  @JsonProperty("deleted_asset_groups")
  public void setDeletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

  public AssetGroupDeletion exceptions(List<@Valid AssetGroupDeleteError> exceptions) {
    this.exceptions = JsonNullable.of(exceptions);
    return this;
  }

  public AssetGroupDeletion addExceptionsItem(AssetGroupDeleteError exceptionsItem) {
    if (this.exceptions == null || !this.exceptions.isPresent()) {
      this.exceptions = JsonNullable.of(new ArrayList<>());
    }
    this.exceptions.get().add(exceptionsItem);
    return this;
  }

  /**
   * Get exceptions
   * @return exceptions
   */
  @Valid 
  @Schema(name = "exceptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptions")
  public JsonNullable<List<@Valid AssetGroupDeleteError>> getExceptions() {
    return exceptions;
  }

  public void setExceptions(JsonNullable<List<@Valid AssetGroupDeleteError>> exceptions) {
    this.exceptions = exceptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetGroupDeletion assetGroupDeletion = (AssetGroupDeletion) o;
    return Objects.equals(this.deletedAssetGroups, assetGroupDeletion.deletedAssetGroups) &&
        equalsNullable(this.exceptions, assetGroupDeletion.exceptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAssetGroups, hashCodeNullable(exceptions));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupDeletion {\n");
    sb.append("    deletedAssetGroups: ").append(toIndentedString(deletedAssetGroups)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

