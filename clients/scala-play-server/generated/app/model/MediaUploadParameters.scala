package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MediaUploadParameters.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MediaUploadParameters(
  contentType: Option[String],
  key: Option[String],
  policy: Option[String],
  xAmzAlgorithm: Option[String],
  xAmzCredential: Option[String],
  xAmzDate: Option[String],
  xAmzSecurityToken: Option[String],
  xAmzSignature: Option[String]
)

object MediaUploadParameters {
  implicit lazy val mediaUploadParametersJsonFormat: Format[MediaUploadParameters] = Json.format[MediaUploadParameters]
}

