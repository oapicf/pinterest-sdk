package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param owner  for example: ''null''
 * @param country  for example: ''null''
 * @param currency  for example: ''null''
 * @param permissions  for example: ''null''
 * @param createdTime Creation time. Unix timestamp in seconds. for example: ''1451431341''
 * @param updatedTime Last update time. Unix timestamp in seconds. for example: ''1451431341''
*/
final case class AdAccount (
  id: Option[String] = None,
  name: Option[String] = None,
  owner: Option[AdAccountOwner] = None,
  country: Option[Country] = None,
  currency: Option[Currency] = None,
  permissions: Option[Seq[BusinessAccessRole]] = None,
  createdTime: Option[Int] = None,
  updatedTime: Option[Int] = None
)

