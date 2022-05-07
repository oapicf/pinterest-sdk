package model

import play.api.libs.json._

/**
  * Board
  * @param privacy Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class Board(
  id: Option[String],
  name: String,
  description: Option[String],
  owner: Option[BoardOwner],
  privacy: Option[Board.Privacy.Value]
  additionalProperties: 
)

object Board {
  implicit lazy val boardJsonFormat: Format[Board] = {
    val realJsonFormat = Json.format[Board]
    val declaredPropNames = Set("id", "name", "description", "owner", "privacy")
    
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
      Writes { board =>
        val jsObj = realJsonFormat.writes(board)
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
    val PROTECTED = Value("PROTECTED")
    val SECRET = Value("SECRET")

    type Privacy = Value
    implicit lazy val PrivacyJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

