package model

import play.api.libs.json._

/**
  * SSIO insertion order status response for a single pin order id lookup.
  * @param creationTime Salesforce insertion order creation time
  * @param pinOrderId Salesforce order id
  * @param status Salesforce insertion order status
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SSIOInsertionOrderStatusResponse(
  creationTime: Option[String],
  pinOrderId: Option[String],
  status: Option[String]
  additionalProperties: 
)

object SSIOInsertionOrderStatusResponse {
  implicit lazy val sSIOInsertionOrderStatusResponseJsonFormat: Format[SSIOInsertionOrderStatusResponse] = {
    val realJsonFormat = Json.format[SSIOInsertionOrderStatusResponse]
    val declaredPropNames = Set("creationTime", "pinOrderId", "status")
    
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
      Writes { sSIOInsertionOrderStatusResponse =>
        val jsObj = realJsonFormat.writes(sSIOInsertionOrderStatusResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

