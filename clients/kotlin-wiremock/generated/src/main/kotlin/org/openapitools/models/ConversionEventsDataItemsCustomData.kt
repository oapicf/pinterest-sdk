@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionEventsDataItemsCustomData(
    @field:JsonProperty("content_brand")
    val contentBrand: kotlin.String? = null,

    @field:JsonProperty("content_category")
    val contentCategory: kotlin.String? = null,

    @field:JsonProperty("content_ids")
    val contentIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("content_name")
    val contentName: kotlin.String? = null,

    @field:JsonProperty("contents")
    val contents: kotlin.collections.List<ConversionEventsDataItemsCustomDataContentsItems>? = null,

    @field:JsonProperty("currency")
    val currency: kotlin.String? = null,

    @field:JsonProperty("external_measurement_id")
    val externalMeasurementId: kotlin.String? = null,

    @field:JsonProperty("external_measurement_vendor_id")
    val externalMeasurementVendorId: kotlin.Int? = null,

    @field:JsonProperty("np")
    val np: kotlin.String? = null,

    @field:JsonProperty("num_items")
    val numItems: kotlin.Long? = null,

    @field:JsonProperty("opt_out_type")
    val optOutType: kotlin.String? = null,

    @field:JsonProperty("order_id")
    val orderId: kotlin.String? = null,

    @field:JsonProperty("predicted_ltv")
    val predictedLtv: kotlin.String? = null,

    @field:JsonProperty("search_string")
    val searchString: kotlin.String? = null,

    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

)
