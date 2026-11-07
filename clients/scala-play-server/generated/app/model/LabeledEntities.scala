package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LabeledEntities.
  * @param errors Labels that were not successfully applied.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LabeledEntities(
  entitiesLabels: Option[List[EntityLabel]],
  errors: Option[List[EntityLabelError]]
)

object LabeledEntities {
  implicit lazy val labeledEntitiesJsonFormat: Format[LabeledEntities] = Json.format[LabeledEntities]
}

