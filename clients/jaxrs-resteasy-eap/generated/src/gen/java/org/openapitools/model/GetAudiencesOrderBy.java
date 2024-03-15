package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum GetAudiencesOrderBy {
  NONE,
  ID,
  SIZE,
  CREATION_DATE,
  UPDATED_TIME,
  NAME,
  STATUS,
  TYPE;
}
