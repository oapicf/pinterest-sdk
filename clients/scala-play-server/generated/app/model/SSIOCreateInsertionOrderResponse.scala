package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOCreateInsertionOrderResponse.
  * @param pinOrderId Salesforce order id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class SSIOCreateInsertionOrderResponse(
  pinOrderId: Option[String]
)

object SSIOCreateInsertionOrderResponse {
  implicit lazy val sSIOCreateInsertionOrderResponseJsonFormat: Format[SSIOCreateInsertionOrderResponse] = Json.format[SSIOCreateInsertionOrderResponse]
}

