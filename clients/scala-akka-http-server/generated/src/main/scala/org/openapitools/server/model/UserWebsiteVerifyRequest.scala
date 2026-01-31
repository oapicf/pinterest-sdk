package org.openapitools.server.model


/**
 * = User website verification request =
 *
 * User website verification request
 *
 * @param verificationMethod  for example: ''null''
 * @param website  for example: ''pintest-website-12345678.test/test_1''
*/
final case class UserWebsiteVerifyRequest (
  verificationMethod: Option[String] = None,
  website: Option[String] = None
)

