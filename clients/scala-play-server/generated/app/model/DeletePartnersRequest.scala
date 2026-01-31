package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeletePartnersRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DeletePartnersRequest(
  partnerIds: List[String],
  partnerType: Option[String]
)

object DeletePartnersRequest {
  implicit lazy val deletePartnersRequestJsonFormat: Format[DeletePartnersRequest] = Json.format[DeletePartnersRequest]
}

