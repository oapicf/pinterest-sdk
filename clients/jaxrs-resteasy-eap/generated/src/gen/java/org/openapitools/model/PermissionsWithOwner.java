package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum PermissionsWithOwner {
  ADMIN,
  ANALYST,
  FINANCE_MANAGER,
  AUDIENCE_MANAGER,
  CAMPAIGN_MANAGER,
  CATALOGS_MANAGER,
  CATALOGS_VIEWER,
  PROFILE_PUBLISHER,
  OWNER;
}
