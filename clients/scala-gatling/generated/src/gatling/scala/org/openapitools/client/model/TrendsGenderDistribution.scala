
package org.openapitools.client.model

import java.util.HashMap

case class TrendsGenderDistribution (
    _genderDistribution: Option[TrendsGender]
)
object TrendsGenderDistribution {
    def toStringBody(var_genderDistribution: Object) =
        s"""
        | {
        | "genderDistribution":$var_genderDistribution
        | }
        """.stripMargin
}
