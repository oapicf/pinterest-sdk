package org.openapitools.server.model


/**
 * = TermsOfService =
 *
 * @param adAccountId The ID of the ad account. for example: ''549755885175''
 * @param hasAccepted Whether the ad account has accepted terms of service. for example: ''true''
 * @param html The terms of service content for example: ''example test''
 * @param id The ID of the terms of service for example: ''2650449554526''
*/
final case class TermsOfService (
  adAccountId: Option[String] = None,
  hasAccepted: Option[Boolean] = None,
  html: Option[String] = None,
  id: Option[String] = None
)

