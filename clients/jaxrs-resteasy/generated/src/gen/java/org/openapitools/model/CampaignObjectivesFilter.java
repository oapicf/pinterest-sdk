package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ObjectiveType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T04:54:58.059572557Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CampaignObjectivesFilter   {
  
  private List<ObjectiveType> campaignObjectiveTypes = new ArrayList<>();

  /**
   * List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA.
   **/
  
  @ApiModelProperty(example = "[\"AWARENESS\"]", value = "List of values for filtering. [\"WEB_SESSIONS\"] in BETA.")
  @JsonProperty("campaign_objective_types")
 @Size(min=1,max=7)  @Valid
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
    return Objects.equals(this.campaignObjectiveTypes, campaignObjectivesFilter.campaignObjectiveTypes);
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

