package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeleteAssetGroupResponseExceptionsInner;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeleteAssetGroupResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteAssetGroupResponse {

  @Valid
  private List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups = new ArrayList<>();

  @Valid
  private JsonNullable<List<@Valid DeleteAssetGroupResponseExceptionsInner>> exceptions = JsonNullable.<List<@Valid DeleteAssetGroupResponseExceptionsInner>>undefined();

  public DeleteAssetGroupResponse deletedAssetGroups(List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
    return this;
  }

  public DeleteAssetGroupResponse addDeletedAssetGroupsItem(String deletedAssetGroupsItem) {
    if (this.deletedAssetGroups == null) {
      this.deletedAssetGroups = new ArrayList<>();
    }
    this.deletedAssetGroups.add(deletedAssetGroupsItem);
    return this;
  }

  /**
   * A list of ids of successfully deleted asset groups.
   * @return deletedAssetGroups
   */
  
  @Schema(name = "deleted_asset_groups", description = "A list of ids of successfully deleted asset groups.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted_asset_groups")
  public List<@Pattern(regexp = "^\\d+$")String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }

  public void setDeletedAssetGroups(List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

  public DeleteAssetGroupResponse exceptions(List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = JsonNullable.of(exceptions);
    return this;
  }

  public DeleteAssetGroupResponse addExceptionsItem(DeleteAssetGroupResponseExceptionsInner exceptionsItem) {
    if (this.exceptions == null || !this.exceptions.isPresent()) {
      this.exceptions = JsonNullable.of(new ArrayList<>());
    }
    this.exceptions.get().add(exceptionsItem);
    return this;
  }

  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
   */
  @Valid 
  @Schema(name = "exceptions", description = "A list of errors associated with the asset groups. Will be returned if there is an error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptions")
  public JsonNullable<List<@Valid DeleteAssetGroupResponseExceptionsInner>> getExceptions() {
    return exceptions;
  }

  public void setExceptions(JsonNullable<List<@Valid DeleteAssetGroupResponseExceptionsInner>> exceptions) {
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
    DeleteAssetGroupResponse deleteAssetGroupResponse = (DeleteAssetGroupResponse) o;
    return Objects.equals(this.deletedAssetGroups, deleteAssetGroupResponse.deletedAssetGroups) &&
        equalsNullable(this.exceptions, deleteAssetGroupResponse.exceptions);
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
    sb.append("class DeleteAssetGroupResponse {\n");
    sb.append("    deletedAssetGroups: ").append(toIndentedString(deletedAssetGroups)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

