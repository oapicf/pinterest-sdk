package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateMemberAssetAccessItem;

/**
 * An object with a list of all the new member asset accesses.
 */
@ApiModel(description = "An object with a list of all the new member asset accesses.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UpdateMemberAssetAccessBody   {
  @JsonProperty("accesses")
  private List<@Valid UpdateMemberAssetAccessItem> accesses = new ArrayList<>();

  public UpdateMemberAssetAccessBody accesses(List<@Valid UpdateMemberAssetAccessItem> accesses) {
    this.accesses = accesses;
    return this;
  }

  public UpdateMemberAssetAccessBody addAccessesItem(UpdateMemberAssetAccessItem accessesItem) {
    this.accesses.add(accessesItem);
    return this;
  }

   /**
   * List of member asset accesses to assign or update.
   * @return accesses
  **/
  @ApiModelProperty(required = true, value = "List of member asset accesses to assign or update.")
  public List<@Valid UpdateMemberAssetAccessItem> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<@Valid UpdateMemberAssetAccessItem> accesses) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

