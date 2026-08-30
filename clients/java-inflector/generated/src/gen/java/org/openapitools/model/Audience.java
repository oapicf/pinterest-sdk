package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceStatus;
import org.openapitools.model.PinnerListType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Audience   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("audience_type")
  private PinnerListType audienceType;

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
  private AudienceRule rule;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("status")
  private AudienceStatus status;

  @JsonProperty("type")
  private String type;

  @JsonProperty("updated_timestamp")
  private Integer updatedTimestamp;

  /**
   * Ad account ID.
   **/
  public Audience adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   **/
  public Audience audienceType(PinnerListType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

  
  @ApiModelProperty(value = "[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
  @JsonProperty("audience_type")
  public PinnerListType getAudienceType() {
    return audienceType;
  }
  public void setAudienceType(PinnerListType audienceType) {
    this.audienceType = audienceType;
  }

  /**
   * The company that created this audience.
   **/
  public Audience createdByCompanyName(String createdByCompanyName) {
    this.createdByCompanyName = createdByCompanyName;
    return this;
  }

  
  @ApiModelProperty(example = "Pinterest", value = "The company that created this audience.")
  @JsonProperty("created_by_company_name")
  public String getCreatedByCompanyName() {
    return createdByCompanyName;
  }
  public void setCreatedByCompanyName(String createdByCompanyName) {
    this.createdByCompanyName = createdByCompanyName;
  }

  /**
   * Creation time. Unix timestamp in seconds.
   **/
  public Audience createdTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  
  @ApiModelProperty(example = "1451431341", value = "Creation time. Unix timestamp in seconds.")
  @JsonProperty("created_timestamp")
  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }
  public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  /**
   * Audience description.
   **/
  public Audience description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "People who love making quilts.", value = "Audience description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Audience ID.
   **/
  public Audience id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1234", value = "Audience ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
   **/
  public Audience isNca(Boolean isNca) {
    this.isNca = isNca;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.")
  @JsonProperty("is_nca")
  public Boolean getIsNca() {
    return isNca;
  }
  public void setIsNca(Boolean isNca) {
    this.isNca = isNca;
  }

  /**
   * Audience name.
   **/
  public Audience name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "ACME Tools", value = "Audience name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Audience rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rule")
  public AudienceRule getRule() {
    return rule;
  }
  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  /**
   * Audience size.
   **/
  public Audience size(Integer size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(example = "1000", value = "Audience size.")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
   **/
  public Audience status(AudienceStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.")
  @JsonProperty("status")
  public AudienceStatus getStatus() {
    return status;
  }
  public void setStatus(AudienceStatus status) {
    this.status = status;
  }

  /**
   * Always \"audience\".
   **/
  public Audience type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "audience", value = "Always \"audience\".")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Last update time. Unix timestamp in seconds.
   **/
  public Audience updatedTimestamp(Integer updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

  
  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
  @JsonProperty("updated_timestamp")
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

