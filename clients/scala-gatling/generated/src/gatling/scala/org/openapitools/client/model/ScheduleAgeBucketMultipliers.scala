
package org.openapitools.client.model

import java.util.HashMap

case class ScheduleAgeBucketMultipliers (
    _AGE_BUCKET: Option[String]
)
object ScheduleAgeBucketMultipliers {
    def toStringBody(var_AGE_BUCKET: Object) =
        s"""
        | {
        | "AGE_BUCKET":$var_AGE_BUCKET
        | }
        """.stripMargin
}
