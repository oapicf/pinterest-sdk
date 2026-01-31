package model

import play.api.libs.json._

/**
  * User website verification request
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UserWebsiteVerifyRequest(
  verificationMethod: Option[UserWebsiteVerifyRequest.VerificationMethod.Value],
  website: Option[String]
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

