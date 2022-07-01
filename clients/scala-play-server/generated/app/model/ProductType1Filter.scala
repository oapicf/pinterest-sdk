package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductType1Filter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class ProductType1Filter(
  PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria
  additionalProperties: 
)

object ProductType1Filter {
  implicit lazy val productType1FilterJsonFormat: Format[ProductType1Filter] = {
    val realJsonFormat = Json.format[ProductType1Filter]
    val declaredPropNames = Set("PRODUCT_TYPE_1")
    
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
      Writes { productType1Filter =>
        val jsObj = realJsonFormat.writes(productType1Filter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

