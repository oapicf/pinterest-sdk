package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AudienceDataParty;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceSharingType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AudienceCreateCustomRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceCreateCustomRequest {

  private String adAccountId;

  private String name;

  private AudienceRule rule;

  private AudienceSharingType sharingType;

  private AudienceDataParty dataParty;

  private String category;

  public AudienceCreateCustomRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AudienceCreateCustomRequest(String name, AudienceRule rule, AudienceSharingType sharingType, AudienceDataParty dataParty) {
    this.name = name;
    this.rule = rule;
    this.sharingType = sharingType;
    this.dataParty = dataParty;
  }

  public AudienceCreateCustomRequest adAccountId(String adAccountId) {
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
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AudienceCreateCustomRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Audience name.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "string", description = "Audience name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceCreateCustomRequest rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

  /**
   * Get rule
   * @return rule
  */
  @NotNull @Valid 
  @Schema(name = "rule", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rule")
  public AudienceRule getRule() {
    return rule;
  }

  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  public AudienceCreateCustomRequest sharingType(AudienceSharingType sharingType) {
    this.sharingType = sharingType;
    return this;
  }

  /**
   * Get sharingType
   * @return sharingType
  */
  @NotNull @Valid 
  @Schema(name = "sharing_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sharing_type")
  public AudienceSharingType getSharingType() {
    return sharingType;
  }

  public void setSharingType(AudienceSharingType sharingType) {
    this.sharingType = sharingType;
  }

  public AudienceCreateCustomRequest dataParty(AudienceDataParty dataParty) {
    this.dataParty = dataParty;
    return this;
  }

  /**
   * Get dataParty
   * @return dataParty
  */
  @NotNull @Valid 
  @Schema(name = "data_party", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data_party")
  public AudienceDataParty getDataParty() {
    return dataParty;
  }

  public void setDataParty(AudienceDataParty dataParty) {
    this.dataParty = dataParty;
  }

  public AudienceCreateCustomRequest category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  
  @Schema(name = "category", example = "DLX Demographics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceCreateCustomRequest audienceCreateCustomRequest = (AudienceCreateCustomRequest) o;
    return Objects.equals(this.adAccountId, audienceCreateCustomRequest.adAccountId) &&
        Objects.equals(this.name, audienceCreateCustomRequest.name) &&
        Objects.equals(this.rule, audienceCreateCustomRequest.rule) &&
        Objects.equals(this.sharingType, audienceCreateCustomRequest.sharingType) &&
        Objects.equals(this.dataParty, audienceCreateCustomRequest.dataParty) &&
        Objects.equals(this.category, audienceCreateCustomRequest.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, rule, sharingType, dataParty, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCreateCustomRequest {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    sharingType: ").append(toIndentedString(sharingType)).append("\n");
    sb.append("    dataParty: ").append(toIndentedString(dataParty)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

