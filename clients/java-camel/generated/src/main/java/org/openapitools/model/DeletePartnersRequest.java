package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeletePartnersRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnersRequest {

  @Valid
  private List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds = new ArrayList<>();

  private JsonNullable<String> partnerType = JsonNullable.<String>undefined();

  public DeletePartnersRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeletePartnersRequest(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
  }

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
   */
  @NotNull @Size(min = 1, max = 50) 
  @Schema(name = "partner_ids", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partner_ids")
  public List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> getPartnerIds() {
    return partnerIds;
  }

  public void setPartnerIds(List<@Pattern(regexp = "^\\d+$")@Size(max = 22)String> partnerIds) {
    this.partnerIds = partnerIds;
  }

  public DeletePartnersRequest partnerType(String partnerType) {
    this.partnerType = JsonNullable.of(partnerType);
    return this;
  }

  /**
   * Get partnerType
   * @return partnerType
   */
  
  @Schema(name = "partner_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_type")
  public JsonNullable<String> getPartnerType() {
    return partnerType;
  }

  public void setPartnerType(JsonNullable<String> partnerType) {
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
    return Objects.equals(this.partnerIds, deletePartnersRequest.partnerIds) &&
        equalsNullable(this.partnerType, deletePartnersRequest.partnerType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerIds, hashCodeNullable(partnerType));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

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

