package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOCreateInsertionOrderResponse.
  * @param pinOrderId Salesforce order id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SSIOCreateInsertionOrderResponse(
  pinOrderId: Option[String]
)

object SSIOCreateInsertionOrderResponse {
  implicit lazy val sSIOCreateInsertionOrderResponseJsonFormat: Format[SSIOCreateInsertionOrderResponse] = Json.format[SSIOCreateInsertionOrderResponse]
}

