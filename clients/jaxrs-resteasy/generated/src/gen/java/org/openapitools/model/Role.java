package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum Role {
    UNKNOWN, OWNER, ADMIN, ANALYST, SOS_READER, FINANCE_MANAGER, AUDIENCE_MANAGER, CAMPAIGN_MANAGER, CATALOGS_MANAGER, RESTRICTED_OWNER, PROFILE_MANAGER, PROFILE_PUBLISHER, RESOURCE_PINNER_LIST_OWNER, RESOURCE_PINNER_LIST_READER, BIZ_PINNER_LIST_SHARER, RESOURCE_CONVERSION_TAGS_READER
}
