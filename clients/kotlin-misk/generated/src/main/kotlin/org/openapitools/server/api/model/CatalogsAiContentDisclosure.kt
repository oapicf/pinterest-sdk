package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsAiContentDisclosureLabel
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsAiContentDisclosure(
    /** Disclosure labels that apply to this asset. */
    val disclosure: kotlin.collections.List<CatalogsAiContentDisclosureLabel>,
    /** URL of the asset. Must match one of image_link, additional_image_link, or video_link. */
    val url: kotlin.String
)
