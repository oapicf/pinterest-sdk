package model

import play.api.libs.json._

/**
  * Board fields for updates
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class BoardUpdate(
  name: Option[String],
  description: Option[String],
  privacy: Option[BoardUpdate.Privacy.Value]
  additionalProperties: 
)

object BoardUpdate {
  implicit lazy val boardUpdateJsonFormat: Format[BoardUpdate] = {
    val realJsonFormat = Json.format[BoardUpdate]
    val declaredPropNames = Set("name", "description", "privacy")
    
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
      Writes { boardUpdate =>
        val jsObj = realJsonFormat.writes(boardUpdate)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object Privacy extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val SECRET = Value("SECRET")

    type Privacy = Value
    implicit lazy val PrivacyJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

