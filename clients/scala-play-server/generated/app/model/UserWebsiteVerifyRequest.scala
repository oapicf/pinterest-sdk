package model

import play.api.libs.json._

/**
  * User website verification request
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UserWebsiteVerifyRequest(
  website: Option[String],
  verificationMethod: Option[UserWebsiteVerifyRequest.VerificationMethod.Value]
)

object UserWebsiteVerifyRequest {
  implicit lazy val userWebsiteVerifyRequestJsonFormat: Format[UserWebsiteVerifyRequest] = Json.format[UserWebsiteVerifyRequest]

  // noinspection TypeAnnotation
  object VerificationMethod extends Enumeration {
    val FILENAME = Value("FILENAME")
    val METATAG = Value("METATAG")
    val DNSTXT = Value("DNSTXT")

    type VerificationMethod = Value
    implicit lazy val VerificationMethodJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

