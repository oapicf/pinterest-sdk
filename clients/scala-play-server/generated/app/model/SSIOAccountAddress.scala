package model

import play.api.libs.json._

/**
  * Salesforce address information.
  * @param addressId Salesforce id for address
  * @param display Address display
  * @param orderLegalEntity Legal entity for this insertion order
  * @param purpose Purpose for which the address is used, usually Billing or Businness
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SSIOAccountAddress(
  addressId: Option[String],
  display: Option[String],
  orderLegalEntity: Option[String],
  purpose: Option[String]
)

object SSIOAccountAddress {
  implicit lazy val sSIOAccountAddressJsonFormat: Format[SSIOAccountAddress] = Json.format[SSIOAccountAddress]
}

