package org.openapitools.server.model


/**
 * = Image URL =
 *
 * Image URL-based media source
 *
 * @param sourceType  for example: ''null''
 * @param url  for example: ''null''
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. for example: ''null''
*/
final case class PinMediaSourceImageURL (
  sourceType: String,
  url: String,
  isStandard: Option[Boolean] = None
)

