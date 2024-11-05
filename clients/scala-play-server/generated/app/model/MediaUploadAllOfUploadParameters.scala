package model

import play.api.libs.json._

/**
  * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

