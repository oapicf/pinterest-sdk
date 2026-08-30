package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param id ID of the product group.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0(
  description: Option[String],
  filters: Option[CatalogsProductGroupFiltersRequest],
  isFeatured: Option[Boolean],
  name: Option[String],
  id: String
  additionalProperties: 
)

object CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 {
  implicit lazy val catalogsProductGroupUpdateManyRequestItemsOneOfItems0JsonFormat: Format[CatalogsProductGroupUpdateManyRequestItemsOneOfItems0] = {
    val realJsonFormat = Json.format[CatalogsProductGroupUpdateManyRequestItemsOneOfItems0]
    val declaredPropNames = Set("description", "filters", "isFeatured", "name", "id")
    
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
      Writes { catalogsProductGroupUpdateManyRequestItemsOneOfItems0 =>
        val jsObj = realJsonFormat.writes(catalogsProductGroupUpdateManyRequestItemsOneOfItems0)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

