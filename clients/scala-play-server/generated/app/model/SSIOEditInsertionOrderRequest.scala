package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOEditInsertionOrderRequest.
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
  * @param adsManagerOrderLineId Ads manager OrderLineId
  * @param oracleLineId LineId in the Oracle DB
  * @param salesforceOrderId OrderId in SFDC
  * @param salesforceOrderLineId OrderLineId in SFDC
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SSIOEditInsertionOrderRequest(
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
  userEmail: Option[String],
  adsManagerOrderLineId: Option[String],
  oracleLineId: Option[String],
  salesforceOrderId: Option[String],
  salesforceOrderLineId: Option[String]
  additionalProperties: 
)

object SSIOEditInsertionOrderRequest {
  implicit lazy val sSIOEditInsertionOrderRequestJsonFormat: Format[SSIOEditInsertionOrderRequest] = {
    val realJsonFormat = Json.format[SSIOEditInsertionOrderRequest]
    val declaredPropNames = Set("agencyLink", "billingContactEmail", "billingContactFirstname", "billingContactLastname", "budgetAmount", "endDate", "mediaContactEmail", "mediaContactFirstname", "mediaContactLastname", "poNumber", "startDate", "userEmail", "adsManagerOrderLineId", "oracleLineId", "salesforceOrderId", "salesforceOrderLineId")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { sSIOEditInsertionOrderRequest =>
        val jsObj = realJsonFormat.writes(sSIOEditInsertionOrderRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

