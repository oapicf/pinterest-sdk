package org.openapitools.server.model


/**
 * = User website verification request =
 *
 * User website verification request
 *
 * @param website  for example: ''pintest-website-12345678.test/test_1''
 * @param verificationMethod  for example: ''null''
*/
final case class UserWebsiteVerifyRequest (
  website: Option[String] = None,
  verificationMethod: Option[String] = None
)

