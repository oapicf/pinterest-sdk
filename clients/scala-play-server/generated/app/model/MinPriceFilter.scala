package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MinPriceFilter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class MinPriceFilter(
  MIN_PRICE: CatalogsProductGroupPricingCriteria
  additionalProperties: 
)

object MinPriceFilter {
  implicit lazy val minPriceFilterJsonFormat: Format[MinPriceFilter] = {
    val realJsonFormat = Json.format[MinPriceFilter]
    val declaredPropNames = Set("MIN_PRICE")
    
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
      Writes { minPriceFilter =>
        val jsObj = realJsonFormat.writes(minPriceFilter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

