package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeletePartnersRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeletePartnersRequest(
  partnerIds: List[String],
  partnerType: Option[String]
)

object DeletePartnersRequest {
  implicit lazy val deletePartnersRequestJsonFormat: Format[DeletePartnersRequest] = Json.format[DeletePartnersRequest]
}

