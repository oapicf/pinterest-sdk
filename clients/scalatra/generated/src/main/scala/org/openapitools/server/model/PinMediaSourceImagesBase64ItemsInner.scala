/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class PinMediaSourceImagesBase64ItemsInner(
  title: Option[String],

  description: Option[String],

  /* Destination link for the image. */
  link: Option[String],

  contentType: String,

  /* Image to upload as base64 string. */
  data: String

 )