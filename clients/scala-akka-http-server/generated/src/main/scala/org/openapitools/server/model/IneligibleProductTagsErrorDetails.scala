package org.openapitools.server.model


/**
 * Details about ineligible product tags in the request.
 *
 * @param productTags List of product tags that failed eligibility check. for example: ''null''
*/
final case class IneligibleProductTagsErrorDetails (
  productTags: Seq[IneligibleProductTagErrorItem]
)

