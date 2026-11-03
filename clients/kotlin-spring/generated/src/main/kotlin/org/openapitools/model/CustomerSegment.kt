package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.TargetingTemplateStatus
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
 * @param audienceIds Audience IDs included in the customer segment.
 * @param name Customer segment name.
 * @param adAccountId The ID of the ad account that this customer segment belongs to.
 * @param createdTime Customer segment created time. Unix timestamp in seconds.
 * @param id Customer segment ID.
 * @param status Indicates whether the customer segment is active or deleted.
 * @param updatedTime Customer segment updated time. Unix timestamp in seconds.
 */
data class CustomerSegment(

    @Schema(required = true, description = "Audience IDs included in the customer segment.")
    @param:JsonProperty("audience_ids", required = true)
    @get:JsonProperty("audience_ids", required = true) val audienceIds: kotlin.collections.List<kotlin.String>,

    @Schema(required = true, description = "Customer segment name.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(readOnly = true, description = "The ID of the ad account that this customer segment belongs to.")
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(readOnly = true, description = "Customer segment created time. Unix timestamp in seconds.")
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(readOnly = true, description = "Customer segment ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(readOnly = true, description = "Indicates whether the customer segment is active or deleted.")
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: TargetingTemplateStatus? = null,

    @Schema(readOnly = true, description = "Customer segment updated time. Unix timestamp in seconds.")
    @param:JsonProperty("updated_time")
    @get:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null
) {

}

