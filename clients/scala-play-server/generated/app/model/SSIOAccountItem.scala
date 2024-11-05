package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOAccountItem.
  * @param id Salesforce id for billto_info
  * @param ioTermsId Salesforce id for IO Terms and Conditions
  * @param ioTerms Salesforce text for IO Terms and Conditions
  * @param usTermsId Salesforce id for US Terms and Conditions
  * @param usTerms Salesforce text for US Terms and Conditions
  * @param rowTermsId Salesforce id for Rest of the World Terms and Conditions
  * @param rowTerms Salesforce text for Rest of the World Terms and Conditions
  * @param ioType Insertion Order Type - Pinterest Paper or Agency Paper
  * @param addresses Address information that is associated with this account.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SSIOAccountItem(
  id: Option[String],
  ioTermsId: Option[String],
  ioTerms: Option[String],
  usTermsId: Option[String],
  usTerms: Option[String],
  rowTermsId: Option[String],
  rowTerms: Option[String],
  ioType: Option[String],
  addresses: Option[List[SSIOAccountAddress]]
)

object SSIOAccountItem {
  implicit lazy val sSIOAccountItemJsonFormat: Format[SSIOAccountItem] = Json.format[SSIOAccountItem]
}

