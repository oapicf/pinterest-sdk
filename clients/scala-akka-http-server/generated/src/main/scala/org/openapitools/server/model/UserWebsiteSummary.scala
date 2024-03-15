package org.openapitools.server.model


/**
 * = UserWebsiteSummary =
 *
 * @param website Website with path or domain only for example: ''mysite.test''
 * @param status Status of the verification process for example: ''success''
 * @param verifiedAt UTC timestamp when the verification happened - sometimes missing for example: ''2022-12-14T21:03:01.602000''
*/
final case class UserWebsiteSummary (
  website: Option[String] = None,
  status: Option[String] = None,
  verifiedAt: Option[String] = None
)

