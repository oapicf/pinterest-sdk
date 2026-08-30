package model

import play.api.libs.json._

/**
  * Salesforce account details including bill-to information.
  * @param billtoInfos An array of Salesforce account information that includes address, io terms, etc.
  * @param canEdit Advertiser eligible to update order lines
  * @param eligible Advertiser eligible to create order lines
  * @param error Error indicator from Salesforce which could be \"No Error\"
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SSIOAccount(
  billtoInfos: Option[List[SSIOAccountItem]],
  canEdit: Option[Boolean],
  currency: Option[String],
  eligible: Option[Boolean],
  error: Option[String],
  pmpNames: Option[List[SSIOAccountPMPName]]
)

object SSIOAccount {
  implicit lazy val sSIOAccountJsonFormat: Format[SSIOAccount] = Json.format[SSIOAccount]
}

