/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class PinMediaSourceImagesBase64ItemsInner (
  title: Option[String] = None,
  description: Option[String] = None,
  /* Destination link for the image. */
  link: Option[String] = None,
  contentType: PinMediaSourceImagesBase64ItemsInnerEnums.ContentType,
  /* Image to upload as base64 string. */
  data: String
) extends ApiModel

object PinMediaSourceImagesBase64ItemsInnerEnums {

  type ContentType = ContentType.Value
  object ContentType extends Enumeration {
    val ImageJpeg = Value("image/jpeg")
    val ImagePng = Value("image/png")
  }

}
