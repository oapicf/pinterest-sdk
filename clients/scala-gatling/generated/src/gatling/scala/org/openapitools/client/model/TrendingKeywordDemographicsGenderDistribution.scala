
package org.openapitools.client.model

import java.util.HashMap

case class TrendingKeywordDemographicsGenderDistribution (
    _genderDistribution: Option[String]
)
object TrendingKeywordDemographicsGenderDistribution {
    def toStringBody(var_genderDistribution: Object) =
        s"""
        | {
        | "genderDistribution":$var_genderDistribution
        | }
        """.stripMargin
}
