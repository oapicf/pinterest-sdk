package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BillingInvoiceDownloadResponse.
  * @param downloadUrl The download url for the billing invoice
  * @param id The billing invoice id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BillingInvoiceDownloadResponse(
  downloadUrl: Option[String],
  id: Option[String]
)

object BillingInvoiceDownloadResponse {
  implicit lazy val billingInvoiceDownloadResponseJsonFormat: Format[BillingInvoiceDownloadResponse] = Json.format[BillingInvoiceDownloadResponse]
}

