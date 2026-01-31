
package org.openapitools.client.model


case class GenderDemographics (
    /* Percentage of female users */
    _female: Number,
    /* Percentage of male users */
    _male: Number,
    /* Percentage of users with unspecified gender */
    _unspecified: Number
)
object GenderDemographics {
    def toStringBody(var_female: Object, var_male: Object, var_unspecified: Object) =
        s"""
        | {
        | "female":$var_female,"male":$var_male,"unspecified":$var_unspecified
        | }
        """.stripMargin
}
