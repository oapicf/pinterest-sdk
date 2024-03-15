package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceRule;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Audience  {
  
 /**
  * Ad account ID.
  */
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  private String adAccountId;

 /**
  * Audience ID.
  */
  @ApiModelProperty(example = "1234", value = "Audience ID.")
  private String id;

 /**
  * Audience name.
  */
  @ApiModelProperty(example = "ACME Tools", value = "Audience name.")
  private String name;

 /**
  * <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  */
  @ApiModelProperty(value = "<a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
  private String audienceType;

 /**
  * Audience description.
  */
  @ApiModelProperty(example = "People who love making quilts.", value = "Audience description.")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private AudienceRule rule;

 /**
  * Audience size.
  */
  @ApiModelProperty(example = "1000", value = "Audience size.")
  private Integer size;

 /**
  * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
  */
  @ApiModelProperty(value = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.")
  private String status;

 /**
  * Always \"audience\".
  */
  @ApiModelProperty(example = "audience", value = "Always \"audience\".")
  private String type;

 /**
  * Creation time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1451431341", value = "Creation time. Unix timestamp in seconds.")
  private Integer createdTimestamp;

 /**
  * Last update time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
  private Integer updatedTimestamp;
 /**
  * Ad account ID.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public Audience adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Audience ID.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public Audience id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Audience name.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public Audience name(String name) {
    this.name = name;
    return this;
  }

 /**
  * &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  * @return audienceType
  */
  @JsonProperty("audience_type")
  public String getAudienceType() {
    return audienceType;
  }

  /**
   * Sets the <code>audienceType</code> property.
   */
 public void setAudienceType(String audienceType) {
    this.audienceType = audienceType;
  }

  /**
   * Sets the <code>audienceType</code> property.
   */
  public Audience audienceType(String audienceType) {
    this.audienceType = audienceType;
    return this;
  }

 /**
  * Audience description.
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public Audience description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get rule
  * @return rule
  */
  @JsonProperty("rule")
  public AudienceRule getRule() {
    return rule;
  }

  /**
   * Sets the <code>rule</code> property.
   */
 public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  /**
   * Sets the <code>rule</code> property.
   */
  public Audience rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

 /**
  * Audience size.
  * @return size
  */
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  /**
   * Sets the <code>size</code> property.
   */
 public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   */
  public Audience size(Integer size) {
    this.size = size;
    return this;
  }

 /**
  * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
  * @return status
  */
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public Audience status(String status) {
    this.status = status;
    return this;
  }

 /**
  * Always \&quot;audience\&quot;.
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public Audience type(String type) {
    this.type = type;
    return this;
  }

 /**
  * Creation time. Unix timestamp in seconds.
  * @return createdTimestamp
  */
  @JsonProperty("created_timestamp")
  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }

  /**
   * Sets the <code>createdTimestamp</code> property.
   */
 public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  /**
   * Sets the <code>createdTimestamp</code> property.
   */
  public Audience createdTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

 /**
  * Last update time. Unix timestamp in seconds.
  * @return updatedTimestamp
  */
  @JsonProperty("updated_timestamp")
  public Integer getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  /**
   * Sets the <code>updatedTimestamp</code> property.
   */
 public void setUpdatedTimestamp(Integer updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }

  /**
   * Sets the <code>updatedTimestamp</code> property.
   */
  public Audience updatedTimestamp(Integer updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

