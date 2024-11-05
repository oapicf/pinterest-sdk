package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOAccountResponse.
  * @param eligible Advertiser eligible to create order lines
  * @param canEdit Advertiser eligible to update order lines
  * @param billtoInfos An array of Salesforce account information that includes address, io terms, etc.
  * @param error Error indicator from Salesforce which could be \"No Error\"
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SSIOAccountResponse(
  eligible: Option[Boolean],
  canEdit: Option[Boolean],
  billtoInfos: Option[List[SSIOAccountItem]],
  currency: Option[String],
  pmpNames: Option[List[SSIOAccountPMPName]],
  error: Option[String]
)

object SSIOAccountResponse {
  implicit lazy val sSIOAccountResponseJsonFormat: Format[SSIOAccountResponse] = Json.format[SSIOAccountResponse]
}

