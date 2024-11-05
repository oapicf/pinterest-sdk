package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Catalog entity
  * @param id ID of the catalog entity.
  * @param name A human-friendly name associated to a catalog entity.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class Catalog(
  createdAt: OffsetDateTime,
  id: String,
  updatedAt: OffsetDateTime,
  name: String,
  catalogType: CatalogsType
  additionalProperties: 
)

object Catalog {
  implicit lazy val catalogJsonFormat: Format[Catalog] = {
    val realJsonFormat = Json.format[Catalog]
    val declaredPropNames = Set("createdAt", "id", "updatedAt", "name", "catalogType")
    
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

