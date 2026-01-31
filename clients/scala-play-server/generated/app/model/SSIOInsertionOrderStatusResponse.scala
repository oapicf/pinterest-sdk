package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOInsertionOrderStatusResponse.
  * @param creationTime Salesforce insertion order creation time
  * @param pinOrderId Salesforce order id
  * @param status Salesforce insertion order status
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SSIOInsertionOrderStatusResponse(
  creationTime: Option[String],
  pinOrderId: Option[String],
  status: Option[String]
)

object SSIOInsertionOrderStatusResponse {
  implicit lazy val sSIOInsertionOrderStatusResponseJsonFormat: Format[SSIOInsertionOrderStatusResponse] = Json.format[SSIOInsertionOrderStatusResponse]
}

