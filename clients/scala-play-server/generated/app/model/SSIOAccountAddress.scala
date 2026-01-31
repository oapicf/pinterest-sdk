package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOAccountAddress.
  * @param display Address display
  * @param purpose Purpose for which the address is used, usually Billing or Businness
  * @param addressId Salesforce id for address
  * @param orderLegalEntity Legal entity for this insertion order
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SSIOAccountAddress(
  display: Option[String],
  purpose: Option[String],
  addressId: Option[String],
  orderLegalEntity: Option[String]
)

object SSIOAccountAddress {
  implicit lazy val sSIOAccountAddressJsonFormat: Format[SSIOAccountAddress] = Json.format[SSIOAccountAddress]
}

