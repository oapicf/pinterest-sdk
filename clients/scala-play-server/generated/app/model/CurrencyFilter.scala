package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CurrencyFilter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CurrencyFilter(
  CURRENCY: CatalogsProductGroupCurrencyCriteria
  additionalProperties: 
)

object CurrencyFilter {
  implicit lazy val currencyFilterJsonFormat: Format[CurrencyFilter] = {
    val realJsonFormat = Json.format[CurrencyFilter]
    val declaredPropNames = Set("CURRENCY")
    
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
      Writes { currencyFilter =>
        val jsObj = realJsonFormat.writes(currencyFilter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

