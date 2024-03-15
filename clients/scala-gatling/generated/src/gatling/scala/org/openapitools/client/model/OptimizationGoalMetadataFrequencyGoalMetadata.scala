
package org.openapitools.client.model


case class OptimizationGoalMetadataFrequencyGoalMetadata (
    _frequency: Option[Integer],
    /* User entity counts time range */
    _timerange: Option[String]
)
object OptimizationGoalMetadataFrequencyGoalMetadata {
    def toStringBody(var_frequency: Object, var_timerange: Object) =
        s"""
        | {
        | "frequency":$var_frequency,"timerange":$var_timerange
        | }
        """.stripMargin
}
