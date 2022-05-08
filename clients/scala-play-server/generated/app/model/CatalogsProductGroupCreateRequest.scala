package model

import play.api.libs.json._

/**
  * Request object for creating a product group.
  * @param feedId Catalog Feed id pertaining to the catalog product group.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CatalogsProductGroupCreateRequest(
  feedId: String,
  name: String,
  description: Option[String],
  filters: CatalogsProductGroupFilters
  additionalProperties: 
)

object CatalogsProductGroupCreateRequest {
  implicit lazy val catalogsProductGroupCreateRequestJsonFormat: Format[CatalogsProductGroupCreateRequest] = {
    val realJsonFormat = Json.format[CatalogsProductGroupCreateRequest]
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
      Writes { catalogsProductGroupCreateRequest =>
        val jsObj = realJsonFormat.writes(catalogsProductGroupCreateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

