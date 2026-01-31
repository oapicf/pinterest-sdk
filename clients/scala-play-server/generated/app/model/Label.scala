package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Label.
  * @param id Label ID.
  * @param parentId Label parent entity ID.
  * @param parentType Label parent entity type.
  * @param value Label name.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Label(
  id: Option[String],
  labelType: Option[LabelType],
  parentId: Option[String],
  parentType: Option[Label.ParentType.Value],
  status: Option[LabelStatus],
  value: Option[String]
)

object Label {
  implicit lazy val labelJsonFormat: Format[Label] = Json.format[Label]

  // noinspection TypeAnnotation
  object ParentType extends Enumeration {
    val CAMPAIGN = Value("CAMPAIGN")

    type ParentType = Value
    implicit lazy val ParentTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

