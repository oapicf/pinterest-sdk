package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductType0Filter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class ProductType0Filter(
  PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria
  additionalProperties: 
)

object ProductType0Filter {
  implicit lazy val productType0FilterJsonFormat: Format[ProductType0Filter] = {
    val realJsonFormat = Json.format[ProductType0Filter]
    val declaredPropNames = Set("PRODUCT_TYPE_0")
    
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
      Writes { productType0Filter =>
        val jsObj = realJsonFormat.writes(productType0Filter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

