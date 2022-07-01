package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductType3Filter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class ProductType3Filter(
  PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria
  additionalProperties: 
)

object ProductType3Filter {
  implicit lazy val productType3FilterJsonFormat: Format[ProductType3Filter] = {
    val realJsonFormat = Json.format[ProductType3Filter]
    val declaredPropNames = Set("PRODUCT_TYPE_3")
    
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
      Writes { productType3Filter =>
        val jsObj = realJsonFormat.writes(productType3Filter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

