package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum Permissions {
    ADMIN, ANALYST, FINANCE_MANAGER, FINANCE_EDIT, FINANCE_VIEW, AUDIENCE_MANAGER, CAMPAIGN_MANAGER, CATALOGS_MANAGER, CATALOGS_VIEWER, PROFILE_PUBLISHER, CONSUMER_USER
}
