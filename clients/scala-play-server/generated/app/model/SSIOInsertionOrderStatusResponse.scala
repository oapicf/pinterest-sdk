package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOInsertionOrderStatusResponse.
  * @param pinOrderId Salesforce order id
  * @param status Salesforce insertion order status
  * @param creationTime Salesforce insertion order creation time
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class SSIOInsertionOrderStatusResponse(
  pinOrderId: Option[String],
  status: Option[String],
  creationTime: Option[String]
)

object SSIOInsertionOrderStatusResponse {
  implicit lazy val sSIOInsertionOrderStatusResponseJsonFormat: Format[SSIOInsertionOrderStatusResponse] = Json.format[SSIOInsertionOrderStatusResponse]
}

