package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrderLineMutationResult.
  * @param errors Error list if update(s) fail.
  * @param orderLine Order Line object array.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class OrderLineMutationResult(
  errors: Option[List[OrderLineMutationError]],
  orderLine: Option[List[OrderLine]]
)

object OrderLineMutationResult {
  implicit lazy val orderLineMutationResultJsonFormat: Format[OrderLineMutationResult] = Json.format[OrderLineMutationResult]
}

