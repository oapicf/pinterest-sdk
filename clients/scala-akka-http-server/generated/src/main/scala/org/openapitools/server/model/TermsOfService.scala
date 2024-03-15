package org.openapitools.server.model


/**
 * = TermsOfService =
 *
 * @param id The ID of the terms of service for example: ''2650449554526''
 * @param html The terms of service content for example: ''example test''
 * @param hasAccepted Whether the ad account has accepted terms of service. for example: ''true''
 * @param adAccountId The ID of the ad account. for example: ''549755885175''
*/
final case class TermsOfService (
  id: Option[String] = None,
  html: Option[String] = None,
  hasAccepted: Option[Boolean] = None,
  adAccountId: Option[String] = None
)

