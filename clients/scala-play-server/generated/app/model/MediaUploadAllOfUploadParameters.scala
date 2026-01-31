package model

import play.api.libs.json._

/**
  * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MediaUploadAllOfUploadParameters(
  xAmzDate: Option[String],
  xAmzSignature: Option[String],
  xAmzSecurityToken: Option[String],
  xAmzAlgorithm: Option[String],
  key: Option[String],
  policy: Option[String],
  xAmzCredential: Option[String],
  contentType: Option[String]
)

object MediaUploadAllOfUploadParameters {
  implicit lazy val mediaUploadAllOfUploadParametersJsonFormat: Format[MediaUploadAllOfUploadParameters] = Json.format[MediaUploadAllOfUploadParameters]
}

