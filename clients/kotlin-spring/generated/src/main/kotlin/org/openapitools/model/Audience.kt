package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AudienceRule
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
 * 
 * @param adAccountId Ad account ID.
 * @param id Audience ID.
 * @param name Audience name.
 * @param audienceType <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
 * @param description Audience description.
 * @param rule 
 * @param propertySize Audience size.
 * @param status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
 * @param type Always \"audience\".
 * @param createdTimestamp Creation time. Unix timestamp in seconds.
 * @param updatedTimestamp Last update time. Unix timestamp in seconds.
 */
data class Audience(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Ad account ID.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1234", description = "Audience ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "ACME Tools", description = "Audience name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "<a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
    @get:JsonProperty("audience_type") val audienceType: kotlin.String? = null,

    @Schema(example = "People who love making quilts.", description = "Audience description.")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("rule") val rule: AudienceRule? = null,

    @Schema(example = "1000", description = "Audience size.")
    @get:JsonProperty("size") val propertySize: kotlin.Int? = null,

    @Schema(example = "null", description = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.")
    @get:JsonProperty("status") val status: kotlin.String? = null,

    @Schema(example = "audience", description = "Always \"audience\".")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "1451431341", description = "Creation time. Unix timestamp in seconds.")
    @get:JsonProperty("created_timestamp") val createdTimestamp: kotlin.Int? = null,

    @Schema(example = "1451431341", description = "Last update time. Unix timestamp in seconds.")
    @get:JsonProperty("updated_timestamp") val updatedTimestamp: kotlin.Int? = null
) {

}

