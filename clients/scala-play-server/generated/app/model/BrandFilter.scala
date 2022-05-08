package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BrandFilter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class BrandFilter(
  BRAND: CatalogsProductGroupMultipleStringCriteria
  additionalProperties: 
)

object BrandFilter {
  implicit lazy val brandFilterJsonFormat: Format[BrandFilter] = {
    val realJsonFormat = Json.format[BrandFilter]
    val declaredPropNames = Set("BRAND")
    
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
      Writes { brandFilter =>
        val jsObj = realJsonFormat.writes(brandFilter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

