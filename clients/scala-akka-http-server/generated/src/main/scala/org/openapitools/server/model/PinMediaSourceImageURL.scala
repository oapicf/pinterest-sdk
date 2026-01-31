package org.openapitools.server.model


/**
 * = Object containing Image URL =
 *
 * Image URL-based media source.
 *
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. for example: ''null''
 * @param sourceType The source type of the media. for example: ''null''
 * @param url  for example: ''null''
*/
final case class PinMediaSourceImageURL (
  isStandard: Option[Boolean] = None,
  sourceType: String,
  url: String
)

