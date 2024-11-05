package model

import play.api.libs.json._

/**
  * Board fields for updates
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BoardUpdate(
  name: Option[String],
  description: Option[String],
  privacy: Option[BoardUpdate.Privacy.Value]
)

object BoardUpdate {
  implicit lazy val boardUpdateJsonFormat: Format[BoardUpdate] = Json.format[BoardUpdate]

  // noinspection TypeAnnotation
  object Privacy extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val SECRET = Value("SECRET")

    type Privacy = Value
    implicit lazy val PrivacyJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

