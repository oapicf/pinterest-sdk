package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeleteMemberAssetAccessItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * An object with a list of member asset accesses to delete.
 */

@Schema(name = "BusinessMembersAssetAccessDeleteBody", description = "An object with a list of member asset accesses to delete.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessMembersAssetAccessDeleteBody {

  @Valid
  private List<@Valid DeleteMemberAssetAccessItem> accesses = new ArrayList<>();

  public BusinessMembersAssetAccessDeleteBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BusinessMembersAssetAccessDeleteBody(List<@Valid DeleteMemberAssetAccessItem> accesses) {
    this.accesses = accesses;
  }

  public BusinessMembersAssetAccessDeleteBody accesses(List<@Valid DeleteMemberAssetAccessItem> accesses) {
    this.accesses = accesses;
    return this;
  }

  public BusinessMembersAssetAccessDeleteBody addAccessesItem(DeleteMemberAssetAccessItem accessesItem) {
    if (this.accesses == null) {
      this.accesses = new ArrayList<>();
    }
    this.accesses.add(accessesItem);
    return this;
  }

  /**
   * List of members asset access to be deleted
   * @return accesses
   */
  @NotNull @Valid @Size(min = 1, max = 100) 
  @Schema(name = "accesses", description = "List of members asset access to be deleted", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accesses")
  public List<@Valid DeleteMemberAssetAccessItem> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<@Valid DeleteMemberAssetAccessItem> accesses) {
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
    BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody = (BusinessMembersAssetAccessDeleteBody) o;
    return Objects.equals(this.accesses, businessMembersAssetAccessDeleteBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMembersAssetAccessDeleteBody {\n");
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

