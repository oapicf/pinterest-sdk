package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param country  for example: ''null''
 * @param currency  for example: ''null''
 * @param name Ad account name. for example: ''null''
 * @param ownerUserId Advertiser's owning user ID. for example: ''null''
*/
final case class AdAccountCreate (
  country: Option[Country] = None,
  currency: Option[Currency] = None,
  name: Option[String] = None,
  ownerUserId: Option[String] = None
)

