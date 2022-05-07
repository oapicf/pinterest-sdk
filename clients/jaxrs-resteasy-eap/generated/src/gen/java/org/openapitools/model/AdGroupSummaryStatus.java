package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
public enum AdGroupSummaryStatus {
  RUNNING,
  PAUSED,
  NOT_STARTED,
  COMPLETED,
  ADVERTISER_DISABLED,
  ARCHIVED;
}
