package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssetAccessRequestError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateAssetAccessRequestResponse(
    /** A list of errors associated with the asset access requests. Will be returned if there is an error. */
    val exceptions: kotlin.collections.List<AssetAccessRequestError>? = null,
    /** An object mapping each partner id to the asset access request id. Only one request id is returned per partner. */
    val invites: kotlin.collections.Map<kotlin.String, kotlin.String>? = null
)
