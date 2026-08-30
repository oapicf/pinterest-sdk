package org.openapitools.server.model


/**
 * Error response for requests containing ineligible product tags.
 *
 * @param code  for example: ''null''
 * @param details Details about which product tags failed eligibility check. for example: ''null''
 * @param message  for example: ''null''
*/
final case class ProductTagsError (
  code: Int,
  details: Option[IneligibleProductTagsErrorDetails] = None,
  message: String
)

