package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdAccountsAudienceRule;
import org.openapitools.model.AudienceStatus;
import org.openapitools.model.AudienceType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdAccountsAudience
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsAudience {

  private String adAccountId;

  private AudienceType audienceType;

  private JsonNullable<String> createdByCompanyName = JsonNullable.<String>undefined();

  private JsonNullable<Integer> createdTimestamp = JsonNullable.<Integer>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private String id;

  private Boolean isNca;

  private String name;

  private AdAccountsAudienceRule rule;

  private JsonNullable<Integer> size = JsonNullable.<Integer>undefined();

  private AudienceStatus status;

  private String type;

  private JsonNullable<Integer> updatedTimestamp = JsonNullable.<Integer>undefined();

  public AdAccountsAudience() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdAccountsAudience(String id) {
    this.id = id;
  }

  public AdAccountsAudience adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Ad account ID.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", description = "Ad account ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdAccountsAudience audienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

  /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   * @return audienceType
   */
  @Valid 
  @Schema(name = "audience_type", description = "[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audience_type")
  public AudienceType getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
  }

  public AdAccountsAudience createdByCompanyName(String createdByCompanyName) {
    this.createdByCompanyName = JsonNullable.of(createdByCompanyName);
    return this;
  }

  /**
   * The company that created this audience.
   * @return createdByCompanyName
   */
  
  @Schema(name = "created_by_company_name", accessMode = Schema.AccessMode.READ_ONLY, description = "The company that created this audience.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by_company_name")
  public JsonNullable<String> getCreatedByCompanyName() {
    return createdByCompanyName;
  }

  public void setCreatedByCompanyName(JsonNullable<String> createdByCompanyName) {
    this.createdByCompanyName = createdByCompanyName;
  }

  public AdAccountsAudience createdTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = JsonNullable.of(createdTimestamp);
    return this;
  }

  /**
   * Creation time. Unix timestamp in seconds.
   * @return createdTimestamp
   */
  
  @Schema(name = "created_timestamp", accessMode = Schema.AccessMode.READ_ONLY, description = "Creation time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_timestamp")
  public JsonNullable<Integer> getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(JsonNullable<Integer> createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  public AdAccountsAudience description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Audience description.
   * @return description
   */
  
  @Schema(name = "description", description = "Audience description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public AdAccountsAudience id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Audience ID.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", description = "Audience ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdAccountsAudience isNca(Boolean isNca) {
    this.isNca = isNca;
    return this;
  }

  /**
   * Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
   * @return isNca
   */
  
  @Schema(name = "is_nca", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_nca")
  public Boolean getIsNca() {
    return isNca;
  }

  public void setIsNca(Boolean isNca) {
    this.isNca = isNca;
  }

  public AdAccountsAudience name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Audience name.
   * @return name
   */
  
  @Schema(name = "name", description = "Audience name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdAccountsAudience rule(AdAccountsAudienceRule rule) {
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
  public AdAccountsAudienceRule getRule() {
    return rule;
  }

  public void setRule(AdAccountsAudienceRule rule) {
    this.rule = rule;
  }

  public AdAccountsAudience size(Integer size) {
    this.size = JsonNullable.of(size);
    return this;
  }

  /**
   * Audience size.
   * @return size
   */
  
  @Schema(name = "size", accessMode = Schema.AccessMode.READ_ONLY, description = "Audience size.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public JsonNullable<Integer> getSize() {
    return size;
  }

  public void setSize(JsonNullable<Integer> size) {
    this.size = size;
  }

  public AdAccountsAudience status(AudienceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
   * @return status
   */
  @Valid 
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, description = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public AudienceStatus getStatus() {
    return status;
  }

  public void setStatus(AudienceStatus status) {
    this.status = status;
  }

  public AdAccountsAudience type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"audience\".
   * @return type
   */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, description = "Always \"audience\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AdAccountsAudience updatedTimestamp(Integer updatedTimestamp) {
    this.updatedTimestamp = JsonNullable.of(updatedTimestamp);
    return this;
  }

  /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTimestamp
   */
  
  @Schema(name = "updated_timestamp", accessMode = Schema.AccessMode.READ_ONLY, description = "Last update time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    AdAccountsAudience adAccountsAudience = (AdAccountsAudience) o;
    return Objects.equals(this.adAccountId, adAccountsAudience.adAccountId) &&
        Objects.equals(this.audienceType, adAccountsAudience.audienceType) &&
        equalsNullable(this.createdByCompanyName, adAccountsAudience.createdByCompanyName) &&
        equalsNullable(this.createdTimestamp, adAccountsAudience.createdTimestamp) &&
        equalsNullable(this.description, adAccountsAudience.description) &&
        Objects.equals(this.id, adAccountsAudience.id) &&
        Objects.equals(this.isNca, adAccountsAudience.isNca) &&
        Objects.equals(this.name, adAccountsAudience.name) &&
        Objects.equals(this.rule, adAccountsAudience.rule) &&
        equalsNullable(this.size, adAccountsAudience.size) &&
        Objects.equals(this.status, adAccountsAudience.status) &&
        Objects.equals(this.type, adAccountsAudience.type) &&
        equalsNullable(this.updatedTimestamp, adAccountsAudience.updatedTimestamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceType, hashCodeNullable(createdByCompanyName), hashCodeNullable(createdTimestamp), hashCodeNullable(description), id, isNca, name, rule, hashCodeNullable(size), status, type, hashCodeNullable(updatedTimestamp));
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
    sb.append("class AdAccountsAudience {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    createdByCompanyName: ").append(toIndentedString(createdByCompanyName)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isNca: ").append(toIndentedString(isNca)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

