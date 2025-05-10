package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOAccountAddress.
  * @param display Address display
  * @param purpose Purpose for which the address is used, usually Billing or Businness
  * @param addressId Salesforce id for address
  * @param orderLegalEntity Legal entity for this insertion order
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class SSIOAccountAddress(
  display: Option[String],
  purpose: Option[String],
  addressId: Option[String],
  orderLegalEntity: Option[String]
)

object SSIOAccountAddress {
  implicit lazy val sSIOAccountAddressJsonFormat: Format[SSIOAccountAddress] = Json.format[SSIOAccountAddress]
}

