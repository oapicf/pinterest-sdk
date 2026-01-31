package org.openapitools.server.model


/**
 * = UserWebsiteVerificationCode =
 *
 * @param dnsTxtRecord DNS TXT record to check against for the website to be claimed for example: ''pinterest-site-verification=e1edcc1a43976c646367e9c6c9a9b7b6''
 * @param fileContent A full html file to upload to the website in order for it to be claimed for example: ''null''
 * @param filename File expected to find on the website being claimed for example: ''pinterest-e1edc.html''
 * @param metatag Metatag the verification process searchs for the website to be claimed for example: ''<meta name="p:domain_verify" content="e1edcc1a43976c646367e9c6c9a9b7b6"/>''
 * @param verificationCode Code to check against the user claiming the website for example: ''e1edcc1a43976c646367e9c6c9a9b7b6''
*/
final case class UserWebsiteVerificationCode (
  dnsTxtRecord: Option[String] = None,
  fileContent: Option[String] = None,
  filename: Option[String] = None,
  metatag: Option[String] = None,
  verificationCode: Option[String] = None
)

