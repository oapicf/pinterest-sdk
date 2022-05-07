package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductType4Filter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class ProductType4Filter(
  PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria
  additionalProperties: 
)

object ProductType4Filter {
  implicit lazy val productType4FilterJsonFormat: Format[ProductType4Filter] = {
    val realJsonFormat = Json.format[ProductType4Filter]
    val declaredPropNames = Set("PRODUCT_TYPE_4")
    
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
      Writes { productType4Filter =>
        val jsObj = realJsonFormat.writes(productType4Filter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

