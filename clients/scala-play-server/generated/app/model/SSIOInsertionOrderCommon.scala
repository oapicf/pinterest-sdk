package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOInsertionOrderCommon.
  * @param agencyLink URL link for agency
  * @param billingContactEmail The billing contact email
  * @param billingContactFirstname The billing contact first name
  * @param billingContactLastname The billing contact last name
  * @param budgetAmount If Budget order line, the budget amount.
  * @param endDate End date of time period. Format: YYYY-MM-DD
  * @param mediaContactEmail The media contact email
  * @param mediaContactFirstname The media contact first name
  * @param mediaContactLastname The media contact last name
  * @param poNumber The po number
  * @param startDate Starting date of time period. Format: YYYY-MM-DD
  * @param userEmail The email of user submitting the insertion order
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SSIOInsertionOrderCommon(
  agencyLink: Option[String],
  billingContactEmail: Option[String],
  billingContactFirstname: Option[String],
  billingContactLastname: Option[String],
  budgetAmount: Option[BigDecimal],
  endDate: Option[String],
  mediaContactEmail: Option[String],
  mediaContactFirstname: Option[String],
  mediaContactLastname: Option[String],
  poNumber: Option[String],
  startDate: Option[String],
  userEmail: Option[String]
)

object SSIOInsertionOrderCommon {
  implicit lazy val sSIOInsertionOrderCommonJsonFormat: Format[SSIOInsertionOrderCommon] = Json.format[SSIOInsertionOrderCommon]
}

