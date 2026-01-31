package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ContentType
import org.openapitools.models.PinMediaSourceImageBase64
import org.openapitools.models.PinMediaSourceImageURL
import org.openapitools.models.PinMediaSourceImagesBase64
import org.openapitools.models.PinMediaSourceImagesURL
import org.openapitools.models.PinMediaSourceImagesURLItem
import org.openapitools.models.PinMediaSourcePinURL
import org.openapitools.models.PinMediaSourceVideoID
import scala.collection.immutable.Seq

/**
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 * @param contentUnderscoretype 
 * @param data 
 * @param isUnderscorestandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 * @param sourceUnderscoretype 
 * @param url 
 * @param coverUnderscoreimageUnderscorecontentUnderscoretype Content type for cover image Base64.
 * @param coverUnderscoreimageUnderscoredata Cover image Base64.
 * @param coverUnderscoreimageUnderscorekeyUnderscoreframeUnderscoretime Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
 * @param coverUnderscoreimageUnderscoreurl Cover image URL.
 * @param mediaUnderscoreid 
 * @param index 
 * @param items Array with image objects.
 * @param isUnderscoreaffiliateUnderscorelink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
 */
case class PinMediaSource(contentUnderscoretype: ContentType,
                data: String,
                isUnderscorestandard: Option[Boolean],
                sourceUnderscoretype: String,
                url: String,
                coverUnderscoreimageUnderscorecontentUnderscoretype: Option[ContentType],
                coverUnderscoreimageUnderscoredata: Option[String],
                coverUnderscoreimageUnderscorekeyUnderscoreframeUnderscoretime: Option[Int],
                coverUnderscoreimageUnderscoreurl: Option[String],
                mediaUnderscoreid: String,
                index: Option[Int],
                items: Seq[PinMediaSourceImagesURLItem],
                isUnderscoreaffiliateUnderscorelink: Option[Boolean]
                )

object PinMediaSource {
    /**
     * Creates the codec for converting PinMediaSource from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSource] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSource] = deriveEncoder
}
