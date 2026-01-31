package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Catalog entity
  * @param id ID of the catalog entity.
  * @param name A human-friendly name associated to a catalog entity.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Catalog(
  createdAt: OffsetDateTime,
  id: String,
  updatedAt: OffsetDateTime,
  catalogType: CatalogsType,
  name: String
  additionalProperties: 
)

object Catalog {
  implicit lazy val catalogJsonFormat: Format[Catalog] = {
    val realJsonFormat = Json.format[Catalog]
    val declaredPropNames = Set("createdAt", "id", "updatedAt", "catalogType", "name")
    
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
      Writes { catalog =>
        val jsObj = realJsonFormat.writes(catalog)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

