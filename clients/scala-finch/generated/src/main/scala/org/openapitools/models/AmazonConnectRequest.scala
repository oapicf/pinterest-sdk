package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Request containing OTP and Amazon storefront info called by Amazon
 * @param amazonUnderscorestorefrontUnderscoreid The Amazon storefront id
 * @param amazonUnderscorestorefrontUnderscorename The Amazon storefront name
 * @param amazonUnderscorestorefrontUnderscoreurl The Amazon storefront url
 * @param amazonUnderscoreuserUnderscoreid The Amazon user id
 * @param isUnderscoreamazonUnderscoreaccountUnderscorelinked The Amazon account linking status
 * @param oneUnderscoretimeUnderscorepasscode The one time passcode for Pinterest-initiated linking requests
 * @param pinterestUnderscoreuserUnderscoreid The Pinterest user id for Amazon-initiated linking requests
 */
case class AmazonConnectRequest(amazonUnderscorestorefrontUnderscoreid: Option[String],
                amazonUnderscorestorefrontUnderscorename: String,
                amazonUnderscorestorefrontUnderscoreurl: String,
                amazonUnderscoreuserUnderscoreid: Option[String],
                isUnderscoreamazonUnderscoreaccountUnderscorelinked: Boolean,
                oneUnderscoretimeUnderscorepasscode: Option[String],
                pinterestUnderscoreuserUnderscoreid: Option[String]
                )

object AmazonConnectRequest {
    /**
     * Creates the codec for converting AmazonConnectRequest from and to JSON.
     */
    implicit val decoder: Decoder[AmazonConnectRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AmazonConnectRequest] = deriveEncoder
}
