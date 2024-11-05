package apimodels;

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
 * DeletePartnersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeletePartnersRequest   {
  @JsonProperty("partner_ids")
  @NotNull
@Size(min=1,max=50)

  private List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds = new ArrayList<>();

  @JsonProperty("partner_type")
  
  private String partnerType;

  public DeletePartnersRequest partnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
    return this;
  }

  public DeletePartnersRequest addPartnerIdsItem(String partnerIdsItem) {
    if (this.partnerIds == null) {
      this.partnerIds = new ArrayList<>();
    }
    this.partnerIds.add(partnerIdsItem);
    return this;
  }

   /**
   * Get partnerIds
   * @return partnerIds
  **/
  public List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> getPartnerIds() {
    return partnerIds;
  }

  public void setPartnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public DeletePartnersRequest partnerType(String partnerType) {
    this.partnerType = partnerType;
    return this;
  }

   /**
   * Get partnerType
   * @return partnerType
  **/
  public String getPartnerType() {
    return partnerType;
  }

  public void setPartnerType(String partnerType) {
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
    DeletePartnersRequest deletePartnersRequest = (DeletePartnersRequest) o;
    return Objects.equals(partnerIds, deletePartnersRequest.partnerIds) &&
        Objects.equals(partnerType, deletePartnersRequest.partnerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerIds, partnerType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnersRequest {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

