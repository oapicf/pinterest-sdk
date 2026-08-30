package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum CampaignPlanningEstimationType {
    IMPRESSION, CLICK, CONVERSION, WEEKLY_FREQUENCY, WEEKLY_REACH, LIFETIME_FREQUENCY, LIFETIME_REACH, CPM, CPC, CPA
}
