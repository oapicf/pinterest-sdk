package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOAccountItem.
  * @param addresses Address information that is associated with this account.
  * @param id Salesforce id for billto_info
  * @param ioTerms Salesforce text for IO Terms and Conditions
  * @param ioTermsId Salesforce id for IO Terms and Conditions
  * @param ioType Insertion Order Type - Pinterest Paper or Agency Paper
  * @param rowTerms Salesforce text for Rest of the World Terms and Conditions
  * @param rowTermsId Salesforce id for Rest of the World Terms and Conditions
  * @param usTerms Salesforce text for US Terms and Conditions
  * @param usTermsId Salesforce id for US Terms and Conditions
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SSIOAccountItem(
  addresses: Option[List[SSIOAccountAddress]],
  id: Option[String],
  ioTerms: Option[String],
  ioTermsId: Option[String],
  ioType: Option[String],
  rowTerms: Option[String],
  rowTermsId: Option[String],
  usTerms: Option[String],
  usTermsId: Option[String]
)

object SSIOAccountItem {
  implicit lazy val sSIOAccountItemJsonFormat: Format[SSIOAccountItem] = Json.format[SSIOAccountItem]
}

