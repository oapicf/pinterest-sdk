package model

import play.api.libs.json._

/**
  * A request object that can have multiple operations on a single batch
  * @param items Array with catalogs item operations
  * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsVerticalBatchRequest(
  catalogType: CatalogsType,
  country: Country,
  language: Language,
  items: List[CatalogsHotelBatchItem],
  catalogId: Option[String]
  additionalProperties: 
)

object CatalogsVerticalBatchRequest {
  implicit lazy val catalogsVerticalBatchRequestJsonFormat: Format[CatalogsVerticalBatchRequest] = {
    val realJsonFormat = Json.format[CatalogsVerticalBatchRequest]
    val declaredPropNames = Set("catalogType", "country", "language", "items", "catalogId")
    
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
      Writes { catalogsVerticalBatchRequest =>
        val jsObj = realJsonFormat.writes(catalogsVerticalBatchRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

