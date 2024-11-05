package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request body used to delete asset groups
 */

@Schema(name = "DeleteAssetGroupBody", description = "Request body used to delete asset groups")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteAssetGroupBody {

  @Valid
  private List<@Pattern(regexp = "^\\d+$")String> assetGroupsToDelete = new ArrayList<>();

  public DeleteAssetGroupBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeleteAssetGroupBody(List<@Pattern(regexp = "^\\d+$")String> assetGroupsToDelete) {
    this.assetGroupsToDelete = assetGroupsToDelete;
  }

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
   */
  @NotNull @Size(min = 1, max = 50) 
  @Schema(name = "asset_groups_to_delete", example = "[\"666791336903426391\",\"666791336903426392\"]", description = "List of ids of asset groups to be deleted", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_groups_to_delete")
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
    return Objects.equals(this.assetGroupsToDelete, deleteAssetGroupBody.assetGroupsToDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupsToDelete);
  }

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

