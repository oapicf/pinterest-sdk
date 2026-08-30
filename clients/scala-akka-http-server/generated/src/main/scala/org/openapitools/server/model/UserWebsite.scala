package org.openapitools.server.model


/**
 * = UserWebsiteSummary =
 *
 * @param status Status of the verification process for example: ''null''
 * @param verifiedAt UTC timestamp when the verification happened - sometimes missing for example: ''null''
 * @param website Website with path or domain only for example: ''null''
*/
final case class UserWebsite (
  status: Option[String] = None,
  verifiedAt: Option[String] = None,
  website: Option[String] = None
)

