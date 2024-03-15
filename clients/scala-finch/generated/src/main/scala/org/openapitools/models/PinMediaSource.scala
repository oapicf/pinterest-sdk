package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMediaSourceImageBase64
import org.openapitools.models.PinMediaSourceImageURL
import org.openapitools.models.PinMediaSourceImagesBase64
import org.openapitools.models.PinMediaSourceImagesURL
import org.openapitools.models.PinMediaSourceImagesURLItemsInner
import org.openapitools.models.PinMediaSourcePinURL
import org.openapitools.models.PinMediaSourceVideoID
import scala.collection.immutable.Seq

/**
 * Pin media source.
 * @param sourceUnderscoretype 
 * @param contentUnderscoretype 
 * @param data 
 * @param isUnderscorestandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 * @param url 
 * @param coverUnderscoreimageUnderscoreurl Cover image url.
 * @param coverUnderscoreimageUnderscorecontentUnderscoretype Content type for cover image Base64.
 * @param coverUnderscoreimageUnderscoredata Cover image Base64.
 * @param mediaUnderscoreid 
 * @param items Array with image objects.
 * @param index 
 * @param isUnderscoreaffiliateUnderscorelink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
 */
case class PinMediaSource(sourceUnderscoretype: String,
                contentUnderscoretype: String,
                data: String,
                isUnderscorestandard: Option[Boolean],
                url: String,
                coverUnderscoreimageUnderscoreurl: Option[String],
                coverUnderscoreimageUnderscorecontentUnderscoretype: Option[String],
                coverUnderscoreimageUnderscoredata: Option[String],
                mediaUnderscoreid: String,
                items: Seq[PinMediaSourceImagesURLItemsInner],
                index: Option[Int],
                isUnderscoreaffiliateUnderscorelink: Option[Boolean]
                )

object PinMediaSource {
    /**
     * Creates the codec for converting PinMediaSource from and to JSON.
     */
    implicit val decoder: Decoder[PinMediaSource] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMediaSource] = deriveEncoder
}
