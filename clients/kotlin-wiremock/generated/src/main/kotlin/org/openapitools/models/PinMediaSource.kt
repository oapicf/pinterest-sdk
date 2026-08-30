@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinMediaSource(
    @field:JsonProperty("content_type")
    val contentType: ContentType,

    @field:JsonProperty("data")
    val `data`: kotlin.String,

    @field:JsonProperty("source_type")
    val sourceType: kotlin.String,

    @field:JsonProperty("url")
    val url: kotlin.String,

    @field:JsonProperty("media_id")
    val mediaId: kotlin.String,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<PinMediaSourceImagesURLItem>,

    @field:JsonProperty("is_standard")
    val isStandard: kotlin.Boolean? = true,

    @field:JsonProperty("cover_image_content_type")
    val coverImageContentType: ContentType? = null,

    @field:JsonProperty("cover_image_data")
    val coverImageData: kotlin.String? = null,

    @field:JsonProperty("cover_image_key_frame_time")
    val coverImageKeyFrameTime: kotlin.Int? = null,

    @field:JsonProperty("cover_image_url")
    val coverImageUrl: kotlin.String? = null,

    @field:JsonProperty("index")
    val index: kotlin.Int? = null,

    @field:JsonProperty("is_affiliate_link")
    val isAffiliateLink: kotlin.Boolean? = false,

)
