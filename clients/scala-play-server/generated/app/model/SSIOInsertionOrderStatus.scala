package model

import play.api.libs.json._

/**
  * SSIO insertion order status item in a list response.
  * @param creationTime Salesforce insertion order creation time
  * @param pinOrderId Salesforce order id
  * @param status Salesforce insertion order status
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SSIOInsertionOrderStatus(
  creationTime: Option[String],
  pinOrderId: Option[String],
  status: Option[String]
)

object SSIOInsertionOrderStatus {
  implicit lazy val sSIOInsertionOrderStatusJsonFormat: Format[SSIOInsertionOrderStatus] = Json.format[SSIOInsertionOrderStatus]
}

