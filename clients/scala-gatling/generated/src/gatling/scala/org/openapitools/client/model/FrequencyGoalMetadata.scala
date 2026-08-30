
package org.openapitools.client.model


case class FrequencyGoalMetadata (
    _frequency: Option[Integer],
    _timerange: Option[FrequencyGoalMetadataTimerange]
)
object FrequencyGoalMetadata {
    def toStringBody(var_frequency: Object, var_timerange: Object) =
        s"""
        | {
        | "frequency":$var_frequency,"timerange":$var_timerange
        | }
        """.stripMargin
}
