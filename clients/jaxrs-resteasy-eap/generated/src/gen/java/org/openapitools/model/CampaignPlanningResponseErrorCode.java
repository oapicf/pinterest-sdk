package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum CampaignPlanningResponseErrorCode {
  SERVER_ERROR,
  AUDIENCE_LIST_MISSING,
  INVALID_REQUEST,
  PRODUCT_GROUP_MISSING;
}
