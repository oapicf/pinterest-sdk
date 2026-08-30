package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsAiContentDisclosureLabel
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * AI content disclosure for a single asset of a catalog item.
 * @param disclosure Disclosure labels that apply to this asset.
 * @param url URL of the asset. Must match one of image_link, additional_image_link, or video_link.
 */
data class CatalogsAiContentDisclosure(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "[\"ai_modified\"]", required = true, description = "Disclosure labels that apply to this asset.")
    @param:JsonProperty("disclosure")
    @get:JsonProperty("disclosure", required = true) val disclosure: kotlin.collections.List<CatalogsAiContentDisclosureLabel>,

    @get:Size(max=2000)
    @Schema(example = "https://scene.example.com/image/image_v2.jpg", required = true, description = "URL of the asset. Must match one of image_link, additional_image_link, or video_link.")
    @param:JsonProperty("url")
    @get:JsonProperty("url", required = true) val url: kotlin.String
) {

}

