package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Object describing the catalogs items batch
  * @param batchId Id of the catalogs items batch
  * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  * @param items Array with the catalogs items processing records part of the catalogs items batch
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsItemsBatch(
  batchId: Option[String],
  catalogType: CatalogsItemsBatch.CatalogType.Value,
  completedTime: Option[OffsetDateTime],
  createdTime: OffsetDateTime,
  items: Option[List[CreativeAssetsProcessingRecord]],
  status: Option[BatchOperationStatus]
  additionalProperties: 
)

object CatalogsItemsBatch {
  implicit lazy val catalogsItemsBatchJsonFormat: Format[CatalogsItemsBatch] = {
    val realJsonFormat = Json.format[CatalogsItemsBatch]
    val declaredPropNames = Set("batchId", "catalogType", "completedTime", "createdTime", "items", "status")
    
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
      Writes { catalogsItemsBatch =>
        val jsObj = realJsonFormat.writes(catalogsItemsBatch)
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

