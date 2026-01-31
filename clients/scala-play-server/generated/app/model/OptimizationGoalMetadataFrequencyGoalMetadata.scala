package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OptimizationGoalMetadata_frequency_goal_metadata.
  * @param timerange User entity counts time range
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

