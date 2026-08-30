package org.openapitools.server.model


/**
 * Error item for a product tag that failed eligibility check.
 *
 * @param errorMessage Reason why the pin is ineligible for tagging. for example: ''null''
 * @param pinId Pin ID that failed eligibility check. for example: ''null''
*/
final case class IneligibleProductTagErrorItem (
  errorMessage: IneligibleProductTagReason,
  pinId: String
)

