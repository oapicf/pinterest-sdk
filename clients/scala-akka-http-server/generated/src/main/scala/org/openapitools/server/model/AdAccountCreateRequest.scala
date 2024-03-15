package org.openapitools.server.model


/**
 * = AdAccountCreate =
 *
 * @param country  for example: ''null''
 * @param name Ad Account name. for example: ''ACME Tools''
 * @param ownerUserId Advertiser's owning user ID. for example: ''383791336903426391''
*/
final case class AdAccountCreateRequest (
  country: Option[Country] = None,
  name: Option[String] = None,
  ownerUserId: Option[String] = None
)

