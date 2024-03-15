package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum CatalogsFeedProcessingStatus {
  COMPLETED,
  COMPLETED_EARLY,
  DISAPPROVED,
  FAILED,
  PROCESSING,
  QUEUED_FOR_PROCESSING,
  UNDER_APPEAL,
  UNDER_REVIEW;
}
