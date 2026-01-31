package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ObjectiveType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CampaignObjectivesFilter   {
  @JsonProperty("campaign_objective_types")
  private List<ObjectiveType> campaignObjectiveTypes = null;

  /**
   * List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
   **/
  public CampaignObjectivesFilter campaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  
  @ApiModelProperty(example = "[\"AWARENESS\"]", value = "List of values for filtering. [\"WEB_SESSIONS\"] in BETA.")
  @JsonProperty("campaign_objective_types")
  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }
  public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignObjectivesFilter campaignObjectivesFilter = (CampaignObjectivesFilter) o;
    return Objects.equals(campaignObjectiveTypes, campaignObjectivesFilter.campaignObjectiveTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignObjectiveTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignObjectivesFilter {\n");
    
    sb.append("    campaignObjectiveTypes: ").append(toIndentedString(campaignObjectiveTypes)).append("\n");
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

