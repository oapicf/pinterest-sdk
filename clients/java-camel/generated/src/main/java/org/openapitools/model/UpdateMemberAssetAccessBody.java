package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateMemberAssetAccessBodyAccessesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An object with a list of all the new accesses.
 */

@Schema(name = "UpdateMemberAssetAccessBody", description = "An object with a list of all the new accesses.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateMemberAssetAccessBody {

  @Valid
  private List<@Valid UpdateMemberAssetAccessBodyAccessesInner> accesses = new ArrayList<>();

  public UpdateMemberAssetAccessBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateMemberAssetAccessBody(List<@Valid UpdateMemberAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
  }

  public UpdateMemberAssetAccessBody accesses(List<@Valid UpdateMemberAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  public UpdateMemberAssetAccessBody addAccessesItem(UpdateMemberAssetAccessBodyAccessesInner accessesItem) {
    if (this.accesses == null) {
      this.accesses = new ArrayList<>();
    }
    this.accesses.add(accessesItem);
    return this;
  }

  /**
   * Get accesses
   * @return accesses
   */
  @NotNull @Valid @Size(min = 1, max = 50) 
  @Schema(name = "accesses", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accesses")
  public List<@Valid UpdateMemberAssetAccessBodyAccessesInner> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<@Valid UpdateMemberAssetAccessBodyAccessesInner> accesses) {
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
    UpdateMemberAssetAccessBody updateMemberAssetAccessBody = (UpdateMemberAssetAccessBody) o;
    return Objects.equals(this.accesses, updateMemberAssetAccessBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetAccessBody {\n");
    sb.append("    accesses: ").append(toIndentedString(accesses)).append("\n");
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

