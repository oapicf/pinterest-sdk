package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AudienceRule
import org.openapitools.model.AudienceStatus
import org.openapitools.model.PinnerListType
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
 * @param audienceType [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
 * @param createdByCompanyName The company that created this audience.
 * @param createdTimestamp Creation time. Unix timestamp in seconds.
 * @param description Audience description.
 * @param id Audience ID.
 * @param isNca Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
 * @param name Audience name.
 * @param rule 
 * @param propertySize Audience size.
 * @param status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
 * @param type Always \"audience\".
 * @param updatedTimestamp Last update time. Unix timestamp in seconds.
 */
data class Audience(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Ad account ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("audience_type")
    @get:JsonProperty("audience_type") val audienceType: PinnerListType? = null,

    @Schema(example = "Pinterest", description = "The company that created this audience.")
    @param:JsonProperty("created_by_company_name")
    @get:JsonProperty("created_by_company_name") val createdByCompanyName: kotlin.String? = null,

    @Schema(example = "1451431341", description = "Creation time. Unix timestamp in seconds.")
    @param:JsonProperty("created_timestamp")
    @get:JsonProperty("created_timestamp") val createdTimestamp: kotlin.Int? = null,

    @Schema(example = "People who love making quilts.", description = "Audience description.")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1234", description = "Audience ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(description = "Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_nca")
    @get:JsonProperty("is_nca") val isNca: kotlin.Boolean? = null,

    @Schema(example = "ACME Tools", description = "Audience name.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rule")
    @get:JsonProperty("rule") val rule: AudienceRule? = null,

    @Schema(example = "1000", description = "Audience size.")
    @param:JsonProperty("size")
    @get:JsonProperty("size") val propertySize: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: AudienceStatus? = null,

    @Schema(example = "audience", description = "Always \"audience\".")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "1451431341", description = "Last update time. Unix timestamp in seconds.")
    @param:JsonProperty("updated_timestamp")
    @get:JsonProperty("updated_timestamp") val updatedTimestamp: kotlin.Int? = null
) {

}

