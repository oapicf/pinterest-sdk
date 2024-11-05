package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequestAccessesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BusinessMembersAssetAccessDeleteRequest
 */

@JsonTypeName("business_members_asset_access_delete_request")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessMembersAssetAccessDeleteRequest {

  @Valid
  private List<@Valid BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses = new ArrayList<>();

  public BusinessMembersAssetAccessDeleteRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BusinessMembersAssetAccessDeleteRequest(List<@Valid BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses) {
    this.accesses = accesses;
  }

  public BusinessMembersAssetAccessDeleteRequest accesses(List<@Valid BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  public BusinessMembersAssetAccessDeleteRequest addAccessesItem(BusinessMembersAssetAccessDeleteRequestAccessesInner accessesItem) {
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
  public List<@Valid BusinessMembersAssetAccessDeleteRequestAccessesInner> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<@Valid BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses) {
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
    BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest = (BusinessMembersAssetAccessDeleteRequest) o;
    return Objects.equals(this.accesses, businessMembersAssetAccessDeleteRequest.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMembersAssetAccessDeleteRequest {\n");
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

