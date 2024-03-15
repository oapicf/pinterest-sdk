package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* Summary status for campaign
* Values: RUNNING,PAUSED,NOT_STARTED,COMPLETED,ADVERTISER_DISABLED,ARCHIVED,DRAFT,DELETED_DRAFT
*/
enum class CampaignSummaryStatus(val value: kotlin.String) {

    @JsonProperty("RUNNING") RUNNING("RUNNING"),
    @JsonProperty("PAUSED") PAUSED("PAUSED"),
    @JsonProperty("NOT_STARTED") NOT_STARTED("NOT_STARTED"),
    @JsonProperty("COMPLETED") COMPLETED("COMPLETED"),
    @JsonProperty("ADVERTISER_DISABLED") ADVERTISER_DISABLED("ADVERTISER_DISABLED"),
    @JsonProperty("ARCHIVED") ARCHIVED("ARCHIVED"),
    @JsonProperty("DRAFT") DRAFT("DRAFT"),
    @JsonProperty("DELETED_DRAFT") DELETED_DRAFT("DELETED_DRAFT")
}

