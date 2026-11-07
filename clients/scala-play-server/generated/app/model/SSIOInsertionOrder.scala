package model

import play.api.libs.json._

/**
  * An SSIO insertion order.
  * @param pinOrderId Salesforce order id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SSIOInsertionOrder(
  pinOrderId: Option[String]
)

object SSIOInsertionOrder {
  implicit lazy val sSIOInsertionOrderJsonFormat: Format[SSIOInsertionOrder] = Json.format[SSIOInsertionOrder]
}

