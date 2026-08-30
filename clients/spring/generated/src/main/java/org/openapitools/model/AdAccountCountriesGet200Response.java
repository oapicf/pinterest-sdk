package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdAccountsCountry;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdAccountCountriesGet200Response
 */

@JsonTypeName("ad_account_countries_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountCountriesGet200Response {

  private List<@Valid AdAccountsCountry> items = new ArrayList<>();

  public AdAccountCountriesGet200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdAccountCountriesGet200Response(List<@Valid AdAccountsCountry> items) {
    this.items = items;
  }

  public AdAccountCountriesGet200Response items(List<@Valid AdAccountsCountry> items) {
    this.items = items;
    return this;
  }

  public AdAccountCountriesGet200Response addItemsItem(AdAccountsCountry itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @NotNull @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid AdAccountsCountry> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid AdAccountsCountry> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountCountriesGet200Response adAccountCountriesGet200Response = (AdAccountCountriesGet200Response) o;
    return Objects.equals(this.items, adAccountCountriesGet200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCountriesGet200Response {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

