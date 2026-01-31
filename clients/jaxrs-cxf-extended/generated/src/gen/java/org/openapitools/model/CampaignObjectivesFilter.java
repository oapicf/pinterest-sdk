package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ObjectiveType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignObjectivesFilter  {
  
 /**
  * List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
  */
  @ApiModelProperty(example = "[\"AWARENESS\"]", value = "List of values for filtering. [\"WEB_SESSIONS\"] in BETA.")
  @Valid
  private List<ObjectiveType> campaignObjectiveTypes = new ArrayList<>();
 /**
  * List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA.
  * @return campaignObjectiveTypes
  */
  @JsonProperty("campaign_objective_types")
 @Size(min=1,max=7)  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  /**
   * Sets the <code>campaignObjectiveTypes</code> property.
   */
 public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  /**
   * Sets the <code>campaignObjectiveTypes</code> property.
   */
  public CampaignObjectivesFilter campaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignObjectiveTypes</code> list.
   */
  public CampaignObjectivesFilter addCampaignObjectiveTypesItem(ObjectiveType campaignObjectiveTypesItem) {
    this.campaignObjectiveTypes.add(campaignObjectiveTypesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

