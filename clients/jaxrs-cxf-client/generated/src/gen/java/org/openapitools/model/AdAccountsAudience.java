package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdAccountsAudienceRule;
import org.openapitools.model.AudienceStatus;
import org.openapitools.model.AudienceType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountsAudience  {
  
 /**
  * Ad account ID.
  */
  @ApiModelProperty(value = "Ad account ID.")

  private String adAccountId;

 /**
  * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  */
  @ApiModelProperty(value = "[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")

  private AudienceType audienceType;

 /**
  * The company that created this audience.
  */
  @ApiModelProperty(value = "The company that created this audience.")

  private String createdByCompanyName;

 /**
  * Creation time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Creation time. Unix timestamp in seconds.")

  private Integer createdTimestamp;

 /**
  * Audience description.
  */
  @ApiModelProperty(value = "Audience description.")

  private String description;

 /**
  * Audience ID.
  */
  @ApiModelProperty(required = true, value = "Audience ID.")

  private String id;

 /**
  * Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
  */
  @ApiModelProperty(value = "Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.")

  private Boolean isNca;

 /**
  * Audience name.
  */
  @ApiModelProperty(value = "Audience name.")

  private String name;

  @ApiModelProperty(value = "")

  private AdAccountsAudienceRule rule;

 /**
  * Audience size.
  */
  @ApiModelProperty(value = "Audience size.")

  private Integer size;

 /**
  * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
  */
  @ApiModelProperty(value = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.")

  private AudienceStatus status;

 /**
  * Always \"audience\".
  */
  @ApiModelProperty(value = "Always \"audience\".")

  private String type;

 /**
  * Last update time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Last update time. Unix timestamp in seconds.")

  private Integer updatedTimestamp;
 /**
   * Ad account ID.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdAccountsAudience adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   * @return audienceType
  **/
  @JsonProperty("audience_type")
  public AudienceType getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
  }

  public AdAccountsAudience audienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

 /**
   * The company that created this audience.
   * @return createdByCompanyName
  **/
  @JsonProperty("created_by_company_name")
  public String getCreatedByCompanyName() {
    return createdByCompanyName;
  }


 /**
   * Creation time. Unix timestamp in seconds.
   * @return createdTimestamp
  **/
  @JsonProperty("created_timestamp")
  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }


 /**
   * Audience description.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdAccountsAudience description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Audience ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdAccountsAudience id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
   * @return isNca
  **/
  @JsonProperty("is_nca")
  public Boolean getIsNca() {
    return isNca;
  }


 /**
   * Audience name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdAccountsAudience name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get rule
   * @return rule
  **/
  @JsonProperty("rule")
  public AdAccountsAudienceRule getRule() {
    return rule;
  }

  public void setRule(AdAccountsAudienceRule rule) {
    this.rule = rule;
  }

  public AdAccountsAudience rule(AdAccountsAudienceRule rule) {
    this.rule = rule;
    return this;
  }

 /**
   * Audience size.
   * @return size
  **/
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }


 /**
   * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
   * @return status
  **/
  @JsonProperty("status")
  public AudienceStatus getStatus() {
    return status;
  }


 /**
   * Always \&quot;audience\&quot;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }


 /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTimestamp
  **/
  @JsonProperty("updated_timestamp")
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

