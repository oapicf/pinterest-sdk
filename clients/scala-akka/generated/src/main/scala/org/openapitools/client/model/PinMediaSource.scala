/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class PinMediaSource (
  sourceType: PinMediaSourceEnums.SourceType,
  contentType: PinMediaSourceEnums.ContentType,
  data: String,
  /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
  isStandard: Option[Boolean] = None,
  url: String,
  /* Cover image url. */
  coverImageUrl: Option[String] = None,
  /* Content type for cover image Base64. */
  coverImageContentType: Option[PinMediaSourceEnums.CoverImageContentType] = None,
  /* Cover image Base64. */
  coverImageData: Option[String] = None,
  mediaId: String,
  /* Array with image objects. */
  items: Seq[PinMediaSourceImagesURLItemsInner],
  index: Option[Int] = None,
  /* This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
  isAffiliateLink: Option[Boolean] = None
) extends ApiModel

object PinMediaSourceEnums {

  type SourceType = SourceType.Value
  type ContentType = ContentType.Value
  type CoverImageContentType = CoverImageContentType.Value
  object SourceType extends Enumeration {
    val PinUrl = Value("pin_url")
  }

  object ContentType extends Enumeration {
    val ImageJpeg = Value("image/jpeg")
    val ImagePng = Value("image/png")
  }

  object CoverImageContentType extends Enumeration {
    val ImageJpeg = Value("image/jpeg")
    val ImagePng = Value("image/png")
  }

}