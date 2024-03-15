/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceRule;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Audience   {
  
  private String adAccountId;
  private String id;
  private String name;
  private String audienceType;
  private String description;
  private AudienceRule rule;
  private Integer size;
  private String status;
  private String type;
  private Integer createdTimestamp;
  private Integer updatedTimestamp;

  /**
   * Ad account ID.
   */
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
   * Audience ID.
   */
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
   * Audience name.
   */
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
   * <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   */
  public Audience audienceType(String audienceType) {
    this.audienceType = audienceType;
    return this;
  }

  
  @ApiModelProperty(value = "<a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
  @JsonProperty("audience_type")
  public String getAudienceType() {
    return audienceType;
  }
  public void setAudienceType(String audienceType) {
    this.audienceType = audienceType;
  }

  /**
   * Audience description.
   */
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
   */
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
   */
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
   */
  public Audience status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Always \"audience\".
   */
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
   * Creation time. Unix timestamp in seconds.
   */
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
   * Last update time. Unix timestamp in seconds.
   */
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
        Objects.equals(id, audience.id) &&
        Objects.equals(name, audience.name) &&
        Objects.equals(audienceType, audience.audienceType) &&
        Objects.equals(description, audience.description) &&
        Objects.equals(rule, audience.rule) &&
        Objects.equals(size, audience.size) &&
        Objects.equals(status, audience.status) &&
        Objects.equals(type, audience.type) &&
        Objects.equals(createdTimestamp, audience.createdTimestamp) &&
        Objects.equals(updatedTimestamp, audience.updatedTimestamp);
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

