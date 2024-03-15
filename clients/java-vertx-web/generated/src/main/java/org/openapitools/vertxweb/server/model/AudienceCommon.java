package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AudienceRule;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudienceCommon   {
  
  private String adAccountId;
  private String name;
  private AudienceRule rule;

  public AudienceCommon () {

  }

  public AudienceCommon (String adAccountId, String name, AudienceRule rule) {
    this.adAccountId = adAccountId;
    this.name = name;
    this.rule = rule;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("rule")
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
    return Objects.equals(adAccountId, audienceCommon.adAccountId) &&
        Objects.equals(name, audienceCommon.name) &&
        Objects.equals(rule, audienceCommon.rule);
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
