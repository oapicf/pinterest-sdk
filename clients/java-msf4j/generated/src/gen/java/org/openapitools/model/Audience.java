package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceRule;

/**
 * Audience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Audience   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("audience_type")
  private String audienceType;

  @JsonProperty("description")
  private String description;

  @JsonProperty("rule")
  private AudienceRule rule;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("status")
  private String status;

  @JsonProperty("type")
  private String type;

  @JsonProperty("created_timestamp")
  private Integer createdTimestamp;

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
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public Audience id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Audience ID.
   * @return id
  **/
  @ApiModelProperty(example = "1234", value = "Audience ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Audience name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Audience name.
   * @return name
  **/
  @ApiModelProperty(example = "ACME Tools", value = "Audience name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Audience audienceType(String audienceType) {
    this.audienceType = audienceType;
    return this;
  }

   /**
   * <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   * @return audienceType
  **/
  @ApiModelProperty(value = "<a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
  public String getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(String audienceType) {
    this.audienceType = audienceType;
  }

  public Audience description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Audience description.
   * @return description
  **/
  @ApiModelProperty(example = "People who love making quilts.", value = "Audience description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Audience rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(example = "1000", value = "Audience size.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Audience status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
   * @return status
  **/
  @ApiModelProperty(value = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
  @ApiModelProperty(example = "audience", value = "Always \"audience\".")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Audience createdTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Creation time. Unix timestamp in seconds.
   * @return createdTimestamp
  **/
  @ApiModelProperty(example = "1451431341", value = "Creation time. Unix timestamp in seconds.")
  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  public Audience updatedTimestamp(Integer updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

   /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTimestamp
  **/
  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
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
    return Objects.equals(this.adAccountId, audience.adAccountId) &&
        Objects.equals(this.id, audience.id) &&
        Objects.equals(this.name, audience.name) &&
        Objects.equals(this.audienceType, audience.audienceType) &&
        Objects.equals(this.description, audience.description) &&
        Objects.equals(this.rule, audience.rule) &&
        Objects.equals(this.size, audience.size) &&
        Objects.equals(this.status, audience.status) &&
        Objects.equals(this.type, audience.type) &&
        Objects.equals(this.createdTimestamp, audience.createdTimestamp) &&
        Objects.equals(this.updatedTimestamp, audience.updatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, id, name, audienceType, description, rule, size, status, type, createdTimestamp, updatedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audience {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
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

