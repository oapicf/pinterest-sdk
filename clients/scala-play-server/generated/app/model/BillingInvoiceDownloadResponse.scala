package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BillingInvoiceDownloadResponse.
  * @param downloadUrl The download url for the billing invoice
  * @param id The billing invoice id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BillingInvoiceDownloadResponse(
  downloadUrl: Option[String],
  id: Option[String]
)

object BillingInvoiceDownloadResponse {
  implicit lazy val billingInvoiceDownloadResponseJsonFormat: Format[BillingInvoiceDownloadResponse] = Json.format[BillingInvoiceDownloadResponse]
}

