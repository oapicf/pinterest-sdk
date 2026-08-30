package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param verificationMethod Method used to verify website ownership. for example: ''null''
 * @param website Website with path or domain only for example: ''null''
*/
final case class UserWebsiteCreate (
  verificationMethod: Option[WebsiteVerificationMethod] = None,
  website: Option[String] = None
)

