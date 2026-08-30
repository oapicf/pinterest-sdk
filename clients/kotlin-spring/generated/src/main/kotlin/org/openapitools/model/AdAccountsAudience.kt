package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdAccountsAudienceRule
import org.openapitools.model.AudienceStatus
import org.openapitools.model.AudienceType
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
 * @param id Audience ID.
 * @param adAccountId Ad account ID.
 * @param audienceType [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
 * @param createdByCompanyName The company that created this audience.
 * @param createdTimestamp Creation time. Unix timestamp in seconds.
 * @param description Audience description.
 * @param isNca Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
 * @param name Audience name.
 * @param rule 
 * @param propertySize Audience size.
 * @param status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
 * @param type Always \"audience\".
 * @param updatedTimestamp Last update time. Unix timestamp in seconds.
 */
data class AdAccountsAudience(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "Audience ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Ad account ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("audience_type")
    @get:JsonProperty("audience_type") val audienceType: AudienceType? = null,

    @Schema(readOnly = true, description = "The company that created this audience.")
    @param:JsonProperty("created_by_company_name")
    @get:JsonProperty("created_by_company_name") val createdByCompanyName: kotlin.String? = null,

    @Schema(readOnly = true, description = "Creation time. Unix timestamp in seconds.")
    @param:JsonProperty("created_timestamp")
    @get:JsonProperty("created_timestamp") val createdTimestamp: kotlin.Int? = null,

    @Schema(description = "Audience description.")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(readOnly = true, description = "Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_nca")
    @get:JsonProperty("is_nca") val isNca: kotlin.Boolean? = null,

    @Schema(description = "Audience name.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("rule")
    @get:JsonProperty("rule") val rule: AdAccountsAudienceRule? = null,

    @Schema(readOnly = true, description = "Audience size.")
    @param:JsonProperty("size")
    @get:JsonProperty("size") val propertySize: kotlin.Int? = null,

    @field:Valid
    @Schema(readOnly = true, description = "Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: AudienceStatus? = null,

    @Schema(readOnly = true, description = "Always \"audience\".")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(readOnly = true, description = "Last update time. Unix timestamp in seconds.")
    @param:JsonProperty("updated_timestamp")
    @get:JsonProperty("updated_timestamp") val updatedTimestamp: kotlin.Int? = null
) {

}

