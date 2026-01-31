package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceRule;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Audience
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Audience {

  private @Nullable String adAccountId;

  private @Nullable String audienceType;

  private JsonNullable<String> createdByCompanyName = JsonNullable.<String>undefined();

  private JsonNullable<Integer> createdTimestamp = JsonNullable.<Integer>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private @Nullable String id;

  private @Nullable String name;

  private @Nullable AudienceRule rule;

  private JsonNullable<Integer> size = JsonNullable.<Integer>undefined();

  private @Nullable String status;

  private @Nullable String type;

  private JsonNullable<Integer> updatedTimestamp = JsonNullable.<Integer>undefined();

  public Audience adAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Ad account ID.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "Ad account ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public @Nullable String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public Audience audienceType(@Nullable String audienceType) {
    this.audienceType = audienceType;
    return this;
  }

  /**
   * <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   * @return audienceType
   */
  
  @Schema(name = "audience_type", description = "<a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audience_type")
  public @Nullable String getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(@Nullable String audienceType) {
    this.audienceType = audienceType;
  }

  public Audience createdByCompanyName(String createdByCompanyName) {
    this.createdByCompanyName = JsonNullable.of(createdByCompanyName);
    return this;
  }

  /**
   * The company that created this audience.
   * @return createdByCompanyName
   */
  
  @Schema(name = "created_by_company_name", example = "Pinterest", description = "The company that created this audience.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by_company_name")
  public JsonNullable<String> getCreatedByCompanyName() {
    return createdByCompanyName;
  }

  public void setCreatedByCompanyName(JsonNullable<String> createdByCompanyName) {
    this.createdByCompanyName = createdByCompanyName;
  }

  public Audience createdTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = JsonNullable.of(createdTimestamp);
    return this;
  }

  /**
   * Creation time. Unix timestamp in seconds.
   * @return createdTimestamp
   */
  
  @Schema(name = "created_timestamp", example = "1451431341", description = "Creation time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_timestamp")
  public JsonNullable<Integer> getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(JsonNullable<Integer> createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  public Audience description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Audience description.
   * @return description
   */
  
  @Schema(name = "description", example = "People who love making quilts.", description = "Audience description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public Audience id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Audience ID.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "1234", description = "Audience ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public Audience name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Audience name.
   * @return name
   */
  
  @Schema(name = "name", example = "ACME Tools", description = "Audience name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Audience rule(@Nullable AudienceRule rule) {
    this.rule = rule;
    return this;
  }

  /**
   * Get rule
   * @return rule
   */
  @Valid 
  @Schema(name = "rule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rule")
  public @Nullable AudienceRule getRule() {
    return rule;
  }

  public void setRule(@Nullable AudienceRule rule) {
    this.rule = rule;
  }

  public Audience size(Integer size) {
    this.size = JsonNullable.of(size);
    return this;
  }

  /**
   * Audience size.
   * @return size
   */
  
  @Schema(name = "size", example = "1000", description = "Audience size.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public JsonNullable<Integer> getSize() {
    return size;
  }

  public void setSize(JsonNullable<Integer> size) {
    this.size = size;
  }

  public Audience status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
   * @return status
   */
  
  @Schema(name = "status", description = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  public Audience type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"audience\".
   * @return type
   */
  
  @Schema(name = "type", example = "audience", description = "Always \"audience\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public Audience updatedTimestamp(Integer updatedTimestamp) {
    this.updatedTimestamp = JsonNullable.of(updatedTimestamp);
    return this;
  }

  /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTimestamp
   */
  
  @Schema(name = "updated_timestamp", example = "1451431341", description = "Last update time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_timestamp")
  public JsonNullable<Integer> getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  public void setUpdatedTimestamp(JsonNullable<Integer> updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Audience audience = (Audience) o;
    return Objects.equals(this.adAccountId, audience.adAccountId) &&
        Objects.equals(this.audienceType, audience.audienceType) &&
        equalsNullable(this.createdByCompanyName, audience.createdByCompanyName) &&
        equalsNullable(this.createdTimestamp, audience.createdTimestamp) &&
        equalsNullable(this.description, audience.description) &&
        Objects.equals(this.id, audience.id) &&
        Objects.equals(this.name, audience.name) &&
        Objects.equals(this.rule, audience.rule) &&
        equalsNullable(this.size, audience.size) &&
        Objects.equals(this.status, audience.status) &&
        Objects.equals(this.type, audience.type) &&
        equalsNullable(this.updatedTimestamp, audience.updatedTimestamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceType, hashCodeNullable(createdByCompanyName), hashCodeNullable(createdTimestamp), hashCodeNullable(description), id, name, rule, hashCodeNullable(size), status, type, hashCodeNullable(updatedTimestamp));
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
    sb.append("class Audience {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    createdByCompanyName: ").append(toIndentedString(createdByCompanyName)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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

