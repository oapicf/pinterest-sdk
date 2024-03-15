package org.openapitools.server.model


/**
 * = LeadFormTestResponse =
 *
 * Response for lead data test API.
 *
 * @param subscriptionId Subscription ID. for example: ''8078432025948590686''
*/
final case class LeadFormTestResponse (
  subscriptionId: Option[String] = None
)

