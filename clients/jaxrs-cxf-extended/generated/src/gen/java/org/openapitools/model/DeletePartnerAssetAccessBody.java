package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeletePartnerAssetAccessItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An object with a list of partner asset accesses to delete.
 */
@ApiModel(description="An object with a list of partner asset accesses to delete.")

public class DeletePartnerAssetAccessBody  {
  
 /**
  * List of partner asset accesses to delete.
  */
  @ApiModelProperty(required = true, value = "List of partner asset accesses to delete.")
  @Valid
  private List<@Valid DeletePartnerAssetAccessItem> accesses = new ArrayList<>();
 /**
  * List of partner asset accesses to delete.
  * @return accesses
  */
  @JsonProperty("accesses")
  @NotNull
 @Size(min=1,max=50)  public List<@Valid DeletePartnerAssetAccessItem> getAccesses() {
    return accesses;
  }

  /**
   * Sets the <code>accesses</code> property.
   */
 public void setAccesses(List<@Valid DeletePartnerAssetAccessItem> accesses) {
    this.accesses = accesses;
  }

  /**
   * Sets the <code>accesses</code> property.
   */
  public DeletePartnerAssetAccessBody accesses(List<@Valid DeletePartnerAssetAccessItem> accesses) {
    this.accesses = accesses;
    return this;
  }

  /**
   * Adds a new item to the <code>accesses</code> list.
   */
  public DeletePartnerAssetAccessBody addAccessesItem(DeletePartnerAssetAccessItem accessesItem) {
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
    DeletePartnerAssetAccessBody deletePartnerAssetAccessBody = (DeletePartnerAssetAccessBody) o;
    return Objects.equals(this.accesses, deletePartnerAssetAccessBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessBody {\n");
    
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

