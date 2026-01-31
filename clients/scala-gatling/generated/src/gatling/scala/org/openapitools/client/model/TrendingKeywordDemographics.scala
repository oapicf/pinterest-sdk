
package org.openapitools.client.model


case class TrendingKeywordDemographics (
    _ageDistribution: Option[TrendingKeywordDemographicsAgeDistribution],
    _genderDistribution: Option[TrendingKeywordDemographicsGenderDistribution]
)
object TrendingKeywordDemographics {
    def toStringBody(var_ageDistribution: Object, var_genderDistribution: Object) =
        s"""
        | {
        | "ageDistribution":$var_ageDistribution,"genderDistribution":$var_genderDistribution
        | }
        """.stripMargin
}
