package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Country;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdAccountCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdAccountCreateRequest {

  private @Nullable Country country;

  private @Nullable String name;

  private @Nullable String ownerUserId;

  public AdAccountCreateRequest country(@Nullable Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @Valid 
  @Schema(name = "country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public @Nullable Country getCountry() {
    return country;
  }

  public void setCountry(@Nullable Country country) {
    this.country = country;
  }

  public AdAccountCreateRequest name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Ad Account name.
   * @return name
   */
  @Size(max = 256) 
  @Schema(name = "name", example = "ACME Tools", description = "Ad Account name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public AdAccountCreateRequest ownerUserId(@Nullable String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

  /**
   * Advertiser's owning user ID.
   * @return ownerUserId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "owner_user_id", example = "383791336903426391", description = "Advertiser's owning user ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner_user_id")
  public @Nullable String getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(@Nullable String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountCreateRequest adAccountCreateRequest = (AdAccountCreateRequest) o;
    return Objects.equals(this.country, adAccountCreateRequest.country) &&
        Objects.equals(this.name, adAccountCreateRequest.name) &&
        Objects.equals(this.ownerUserId, adAccountCreateRequest.ownerUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, name, ownerUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCreateRequest {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
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

