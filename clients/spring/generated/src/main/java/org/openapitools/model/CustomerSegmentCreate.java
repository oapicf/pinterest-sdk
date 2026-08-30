package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "CustomerSegmentCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerSegmentCreate {

  private List<String> audienceIds = new ArrayList<>();

  private String name;

  public CustomerSegmentCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerSegmentCreate(List<String> audienceIds, String name) {
    this.audienceIds = audienceIds;
    this.name = name;
  }

  public CustomerSegmentCreate audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  public CustomerSegmentCreate addAudienceIdsItem(String audienceIdsItem) {
    if (this.audienceIds == null) {
      this.audienceIds = new ArrayList<>();
    }
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

  /**
   * Audience IDs included in the customer segment.
   * @return audienceIds
   */
  @NotNull 
  @Schema(name = "audience_ids", description = "Audience IDs included in the customer segment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("audience_ids")
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  @JsonProperty("audience_ids")
  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  public CustomerSegmentCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Customer segment name.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Customer segment name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSegmentCreate customerSegmentCreate = (CustomerSegmentCreate) o;
    return Objects.equals(this.audienceIds, customerSegmentCreate.audienceIds) &&
        Objects.equals(this.name, customerSegmentCreate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceIds, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSegmentCreate {\n");
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

