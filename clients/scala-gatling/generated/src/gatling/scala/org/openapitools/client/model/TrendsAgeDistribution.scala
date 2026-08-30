
package org.openapitools.client.model

import java.util.HashMap

case class TrendsAgeDistribution (
    _ageDistribution: Option[TrendsAgeBucket]
)
object TrendsAgeDistribution {
    def toStringBody(var_ageDistribution: Object) =
        s"""
        | {
        | "ageDistribution":$var_ageDistribution
        | }
        """.stripMargin
}
