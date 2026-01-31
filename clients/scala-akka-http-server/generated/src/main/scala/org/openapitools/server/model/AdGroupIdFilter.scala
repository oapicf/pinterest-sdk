package org.openapitools.server.model


/**
 * @param adGroupIds List of ad group ids for example: ''["12345678"]''
*/
final case class AdGroupIdFilter (
  adGroupIds: Option[Seq[String]] = None
)

