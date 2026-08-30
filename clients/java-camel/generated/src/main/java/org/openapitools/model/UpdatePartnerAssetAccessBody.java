package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePartnerAssetAccessItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * An object with a list of partner asset accesses to assign or update.
 */

@Schema(name = "UpdatePartnerAssetAccessBody", description = "An object with a list of partner asset accesses to assign or update.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UpdatePartnerAssetAccessBody {

  @Valid
  private List<@Valid UpdatePartnerAssetAccessItem> accesses = new ArrayList<>();

  public UpdatePartnerAssetAccessBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdatePartnerAssetAccessBody(List<@Valid UpdatePartnerAssetAccessItem> accesses) {
    this.accesses = accesses;
  }

  public UpdatePartnerAssetAccessBody accesses(List<@Valid UpdatePartnerAssetAccessItem> accesses) {
    this.accesses = accesses;
    return this;
  }

  public UpdatePartnerAssetAccessBody addAccessesItem(UpdatePartnerAssetAccessItem accessesItem) {
    if (this.accesses == null) {
      this.accesses = new ArrayList<>();
    }
    this.accesses.add(accessesItem);
    return this;
  }

  /**
   * List of partner asset accesses to assign or update.
   * @return accesses
   */
  @NotNull @Valid @Size(min = 1, max = 50) 
  @Schema(name = "accesses", description = "List of partner asset accesses to assign or update.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accesses")
  public List<@Valid UpdatePartnerAssetAccessItem> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<@Valid UpdatePartnerAssetAccessItem> accesses) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

