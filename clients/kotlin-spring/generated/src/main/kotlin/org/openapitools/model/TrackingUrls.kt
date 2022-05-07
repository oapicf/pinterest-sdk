package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @param impression 
 * @param click 
 * @param engagement 
 * @param buyableButton 
 * @param audienceVerification 
 */
data class TrackingUrls(

    @get:Size(max=3)
    @field:JsonProperty("impression") val impression: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(max=3)
    @field:JsonProperty("click") val click: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(max=3)
    @field:JsonProperty("engagement") val engagement: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(max=3)
    @field:JsonProperty("buyable_button") val buyableButton: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(max=3)
    @field:JsonProperty("audience_verification") val audienceVerification: kotlin.collections.List<kotlin.String>? = null
) {

}

