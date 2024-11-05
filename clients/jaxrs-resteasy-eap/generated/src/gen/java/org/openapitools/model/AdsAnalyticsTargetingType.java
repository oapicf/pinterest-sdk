package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum AdsAnalyticsTargetingType {
  KEYWORD,
  APPTYPE,
  GENDER,
  LOCATION,
  PLACEMENT,
  COUNTRY,
  TARGETED_INTEREST,
  PINNER_INTEREST,
  AUDIENCE_INCLUDE,
  GEO,
  AGE_BUCKET,
  REGION,
  AGE_BUCKET_AND_GENDER;
}
