package org.openapitools.server.model


/**
 * = UserWebsiteVerificationCode =
 *
 * @param dnsTxtRecord DNS TXT record to check against for the website to be claimed for example: ''null''
 * @param fileContent A full html file to upload to the website in order for it to be claimed for example: ''null''
 * @param filename File expected to find on the website being claimed for example: ''null''
 * @param metatag Metatag the verification process searchs for the website to be claimed for example: ''null''
 * @param verificationCode Code to check against the user claiming the website for example: ''null''
*/
final case class UserWebsiteVerification (
  dnsTxtRecord: Option[String] = None,
  fileContent: Option[String] = None,
  filename: Option[String] = None,
  metatag: Option[String] = None,
  verificationCode: Option[String] = None
)

