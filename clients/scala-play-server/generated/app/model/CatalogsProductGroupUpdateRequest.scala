package model

import play.api.libs.json._

/**
  * Request object for updating a product group.
  * @param feedId Catalog Feed id pertaining to the catalog product group.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class CatalogsProductGroupUpdateRequest(
  feedId: String,
  name: String,
  description: Option[String],
  filters: CatalogsProductGroupFilters
  additionalProperties: 
)

object CatalogsProductGroupUpdateRequest {
  implicit lazy val catalogsProductGroupUpdateRequestJsonFormat: Format[CatalogsProductGroupUpdateRequest] = {
    val realJsonFormat = Json.format[CatalogsProductGroupUpdateRequest]
    val declaredPropNames = Set("feedId", "name", "description", "filters")
    
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
      Writes { catalogsProductGroupUpdateRequest =>
        val jsObj = realJsonFormat.writes(catalogsProductGroupUpdateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

