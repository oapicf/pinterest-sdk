package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.PinMediaSourceImageBase64
import org.openapitools.model.PinMediaSourceImageURL
import org.openapitools.model.PinMediaSourceImagesBase64
import org.openapitools.model.PinMediaSourceImagesURL
import org.openapitools.model.PinMediaSourceImagesURLItemsInner
import org.openapitools.model.PinMediaSourcePinURL
import org.openapitools.model.PinMediaSourceVideoID
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
 * Pin media source.
 * @param sourceType 
 * @param contentType 
 * @param &#x60;data&#x60; 
 * @param url 
 * @param mediaId 
 * @param items Array with image objects.
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 * @param coverImageUrl Cover image url.
 * @param coverImageContentType Content type for cover image Base64.
 * @param coverImageData Cover image Base64.
 * @param index 
 * @param isAffiliateLink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "source_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = PinMediaSourceImageBase64::class, name = "image_base64"),
      JsonSubTypes.Type(value = PinMediaSourceImageURL::class, name = "image_url"),
      JsonSubTypes.Type(value = PinMediaSourceImagesBase64::class, name = "multiple_image_base64"),
      JsonSubTypes.Type(value = PinMediaSourceImagesURL::class, name = "multiple_image_urls"),
      JsonSubTypes.Type(value = PinMediaSourcePinURL::class, name = "pin_url"),
      JsonSubTypes.Type(value = PinMediaSourceVideoID::class, name = "video_id")
)

interface PinMediaSource{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val sourceType: PinMediaSource.SourceType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val contentType: PinMediaSource.ContentType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val `data`: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val url: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val mediaId: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "Array with image objects.")
        val items: kotlin.collections.List<PinMediaSourceImagesURLItemsInner>

                @get:Schema(example = "null", description = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
        val isStandard: kotlin.Boolean? 

                @get:Schema(example = "null", description = "Cover image url.")
        val coverImageUrl: kotlin.String? 

                @get:Schema(example = "null", description = "Content type for cover image Base64.")
        val coverImageContentType: PinMediaSource.CoverImageContentType? 

                @get:Schema(example = "null", description = "Cover image Base64.")
        val coverImageData: kotlin.String? 

                @get:Schema(example = "null", description = "")
        val index: kotlin.Int? 

                @get:Schema(example = "null", description = "This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.")
        val isAffiliateLink: kotlin.Boolean? 


    /**
    * 
    * Values: pin_url
    */
    enum class SourceType(val value: kotlin.String) {

        @JsonProperty("pin_url") pin_url("pin_url")
    }

    /**
    * 
    * Values: jpeg,png
    */
    enum class ContentType(val value: kotlin.String) {

        @JsonProperty("image/jpeg") jpeg("image/jpeg"),
        @JsonProperty("image/png") png("image/png")
    }

    /**
    * Content type for cover image Base64.
    * Values: jpeg,png
    */
    enum class CoverImageContentType(val value: kotlin.String) {

        @JsonProperty("image/jpeg") jpeg("image/jpeg"),
        @JsonProperty("image/png") png("image/png")
    }

}

