
package org.openapitools.client.model

import java.util.HashMap

case class AgeBucketMultipliers (
    /* Age bucket identifier. */
    _AGE_BUCKET: Option[TargetingSpecAgeBucket]
)
object AgeBucketMultipliers {
    def toStringBody(var_AGE_BUCKET: Object) =
        s"""
        | {
        | "AGE_BUCKET":$var_AGE_BUCKET
        | }
        """.stripMargin
}
