package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param entityIds Entity IDs to apply label to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LabeledEntitiesCreate(
  entityIds: List[String]
)

object LabeledEntitiesCreate {
  implicit lazy val labeledEntitiesCreateJsonFormat: Format[LabeledEntitiesCreate] = Json.format[LabeledEntitiesCreate]
}

