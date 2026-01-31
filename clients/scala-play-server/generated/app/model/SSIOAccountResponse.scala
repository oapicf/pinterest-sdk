package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOAccountResponse.
  * @param billtoInfos An array of Salesforce account information that includes address, io terms, etc.
  * @param canEdit Advertiser eligible to update order lines
  * @param eligible Advertiser eligible to create order lines
  * @param error Error indicator from Salesforce which could be \"No Error\"
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SSIOAccountResponse(
  billtoInfos: Option[List[SSIOAccountItem]],
  canEdit: Option[Boolean],
  currency: Option[String],
  eligible: Option[Boolean],
  error: Option[String],
  pmpNames: Option[List[SSIOAccountPMPName]]
)

object SSIOAccountResponse {
  implicit lazy val sSIOAccountResponseJsonFormat: Format[SSIOAccountResponse] = Json.format[SSIOAccountResponse]
}

