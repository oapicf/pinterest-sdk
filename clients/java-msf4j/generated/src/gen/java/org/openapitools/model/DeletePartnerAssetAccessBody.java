package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeletePartnerAssetAccessBodyAccessesInner;

/**
 * DeletePartnerAssetAccessBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnerAssetAccessBody   {
  @JsonProperty("accesses")
  private List<@Valid DeletePartnerAssetAccessBodyAccessesInner> accesses = new ArrayList<>();

  public DeletePartnerAssetAccessBody accesses(List<@Valid DeletePartnerAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  public DeletePartnerAssetAccessBody addAccessesItem(DeletePartnerAssetAccessBodyAccessesInner accessesItem) {
    this.accesses.add(accessesItem);
    return this;
  }

   /**
   * Get accesses
   * @return accesses
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid DeletePartnerAssetAccessBodyAccessesInner> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<@Valid DeletePartnerAssetAccessBodyAccessesInner> accesses) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

