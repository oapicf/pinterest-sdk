package model

import play.api.libs.json._

/**
  * An object with a list of partners that were deleted.
  * @param deletedPartners List of partners whose business partnership have been terminated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeletePartnersResponse(
  deletedPartners: Option[List[String]]
)

object DeletePartnersResponse {
  implicit lazy val deletePartnersResponseJsonFormat: Format[DeletePartnersResponse] = Json.format[DeletePartnersResponse]
}

