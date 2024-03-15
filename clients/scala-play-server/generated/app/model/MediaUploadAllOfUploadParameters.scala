package model

import play.api.libs.json._

/**
  * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

