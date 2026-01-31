package org.openapitools.server.model


/**
 * = BillingInvoiceDownloadResponse =
 *
 * @param downloadUrl The download url for the billing invoice for example: ''null''
 * @param id The billing invoice id for example: ''null''
*/
final case class BillingInvoiceDownloadResponse (
  downloadUrl: Option[String] = None,
  id: Option[String] = None
)

