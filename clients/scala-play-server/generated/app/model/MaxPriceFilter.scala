package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MaxPriceFilter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class MaxPriceFilter(
  MAX_PRICE: CatalogsProductGroupPricingCriteria
  additionalProperties: 
)

object MaxPriceFilter {
  implicit lazy val maxPriceFilterJsonFormat: Format[MaxPriceFilter] = {
    val realJsonFormat = Json.format[MaxPriceFilter]
    val declaredPropNames = Set("MAX_PRICE")
    
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
      Writes { maxPriceFilter =>
        val jsObj = realJsonFormat.writes(maxPriceFilter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

