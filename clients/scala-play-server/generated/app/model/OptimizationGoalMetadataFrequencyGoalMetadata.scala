package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OptimizationGoalMetadata_frequency_goal_metadata.
  * @param timerange User entity counts time range
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class OptimizationGoalMetadataFrequencyGoalMetadata(
  frequency: Option[Int],
  timerange: Option[OptimizationGoalMetadataFrequencyGoalMetadata.Timerange.Value]
)

object OptimizationGoalMetadataFrequencyGoalMetadata {
  implicit lazy val optimizationGoalMetadataFrequencyGoalMetadataJsonFormat: Format[OptimizationGoalMetadataFrequencyGoalMetadata] = Json.format[OptimizationGoalMetadataFrequencyGoalMetadata]

  // noinspection TypeAnnotation
  object Timerange extends Enumeration {
    val THIRTYDAY = Value("THIRTY_DAY")
    val DAY = Value("DAY")
    val SEVENDAY = Value("SEVEN_DAY")
    val TWENTYMINUTE = Value("TWENTY_MINUTE")
    val TENMINUTE = Value("TEN_MINUTE")
    val TWENTYFOURHOUR = Value("TWENTY_FOUR_HOUR")

    type Timerange = Value
    implicit lazy val TimerangeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

