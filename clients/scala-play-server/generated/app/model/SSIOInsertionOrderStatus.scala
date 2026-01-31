package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOInsertionOrderStatus.
  * @param creationTime Salesforce insertion order creation time
  * @param pinOrderId Salesforce order id
  * @param status Salesforce insertion order status
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SSIOInsertionOrderStatus(
  creationTime: Option[String],
  pinOrderId: Option[String],
  status: Option[String]
)

object SSIOInsertionOrderStatus {
  implicit lazy val sSIOInsertionOrderStatusJsonFormat: Format[SSIOInsertionOrderStatus] = Json.format[SSIOInsertionOrderStatus]
}

