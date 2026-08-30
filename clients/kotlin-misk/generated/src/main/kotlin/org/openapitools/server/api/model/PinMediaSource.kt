package org.openapitools.server.api.model

import org.openapitools.server.api.model.ContentType
import org.openapitools.server.api.model.PinMediaSourceImageBase64
import org.openapitools.server.api.model.PinMediaSourceImageURL
import org.openapitools.server.api.model.PinMediaSourceImagesBase64
import org.openapitools.server.api.model.PinMediaSourceImagesURL
import org.openapitools.server.api.model.PinMediaSourceImagesURLItem
import org.openapitools.server.api.model.PinMediaSourcePinURL
import org.openapitools.server.api.model.PinMediaSourceVideoID
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaSource(
    val contentType: ContentType,
    val `data`: kotlin.String,
    val sourceType: kotlin.String,
    val url: kotlin.String,
    val mediaId: kotlin.String,
    /** Array with image objects. */
    val items: kotlin.collections.List<PinMediaSourceImagesURLItem>,
    /** Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    val isStandard: kotlin.Boolean? = true,
    /** Content type for cover image Base64. */
    val coverImageContentType: ContentType? = null,
    /** Cover image Base64. */
    val coverImageData: kotlin.String? = null,
    /** Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. */
    val coverImageKeyFrameTime: kotlin.Int? = null,
    /** Cover image URL. */
    val coverImageUrl: kotlin.String? = null,
    val index: kotlin.Int? = null,
    /** This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
    val isAffiliateLink: kotlin.Boolean? = false
)
