package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdAccountsAudienceRule;
import org.openapitools.model.AudienceType;
import org.openapitools.model.AudienceUpdateOperationType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create or update operation model.
 */
public class AdAccountsAudienceUpdate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Ad account ID.
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   */
  @JsonProperty("audience_type")
  private AudienceType audienceType;

  /**
   * Audience description.
   */
  @JsonProperty("description")
  private String description;

  /**
   * Audience name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Audience operation type (update or remove). Only valid in update request body.
   */
  @JsonProperty("operation_type")
  private AudienceUpdateOperationType operationType;

  @JsonProperty("rule")
  private AdAccountsAudienceRule rule;

  /**
   * Ad account ID.
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   * @return audienceType
   */
  public AudienceType getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
  }

  /**
   * Audience description.
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Audience name.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Audience operation type (update or remove). Only valid in update request body.
   * @return operationType
   */
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }

  /**
   * 
   * @return rule
   */
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
        Objects.equals(this.description, adAccountsAudienceUpdate.description) &&
        Objects.equals(this.name, adAccountsAudienceUpdate.name) &&
        Objects.equals(this.operationType, adAccountsAudienceUpdate.operationType) &&
        Objects.equals(this.rule, adAccountsAudienceUpdate.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceType, description, name, operationType, rule);
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
