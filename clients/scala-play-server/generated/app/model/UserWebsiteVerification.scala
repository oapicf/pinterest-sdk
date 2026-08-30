package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserWebsiteVerification.
  * @param dnsTxtRecord DNS TXT record to check against for the website to be claimed
  * @param fileContent A full html file to upload to the website in order for it to be claimed
  * @param filename File expected to find on the website being claimed
  * @param metatag Metatag the verification process searchs for the website to be claimed
  * @param verificationCode Code to check against the user claiming the website
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class UserWebsiteVerification(
  dnsTxtRecord: Option[String],
  fileContent: Option[String],
  filename: Option[String],
  metatag: Option[String],
  verificationCode: Option[String]
)

object UserWebsiteVerification {
  implicit lazy val userWebsiteVerificationJsonFormat: Format[UserWebsiteVerification] = Json.format[UserWebsiteVerification]
}

