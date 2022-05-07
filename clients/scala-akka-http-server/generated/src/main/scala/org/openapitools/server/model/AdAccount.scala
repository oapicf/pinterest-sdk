package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param owner  for example: ''null''
 * @param country  for example: ''null''
 * @param currency  for example: ''null''
*/
final case class AdAccount (
  id: Option[String],
  name: Option[String],
  owner: Option[AdAccountOwner],
  country: Option[Country],
  currency: Option[Currency]
)

