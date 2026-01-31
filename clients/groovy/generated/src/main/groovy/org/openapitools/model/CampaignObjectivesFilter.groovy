package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ObjectiveType;

@Canonical
class CampaignObjectivesFilter {
    /* List of values for filtering. [\"WEB_SESSIONS\"] in BETA. */
    List<ObjectiveType> campaignObjectiveTypes = new ArrayList<>()
}
