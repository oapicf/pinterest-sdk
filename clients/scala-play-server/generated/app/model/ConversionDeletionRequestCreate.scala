package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param deletionTargets Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionDeletionRequestCreate(
  deletionTargets: ConversionDeletionRequestTargets
)

object ConversionDeletionRequestCreate {
  implicit lazy val conversionDeletionRequestCreateJsonFormat: Format[ConversionDeletionRequestCreate] = Json.format[ConversionDeletionRequestCreate]
}

