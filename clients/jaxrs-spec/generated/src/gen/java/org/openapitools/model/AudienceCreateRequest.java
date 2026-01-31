package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AudienceCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-26T05:38:03.166641305Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AudienceCreateRequest   {
  private String adAccountId;
  private String name;
  private AudienceRule rule;
  private String description;
  private AudienceType audienceType;

  public AudienceCreateRequest() {
  }

  @JsonCreator
  public AudienceCreateRequest(
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "rule") AudienceRule rule,
    @JsonProperty(required = true, value = "audience_type") AudienceType audienceType
  ) {
    this.name = name;
    this.rule = rule;
    this.audienceType = audienceType;
  }

  /**
   * Ad account ID.
   **/
  public AudienceCreateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  @JsonProperty("ad_account_id")
   @Pattern(regexp="^\\d+$")public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
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
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
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
  @JsonProperty(required = true, value = "rule")
  @NotNull @Valid public AudienceRule getRule() {
    return rule;
  }

  @JsonProperty(required = true, value = "rule")
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

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive.
   **/
  public AudienceCreateRequest audienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "<a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive.")
  @JsonProperty(required = true, value = "audience_type")
  @NotNull public AudienceType getAudienceType() {
    return audienceType;
  }

  @JsonProperty(required = true, value = "audience_type")
  public void setAudienceType(AudienceType audienceType) {
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
    return Objects.equals(this.adAccountId, audienceCreateRequest.adAccountId) &&
        Objects.equals(this.name, audienceCreateRequest.name) &&
        Objects.equals(this.rule, audienceCreateRequest.rule) &&
        Objects.equals(this.description, audienceCreateRequest.description) &&
        Objects.equals(this.audienceType, audienceCreateRequest.audienceType);
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

