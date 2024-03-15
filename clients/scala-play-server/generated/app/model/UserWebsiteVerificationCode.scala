package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserWebsiteVerificationCode.
  * @param verificationCode Code to check against the user claiming the website
  * @param dnsTxtRecord DNS TXT record to check against for the website to be claimed
  * @param metatag Metatag the verification process searchs for the website to be claimed
  * @param filename File expected to find on the website being claimed
  * @param fileContent A full html file to upload to the website in order for it to be claimed
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class UserWebsiteVerificationCode(
  verificationCode: Option[String],
  dnsTxtRecord: Option[String],
  metatag: Option[String],
  filename: Option[String],
  fileContent: Option[String]
)

object UserWebsiteVerificationCode {
  implicit lazy val userWebsiteVerificationCodeJsonFormat: Format[UserWebsiteVerificationCode] = Json.format[UserWebsiteVerificationCode]
}

