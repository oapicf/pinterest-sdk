
package org.openapitools.client.model

import java.util.HashMap

case class TrendingKeywordDemographicsAgeDistribution (
    _ageDistribution: Option[String]
)
object TrendingKeywordDemographicsAgeDistribution {
    def toStringBody(var_ageDistribution: Object) =
        s"""
        | {
        | "ageDistribution":$var_ageDistribution
        | }
        """.stripMargin
}
