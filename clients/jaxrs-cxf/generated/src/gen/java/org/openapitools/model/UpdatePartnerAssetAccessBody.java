package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePartnerAssetAccessItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object with a list of partner asset accesses to assign or update.
 */
@ApiModel(description="An object with a list of partner asset accesses to assign or update.")

public class UpdatePartnerAssetAccessBody  {
  
 /**
  * List of partner asset accesses to assign or update.
  */
  @ApiModelProperty(required = true, value = "List of partner asset accesses to assign or update.")

  @Valid

  private List<@Valid UpdatePartnerAssetAccessItem> accesses = new ArrayList<>();
 /**
   * List of partner asset accesses to assign or update.
   * @return accesses
  **/
  @JsonProperty("accesses")
  @NotNull
 @Size(min=1,max=50)  public List<@Valid UpdatePartnerAssetAccessItem> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<@Valid UpdatePartnerAssetAccessItem> accesses) {
    this.accesses = accesses;
  }

  public UpdatePartnerAssetAccessBody accesses(List<@Valid UpdatePartnerAssetAccessItem> accesses) {
    this.accesses = accesses;
    return this;
  }

  public UpdatePartnerAssetAccessBody addAccessesItem(UpdatePartnerAssetAccessItem accessesItem) {
    this.accesses.add(accessesItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody = (UpdatePartnerAssetAccessBody) o;
    return Objects.equals(this.accesses, updatePartnerAssetAccessBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetAccessBody {\n");
    
    sb.append("    accesses: ").append(toIndentedString(accesses)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

