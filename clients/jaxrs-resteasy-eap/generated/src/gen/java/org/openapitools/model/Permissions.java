package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum Permissions {
  ADMIN,
  ANALYST,
  FINANCE_MANAGER,
  AUDIENCE_MANAGER,
  CAMPAIGN_MANAGER,
  CATALOGS_MANAGER,
  PROFILE_PUBLISHER;
}
