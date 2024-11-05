package org.openapitools.model

import java.util.Objects
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
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 * @param subscriberKey Text field value that uniquely identifies a subscriber.
 */
data class AdAccountCreateSubscriptionRequestPartnerMetadata(

    @Schema(example = "null", description = "Text field value that uniquely identifies a subscriber.")
    @get:JsonProperty("subscriber_key") val subscriberKey: kotlin.String? = null
    ) {

}

