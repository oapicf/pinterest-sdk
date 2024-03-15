package model

import play.api.libs.json._

/**
  * Board fields for updates
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

