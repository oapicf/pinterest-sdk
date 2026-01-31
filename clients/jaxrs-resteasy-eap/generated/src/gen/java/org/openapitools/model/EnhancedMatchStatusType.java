package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum EnhancedMatchStatusType {
  UNKNOWN,
  NOT_VALIDATED,
  VALIDATING_IN_PROGRESS,
  VALIDATION_COMPLETE;
}
