package model

import play.api.libs.json._

/**
  * Request object for updating a hotel product group.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsVerticalProductGroupUpdateRequest(
  catalogType: Option[CatalogsVerticalProductGroupUpdateRequest.CatalogType.Value],
  name: Option[String],
  description: Option[String],
  filters: Option[CatalogsHotelProductGroupFilters]
  additionalProperties: 
)

object CatalogsVerticalProductGroupUpdateRequest {
  implicit lazy val catalogsVerticalProductGroupUpdateRequestJsonFormat: Format[CatalogsVerticalProductGroupUpdateRequest] = {
    val realJsonFormat = Json.format[CatalogsVerticalProductGroupUpdateRequest]
    val declaredPropNames = Set("catalogType", "name", "description", "filters")
    
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
      Writes { catalogsVerticalProductGroupUpdateRequest =>
        val jsObj = realJsonFormat.writes(catalogsVerticalProductGroupUpdateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

