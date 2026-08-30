package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdsCreditRedeem(
    /** Error code type if error occurs */
    val errorCode: kotlin.Int? = null,
    /** Reason for failure */
    val errorMessage: kotlin.String? = null,
    /** Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true). */
    val success: kotlin.Boolean? = null
)
