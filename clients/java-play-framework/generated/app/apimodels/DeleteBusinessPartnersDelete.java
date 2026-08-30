package apimodels;

import apimodels.NullablePartnerType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DeleteBusinessPartnersDelete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeleteBusinessPartnersDelete   {
  @JsonProperty("partner_ids")
  @NotNull
@Size(min=1,max=50)

  private List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds = new ArrayList<>();

  @JsonProperty("partner_type")
  @Valid

  private NullablePartnerType partnerType;

  public DeleteBusinessPartnersDelete partnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  public DeleteBusinessPartnersDelete addPartnerIdsItem(String partnerIdsItem) {
    if (this.partnerIds == null) {
      this.partnerIds = new ArrayList<>();
    }
    this.partnerIds.add(partnerIdsItem);
    return this;
  }

   /**
   * A list of partner ids to be deleted
   * @return partnerIds
  **/
  public List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> getPartnerIds() {
    return partnerIds;
  }

  public void setPartnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public DeleteBusinessPartnersDelete partnerType(NullablePartnerType partnerType) {
    this.partnerType = partnerType;
    return this;
  }

   /**
   * Get partnerType
   * @return partnerType
  **/
  public NullablePartnerType getPartnerType() {
    return partnerType;
  }

  public void setPartnerType(NullablePartnerType partnerType) {
    this.partnerType = partnerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteBusinessPartnersDelete deleteBusinessPartnersDelete = (DeleteBusinessPartnersDelete) o;
    return Objects.equals(partnerIds, deleteBusinessPartnersDelete.partnerIds) &&
        Objects.equals(partnerType, deleteBusinessPartnersDelete.partnerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerIds, partnerType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteBusinessPartnersDelete {\n");
    
    sb.append("    partnerIds: ").append(toIndentedString(partnerIds)).append("\n");
    sb.append("    partnerType: ").append(toIndentedString(partnerType)).append("\n");
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

