package org.openapitools.server.model


/**
 * @param code  for example: ''US''
 * @param currency Country currency. for example: ''Dollars''
 * @param index Country index for example: ''1''
 * @param name Country name for example: ''United States of America''
*/
final case class AdAccountsCountry (
  code: Country,
  currency: String,
  index: Double,
  name: String
)

