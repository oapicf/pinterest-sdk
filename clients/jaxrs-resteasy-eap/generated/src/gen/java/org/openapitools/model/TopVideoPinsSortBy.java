package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum TopVideoPinsSortBy {
  SAVE,
  IMPRESSION,
  OUTBOUND_CLICK,
  VIDEO_MRC_VIEW,
  VIDEO_AVG_WATCH_TIME,
  VIDEO_V50_WATCH_TIME,
  QUARTILE_95_PERCENT_VIEW,
  VIDEO_10_S_VIEW,
  VIDEO_START;
}
