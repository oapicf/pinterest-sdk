package apimodels;

import apimodels.AudienceRule;
import apimodels.AudienceStatus;
import apimodels.PinnerListType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Audience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Audience   {
  @JsonProperty("ad_account_id")
  @Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("audience_type")
  @Valid

  private PinnerListType audienceType;

  @JsonProperty("created_by_company_name")
  
  private String createdByCompanyName;

  @JsonProperty("created_timestamp")
  
  private Integer createdTimestamp;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("is_nca")
  
  private Boolean isNca;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("rule")
  @Valid

  private AudienceRule rule;

  @JsonProperty("size")
  
  private Integer size;

  @JsonProperty("status")
  @Valid

  private AudienceStatus status;

  @JsonProperty("type")
  
  private String type;

  @JsonProperty("updated_timestamp")
  
  private Integer updatedTimestamp;

  public Audience adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Ad account ID.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public Audience audienceType(PinnerListType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

   /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   * @return audienceType
  **/
  public PinnerListType getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(PinnerListType audienceType) {
    this.audienceType = audienceType;
  }

  public Audience createdByCompanyName(String createdByCompanyName) {
    this.createdByCompanyName = createdByCompanyName;
    return this;
  }

   /**
   * The company that created this audience.
   * @return createdByCompanyName
  **/
  public String getCreatedByCompanyName() {
    return createdByCompanyName;
  }

  public void setCreatedByCompanyName(String createdByCompanyName) {
    this.createdByCompanyName = createdByCompanyName;
  }

  public Audience createdTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Creation time. Unix timestamp in seconds.
   * @return createdTimestamp
  **/
  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  public Audience description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Audience description.
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Audience id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Audience ID.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Audience isNca(Boolean isNca) {
    this.isNca = isNca;
    return this;
  }

   /**
   * Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
   * @return isNca
  **/
  public Boolean getIsNca() {
    return isNca;
  }

  public void setIsNca(Boolean isNca) {
    this.isNca = isNca;
  }

  public Audience name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Audience name.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Audience rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  public AudienceRule getRule() {
    return rule;
  }

  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  public Audience size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Audience size.
   * @return size
  **/
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Audience status(AudienceStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
   * @return status
  **/
  public AudienceStatus getStatus() {
    return status;
  }

  public void setStatus(AudienceStatus status) {
    this.status = status;
  }

  public Audience type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Always \"audience\".
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Audience updatedTimestamp(Integer updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

   /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTimestamp
  **/
  public Integer getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  public void setUpdatedTimestamp(Integer updatedTimestamp) {
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
    return Objects.equals(adAccountId, audience.adAccountId) &&
        Objects.equals(audienceType, audience.audienceType) &&
        Objects.equals(createdByCompanyName, audience.createdByCompanyName) &&
        Objects.equals(createdTimestamp, audience.createdTimestamp) &&
        Objects.equals(description, audience.description) &&
        Objects.equals(id, audience.id) &&
        Objects.equals(isNca, audience.isNca) &&
        Objects.equals(name, audience.name) &&
        Objects.equals(rule, audience.rule) &&
        Objects.equals(size, audience.size) &&
        Objects.equals(status, audience.status) &&
        Objects.equals(type, audience.type) &&
        Objects.equals(updatedTimestamp, audience.updatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceType, createdByCompanyName, createdTimestamp, description, id, isNca, name, rule, size, status, type, updatedTimestamp);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

