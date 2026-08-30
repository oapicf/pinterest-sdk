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
import org.openapitools.model.AudienceType;
import org.openapitools.model.AudienceUpdateOperationType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create or update operation model.
 */

@Schema(name = "AdAccountsAudienceUpdate", description = "Resource create or update operation model.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsAudienceUpdate {

  private String adAccountId;

  private AudienceType audienceType;

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private String name;

  private AudienceUpdateOperationType operationType;

  private AdAccountsAudienceRule rule;

  public AdAccountsAudienceUpdate adAccountId(String adAccountId) {
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

  public AdAccountsAudienceUpdate audienceType(AudienceType audienceType) {
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

  public AdAccountsAudienceUpdate description(String description) {
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

  public AdAccountsAudienceUpdate name(String name) {
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

  public AdAccountsAudienceUpdate operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Audience operation type (update or remove). Only valid in update request body.
   * @return operationType
   */
  @Valid 
  @Schema(name = "operation_type", description = "Audience operation type (update or remove). Only valid in update request body.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operation_type")
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }

  public AdAccountsAudienceUpdate rule(AdAccountsAudienceRule rule) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountsAudienceUpdate adAccountsAudienceUpdate = (AdAccountsAudienceUpdate) o;
    return Objects.equals(this.adAccountId, adAccountsAudienceUpdate.adAccountId) &&
        Objects.equals(this.audienceType, adAccountsAudienceUpdate.audienceType) &&
        equalsNullable(this.description, adAccountsAudienceUpdate.description) &&
        Objects.equals(this.name, adAccountsAudienceUpdate.name) &&
        Objects.equals(this.operationType, adAccountsAudienceUpdate.operationType) &&
        Objects.equals(this.rule, adAccountsAudienceUpdate.rule);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceType, hashCodeNullable(description), name, operationType, rule);
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
    sb.append("class AdAccountsAudienceUpdate {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

