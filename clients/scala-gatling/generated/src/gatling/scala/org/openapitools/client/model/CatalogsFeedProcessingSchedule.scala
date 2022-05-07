
package org.openapitools.client.model


case class CatalogsFeedProcessingSchedule (
    /* A time in format HH:MM with leading 0 (zero) */
    _time: String,
    /* The timezone considered for the processing schedule time. */
    _timezone: String
)
object CatalogsFeedProcessingSchedule {
    def toStringBody(var_time: Object, var_timezone: Object) =
        s"""
        | {
        | "time":$var_time,"timezone":$var_timezone
        | }
        """.stripMargin
}
