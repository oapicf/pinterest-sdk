package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Object describing the catalogs items batch
  * @param items Array with the catalogs items processing records part of the catalogs items batch
  * @param batchId Id of the catalogs items batch
  * @param createdTime Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
  * @param completedTime Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class CatalogsItemsBatch(
  items: Option[List[ItemProcessingRecord]],
  batchId: Option[String],
  createdTime: Option[OffsetDateTime],
  completedTime: Option[OffsetDateTime],
  status: Option[BatchOperationStatus]
  additionalProperties: 
)

object CatalogsItemsBatch {
  implicit lazy val catalogsItemsBatchJsonFormat: Format[CatalogsItemsBatch] = {
    val realJsonFormat = Json.format[CatalogsItemsBatch]
    val declaredPropNames = Set("items", "batchId", "createdTime", "completedTime", "status")
    
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
}

