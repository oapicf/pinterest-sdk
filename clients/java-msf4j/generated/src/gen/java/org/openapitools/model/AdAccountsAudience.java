package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdAccountsAudienceRule;
import org.openapitools.model.AudienceStatus;
import org.openapitools.model.AudienceType;

/**
 * AdAccountsAudience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsAudience   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("audience_type")
  private AudienceType audienceType;

  @JsonProperty("created_by_company_name")
  private String createdByCompanyName;

  @JsonProperty("created_timestamp")
  private Integer createdTimestamp;

  @JsonProperty("description")
  private String description;

  @JsonProperty("id")
  private String id;

  @JsonProperty("is_nca")
  private Boolean isNca;

  @JsonProperty("name")
  private String name;

  @JsonProperty("rule")
  private AdAccountsAudienceRule rule;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("status")
  private AudienceStatus status;

  @JsonProperty("type")
  private String type;

  @JsonProperty("updated_timestamp")
  private Integer updatedTimestamp;

  public AdAccountsAudience adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Ad account ID.
   * @return adAccountId
  **/
  @ApiModelProperty(value = "Ad account ID.")
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
  **/
  @ApiModelProperty(value = "[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
  public AudienceType getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
  }

   /**
   * The company that created this audience.
   * @return createdByCompanyName
  **/
  @ApiModelProperty(value = "The company that created this audience.")
  public String getCreatedByCompanyName() {
    return createdByCompanyName;
  }

   /**
   * Creation time. Unix timestamp in seconds.
   * @return createdTimestamp
  **/
  @ApiModelProperty(value = "Creation time. Unix timestamp in seconds.")
  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }

  public AdAccountsAudience description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Audience description.
   * @return description
  **/
  @ApiModelProperty(value = "Audience description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdAccountsAudience id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Audience ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Audience ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
   * @return isNca
  **/
  @ApiModelProperty(value = "Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.")
  public Boolean getIsNca() {
    return isNca;
  }

  public AdAccountsAudience name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Audience name.
   * @return name
  **/
  @ApiModelProperty(value = "Audience name.")
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
  **/
  @ApiModelProperty(value = "")
  public AdAccountsAudienceRule getRule() {
    return rule;
  }

  public void setRule(AdAccountsAudienceRule rule) {
    this.rule = rule;
  }

   /**
   * Audience size.
   * @return size
  **/
  @ApiModelProperty(value = "Audience size.")
  public Integer getSize() {
    return size;
  }

   /**
   * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
   * @return status
  **/
  @ApiModelProperty(value = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.")
  public AudienceStatus getStatus() {
    return status;
  }

   /**
   * Always \"audience\".
   * @return type
  **/
  @ApiModelProperty(value = "Always \"audience\".")
  public String getType() {
    return type;
  }

   /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTimestamp
  **/
  @ApiModelProperty(value = "Last update time. Unix timestamp in seconds.")
  public Integer getUpdatedTimestamp() {
    return updatedTimestamp;
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
        Objects.equals(this.createdByCompanyName, adAccountsAudience.createdByCompanyName) &&
        Objects.equals(this.createdTimestamp, adAccountsAudience.createdTimestamp) &&
        Objects.equals(this.description, adAccountsAudience.description) &&
        Objects.equals(this.id, adAccountsAudience.id) &&
        Objects.equals(this.isNca, adAccountsAudience.isNca) &&
        Objects.equals(this.name, adAccountsAudience.name) &&
        Objects.equals(this.rule, adAccountsAudience.rule) &&
        Objects.equals(this.size, adAccountsAudience.size) &&
        Objects.equals(this.status, adAccountsAudience.status) &&
        Objects.equals(this.type, adAccountsAudience.type) &&
        Objects.equals(this.updatedTimestamp, adAccountsAudience.updatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceType, createdByCompanyName, createdTimestamp, description, id, isNca, name, rule, size, status, type, updatedTimestamp);
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

