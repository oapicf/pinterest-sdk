package org.openapitools.server.model


/**
 * @param country  for example: ''null''
 * @param createdTime  Creation time. Unix timestamp in seconds. for example: ''null''
 * @param currency  for example: ''null''
 * @param id  for example: ''null''
 * @param name Ad account name. for example: ''null''
 * @param owner Ad account owner for example: ''null''
 * @param permissions  for example: ''null''
 * @param updatedTime  for example: ''null''
*/
final case class AdAccount (
  country: Option[Country] = None,
  createdTime: Option[Int] = None,
  currency: Option[Currency] = None,
  id: String,
  name: Option[String] = None,
  owner: Option[AdAccountOwner] = None,
  permissions: Option[Seq[BusinessAccessRole]] = None,
  updatedTime: Option[Int] = None
)

