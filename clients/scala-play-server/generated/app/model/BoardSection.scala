package model

import play.api.libs.json._

/**
  * Sections help organize pins within a board.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class BoardSection(
  id: Option[String],
  name: Option[String]
  additionalProperties: 
)

object BoardSection {
  implicit lazy val boardSectionJsonFormat: Format[BoardSection] = {
    val realJsonFormat = Json.format[BoardSection]
    val declaredPropNames = Set("id", "name")
    
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
      Writes { boardSection =>
        val jsObj = realJsonFormat.writes(boardSection)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

