@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedIngestionErrors(
    @field:JsonProperty("ACCOUNT_FLAGGED")
    val ACCOUNT_FLAGGED: kotlin.Int? = null,

    @field:JsonProperty("FETCH_GOOGLE_SHEET_NOT_SHARED")
    val FETCH_GOOGLE_SHEET_NOT_SHARED: kotlin.Int? = null,

    @field:JsonProperty("IMAGE_FILE_NOT_ACCESSIBLE")
    val IMAGE_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,

    @field:JsonProperty("IMAGE_FILE_NOT_FOUND")
    val IMAGE_FILE_NOT_FOUND: kotlin.Int? = null,

    @field:JsonProperty("IMAGE_INVALID_FILE")
    val IMAGE_INVALID_FILE: kotlin.Int? = null,

    @field:JsonProperty("IMAGE_LEVEL_INTERNAL_ERROR")
    val IMAGE_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,

    @field:JsonProperty("IMAGE_MALFORMED_URL")
    val IMAGE_MALFORMED_URL: kotlin.Int? = null,

    @field:JsonProperty("LARGE_PRODUCT_COUNT_DECREASE")
    val LARGE_PRODUCT_COUNT_DECREASE: kotlin.Int? = null,

    @field:JsonProperty("LINE_LEVEL_INTERNAL_ERROR")
    val LINE_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,

)
