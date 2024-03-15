package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceRule;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
   **/
  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Audience ID.
   **/
  
  @ApiModelProperty(example = "1234", value = "Audience ID.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Audience name.
   **/
  
  @ApiModelProperty(example = "ACME Tools", value = "Audience name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   **/
  
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
   **/
  
  @ApiModelProperty(example = "People who love making quilts.", value = "Audience description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rule")
  @Valid
  public AudienceRule getRule() {
    return rule;
  }
  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  /**
   * Audience size.
   **/
  
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
  
  @ApiModelProperty(value = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Always \&quot;audience\&quot;.
   **/
  
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
   **/
  
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
   **/
  
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

