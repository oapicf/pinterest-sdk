package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrderLineMutationError.
  * @param errorMessages Error messages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class OrderLineMutationError(
  data: Option[OrderLine],
  errorMessages: Option[List[String]]
)

object OrderLineMutationError {
  implicit lazy val orderLineMutationErrorJsonFormat: Format[OrderLineMutationError] = Json.format[OrderLineMutationError]
}

