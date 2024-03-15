package model

import play.api.libs.json._

/**
  * Request object to list products for a given product group filter.
  * @param feedId Catalog Feed id pertaining to the catalog product group filter.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsListProductsByFilterRequest(
  feedId: String,
  filters: CatalogsProductGroupFilters
  additionalProperties: 
)

object CatalogsListProductsByFilterRequest {
  implicit lazy val catalogsListProductsByFilterRequestJsonFormat: Format[CatalogsListProductsByFilterRequest] = {
    val realJsonFormat = Json.format[CatalogsListProductsByFilterRequest]
    val declaredPropNames = Set("feedId", "filters")
    
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
      Writes { catalogsListProductsByFilterRequest =>
        val jsObj = realJsonFormat.writes(catalogsListProductsByFilterRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

