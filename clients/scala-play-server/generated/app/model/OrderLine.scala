package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrderLine.
  * @param id Order line ID.
  * @param `type` Always \"orderline\".
  * @param adAccountId Ad account ID.
  * @param purchaseOrderId Purchase order ID.
  * @param startTime Start time. Unix timestamp.
  * @param endTime End time. Unix timestamp.
  * @param budget Order line budget in micro currency.
  * @param paidBudget Order line paid budget in micro currency.
  * @param status Order line status.
  * @param name Order line name.
  * @param paidType Order line paid type.
  * @param campaignIds Associated List of campaign IDs.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class OrderLine(
  id: Option[String],
  `type`: Option[String],
  adAccountId: Option[String],
  purchaseOrderId: Option[String],
  startTime: Option[BigDecimal],
  endTime: Option[BigDecimal],
  budget: Option[BigDecimal],
  paidBudget: Option[BigDecimal],
  status: Option[OrderLineStatus],
  name: Option[String],
  paidType: Option[OrderLinePaidType],
  campaignIds: List[String]
  additionalProperties: 
)

object OrderLine {
  implicit lazy val orderLineJsonFormat: Format[OrderLine] = {
    val realJsonFormat = Json.format[OrderLine]
    val declaredPropNames = Set("id", "`type`", "adAccountId", "purchaseOrderId", "startTime", "endTime", "budget", "paidBudget", "status", "name", "paidType", "campaignIds")
    
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
      Writes { orderLine =>
        val jsObj = realJsonFormat.writes(orderLine)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

