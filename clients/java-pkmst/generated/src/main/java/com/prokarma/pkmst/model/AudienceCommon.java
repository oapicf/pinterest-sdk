package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AudienceRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AudienceCommon
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceCommon   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("rule")
  private AudienceRule rule;

  public AudienceCommon adAccountId(String adAccountId) {
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

  public AudienceCommon name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Audience name.
   * @return name
  **/
  @ApiModelProperty(example = "string", value = "Audience name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceCommon rule(AudienceRule rule) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceCommon audienceCommon = (AudienceCommon) o;
    return Objects.equals(this.adAccountId, audienceCommon.adAccountId) &&
        Objects.equals(this.name, audienceCommon.name) &&
        Objects.equals(this.rule, audienceCommon.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCommon {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

