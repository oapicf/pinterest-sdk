package org.openapitools.server.model


/**
 * @param code  for example: ''null''
 * @param currency Country currency. for example: ''Dollars''
 * @param index Country index for example: ''1''
 * @param name Country name for example: ''United States of America''
*/
final case class AdAccountsCountryResponseData (
  code: Option[AdCountry] = None,
  currency: Option[String] = None,
  index: Option[Double] = None,
  name: Option[String] = None
)

