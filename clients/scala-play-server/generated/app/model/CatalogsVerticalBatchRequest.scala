package model

import play.api.libs.json._

/**
  * A request object that can have multiple operations on a single batch
  * @param items Array with creative assets item operations
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsVerticalBatchRequest(
  catalogType: CatalogsVerticalBatchRequest.CatalogType.Value,
  country: Country,
  language: CatalogsItemsRequestLanguage,
  items: List[CatalogsCreativeAssetsBatchItem],
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

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

