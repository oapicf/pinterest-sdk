package org.openapitools.server.api.model

import org.openapitools.server.api.model.UserListOperationType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomerListUploadCreateRequest(
    val operation: UserListOperationType,
    /** Number of parts to upload the file in. */
    val totalParts: kotlin.Int
)
