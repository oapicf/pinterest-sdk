package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeletePartnerAssetAccessItem;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * An object with a list of partner asset accesses to delete.
 */

@Schema(name = "DeletePartnerAssetAccessBody", description = "An object with a list of partner asset accesses to delete.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeletePartnerAssetAccessBody {

  private List<@Valid DeletePartnerAssetAccessItem> accesses = new ArrayList<>();

  public DeletePartnerAssetAccessBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeletePartnerAssetAccessBody(List<@Valid DeletePartnerAssetAccessItem> accesses) {
    this.accesses = accesses;
  }

  public DeletePartnerAssetAccessBody accesses(List<@Valid DeletePartnerAssetAccessItem> accesses) {
    this.accesses = accesses;
    return this;
  }

  public DeletePartnerAssetAccessBody addAccessesItem(DeletePartnerAssetAccessItem accessesItem) {
    if (this.accesses == null) {
      this.accesses = new ArrayList<>();
    }
    this.accesses.add(accessesItem);
    return this;
  }

  /**
   * List of partner asset accesses to delete.
   * @return accesses
   */
  @NotNull @Valid @Size(min = 1, max = 50) 
  @Schema(name = "accesses", description = "List of partner asset accesses to delete.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accesses")
  public List<@Valid DeletePartnerAssetAccessItem> getAccesses() {
    return accesses;
  }

  @JsonProperty("accesses")
  public void setAccesses(List<@Valid DeletePartnerAssetAccessItem> accesses) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

