package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionHealthSelectionItem(
    /** Overall status for this selection item */
    val status: kotlin.Any,
    /** Status for conversion types */
    val conversionType: kotlin.Any? = null,
    /** Status for criteria */
    val criteria: kotlin.Any? = null,
    /** Status for ingestion sources */
    val ingestionSource: kotlin.Any? = null
)
