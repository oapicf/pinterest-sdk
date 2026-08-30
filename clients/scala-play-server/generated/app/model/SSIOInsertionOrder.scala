package model

import play.api.libs.json._

/**
  * An SSIO insertion order.
  * @param pinOrderId Salesforce order id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SSIOInsertionOrder(
  pinOrderId: Option[String]
)

object SSIOInsertionOrder {
  implicit lazy val sSIOInsertionOrderJsonFormat: Format[SSIOInsertionOrder] = Json.format[SSIOInsertionOrder]
}

