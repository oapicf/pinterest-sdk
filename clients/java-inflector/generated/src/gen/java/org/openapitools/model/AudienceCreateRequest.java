package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceCreateRequest1AudienceType;
import org.openapitools.model.AudienceRule;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceCreateRequest   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("rule")
  private AudienceRule rule;

  @JsonProperty("description")
  private String description;

  @JsonProperty("audience_type")
  private AudienceCreateRequest1AudienceType audienceType;

  /**
   * Ad account ID.
   **/
  public AudienceCreateRequest adAccountId(String adAccountId) {
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
   * Audience name.
   **/
  public AudienceCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "string", required = true, value = "Audience name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public AudienceCreateRequest rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("rule")
  public AudienceRule getRule() {
    return rule;
  }
  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  /**
   * Audience description.
   **/
  public AudienceCreateRequest description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "string", value = "Audience description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public AudienceCreateRequest audienceType(AudienceCreateRequest1AudienceType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("audience_type")
  public AudienceCreateRequest1AudienceType getAudienceType() {
    return audienceType;
  }
  public void setAudienceType(AudienceCreateRequest1AudienceType audienceType) {
    this.audienceType = audienceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceCreateRequest audienceCreateRequest = (AudienceCreateRequest) o;
    return Objects.equals(adAccountId, audienceCreateRequest.adAccountId) &&
        Objects.equals(name, audienceCreateRequest.name) &&
        Objects.equals(rule, audienceCreateRequest.rule) &&
        Objects.equals(description, audienceCreateRequest.description) &&
        Objects.equals(audienceType, audienceCreateRequest.audienceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, rule, description, audienceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCreateRequest {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
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

