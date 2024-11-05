package apimodels;

import apimodels.BusinessMembersAssetAccessDeleteRequestAccessesInner;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * BusinessMembersAssetAccessDeleteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BusinessMembersAssetAccessDeleteRequest   {
  @JsonProperty("accesses")
  @NotNull
@Size(min=1,max=100)
@Valid

  private List<@Valid BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses = new ArrayList<>();

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
  **/
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
    return Objects.equals(accesses, businessMembersAssetAccessDeleteRequest.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

