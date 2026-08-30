package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Country;
import org.openapitools.model.Currency;
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

@Schema(name = "AdAccountCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountCreate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Country country;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Currency currency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String ownerUserId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String timeZone;

  public AdAccountCreate country(@Nullable Country country) {
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

  @JsonProperty("country")
  public void setCountry(@Nullable Country country) {
    this.country = country;
  }

  public AdAccountCreate currency(@Nullable Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public @Nullable Currency getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(@Nullable Currency currency) {
    this.currency = currency;
  }

  public AdAccountCreate name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Ad account name.
   * @return name
   */
  @Size(max = 256) 
  @Schema(name = "name", description = "Ad account name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public AdAccountCreate ownerUserId(@Nullable String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

  /**
   * Advertiser's owning user ID.
   * @return ownerUserId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "owner_user_id", description = "Advertiser's owning user ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner_user_id")
  public @Nullable String getOwnerUserId() {
    return ownerUserId;
  }

  @JsonProperty("owner_user_id")
  public void setOwnerUserId(@Nullable String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public AdAccountCreate timeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
   * @return timeZone
   */
  
  @Schema(name = "time_zone", example = "America/Los_Angeles", description = "The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time_zone")
  public @Nullable String getTimeZone() {
    return timeZone;
  }

  @JsonProperty("time_zone")
  public void setTimeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountCreate adAccountCreate = (AdAccountCreate) o;
    return Objects.equals(this.country, adAccountCreate.country) &&
        Objects.equals(this.currency, adAccountCreate.currency) &&
        Objects.equals(this.name, adAccountCreate.name) &&
        Objects.equals(this.ownerUserId, adAccountCreate.ownerUserId) &&
        Objects.equals(this.timeZone, adAccountCreate.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, currency, name, ownerUserId, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCreate {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

