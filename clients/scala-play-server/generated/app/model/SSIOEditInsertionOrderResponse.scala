package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOEditInsertionOrderResponse.
  * @param pinOrderId Salesforce order id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class SSIOEditInsertionOrderResponse(
  pinOrderId: Option[String]
)

object SSIOEditInsertionOrderResponse {
  implicit lazy val sSIOEditInsertionOrderResponseJsonFormat: Format[SSIOEditInsertionOrderResponse] = Json.format[SSIOEditInsertionOrderResponse]
}

