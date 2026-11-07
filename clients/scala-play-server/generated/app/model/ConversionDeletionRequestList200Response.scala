package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for conversion_deletion_request_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConversionDeletionRequestList200Response(
  bookmark: Option[String],
  items: List[ConversionDeletionRequest]
)

object ConversionDeletionRequestList200Response {
  implicit lazy val conversionDeletionRequestList200ResponseJsonFormat: Format[ConversionDeletionRequestList200Response] = Json.format[ConversionDeletionRequestList200Response]
}

